/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Carrito;
import Modelo.DetallePedidoDAO;
import Modelo.Detalle_Pedido;
import Modelo.Pedido;
import Modelo.PedidoDAO;
import Modelo.Producto;
import Modelo.ProductoDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "CtrProducto", urlPatterns = {"/CtrProducto"})
public class CtrProducto extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    ProductoDAO pdao = new ProductoDAO();
    PedidoDAO pedao = new PedidoDAO();
    DetallePedidoDAO dpdao = new DetallePedidoDAO();
    List<Producto> productos = new ArrayList();
    List<Carrito> listacarrito = new ArrayList();
    int cantidad = 1;
    int totalpagar;
    int idp;
    int item;
    int pre, sto, id, cat, monto, pago;
    String nom, des, fto, estado, fecha, idclient, idcli;
    Carrito car;
    Date d = new Date();
    Pedido ped = new Pedido();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String accion = request.getParameter("accion");
        HttpSession sesion = request.getSession();
        Producto p = new Producto();
        productos = pdao.Listar();
        switch (accion) {
            case "Listar":
                productos = pdao.Listar();
                request.setAttribute("producto", productos);
                request.getRequestDispatcher("Vistas/ListarProducto.jsp").forward(request, response);
                System.out.println("Entro en ctrproducto" + "\n");

                break;

            case "buscar":
                String nombre = request.getParameter("busqueda");
                productos = pdao.Buscar(nombre);
                request.setAttribute("producto", productos);

                if (sesion.getAttribute("tipo").equals("Administrador")) {
                    request.getRequestDispatcher("Vistas/Ventas_Admin.jsp").forward(request, response);
                }
                if (sesion.getAttribute("tipo").equals("Cliente")) {
                    request.getRequestDispatcher("Vistas/Ventas_Cliente.jsp").forward(request, response);
                }

                break;

            case "AgregarCarrito":
                int pos = 0;
                cantidad = 1;
                idp = Integer.parseInt(request.getParameter("id"));
                p = pdao.ListarId(idp);
                if (listacarrito.size() > 0) {
                    for (int i = 0; i < listacarrito.size(); i++) {
                        if (idp == listacarrito.get(i).getIdproducto()) {
                            pos = i;
                        }
                    }

                    if (idp == listacarrito.get(pos).getIdproducto()) {
                        cantidad = cantidad + listacarrito.get(pos).getCantidad();
                        int subtotal = cantidad * listacarrito.get(pos).getPreciocompra();
                        listacarrito.get(pos).setCantidad(cantidad);
                        listacarrito.get(pos).setSubtotal(subtotal);
                    } else {
                        item++;
                        Carrito car = new Carrito();
                        car.setItem(item);
                        car.setIdproducto(idp);
                        car.setNombre(p.getNombre());
                        car.setDescripcion(p.getDescripcion());
                        car.setFoto(p.getFoto());
                        car.setPreciocompra(p.getPrecio());
                        car.setCantidad(cantidad);
                        car.setSubtotal(cantidad * p.getPrecio());
                        listacarrito.add(car);
                    }

                } else {

                    item++;
                    Carrito car = new Carrito();
                    car.setItem(item);
                    car.setIdproducto(idp);
                    car.setNombre(p.getNombre());
                    car.setDescripcion(p.getDescripcion());
                    car.setFoto(p.getFoto());
                    car.setPreciocompra(p.getPrecio());
                    car.setCantidad(cantidad);
                    car.setSubtotal(cantidad * p.getPrecio());
                    listacarrito.add(car);

                }

                request.setAttribute("contador", listacarrito.size());
                request.getRequestDispatcher("CtrProducto?accion=home").forward(request, response);

                break;

            case "Carrito":
                System.out.println("Entre: carrito 3");
                totalpagar = 0;
                for (int i = 0; i < listacarrito.size(); i++) {
                    totalpagar = totalpagar + listacarrito.get(i).getSubtotal();

                }
                request.setAttribute("totalpagar", totalpagar);
                request.setAttribute("carrito", listacarrito);

                if (sesion.getAttribute("tipo").equals("Administrador")) {
                    request.getRequestDispatcher("Vistas/Carrito_Admin.jsp").forward(request, response);
                }
                if (sesion.getAttribute("tipo").equals("Cliente")) {
                    request.getRequestDispatcher("Vistas/Carrito_Cliente.jsp").forward(request, response);
                }

                break;

            case "Delete":
                int idproducto = Integer.parseInt(request.getParameter("idp"));
                System.out.println("entro carrito 3" + idproducto);
                for (int i = 0; i < listacarrito.size(); i++) {
                    if (listacarrito.get(i).getIdproducto() == idproducto) {
                        listacarrito.remove(i);
                    }
                }

                break;
                
            case "Eliminar":
                
               
                int idpr = Integer.parseInt(request.getParameter("idp"));
                System.out.println("entro carrito 3" + idpr);
                pdao.eliminar(idpr);

              
                break;

            case "ActualizarCantidad":

                int idpro = Integer.parseInt(request.getParameter("idp"));
                int can = Integer.parseInt(request.getParameter("Cantidad"));

                for (int i = 0; i < listacarrito.size(); i++) {
                    if (listacarrito.get(i).getIdproducto() == idpro) {
                        listacarrito.get(i).setCantidad(can);
                        int st = listacarrito.get(i).getPreciocompra() * can;
                        listacarrito.get(i).setSubtotal(st);

                    }
                }
                break;

            case "Comprar":

                totalpagar = 0;
                if (cantidad == 0) {
                    cantidad = 1;
                }

                idp = Integer.parseInt(request.getParameter("id"));
                p = pdao.ListarId(idp);
                item++;
                car = new Carrito();
                car.setItem(item);
                car.setIdproducto(idp);
                car.setNombre(p.getNombre());
                car.setDescripcion(p.getDescripcion());
                car.setFoto(p.getFoto());
                car.setPreciocompra(p.getPrecio());
                car.setCantidad(cantidad);
                car.setSubtotal(cantidad * p.getPrecio());
                boolean producto = false;
                int con = 0;

                for (int i = 0; i < listacarrito.size(); i++) {

                    if (listacarrito.get(i).getIdproducto() == idp) {
                        System.out.println("Encontró el producto en la lista");
                        producto = true;
                        con = i;
                    }

                    totalpagar = totalpagar + listacarrito.get(i).getSubtotal();

                }

                if (producto == false) {
                    listacarrito.add(car);
                    System.out.println("Agrego a lista carrito");
                } else {
                    listacarrito.get(con).setCantidad(listacarrito.get(con).getCantidad() + 1);
                }

                request.setAttribute("contador", listacarrito.size());
                request.setAttribute("totalpagar", totalpagar);
                request.setAttribute("carrito", listacarrito);

                if (sesion.getAttribute("tipo").equals("Administrador")) {
                    request.getRequestDispatcher("Vistas/Carrito_Admin.jsp").forward(request, response);
                }

                break;

            case "Agregar":
                nom = request.getParameter("nombre");
                des = request.getParameter("descripcion");
                pre = Integer.parseInt(request.getParameter("precio"));
                sto = Integer.parseInt(request.getParameter("stock"));
                cat = Integer.parseInt(request.getParameter("categoria"));
                fto = "Imagenes/" + request.getParameter("imagen");
             
                //System.out.println("Valor de foto es " + fto);
                p.setNombre(nom);
                p.setDescripcion(des);
                p.setPrecio(pre);
                p.setStock(sto);
                p.setCategoria(cat);
                p.setFoto(fto);
                pdao.crear(p);
                request.getRequestDispatcher("CtrProducto?accion=Listar").forward(request, response);
                break;

            case "editar":
                Producto pro;
                int idprodu = Integer.parseInt(request.getParameter("id"));
                pro = pdao.ListarId(idprodu);
                request.setAttribute("producto", pro);
                request.getRequestDispatcher("Vistas/EditarProducto.jsp").forward(request, response);
                break;

            case "Actualizar":
                id = Integer.parseInt(request.getParameter("id"));
                nom = request.getParameter("nombre");
                des = request.getParameter("descripcion");
                pre = Integer.parseInt(request.getParameter("precio"));
                sto = Integer.parseInt(request.getParameter("stock"));
                fto = "Imagenes/" + request.getParameter("imagen");
                cat = Integer.parseInt(request.getParameter("idcat"));
                p.setId(id);
                p.setNombre(nom);
                p.setDescripcion(des);
                p.setPrecio(pre);
                p.setStock(sto);
                p.setCategoria(cat);
                p.setFoto(fto);
                pdao.actualizar(p);
                
                request.getRequestDispatcher("CtrProducto?accion=Listar").forward(request, response);
                
                break;
                
            case "pedido":
               //  idclient = sesion.getId();
                idcli = request.getParameter("idus");
                estado = "En proceso";
                monto = totalpagar;
                pago = 1;
                fecha = DateFormat.getDateInstance().format(d);
                ped.setId_cliente(idcli);
                ped.setId_pago(pago);
                ped.setMonto(monto);
                ped.setFecha_pedido(fecha);
                ped.setEstado(estado);
                pedao.crear(ped);
                int idp =  pedao.listarId();
                
                for (int i = 0; i < listacarrito.size(); i++) {
                    Detalle_Pedido dped = new Detalle_Pedido();
                    dped.setId_pedido(idp);
                    dped.setId_producto(listacarrito.get(i).getIdproducto());
                    dped.setNombre(listacarrito.get(i).getNombre());
                    dped.setCantidad(listacarrito.get(i).getCantidad());
                    dped.setPrecio_pedido(listacarrito.get(i).getPreciocompra());
                    dpdao.crear(dped);
                }

                Properties propiedad = new Properties();
                propiedad.setProperty("mail.smtp.host", "smtp.gmail.com");
                propiedad.setProperty("mail.smtp.starttls.enable", "true");
                propiedad.setProperty("mail.smtp.port", "587");
                propiedad.setProperty("mail.smtp.auth", "true");

                Session sesion1 = Session.getDefaultInstance(propiedad);
                String correoenvio = "sugeyberdugocaicedo@gmail.com";
                String contrasena = "qchmwcibvvnmcicl";
                String destinatario = "oscarmarquez0603@gmail.com";
                String asunto = "Pedido realizado";
                String mensaje = "Su pedido será despachado una vez realizado el pago";

                MimeMessage mail = new MimeMessage(sesion1);

                try {
                    mail.setFrom(new InternetAddress(correoenvio));
                    mail.addRecipient(Message.RecipientType.TO, new InternetAddress(destinatario));
                    mail.setSubject(asunto);
                    mail.setText(mensaje);

                    Transport transporte = sesion1.getTransport("smtp");
                    transporte.connect(correoenvio, contrasena);
                    transporte.sendMessage(mail, mail.getRecipients(Message.RecipientType.TO));
                    transporte.close();
                    System.out.println("Se envio el correo correctamente");

                } catch (Exception e) {
                    System.out.println("No se pudo enviar el correo");
                }

                listacarrito.removeAll(listacarrito);
                request.getRequestDispatcher("CtrProducto?accion=Carrito").forward(request, response);






                
                break;
                
                
                
                
                

            default:
                System.out.println("entró en def" + accion);
                System.out.println("cantidad productos " + productos.size());
                request.setAttribute("producto", productos);

                if (sesion.getAttribute("tipo") != null) {
                    if (sesion.getAttribute("tipo").equals("Administrador")) {
                        request.getRequestDispatcher("Vistas/Ventas_Admin.jsp").forward(request, response);
                    }

                    if (sesion.getAttribute("tipo").equals("Cliente")) {
                        request.getRequestDispatcher("Vistas/Ventas_Cliente.jsp").forward(request, response);
                    }
                } else {

                    request.getRequestDispatcher("Vistas/Inicio.jsp").forward(request, response);
                }

        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
