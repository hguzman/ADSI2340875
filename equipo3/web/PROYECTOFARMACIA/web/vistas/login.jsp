<%-- 
    Document   : login
    Created on : 9/09/2022, 08:14:10 AM
    Author     : SENA
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css" integrity="sha384-xOolHFLEh07PJGoPkLv1IbcEPTNtaed2xpHsD9ESMhqIYd0nLMwNLD69Npy4HI+N" crossorigin="anonymous">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"  crossorigin="anonymous">
        <link href="../CSS/estilos.css" rel="stylesheet" type="text/css"/>
        <title>JSP Page</title>
    </head>
    <% String Mensaje = "";
    if (request.getParameter("ingreso") != null){
        int i = Integer.parseInt(request.getParameter("ingreso"));
        if (i==0){
            Mensaje= "error : datos incorrectos";
        }
    }
    
    %>
    <body>
        
        <div class="container mt-4 col-lg-4">
            <div class="card col-sm-10">
                <div class="card-body">
                    <form class="form-sign" method="post" action="../validar">
                        <div class="form-group text-center">
                            <h3>FarmaVision</h3>
                            <img src="../img/login.png" width="100px" height="100px" alt=""/>
                            
                            <h3>Ingresa tu cuenta</h3>
                        </div>
                        <div class="form-group">
                            <lable> Usuario</lable>
                            <input type="text" name="usuario" class="form-control" >
                        </div>
                        <div class="form-group">
                            <lable> Contraseña</lable>
                            <input type="password" name="contrasena" class="form-control">
                        </div>
                        <input type="submit" name="accion" value="Ingresar" class="btn btn-primary btn-block">
                        <label>¿No tienes cuenta?    <a href="/PROYECTOFARMACIA/vistas/regisnuevousu.jsp?accion=nuevo" >Crear una cuenta</a></label> 
                    </form>
                </div>
            </div>
        </div>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"  crossorigin="anonymous"></script>
    </body>
</html>
