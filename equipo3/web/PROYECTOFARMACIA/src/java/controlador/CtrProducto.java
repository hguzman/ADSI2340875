/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import modelo.productoDAO;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import modelo.car;
import modelo.producto;


/**
 *
 * @author SENA
 */
@WebServlet(name = "CtrProducto", urlPatterns = {"/CtrProducto"})
public class CtrProducto extends HttpServlet {
    productoDAO pdao = new productoDAO();
    List<producto> productos = new ArrayList();
    List<car> listacar = new ArrayList();
    int cantidad;
    int totalpagar;
    int idp;
    int item;
    car car;
    int pre,sto,id;
    String nom, des, fto;
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String accion = request.getParameter("accion");
        System.out.println("entro4: " + accion);
        
        HttpSession sesion = request.getSession();
        System.out.println("item: "+sesion.getAttribute("tipo"));
        productos=pdao.listar();
        //***segunda clase**
        
        productoDAO dao = new productoDAO();
        producto p = new producto();
        List<producto> List = dao.listar();
        
        System.out.println("accion : " + accion);
        switch (accion) {
           case "Listar":
                productos = pdao.listar();
                request.setAttribute("producto", productos);
                request.getRequestDispatcher("vistas/listarproducto.jsp").forward(request, response);
                System.out.println("Entro en ctrproducto" + "\n");
                break;
                
           case "buscar":
               String nombre = request.getParameter("busqueda");
               productos = pdao.buscar(nombre);
               request.setAttribute("producto", productos);
                 if (sesion.getAttribute("tipo").equals("administrador")) {  
                    System.out.println("item2: "+sesion.getAttribute("tipo"));
                    System.out.println("producto: "+ productos.size());
                    request.getRequestDispatcher("vistas/Administrador.jsp").forward(request, response);
                }
                if(sesion.getAttribute("tipo").equals("cliente")) {  
                    request.getRequestDispatcher("vistas/Cliente.jsp").forward(request, response);
                }
                break;
                case"editar":
                    producto pro;
                    int idprodu = Integer.parseInt(request.getParameter("id"));
                    pro = pdao.listarId(idprodu);
                    request.setAttribute("producto", pro);
                    request.getRequestDispatcher("vistas/editarproducto.jsp").forward(request, response);
                    break;
                case"actualizar":
                    
                    id = Integer.parseInt(request.getParameter("id"));
                    nom = request.getParameter("nombre");
                    des = request.getParameter("descripcion");
                    pre = Integer.parseInt(request.getParameter("precio"));
                    sto = Integer.parseInt(request.getParameter("stock"));
                    fto = request.getParameter("foto");
                    System.out.println("id :" + id);
                    p.setId(id);
                    p.setNombre(nom);
                    p.setDescripcion(des);
                    p.setPrecio(pre);
                    p.setStock(sto);
                    p.setFoto(fto);
                    pdao.actualizar(p);
                    request.getRequestDispatcher("CtrProducto?accion=Listar").forward(request, response);
                    break;
                
           case "agregarcarrito":
               int pos = 0;
               cantidad = 1;
               idp =Integer.parseInt(request.getParameter("id"));
               p = pdao.listarId(idp);
               System.out.println("idp : " + idp);
               System.out.println("descripcion : " + p.getDescripcion());
               if(listacar.size() > 0 ){
                   for(int i= 0; i < listacar.size(); i++){
                       if(idp == listacar.get(i).getIdproducto()){
                        pos =i;   
                       }
                   }
                   if(idp == listacar.get(pos).getIdproducto()){
                       cantidad = cantidad + listacar.get(pos).getCantidad();
                       int subtotal = cantidad * listacar.get(pos).getPreciocompra();
                       listacar.get(pos).setCantidad(cantidad);
                       listacar.get(pos).setSubtotal(subtotal);
                   }else{
                   item++;
                   car Car = new car();
                   Car.setItem(item);
                   Car.setIdproducto(idp);
                   Car.setNombre(p.getNombre());
                   Car.setDescripcion(p.getDescripcion());
                   Car.setFoto(p.getFoto());
                   Car.setPreciocompra(p.getPrecio());
                   Car.setCantidad(cantidad);
                   Car.setSubtotal(cantidad * p.getPrecio());
                   listacar.add(Car);
               }
               }else{
                  item++;
                   car Car = new car();
                   Car.setItem(item);
                   Car.setIdproducto(idp);
                   Car.setNombre(p.getNombre());
                   Car.setDescripcion(p.getDescripcion());
                   Car.setFoto(p.getFoto());
                   Car.setPreciocompra(p.getPrecio());
                   Car.setCantidad(cantidad);
                   Car.setSubtotal(cantidad * p.getPrecio());
                   listacar.add(Car);
               }
               request.setAttribute("contador", listacar.size());
               request.getRequestDispatcher("CtrProducto?accion=home").forward(request, response);
               break;
               
               case "carrito":
                   totalpagar=0;
                   for(int i = 0; i <listacar.size(); i++){
                       totalpagar = totalpagar + listacar.get(i).getSubtotal();
                   }
                   request.setAttribute("totalpagar", totalpagar);
                   request.setAttribute("car", listacar);
                   
                   if (sesion.getAttribute("tipo").equals("administrador")) {  
                    System.out.println("item2: "+sesion.getAttribute("tipo"));
                    System.out.println("producto: "+ productos.size());
                    request.getRequestDispatcher("vistas/carrito.jsp").forward(request, response);
                }
                if(sesion.getAttribute("tipo").equals("Cliente")) {  
                    request.getRequestDispatcher("vistas/carritocliente.jsp").forward(request, response);
                }
               break;
               
               case "Delete":
                   int idproducto = Integer.parseInt(request.getParameter("idp"));
                   for (int i = 0; i < listacar.size(); i++) {
                       if (listacar.get(i).getIdproducto() == idproducto) {
                           listacar.remove(i);
                       }
                   }
                   break;
                   
               case "Eliminar":
                System.out.println("entro a eliminar");
                id = Integer.parseInt(request.getParameter("id"));
                dao.eliminar(id);
                List = dao.listar();
                request.setAttribute("producto", List);
                request.getRequestDispatcher("vistas/listarproducto.jsp");
                
                break;
                
               case "ActualizarCantidad":
                   int idpro = Integer.parseInt(request.getParameter("idp"));
                   int can = Integer.parseInt(request.getParameter("Cantidad"));
                   for (int i = 0; i< listacar.size(); i++){
                       if (listacar.get(i).getIdproducto() == idpro){
                           listacar.get(i).setCantidad(can);
                           int st = listacar.get(i).getPreciocompra() * can;
                           listacar.get(i).setSubtotal(st);
                       }
                   }
                   break;
               case "Agregar":
                   nom = request.getParameter("nombre");
                   des = request.getParameter("descripcion");
                   pre = Integer.parseInt(request.getParameter("precio"));
                   sto = Integer.parseInt(request.getParameter("stock"));
                   fto = "Imagenes/" + request.getParameter("ftoId");
                   
                   p.setNombre(nom);
                   p.setDescripcion(des);
                   p.setPrecio(pre);
                   p.setStock(sto);
                   p.setFoto(fto);
                   pdao.crear(p);
                   request.getRequestDispatcher("CtrProducto?accion=Listar").forward(request, response);
                   break;
                       
                   
               case "Comprar":
                   totalpagar = 0;
                   
                   if (cantidad == 0) {
                       cantidad = 1;
                   }
                   
                   idp = Integer.parseInt(request.getParameter("id"));
                   p = pdao.listarId(idp);
                   item++;
                   car = new car();
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
                   for (int i = 0; i < listacar.size(); i++) {
                       if (listacar.get(i).getIdproducto() == idp) {
                           producto = true;
                           con = i;
                       }
                       totalpagar = totalpagar + listacar.get(i).getSubtotal();
                       
                   }
                   if (producto == false) {
                       listacar.add(car);
                   }else{
                       listacar.get(con).setCantidad(listacar.get(con).getCantidad() + 1);
                   }
                   
                   
                   
                   
                   
                   request.setAttribute("contador", listacar.size());
                   request.setAttribute("totalpagar", totalpagar);
                   request.setAttribute("car", listacar);
                   if (sesion.getAttribute("tipo").equals("administrador")) {
                       request.getRequestDispatcher("vistas/carrito.jsp").forward(request, response);
                   }
                   
               break;
            default:
                productos = pdao.listar();
                request.setAttribute("producto", productos);
                
                if (sesion.getAttribute("tipo") != null) {
                    if (sesion.getAttribute("tipo").equals("administrador")) {
                        System.out.println("item2: " + sesion.getAttribute("tipo"));
                        System.out.println("producto: " + productos.size());
                        request.getRequestDispatcher("vistas/Administrador.jsp").forward(request, response);
                    }
                    if (sesion.getAttribute("tipo").equals("cliente")) {
                        request.setAttribute("producto", productos);
                        request.getRequestDispatcher("vistas/Cliente.jsp").forward(request, response);
                         System.out.println("item2: " + sesion.getAttribute("tipo"));
                        System.out.println("producto: " + productos.size());
                    }

                } else {
                    request.getRequestDispatcher("vistas/inicio.jsp").forward(request, response);
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
