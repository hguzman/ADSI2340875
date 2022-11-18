package org.apache.jsp.Vistas;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Configuracion.Conectar;
import java.sql.*;

public final class CrearProducto_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0/css/all.min.css\"/> \n");
      out.write("        <link href=\"https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css\" rel=\"stylesheet\"  crossorigin=\"anonymous\">\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC\" crossorigin=\"anonymous\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css\" integrity=\"sha384-xOolHFLEh07PJGoPkLv1IbcEPTNtaed2xpHsD9ESMhqIYd0nLMwNLD69Npy4HI+N\" crossorigin=\"anonymous\">\n");
      out.write("        <link href=\"../CSS/Validar1.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("\n");
      out.write("        \n");
      out.write("        <title>Crear Producto</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("         <nav class=\"navbar navbar-expand-lg navbar-dark bg-dark\">\n");
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
      out.write("                                ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${usuario.getNombre()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(' ');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${usuario.getApellido()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\n");
      out.write("                            </a>\n");
      out.write("                            <ul class=\"dropdown-menu\" aria-labelledby=\"navbarDropdown\">\n");
      out.write("                                <li><a class=\"dropdown-item text-center\" href=\"#\">\n");
      out.write("                                        <img src=\"/tienda1/Imagenes/usuario4-peque.png\" alt=\"60\" width =\"60\"/>\n");
      out.write("                                    </a></li>\n");
      out.write("                                <li><a class=\"dropdown-item text-center\" href=\"#\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${usuario.getUsuario()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</a></li>\n");
      out.write("                                <li><a class=\"dropdown-item text-center\" href=\"#\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${usuario.getTipo()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</a></li>\n");
      out.write("                                <li><hr class=\"dropdown-divider\"></li>\n");
      out.write("                                <li><a class=\"dropdown-item text-center\" href=\"/Proyecto_Cinyuje/Vistas/Logout.jsp\">Salir</a></li>\n");
      out.write("                                ");
      out.write("\n");
      out.write("                            </ul>\n");
      out.write("                        </li>\n");
      out.write("                    </ul>\n");
      out.write("\n");
      out.write("                </div>       \n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("        <div class=\"container mt-2\" id=\"formulario_admin\">\n");
      out.write("                <div class=\"row\" >\n");
      out.write("                    <div class=\"col-sm-2\">    \n");
      out.write("                        \n");
      out.write("                    </div>\n");
      out.write("                    \n");
      out.write("                    <div class=\"col-sm-8 border mt-2 mb-2\" >\n");
      out.write("                        <center>\n");
      out.write("                        <img src=\"\" width=\"700\" id=\"crearusuario\" alt=\"crearproducto\"/>    \n");
      out.write("                        </center>\n");
      out.write("                        \n");
      out.write("\n");
      out.write("                        <form action=\"../CtrProducto?accion=Agregar\" class=\"formulario\" id=\"formulario\">\n");
      out.write("                           \n");
      out.write("                            <div class=\"form-row\">\n");
      out.write("                                <!-- Nombre-->\n");
      out.write("                                <div class =\"col formulario__grupo\" id=\"grupo__nombre\">\n");
      out.write("                                    <label for=\"nombre\" class=\"formulario__label\" >Nombre </label>\n");
      out.write("                                    <div class=\"formulario__grupo-input\">\n");
      out.write("                                        <input type=\"text\" class=\"formulario__input\" name = \"nombre\" id=\"nombre\" placeholder=\"Globos\">\n");
      out.write("                                        <i class=\"formulario__validacion-estado fa fa-times-circle\"></i>\n");
      out.write("                                    </div>\n");
      out.write("                                    <p class=\"formulario__input-error\">nombre tiene que ser letras o espacio no se aceptan numeros ni caracteres especiales</p>\n");
      out.write("                                </div>\n");
      out.write("                                <!-- Descripcion-->\n");
      out.write("                                <div class =\"col formulario__grupo\" id=\"grupo__descripcion\">\n");
      out.write("                                    <label for=\"descripcion\" class=\"formulario__label\" >Descripción</label>\n");
      out.write("                                    <div class=\"formulario__grupo-input\">\n");
      out.write("                                        <input type=\"text\" class=\"formulario__input\" name = \"descripcion\" id=\"descripcion\" placeholder=\"Descripcion producto\">\n");
      out.write("                                        <i class=\"formulario__validacion-estado fa fa-times-circle\"></i>\n");
      out.write("                                    </div>\n");
      out.write("                                    <p class=\"formulario__input-error\">La descripción debe ser solo letras</p>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                             <div class=\"form-row\">\n");
      out.write("                                <!-- Precio-->\n");
      out.write("                                <div class =\"col formulario__grupo\" id=\"grupo__precio\">\n");
      out.write("                                    <label for=\"direccion\" class=\"formulario__label\" >  Precio</label>\n");
      out.write("                                    <div class=\"formulario__grupo-input\">\n");
      out.write("                                        <input type=\"number\" class=\"formulario__input\" name = \"precio\" id=\"precio\" placeholder=\"20000\">\n");
      out.write("                                        <i class=\"formulario__validacion-estado fa fa-times-circle\"></i>\n");
      out.write("                                    </div>\n");
      out.write("                                    <p class=\"formulario__input-error\">El precio solo debe contener numeros</p>\n");
      out.write("                                </div>\n");
      out.write("                                <!-- Stock-->\n");
      out.write("                                <div class =\"col formulario__grupo\" id=\"grupo__stock\">\n");
      out.write("                                   <label for=\"stock\" class=\"formulario__label\"> Stock </label>                          \n");
      out.write("                                    <div class=\"formulario__grupo-input\">\n");
      out.write("                                        <input type=\"number\" class=\"formulario__input\" name = \"stock\" id=\"stock\" placeholder=\"20\">\n");
      out.write("                                        <i class=\"formulario__validacion-estado fa fa-times-circle\"></i>\n");
      out.write("                                    </div>\n");
      out.write("                                    <p class=\"formulario__input-error\">Stock es numerico</p>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-row\">\n");
      out.write("                                <!-- -->\n");
      out.write("                                \n");
      out.write("                                <!-- Tipo-->\n");
      out.write("                                <div class =\"col formulario__grupo\" id=\"grupo__tipo\">\n");
      out.write("                                    <label for=\"tipo\" class=\"formulario__label\" >Categoria</label>\n");
      out.write("                                    <select class=\"form-control\" name=\"categoria\" id=\"categoria\">\n");
      out.write("                                        <option value=\"1\">Recordatorios</option>\n");
      out.write("                                        <option value=\"2\">Anchetas</option>\n");
      out.write("                                        <option value=\"3\">Globos</option>\n");
      out.write("                                        <option value=\"4\">Decoraciones</option>\n");
      out.write("                                    </select></br>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-row\">\n");
      out.write("                                <!-- Imagen-->\n");
      out.write("                                <div class =\"col formulario__grupo\" id=\"grupo__contrasena\">\n");
      out.write("                                    <label for=\"imagen\" class=\"formulario__label\" >Imagen</label>\n");
      out.write("                                    <div class=\"formulario__grupo-input\">\n");
      out.write("                                        <input type=\"file\" class=\"formulario__input\" name = \"imagen\" id=\"imagen\">\n");
      out.write("                                        <input type=\"hidden\" id=\"fotoId\" name=\"fotoId\" value=\"\">\n");
      out.write("                                        <i class=\"formulario__validacion-estado fa fa-times-circle\"></i>\n");
      out.write("                                    </div>\n");
      out.write("                                    <p class=\"formulario__input-error\">La imagen debe ser JPG</p>\n");
      out.write("                                </div>\n");
      out.write("                               \n");
      out.write("                                \n");
      out.write("                            </div>\n");
      out.write("                            \n");
      out.write("                             <div class=\"formulario__mensaje\" id=\"formulario__mensaje\">\n");
      out.write("                                <p><i class=\"fa fa-exclamation-triangle\"></i> <b>Error:</b> por favor llena correctamente el formulario</p>\n");
      out.write("                            </div>\n");
      out.write("                             <div class=\"form-row\">\n");
      out.write("                                <!-- botones-->\n");
      out.write("                                <div class =\"col mt-2 text-center formulario__grupo-btn-enviar\">\n");
      out.write("                                    <button type=\"submit\" class=\"btn btn-success formulario__btn\" name=\"accion\" value=\"Agregar\">Guardar <i class=\"fa fa-check\"></i></button> \n");
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
      out.write("        <script src=\"/Proyecto_Cinyuje/JS/Funciones2.js\" type=\"text/javascript\"></script>                                              \n");
      out.write("        <script src=\"/Proyecto_Cinyuje/JS/Imagen.js\" type=\"text/javascript\"></script>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
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
