package org.apache.jsp.Vistas;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <a href=\"Login.jsp\"></a>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0/css/all.min.css\"/> \n");
      out.write("        <link href=\"https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css\" rel=\"stylesheet\"  crossorigin=\"anonymous\">\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC\" crossorigin=\"anonymous\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css\" integrity=\"sha384-xOolHFLEh07PJGoPkLv1IbcEPTNtaed2xpHsD9ESMhqIYd0nLMwNLD69Npy4HI+N\" crossorigin=\"anonymous\">\n");
      out.write("        <link href=\"/Proyecto_Cinyuje/CSS/login.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        \n");
      out.write("        <title>Cinyuje</title>\n");
      out.write("    </head>\n");
      out.write("    ");

        String Mensaje = "";
        if(request.getParameter("ingreso") != null){
            int i = Integer.parseInt(request.getParameter("ingreso"));
            if (i==0) {
                    Mensaje="Error: Datos Incorrectos";
                }
        }
    
      out.write("\n");
      out.write("       \n");
      out.write("    <body>\n");
      out.write("        <nav class=\"navbar navbar-expand-lg navbar-dark bg-dark\">\n");
      out.write("            <div class=\"container-fluid\">\n");
      out.write("                <ul class=\"navbar-nav\">\n");
      out.write("                    <li class=\"nav-item dropdown\">\n");
      out.write("                        <a class=\"nav-link active dropdown-toggle navbar-brand\" href=\"#\" id=\"navbarDropdown\" role=\"button\" data-bs-toggle=\"dropdown\" aria-expanded=\"false\">\n");
      out.write("                            <img src=\"../Imagenes/logo_cinyuje.png\" width=\"90\" alt=\"logo_cinyuje\"/>\n");
      out.write("                        </a>\n");
      out.write("                        <ul class=\"dropdown-menu\" aria-labelledby=\"navbarDropdown\">\n");
      out.write("                            <li><a class=\"dropdown-item\" href=\"/Proyecto_Cinyuje/CtrProducto?accion=Listar\"  data-bs-target=\"#item\"><i class=\"fa fa-shopping-basket\" aria-hidden=\"true\"></i> Productos</a></li>\n");
      out.write("                            <li><a class=\"dropdown-item\" href=\"#\"><i class=\"fa fa-cubes\" aria-hidden=\"true\"></i> Categorias</a></li>\n");
      out.write("                                ");
      out.write("\n");
      out.write("                            <li><a class=\"dropdown-item\" href=\"/Proyecto_Cinyuje/CtrUsuario?accion=Listar\"><i class=\"fa fa-users\" aria-hidden=\"true\"></i> Usuarios</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </li>   \n");
      out.write("                    \n");
      out.write("                </ul>\n");
      out.write("\n");
      out.write("                <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\n");
      out.write("                    <ul class=\"navbar-nav me-auto mb-2 mb-lg-0\">\n");
      out.write("                        <li class=\"nav-item\">\n");
      out.write("                            <a class=\"nav-link active\" href=\"/Proyecto_Cinyuje/CtrProducto?accion=home\">Inicio</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"nav-item\">\n");
      out.write("                            <a class=\"nav-link active\" href=\"#\">Oferta del día</a>\n");
      out.write("                        </li>\n");
      out.write("\n");
      out.write("                        <li class=\"nav-item\">\n");
      out.write("                            <a class=\"nav-link\" href=\"/Proyecto_Cinyuje/CtrProducto?accion=Carrito\">Carrito <i class=\"fas fa-shopping-cart\">(<label style=\"color: darkorange\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${contador}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</label>)</i></a>\n");
      out.write("                        </li> \n");
      out.write("                    </ul>\n");
      out.write("                    <form class=\"d-flex\" action=\"/Proyecto_Cinyuje/CtrProducto?accion=buscar\" method=\"POST\">\n");
      out.write("                        <input class=\"form-control me-2\" type=\"search\" placeholder=\"Search\" aria-label=\"Search\" name=\"busqueda\">\n");
      out.write("                        <button class=\"btn btn-outline-primary\" type=\"submit\">Buscar</button>\n");
      out.write("                    </form>\n");
      out.write("                    <ul class=\"navbar-nav\">\n");
      out.write("                        <li class=\"nav-item dropdown\">\n");
      out.write("                            <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbarDropdown\" role=\"button\" data-bs-toggle=\"dropdown\" aria-expanded=\"false\">\n");
      out.write("                                Mi Cuenta\n");
      out.write("                            </a>\n");
      out.write("                            <ul class=\"dropdown-menu\" aria-labelledby=\"navbarDropdown\">\n");
      out.write("                                <li>\n");
      out.write("                                    <a class=\"dropdown-item text-center\" href=\"#\">\n");
      out.write("                                        <img src=\"Imagenes/usuario.png\" height=\"60\" width=\"60\" alt=\"img_usuario\"/>\n");
      out.write("                                    </a>\n");
      out.write("                                </li>\n");
      out.write("\n");
      out.write("                                <li><hr class=\"dropdown-divider\"></li>\n");
      out.write("\n");
      out.write("                                <form class=\"form-inline\" action=\"/Proyecto_Cinyuje/Vistas/Login.jsp\" method=\"POST\">\n");
      out.write("                                    <button name=\"action\" value=\"Salir\" class=\"dropdown-item text-center\">Iniciar Sesión</button>\n");
      out.write("\n");
      out.write("                                </form>\n");
      out.write("\n");
      out.write("\n");
      out.write("                            </ul>          \n");
      out.write("                        </li>\n");
      out.write("                    </ul>\n");
      out.write("\n");
      out.write("                </div>       \n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("        <div class=\"container mt-4 col-lg-4\">\n");
      out.write("            <div class=\"card col-sm-10\" id=\"login\">\n");
      out.write("                <div class=\"card-body\">\n");
      out.write("                    <form class=\"form-sign\" action=\"/Proyecto_Cinyuje/Validar\" method=\"POST\">\n");
      out.write("                        <div class=\"form-group text-center\">\n");
      out.write("                            \n");
      out.write("                            <img src=\"../Imagenes/logo_oscuro.png\" width=\"200\" height=\"100\" alt=\"\"/>\n");
      out.write("                            <hr>\n");
      out.write("                            <h3>\n");
      out.write("                               Inicia sesión\n");
      out.write("                            </h3>\n");
      out.write("                            \n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label>\n");
      out.write("                                Usuario:\n");
      out.write("                            </label>\n");
      out.write("                            <input type=\"text\" name=\"txtuser\" class=\"form-control\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label> \n");
      out.write("                                Contraseña:\n");
      out.write("                            </label>\n");
      out.write("                            <input type=\"password\" name=\"txtpassword\" class=\"form-control\">\n");
      out.write("                        </div>\n");
      out.write("                        <input type=\"submit\" name=\"accion\" value=\"Ingresar\" class=\"btn btn-outline-primary btn-block\">\n");
      out.write("                        <p style=\"color:red;\">\n");
      out.write("                            ");
      out.print(Mensaje);
      out.write("\n");
      out.write("                        </p>\n");
      out.write("                        <center>\n");
      out.write("                        <a href=\"#\">Recordar contraseña</a>\n");
      out.write("                        </center>\n");
      out.write("                     \n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("                    </form>\n");
      out.write("                        <div class=\"container mt-2\" id=\"registro\">\n");
      out.write("                            \n");
      out.write("                            <a href=\"Registro.jsp\"><button>Registrate</button></a>\n");
      out.write("                            \n");
      out.write("                        </div>\n");
      out.write("                       \n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("      \n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM\" crossorigin=\"anonymous\"></script>\n");
      out.write("    </body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
