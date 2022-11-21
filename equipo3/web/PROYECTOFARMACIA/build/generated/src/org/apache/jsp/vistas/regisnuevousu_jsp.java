package org.apache.jsp.vistas;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class regisnuevousu_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("   <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        \n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css\" crossorigin=\"anonymous\">\n");
      out.write("        <link href=\"https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css\" rel=\"stylesheet\" crossorigin=\"anonymous\">\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" crossorigin=\"anonymous\">\n");
      out.write("        \n");
      out.write("        <link href=\"/PROYECTOFARMACIA/CSS/Validar.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <title>Crear Usuario</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("      \n");
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
      out.write("                                <div class =\"col formulario__grupo\" id=\"grupo__tipo\">\n");
      out.write("                                    <label for=\"tipo\" class=\"formulario__label\" >Tipo</label>\n");
      out.write("                                    <select class=\"form-control\" name=\"tipo\">\n");
      out.write("                                        <option value=\"Cliente\">Cliente</option>\n");
      out.write("                                        \n");
      out.write("                                    </select></br>\n");
      out.write("                                </div>\n");
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
