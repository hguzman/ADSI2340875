package org.apache.jsp.vistas;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import configuracion.Conectar;
import java.sql.*;

public final class crearproducto_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        \n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css\" crossorigin=\"anonymous\">\n");
      out.write("        <link href=\"https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css\" rel=\"stylesheet\" crossorigin=\"anonymous\">\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" crossorigin=\"anonymous\">\n");
      out.write("        \n");
      out.write("        <link href=\"/PROYECTOFARMACIA/CSS/Validar.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <title>Crear Producto</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("      \n");
      out.write("        <div class=\"container mt-2 border\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-sm-2\"></div>\n");
      out.write("                    <div class=\"col-sm-8 border mt-2 mb-2\">\n");
      out.write("                        <form action=\"../CtrProducto?accion=nuevo\" class=\"formulario\" id=\"formulario\">\n");
      out.write("                            \n");
      out.write("                                \n");
      out.write("                                <!-- Identificacion-->\n");
      out.write("                                <div class =\"col formulario__grupo\" id=\"grupo__identificacion\">\n");
      out.write("                                    <label for=\"id\" class=\"formulario__label\" >Idp</label>\n");
      out.write("                                    <div class=\"formulario__grupo-input\">\n");
      out.write("                                        <input type=\"text\" class=\"formulario__input\" name = \"id\" id=\"id\" >\n");
      out.write("                                        <i class=\"formulario__validacion-estado fa fa-times-circle\"></i>\n");
      out.write("                                    </div>\n");
      out.write("                                    <p class=\"formulario__input-error\">La identificacion tiene que ser de 7 a 10 digitos solo se aceptan numeros</p>\n");
      out.write("                                </div>\n");
      out.write("                                <!-- Nombre-->\n");
      out.write("                                <div class =\"col formulario__grupo\" id=\"grupo__nombre\">\n");
      out.write("                                    <label for=\"nombre\" class=\"formulario__label\" >Nombre</label>\n");
      out.write("                                    <div class=\"formulario__grupo-input\">\n");
      out.write("                                        <input type=\"text\" class=\"formulario__input\" name = \"nombre\" id=\"nombre\">\n");
      out.write("                                        <i class=\"formulario__validacion-estado fa fa-times-circle\"></i>\n");
      out.write("                                    </div>\n");
      out.write("                                    <p class=\"formulario__input-error\">El correo solo puede contener letras, numero, punto guiones y guion bajo</p>\n");
      out.write("                                </div>\n");
      out.write("                           \n");
      out.write("                           \n");
      out.write("                             \n");
      out.write("                                <!-- Descripcion-->\n");
      out.write("                                <div class =\"col formulario__grupo\" id=\"grupo__descipcion\">\n");
      out.write("                                    <label for=\"descripcion\" class=\"formulario__label\" >Descripcion</label>\n");
      out.write("                                    <div class=\"formulario__grupo-input\">\n");
      out.write("                                        <input type=\"text\" class=\"formulario__input\" name = \"descripcion\" id=\"descripcion\">\n");
      out.write("                                        <i class=\"formulario__validacion-estado fa fa-times-circle\"></i>\n");
      out.write("                                    </div>\n");
      out.write("                                    <p class=\"formulario__input-error\">La direccion puede contener letras, numeros y caracteres especiales como - #</p>\n");
      out.write("                                </div>\n");
      out.write("                                \n");
      out.write("                                <!-- Precio-->\n");
      out.write("                                <div class =\"col formulario__grupo\" id=\"grupo__precio\">\n");
      out.write("                                    <label for=\"precio\" class=\"formulario__label\" >Precio</label>\n");
      out.write("                                    <div class=\"formulario__grupo-input\">\n");
      out.write("                                        <input type=\"number\" class=\"formulario__input\" name = \"precio\" id=\"precio\">\n");
      out.write("                                        <i class=\"formulario__validacion-estado fa fa-times-circle\"></i>\n");
      out.write("                                    </div>\n");
      out.write("                                    <p class=\"formulario__input-error\">El usuario tiene que ser de 4 a 10 caracteres, solo se aceptan letras y numeros</p>\n");
      out.write("                                </div>\n");
      out.write("                               \n");
      out.write("                                 <!--Foto-->\n");
      out.write("                                <div class =\"col formulario__grupo\" id=\"grupo__foto\">\n");
      out.write("                                    <label for=\"foto\" class=\"formulario__label\" >Foto</label>\n");
      out.write("                                    <div class=\"formulario__grupo-input\">\n");
      out.write("                                        <input type=\"file\" class=\"formulario__input\" name = \"foto\" id=\"foto\">\n");
      out.write("                                        <i class=\"formulario__validacion-estado fa fa-times-circle\"></i>\n");
      out.write("                                    </div>\n");
      out.write("                                    <p class=\"formulario__input-error\">Ambas contraseñas deben ser iguales</p>\n");
      out.write("                                </div>\n");
      out.write("                             \n");
      out.write("                                <!-- Stock-->\n");
      out.write("                                <div class =\"col formulario__grupo\" id=\"grupo__stock\">\n");
      out.write("                                    <label for=\"stock\" class=\"formulario__label\" >Stock</label>\n");
      out.write("                                    <div class=\"formulario__grupo-input\">\n");
      out.write("                                        <input type=\"number\" class=\"formulario__input\" name = \"stock\" id=\"stock\">\n");
      out.write("                                        <i class=\"formulario__validacion-estado fa fa-times-circle\"></i>\n");
      out.write("                                    </div>\n");
      out.write("                                    <p class=\"formulario__input-error\">Ambas contraseñas deben ser iguales</p>\n");
      out.write("                                </div>\n");
      out.write("     \n");
      out.write("                                <!-- botones-->\n");
      out.write("                                <div class =\"col mt-2 text-center formulario__grupo-btn-enviar\">\n");
      out.write("                                    <button type=\"submit\" class=\"btn btn-primary formulario__btn\" name=\"accion\" value=\"nuevo\">Guardar <i class=\"fa fa-floppy-o\" aria-hidden=\"true\"></i></button> \n");
      out.write("                                    <a class=\"btn btn-danger formulario__btn\" name=\"regresar\" href=\"/PROYECTOFARMACIA/CtrUsuario?accion=Listar\">Regresar <i class=\"fa fa-undo\" aria-hidden=\"true\"></i></a>\n");
      out.write("                                    <p class=\"formulario__mensaje-exito\" id=\"formulario__mensaje-exito\">Informacion enviada exitosamente</p>\n");
      out.write("                                </div>\n");
      out.write("                                                               \n");
      out.write("                            </div>\n");
      out.write("                        </form>  \n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("        </div>\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.3.1.js\"></script>\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js\" ></script>\n");
      out.write("        <script src=\"https://unpkg.com/sweetalert/dist/sweetalert.min.js\"></script>\n");
      out.write("        <script src=\"/PROYECTOFARMACIA/JS/validar1.js\" type=\"text/javascript\"></script>\n");
      out.write("        \n");
      out.write("    </body>\n");
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
