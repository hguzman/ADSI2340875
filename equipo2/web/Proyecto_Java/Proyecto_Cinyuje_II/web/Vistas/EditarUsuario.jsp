<%-- 
    Document   : EditarUsuario
    Created on : 12/10/2022, 07:37:15 PM
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Editar Usuario</title>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0/css/all.min.css"/> 
        <link href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet"  crossorigin="anonymous">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css" integrity="sha384-xOolHFLEh07PJGoPkLv1IbcEPTNtaed2xpHsD9ESMhqIYd0nLMwNLD69Npy4HI+N" crossorigin="anonymous">
        <link href="/Proyecto_Cinyuje/CSS/Validar1.css" rel="stylesheet" type="text/css"/>
    
    </head>
    <body>
        <nav class="navbar navbar-expand-lg navbar-dark bg-dark">
            <div class="container-fluid">
                <ul class="navbar-nav">
                    <li class="nav-item dropdown">
                        <a class="nav-link active dropdown-toggle navbar-brand" href="#" id="navbarDropdown" role="button" data-bs-toggle="dropdown" aria-expanded="false">
                           Cinyuje 
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
                            <a class="nav-link active" href="/Proyecto_Cinyuje/CtrProducto?accion=home">Home</a>
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
                        <button class="btn btn-outline-success" type="submit">Search</button>
                    </form>
                    <ul class="navbar-nav">
                        <li class="nav-item dropdown">
                            <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-bs-toggle="dropdown" aria-expanded="false">
                               ${usuario.getNombre()}
                               ${usuario.getApellido()}
                            </a>
                            <ul class="dropdown-menu" aria-labelledby="navbarDropdown">
                                <li>
                                    <a class="dropdown-item text-center" href="#">
                                        <img src="Imagenes/usuario.png" height="60" width="60" alt="img_usuario"/>
                                    </a>
                                </li>
                                <li><a class="dropdown-item text-center" href="#">${usuario.getUsuario()}</a></li>
                                <li><a class="dropdown-item text-center" href="#">${usuario.getTipo()}</a></li>
                                <li><hr class="dropdown-divider"></li>
                              
                                <form class="form-inline" action="/Proyecto_Cinyuje/Vistas/Logout.jsp" method="POST">
                                    <button name="action" value="Salir" class="dropdown-item text-center">Salir</button>
                                </form>
                                
                                
                            </ul>          
                        </li>
                    </ul>
                    
                </div>       
            </div>
        </nav>
        
        
        <div class="container mt-2 border">
            <div class="row">
                <div class="col-sm-2"></div>
                <div class="col-sm-8 border mt-2 mb-2">
                    <form action="#" class="formulario" id="formulario">
                        <div class="form-row">
                            <!-- Identificacion-->
                            <div class ="col formulario__grupo" id="grupo__identificacion">
                                <label for="id" class="formulario__label" >Identificacion</label>
                                <div class="formulario__grupo-input">
                                    <input type="text" class="formulario__input" name = "id" id="id" placeholder="12345678" value=${u.getId()} readonly>
                                    <input type="hidden" name="id" value="${u.getId()}">
                                    <i class="formulario__validacion-estado fa fa-times-circle"></i>
                                </div>
                                <p class="formulario__input-error">La identificacion tiene que ser de 7 a 10 digitos solo se aceptan numeros</p>
                            </div>
                            <!-- correo-->
                            <div class ="col formulario__grupo" id="grupo__correo">
                                <label for="correo" class="formulario__label" >Correo</label>
                                <div class="formulario__grupo-input">
                                    <input type="email" class="formulario__input" name = "correo" id="correo" value="${u.getCorreo()}" placeholder="abc@xyz.com">
                                    <i class="formulario__validacion-estado fa fa-times-circle"></i>
                                </div>
                                <p class="formulario__input-error">El correo solo puede contener letras, numero, punto guiones y guion bajo</p>
                            </div>
                        </div>
                        <div class="form-row">
                            <!-- Nombre-->
                            <div class ="col formulario__grupo" id="grupo__nombre">
                                <label for="nombre" class="formulario__label" >Nombre</label>
                                <div class="formulario__grupo-input">
                                    <input type="text" class="formulario__input" name = "nombre" id="nombre" value="${u.getNombre()}" placeholder="jhon smith">
                                    <i class="formulario__validacion-estado fa fa-times-circle"></i>
                                </div>
                                <p class="formulario__input-error">nombre tiene que ser letras o espacio no se aceptan numeros ni caracteres especiales</p>
                            </div>
                            <!-- Apellido-->
                            <div class ="col formulario__grupo" id="grupo__apellido">
                                <label for="apellido" class="formulario__label" >Apellido</label>
                                <div class="formulario__grupo-input">
                                    <input type="text" class="formulario__input" name = "apellido" id="apellido" value="${u.getApellido()}" placeholder="perez castro">
                                    <i class="formulario__validacion-estado fa fa-times-circle"></i>
                                </div>
                                <p class="formulario__input-error">El apellido tiene que ser letras o espacio no se aceptan numeros ni caracteres especiales</p>
                            </div>
                        </div>
                        <div class="form-row">
                            <!-- Direccion-->
                            <div class ="col formulario__grupo" id="grupo__direccion">
                                <label for="direccion" class="formulario__label" >Direccion</label>
                                <div class="formulario__grupo-input">
                                    <input type="text" class="formulario__input" name = "direccion" id="direccion" value="${u.getDireccion()}" placeholder="Calle 30 #3E-164">
                                    <i class="formulario__validacion-estado fa fa-times-circle"></i>
                                </div>
                                <p class="formulario__input-error">La direccion puede contener letras, numeros y caracteres especiales como - #</p>
                            </div>
                            <!-- Telefono-->
                            <div class ="col formulario__grupo" id="grupo__telefono">
                                <label for="telefono" class="formulario__label" >Telefono</label>
                                <div class="formulario__grupo-input">
                                    <input type="text" class="formulario__input" name = "telefono" id="telefono" value="${u.getTelefono()}" placeholder="3106549873">
                                    <i class="formulario__validacion-estado fa fa-times-circle"></i>
                                </div>
                                <p class="formulario__input-error">El telefono tiene que ser 10 digitos, solo se aceptan numeros</p>
                            </div>
                        </div>
                        <div class="form-row">
                            <!-- Usuario-->
                            <div class ="col formulario__grupo" id="grupo__usuario">
                                <label for="usuario" class="formulario__label" >Usuario</label>
                                <div class="formulario__grupo-input">
                                    <input type="text" class="formulario__input" name = "usuario" id="usuario" value="${u.getUsuario()}" placeholder="usuario1">
                                    <i class="formulario__validacion-estado fa fa-times-circle"></i>
                                </div>
                                <p class="formulario__input-error">El usuario tiene que ser de 4 a 10 caracteres, solo se aceptan letras y numeros</p>
                            </div>
                            <!-- Tipo-->
                            <div class ="col formulario__grupo" id="grupo__tipo">
                                <label for="tipo" class="formulario__label" >Tipo</label>
                                <select class="form-control" name="tipo">
                                    <option value="Administrador">Administrador</option>
                                    <option value="Cliente">Cliente</option>
                                    <option value="Usuario">Usuario</option>
                                </select></br>
                            </div>
                        </div>
                        <div class="form-row">
                            <!-- Contraseña-->
                            <div class ="col formulario__grupo" id="grupo__contrasena">
                                <label for="contrasena" class="formulario__label" >Contraseña</label>
                                <div class="formulario__grupo-input">
                                    <input type="password" class="formulario__input" name = "contrasena" id="contrasena" value="${u.getContrasena()}">
                                    <i class="formulario__validacion-estado fa fa-times-circle"></i>
                                </div>
                                <p class="formulario__input-error">La contraseña debe contener entre 4 y 10 caracteres</p>
                            </div>
                            <!-- Repetir Contraseña-->
                            <div class ="col formulario__grupo" id="grupo__contrasena2">
                                <label for="contrasena2" class="formulario__label" >Repetir Contraseña</label>
                                <div class="formulario__grupo-input">
                                    <input type="password" class="formulario__input" name = "contrasena2" id="contrasena2" value="${u.getContrasena()}">
                                    <i class="formulario__validacion-estado fa fa-times-circle"></i>
                                </div>
                                <p class="formulario__input-error">Ambas contraseñas deben ser iguales</p>
                            </div>

                        </div>
                     
                      
                        <div class="formulario__mensaje" id="formulario__mensaje">
                            <p><i class="fa fa-exclamation-triangle"></i> <b>Error:</b> por favor llena corectamente el formulario</p>
                        </div>
                        <div class="form-row">
                            <!-- botones-->
                            <div class ="col mt-2 text-center formulario__grupo-btn-enviar">
                                <button type="submit" class="btn btn-primary formulario__btn" name="accion" value="Actualizar">Guardar <i class="fa fa-floppy-o" aria-hidden="true"></i></button> 
                                <a class="btn btn-danger formulario__btn" name="regresar" href="/Proyecto_Cinyuje/CtrUsuario?accion=Listar">Regresar <i class="fa fa-undo" aria-hidden="true"></i></a>
                                <p class="formulario__mensaje-exito" id="formulario__mensaje-exito">Informacion enviada exitosamente</p>
                            </div>

                        </div>
                    </form>  

                </div>
            </div>
        </div>
       
        <script src="https://code.jquery.com/jquery-3.3.1.js"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" crossorigin="anonymous"></script>
        <script src="https://unpkg.com/sweetalert/dist/sweetalert.min.js"></script>
        <script src="/Proyecto_Cinyuje/JS/Funciones.js" type="text/javascript"></script>
        <script src="/Proyecto_Cinyuje/JS/Funciones2.js" type="text/javascript"></script>                      
        <script src="/Proyecto_Cinyuje/JS/Validar2.js" type="text/javascript"></script>
    </body>
</html>
