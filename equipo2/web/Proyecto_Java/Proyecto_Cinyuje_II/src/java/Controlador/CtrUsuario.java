/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Usuario;
import Modelo.UsuarioDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "CtrUsuario", urlPatterns = {"/CtrUsuario"})
public class CtrUsuario extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    UsuarioDAO dao = new UsuarioDAO();
    public String nombuscar;

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet CtrUsuario</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet CtrUsuario at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
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
        //processRequest(request, response);

        System.out.println("entro 2 ");

        String id, nom, ape, dir, tel, cor, usu, pas, tip;
        Usuario us = new Usuario();
        UsuarioDAO dao = new UsuarioDAO();
        List<Usuario> list = dao.Listar();
        String accion = request.getParameter("accion");
        //System.out.println("entro accion "+accion);
        switch (accion) {
            case "Listar":
                list = dao.Listar();
                request.setAttribute("usuario1", list);
                request.getRequestDispatcher("Vistas/ListarUsuario.jsp").forward(request, response);
                break;

            case "Actualizar":
                id = request.getParameter("id");
                nom = request.getParameter("nombre");
                ape = request.getParameter("apellido");
                dir = request.getParameter("direccion");
                tel = request.getParameter("telefono");
                cor = request.getParameter("correo");
                usu = request.getParameter("usuario");
                pas = request.getParameter("contrasena");
                tip = request.getParameter("tipo");

                us.setId(id);
                us.setNombre(nom);
                us.setApellido(ape);
                us.setApellido(ape);
                us.setDireccion(dir);
                us.setTelefono(tel);
                us.setCorreo(cor);
                us.setUsuario(usu);
                us.setContrasena(cor);
                us.setTipo(tip);

                dao.editar(us);
                list = dao.Listar();
                request.setAttribute("usuario1", list);
                request.getRequestDispatcher("Vistas/ListarUsuario.jsp").forward(request, response);

                break;

            case "editar":
                String idu = request.getParameter("id");
                Usuario u = (Usuario) dao.list(idu);
                request.setAttribute("u", u);
                request.getRequestDispatcher("Vistas/EditarUsuario.jsp").forward(request, response);
                break;

            case "nuevo":
                id = request.getParameter("id");
                nom = request.getParameter("nombre");
                ape = request.getParameter("apellido");
                dir = request.getParameter("direccion");
                tel = request.getParameter("telefono");
                cor = request.getParameter("correo");
                usu = request.getParameter("usuario");
                pas = request.getParameter("contrasena");
                tip = request.getParameter("tipo");

                System.out.println("Entro a nuevo" + id);
                us.setId(id);
                us.setNombre(nom);
                us.setApellido(ape);
                us.setDireccion(dir);
                us.setTelefono(tel);
                us.setCorreo(cor);
                us.setUsuario(usu);
                us.setContrasena(pas);
                us.setTipo(tip);

                dao.crear(us);

                if (us.getTipo().equals("Administrador")) {

                    list = dao.Listar();
                    request.setAttribute("usuario1", list);
                    request.getRequestDispatcher("Vistas/ListarUsuario.jsp").forward(request, response);

                } 
                
                if (us.getTipo().equals("Cliente")) {
                    
                    response.sendRedirect("Vistas/Login.jsp");
                }

                break;

           

            case "Eliminar":
                System.out.println("Entro a eliminar");
                id = request.getParameter("id");
                System.out.println("el id es " + id);
                dao.eliminar(id);
                list = dao.Listar();
                request.setAttribute("usuario", list);
                request.getRequestDispatcher("Vistas/ListarUsuario.jsp").forward(request, response);

                break;

            default:
                throw new AssertionError();

        }

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
