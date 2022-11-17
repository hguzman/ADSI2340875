package org.apache.jsp.Vistas;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Configuracion.Conectar;
import java.sql.*;

public final class Registro_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css\" integrity=\"sha384-xOolHFLEh07PJGoPkLv1IbcEPTNtaed2xpHsD9ESMhqIYd0nLMwNLD69Npy4HI+N\" crossorigin=\"anonymous\">\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC\" crossorigin=\"anonymous\">\n");
      out.write("        <link href=\"https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css\" rel=\"stylesheet\"  crossorigin=\"anonymous\">\n");
      out.write("        <link href=\"../CSS/Validar1.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <title>Registro</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <nav class=\"navbar navbar-expand-lg navbar-dark bg-dark\">\n");
      out.write("            <div class=\"container-fluid\">\n");
      out.write("                <ul class=\"navbar-nav\">\n");
      out.write("                    <li class=\"nav-item dropdown\">\n");
      out.write("                        <a class=\"nav-link active dropdown-toggle navbar-brand\" href=\"#\" id=\"navbarDropdown\" role=\"button\" data-bs-toggle=\"dropdown\" aria-expanded=\"false\">\n");
      out.write("                            <img src=\"Imagenes/logo_cinyuje.png\" width=\"90\" alt=\"logo_cinyuje\"/>\n");
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
      out.write("        <div class=\"container mt-2 border\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-sm-2\"></div>\n");
      out.write("                    <div class=\"col-sm-8 border mt-2 mb-2\">\n");
      out.write("                        <form action=\"../CtrUsuario?accion=nuevo\" class=\"formulario\" id=\"formulario\">\n");
      out.write("                            <div class=\"form-row\">\n");
      out.write("                                <!-- Identificacion-->\n");
      out.write("                                <div class =\"col formulario__grupo\" id=\"grupo__identificacion\">\n");
      out.write("                                    <label for=\"id\" class=\"formulario__label\" >Identificacion</label>\n");
      out.write("                                    <div class=\"formulario__grupo-input\">\n");
      out.write("                                        <input type=\"text\" class=\"formulario__input\" name = \"id\" id=\"id\" placeholder=\"12345678\">\n");
      out.write("                                        <i class=\"formulario__validacion-estado fa fa-times-circle\"></i>\n");
      out.write("                                    </div>\n");
      out.write("                                    <p class=\"formulario__input-error\">La identificacion tiene que ser de 7 a 10 digitos solo se aceptan numeros</p>\n");
      out.write("                                </div>\n");
      out.write("                                <!-- correo-->\n");
      out.write("                                <div class =\"col formulario__grupo\" id=\"grupo__correo\">\n");
      out.write("                                    <label for=\"correo\" class=\"formulario__label\" >Correo</label>\n");
      out.write("                                    <div class=\"formulario__grupo-input\">\n");
      out.write("                                        <input type=\"email\" class=\"formulario__input\" name = \"correo\" id=\"correo\" placeholder=\"abc@xyz.com\">\n");
      out.write("                                        <i class=\"formulario__validacion-estado fa fa-times-circle\"></i>\n");
      out.write("                                    </div>\n");
      out.write("                                    <p class=\"formulario__input-error\">El correo solo puede contener letras, numero, punto guiones y guion bajo</p>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-row\">\n");
      out.write("                                <!-- Nombre-->\n");
      out.write("                                <div class =\"col formulario__grupo\" id=\"grupo__nombre\">\n");
      out.write("                                    <label for=\"nombre\" class=\"formulario__label\" >Nombre</label>\n");
      out.write("                                    <div class=\"formulario__grupo-input\">\n");
      out.write("                                        <input type=\"text\" class=\"formulario__input\" name = \"nombre\" id=\"nombre\" placeholder=\"jhon smith\">\n");
      out.write("                                        <i class=\"formulario__validacion-estado fa fa-times-circle\"></i>\n");
      out.write("                                    </div>\n");
      out.write("                                    <p class=\"formulario__input-error\">nombre tiene que ser letras o espacio no se aceptan numeros ni caracteres especiales</p>\n");
      out.write("                                </div>\n");
      out.write("                                <!-- Apellido-->\n");
      out.write("                                <div class =\"col formulario__grupo\" id=\"grupo__apellido\">\n");
      out.write("                                    <label for=\"apellido\" class=\"formulario__label\" >Apellido</label>\n");
      out.write("                                    <div class=\"formulario__grupo-input\">\n");
      out.write("                                        <input type=\"text\" class=\"formulario__input\" name = \"apellido\" id=\"apellido\" placeholder=\"perez castro\">\n");
      out.write("                                        <i class=\"formulario__validacion-estado fa fa-times-circle\"></i>\n");
      out.write("                                    </div>\n");
      out.write("                                    <p class=\"formulario__input-error\">El apellido tiene que ser letras o espacio no se aceptan numeros ni caracteres especiales</p>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                             <div class=\"form-row\">\n");
      out.write("                                <!-- Direccion-->\n");
      out.write("                                <div class =\"col formulario__grupo\" id=\"grupo__direccion\">\n");
      out.write("                                    <label for=\"direccion\" class=\"formulario__label\" >Direccion</label>\n");
      out.write("                                    <div class=\"formulario__grupo-input\">\n");
      out.write("                                        <input type=\"text\" class=\"formulario__input\" name = \"direccion\" id=\"direccion\" placeholder=\"Calle 30 #3E-164\">\n");
      out.write("                                        <i class=\"formulario__validacion-estado fa fa-times-circle\"></i>\n");
      out.write("                                    </div>\n");
      out.write("                                    <p class=\"formulario__input-error\">La direccion puede contener letras, numeros y caracteres especiales como - #</p>\n");
      out.write("                                </div>\n");
      out.write("                                <!-- Telefono-->\n");
      out.write("                                <div class =\"col formulario__grupo\" id=\"grupo__telefono\">\n");
      out.write("                                    <label for=\"telefono\" class=\"formulario__label\" >Telefono</label>\n");
      out.write("                                    <div class=\"formulario__grupo-input\">\n");
      out.write("                                        <input type=\"text\" class=\"formulario__input\" name = \"telefono\" id=\"telefono\" placeholder=\"3106549873\">\n");
      out.write("                                        <i class=\"formulario__validacion-estado fa fa-times-circle\"></i>\n");
      out.write("                                    </div>\n");
      out.write("                                    <p class=\"formulario__input-error\">El telefono tiene que ser 10 digitos, solo se aceptan numeros</p>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-row\">\n");
      out.write("                                <!-- Usuario-->\n");
      out.write("                                <div class =\"col formulario__grupo\" id=\"grupo__usuario\">\n");
      out.write("                                    <label for=\"usuario\" class=\"formulario__label\" >Usuario</label>\n");
      out.write("                                    <div class=\"formulario__grupo-input\">\n");
      out.write("                                        <input type=\"text\" class=\"formulario__input\" name = \"usuario\" id=\"usuario\" placeholder=\"usuario1\">\n");
      out.write("                                        <i class=\"formulario__validacion-estado fa fa-times-circle\"></i>\n");
      out.write("                                    </div>\n");
      out.write("                                    <p class=\"formulario__input-error\">El usuario tiene que ser de 4 a 10 caracteres, solo se aceptan letras y numeros</p>\n");
      out.write("                                </div>\n");
      out.write("                                <!-- Tipo-->\n");
      out.write("                                \n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-row\">\n");
      out.write("                                <!-- Contraseña-->\n");
      out.write("                                <div class =\"col formulario__grupo\" id=\"grupo__contrasena\">\n");
      out.write("                                    <label for=\"contrasena\" class=\"formulario__label\" >Contraseña</label>\n");
      out.write("                                    <div class=\"formulario__grupo-input\">\n");
      out.write("                                        <input type=\"password\" class=\"formulario__input\" name = \"contrasena\" id=\"contrasena\">\n");
      out.write("                                        <i class=\"formulario__validacion-estado fa fa-times-circle\"></i>\n");
      out.write("                                    </div>\n");
      out.write("                                    <p class=\"formulario__input-error\">La contraseña debe contener entre 4 y 10 caracteres</p>\n");
      out.write("                                </div>\n");
      out.write("                                <!-- Repetir Contraseña-->\n");
      out.write("                                <div class =\"col formulario__grupo\" id=\"grupo__contrasena2\">\n");
      out.write("                                    <label for=\"contrasena2\" class=\"formulario__label\" >Repetir Contraseña</label>\n");
      out.write("                                    <div class=\"formulario__grupo-input\">\n");
      out.write("                                        <input type=\"password\" class=\"formulario__input\" name = \"contrasena2\" id=\"contrasena2\">\n");
      out.write("                                        <i class=\"formulario__validacion-estado fa fa-times-circle\"></i>\n");
      out.write("                                    </div>\n");
      out.write("                                    <p class=\"formulario__input-error\">Ambas contraseñas deben ser iguales</p>\n");
      out.write("                                </div>\n");
      out.write("                                \n");
      out.write("                            </div>\n");
      out.write("                             <!-- terminos-->\n");
      out.write("                                <div class =\"formulario__grupo\" id=\"grupo__terminos\">\n");
      out.write("                                    <label class=\"formulario__label\" >\n");
      out.write("                                        <input type=\"checkbox\" class=\"formulario__checkbox\" name=\"terminos\" id=\"terminos\">\n");
      out.write("                                        Acepto terminos y condiciones\n");
      out.write("                                    </label>\n");
      out.write("                                </div>\n");
      out.write("                             <div class=\"formulario__mensaje\" id=\"formulario__mensaje\">\n");
      out.write("                                <p><i class=\"fa fa-exclamation-triangle\"></i> <b>Error:</b> por favor llena corectamente el formulario</p>\n");
      out.write("                            </div>\n");
      out.write("                             <div class=\"form-row\">\n");
      out.write("                                <!-- botones-->\n");
      out.write("                                <div class =\"col mt-2 text-center formulario__grupo-btn-enviar\">\n");
      out.write("                                    <button type=\"submit\" class=\"btn btn-primary formulario__btn\" name=\"accion\" value=\"nuevo\">Guardar <i class=\"fa fa-floppy-o\" aria-hidden=\"true\"></i></button> \n");
      out.write("                                    <a class=\"btn btn-danger formulario__btn\" name=\"regresar\" href=\"#\">Regresar <i class=\"fa fa-undo\" aria-hidden=\"true\"></i></a>\n");
      out.write("                                    <p class=\"formulario__mensaje-exito\" id=\"formulario__mensaje-exito\">Informacion enviada exitosamente</p>\n");
      out.write("                                </div>\n");
      out.write("                                                               \n");
      out.write("                            </div>\n");
      out.write("                        </form>  \n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("         \n");
      out.write("         <script src=\"https://code.jquery.com/jquery-3.3.1.js\"></script>\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://unpkg.com/sweetalert/dist/sweetalert.min.js\"></script>\n");
      out.write("        <script src=\"/Proyecto_Cinyuje/JS/Funciones.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"/Proyecto_Cinyuje/JS/Funciones2.js\" type=\"text/javascript\"></script>                       \n");
      out.write("        <script src=\"/Proyecto_Cinyuje/JS/Validar1.js\" type=\"text/javascript\"></script>                        \n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
