/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import modelo.usuario;
import modelo.usuarioDAO;

/**
 *
 * @author SENA
 */
@WebServlet(name = "validar", urlPatterns = {"/validar"})
public class validar extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    usuario usuari = new usuario();
    usuarioDAO usuario = new usuarioDAO();
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        
        
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet validar</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet validar at " + request.getContextPath() + "</h1>");
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
        //processRequest(request, response);
        String accion = request.getParameter("accion");
        if(accion.equalsIgnoreCase("Ingresar")){
            
            String usu = request.getParameter("usuario");
            String pas = request.getParameter("contrasena");
            System.out.println("ingreso "+usu);
            System.out.println("ingreso "+pas);

            usuari = usuario.validar(usu, pas);
            if(usuari.getUsuario() != null){
                HttpSession sesion = request.getSession();
                sesion.setAttribute("log", '1');
                sesion.setAttribute("user", usuari.getUsuario());
                sesion.setAttribute("id", usuari.getId());
                sesion.setAttribute("tipo", usuari.getTipo());
                sesion.setAttribute("usuario", usuari);
                if(usuari.getTipo().equals("Administrador")){
                    response.sendRedirect("/dulce/CtrProducto?accion=home");
                }
                if(usuari.getTipo().equals("Cliente")){
                    response.sendRedirect("/dulce/CtrProducto?accion=home");
                }
                
            }else{
                response.sendRedirect("/dulce/vistas/login.jsp?ingreso=0");
            }
        }
        if(accion.equalsIgnoreCase("Registrarse")){
                response.sendRedirect("/dulce/vistas/CrearUsuario.jsp?ingreso=0");
            
        }
        
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
