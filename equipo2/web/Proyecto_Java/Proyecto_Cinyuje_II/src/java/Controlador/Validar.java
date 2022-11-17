/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.*;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Clase Validar
 * Responde a la interacción que hace el usuario en la interfaz y realiza las peticiones al modelo para pasar estos a la vista.
 * Version: 1.0.0
 * @author Equipo Cinyuje
 */
@WebServlet(name = "Validar", urlPatterns = {"/Validar"})
public class Validar extends HttpServlet {

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
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Validar</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Validar at " + request.getContextPath() + "</h1>");
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
    
    Usuario usu = new Usuario();
    UsuarioDAO usudao = new UsuarioDAO();
    
    
    
    
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
        String usua = request.getParameter("txtuser");
        String pas = request.getParameter("txtpassword");
        
        usu = usudao.Validar(usua, pas);
        if (usu.getUsuario() != null) {
            
            
            
            HttpSession sesion = request.getSession();
            sesion.setAttribute("log", '1');
            sesion.setAttribute("user", usu.getUsuario());
            sesion.setAttribute("id", usu.getId());
            sesion.setAttribute("tipo", usu.getTipo());
            sesion.setAttribute("usuario", usu);
           
            
            if (usu.getTipo().equals("Administrador")) {
                response.sendRedirect("/Proyecto_Cinyuje/CtrProducto?accion=home");
            }
            
            if (usu.getTipo().equals("Cliente")) {
                response.sendRedirect("../Proyecto_Cinyuje/Vistas/Ventas_Cliente.jsp");
            }
                 
        } else{
            response.sendRedirect("../Proyecto_Cinyuje/Vistas/Login.jsp?ingreso=0");
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
