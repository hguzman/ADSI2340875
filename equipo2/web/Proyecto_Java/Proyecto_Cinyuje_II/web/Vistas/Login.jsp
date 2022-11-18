<%-- 
    Document   : Login
    Created on : 18/09/2022, 12:47:52 PM
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <a href="Login.jsp"></a>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0/css/all.min.css"/> 
        <link href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet"  crossorigin="anonymous">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css" integrity="sha384-xOolHFLEh07PJGoPkLv1IbcEPTNtaed2xpHsD9ESMhqIYd0nLMwNLD69Npy4HI+N" crossorigin="anonymous">
        <link href="/Proyecto_Cinyuje/CSS/login.css" rel="stylesheet" type="text/css"/>
        
        <title>Cinyuje</title>
    </head>
    <%
        String Mensaje = "";
        if(request.getParameter("ingreso") != null){
            int i = Integer.parseInt(request.getParameter("ingreso"));
            if (i==0) {
                    Mensaje="Error: Datos Incorrectos";
                }
        }
    %>
       
    <body>
        <nav class="navbar navbar-expand-lg navbar-dark bg-dark">
            <div class="container-fluid">
                <ul class="navbar-nav">
                    <li class="nav-item dropdown">
                        <a class="nav-link active dropdown-toggle navbar-brand" href="#" id="navbarDropdown" role="button" data-bs-toggle="dropdown" aria-expanded="false">
                            <img src="../Imagenes/logo_cinyuje.png" width="90" alt="logo_cinyuje"/>
                        </a>
                        <ul class="dropdown-menu" aria-labelledby="navbarDropdown">
                            <li><a class="dropdown-item" href="/Proyecto_Cinyuje/CtrProducto?accion=Listar"  data-bs-target="#item"><i class="fa fa-shopping-basket" aria-hidden="true"></i> Productos</a></li>
                            <li><a class="dropdown-item" href="#"><i class="fa fa-cubes" aria-hidden="true"></i> Categorias</a></li>
                                <%--<li><hr class="dropdown-divider"></li>--%>
                            <li><a class="dropdown-item" href="/Proyecto_Cinyuje/CtrUsuario?accion=Listar"><i class="fa fa-users" aria-hidden="true"></i> Usuarios</a></li>
                        </ul>
                    </li>   
                    
                </ul>

                <div class="collapse navbar-collapse" id="navbarSupportedContent">
                    <ul class="navbar-nav me-auto mb-2 mb-lg-0">
                        <li class="nav-item">
                            <a class="nav-link active" href="/Proyecto_Cinyuje/CtrProducto?accion=home">Inicio</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link active" href="#">Oferta del día</a>
                        </li>

                        <li class="nav-item">
                            <a class="nav-link" href="/Proyecto_Cinyuje/CtrProducto?accion=Carrito">Carrito <i class="fas fa-shopping-cart">(<label style="color: darkorange">${contador}</label>)</i></a>
                        </li> 
                    </ul>
                    <form class="d-flex" action="/Proyecto_Cinyuje/CtrProducto?accion=buscar" method="POST">
                        <input class="form-control me-2" type="search" placeholder="Search" aria-label="Search" name="busqueda">
                        <button class="btn btn-outline-primary" type="submit">Buscar</button>
                    </form>
                    <ul class="navbar-nav">
                        <li class="nav-item dropdown">
                            <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-bs-toggle="dropdown" aria-expanded="false">
                                Mi Cuenta
                            </a>
                            <ul class="dropdown-menu" aria-labelledby="navbarDropdown">
                                <li>
                                    <a class="dropdown-item text-center" href="#">
                                        <img src="Imagenes/usuario.png" height="60" width="60" alt="img_usuario"/>
                                    </a>
                                </li>

                                <li><hr class="dropdown-divider"></li>

                                <form class="form-inline" action="/Proyecto_Cinyuje/Vistas/Login.jsp" method="POST">
                                    <button name="action" value="Salir" class="dropdown-item text-center">Iniciar Sesión</button>

                                </form>


                            </ul>          
                        </li>
                    </ul>

                </div>       
            </div>
        </nav>
        <div class="container mt-4 col-lg-4">
            <div class="card col-sm-10" id="login">
                <div class="card-body">
                    <form class="form-sign" action="/Proyecto_Cinyuje/Validar" method="POST">
                        <div class="form-group text-center">
                            
                            <img src="../Imagenes/logo_oscuro.png" width="200" height="100" alt=""/>
                            <hr>
                            <h3>
                               Inicia sesión
                            </h3>
                            
                        </div>
                        <div class="form-group">
                            <label>
                                Usuario:
                            </label>
                            <input type="text" name="txtuser" class="form-control">
                        </div>
                        <div class="form-group">
                            <label> 
                                Contraseña:
                            </label>
                            <input type="password" name="txtpassword" class="form-control">
                        </div>
                        <input type="submit" name="accion" value="Ingresar" class="btn btn-outline-primary btn-block">
                        <p style="color:red;">
                            <%=Mensaje%>
                        </p>
                        <center>
                        <a href="#">Recordar contraseña</a>
                        </center>
                     
                        
                        
                        
                    </form>
                        <div class="container mt-2" id="registro">
                            
                            <a href="Registro.jsp"><button>Registrate</button></a>
                            
                        </div>
                       
                </div>
            </div>
        </div>
      
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
    </body>
</html>