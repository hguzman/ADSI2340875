<%-- 
    Document   : CrearProducto
    Created on : 11/11/2022, 09:51:22 AM
    Author     : HPLAPTOP01
--%>

<%@page import="Configuracion.Conectar"%>
<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0/css/all.min.css"/> 
        <link href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet"  crossorigin="anonymous">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css" integrity="sha384-xOolHFLEh07PJGoPkLv1IbcEPTNtaed2xpHsD9ESMhqIYd0nLMwNLD69Npy4HI+N" crossorigin="anonymous">
        <link href="../CSS/Validar1.css" rel="stylesheet" type="text/css"/>

        
        <title>Crear Producto</title>
    </head>
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
                                ${usuario.getNombre()} ${usuario.getApellido()}
                            </a>
                            <ul class="dropdown-menu" aria-labelledby="navbarDropdown">
                                <li><a class="dropdown-item text-center" href="#">
                                        <img src="/tienda1/Imagenes/usuario4-peque.png" alt="60" width ="60"/>
                                    </a></li>
                                <li><a class="dropdown-item text-center" href="#">${usuario.getUsuario()}</a></li>
                                <li><a class="dropdown-item text-center" href="#">${usuario.getTipo()}</a></li>
                                <li><hr class="dropdown-divider"></li>
                                <li><a class="dropdown-item text-center" href="/Proyecto_Cinyuje/Vistas/Logout.jsp">Salir</a></li>
                                <%--<form class="form-inline" action="/TiendaVirtual/Vistas/Logout.jsp" method="POST">
                                    <button name="accion" value="Salir" class="dropdown-item text-center" href="#">Salir</button>
                                </form>--%>
                            </ul>
                        </li>
                    </ul>

                </div>       
            </div>
        </nav>
        <div class="container mt-2" id="formulario_admin">
                <div class="row" >
                    <div class="col-sm-2">    
                        
                    </div>
                    
                    <div class="col-sm-8 border mt-2 mb-2" >
                        <center>
                        <img src="" width="700" id="crearusuario" alt="crearproducto"/>    
                        </center>
                        

                        <form action="../CtrProducto?accion=Agregar" class="formulario" id="formulario">
                           
                            <div class="form-row">
                                <!-- Nombre-->
                                <div class ="col formulario__grupo" id="grupo__nombre">
                                    <label for="nombre" class="formulario__label" >Nombre </label>
                                    <div class="formulario__grupo-input">
                                        <input type="text" class="formulario__input" name = "nombre" id="nombre" placeholder="Globos">
                                        <i class="formulario__validacion-estado fa fa-times-circle"></i>
                                    </div>
                                    <p class="formulario__input-error">nombre tiene que ser letras o espacio no se aceptan numeros ni caracteres especiales</p>
                                </div>
                                <!-- Descripcion-->
                                <div class ="col formulario__grupo" id="grupo__descripcion">
                                    <label for="descripcion" class="formulario__label" >Descripción</label>
                                    <div class="formulario__grupo-input">
                                        <input type="text" class="formulario__input" name = "descripcion" id="descripcion" placeholder="Descripcion producto">
                                        <i class="formulario__validacion-estado fa fa-times-circle"></i>
                                    </div>
                                    <p class="formulario__input-error">La descripción debe ser solo letras</p>
                                </div>
                            </div>
                             <div class="form-row">
                                <!-- Precio-->
                                <div class ="col formulario__grupo" id="grupo__precio">
                                    <label for="direccion" class="formulario__label" >  Precio</label>
                                    <div class="formulario__grupo-input">
                                        <input type="number" class="formulario__input" name = "precio" id="precio" placeholder="20000">
                                        <i class="formulario__validacion-estado fa fa-times-circle"></i>
                                    </div>
                                    <p class="formulario__input-error">El precio solo debe contener numeros</p>
                                </div>
                                <!-- Stock-->
                                <div class ="col formulario__grupo" id="grupo__stock">
                                   <label for="stock" class="formulario__label"> Stock </label>                          
                                    <div class="formulario__grupo-input">
                                        <input type="number" class="formulario__input" name = "stock" id="stock" placeholder="20">
                                        <i class="formulario__validacion-estado fa fa-times-circle"></i>
                                    </div>
                                    <p class="formulario__input-error">Stock es numerico</p>
                                </div>
                            </div>
                            <div class="form-row">
                                <!-- -->
                                
                                <!-- Tipo-->
                                <div class ="col formulario__grupo" id="grupo__tipo">
                                    <label for="tipo" class="formulario__label" >Categoria</label>
                                    <select class="form-control" name="categoria" id="categoria">
                                        <option value="1">Recordatorios</option>
                                        <option value="2">Anchetas</option>
                                        <option value="3">Globos</option>
                                        <option value="4">Decoraciones</option>
                                    </select></br>
                                </div>
                            </div>
                            <div class="form-row">
                                <!-- Imagen-->
                                <div class ="col formulario__grupo" id="grupo__contrasena">
                                    <label for="imagen" class="formulario__label" >Imagen</label>
                                    <div class="formulario__grupo-input">
                                        <input type="file" class="formulario__input" name = "imagen" id="imagen">
                                        <input type="hidden" id="fotoId" name="fotoId" value="">
                                        <i class="formulario__validacion-estado fa fa-times-circle"></i>
                                    </div>
                                    <p class="formulario__input-error">La imagen debe ser JPG</p>
                                </div>
                               
                                
                            </div>
                            
                             <div class="formulario__mensaje" id="formulario__mensaje">
                                <p><i class="fa fa-exclamation-triangle"></i> <b>Error:</b> por favor llena correctamente el formulario</p>
                            </div>
                             <div class="form-row">
                                <!-- botones-->
                                <div class ="col mt-2 text-center formulario__grupo-btn-enviar">
                                    <button type="submit" class="btn btn-success formulario__btn" name="accion" value="Agregar">Guardar <i class="fa fa-check"></i></button> 
                                    <a class="btn btn-danger formulario__btn" name="regresar" href="#">Regresar <i class="fa fa-undo" aria-hidden="true"></i></a>
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
        <script src="/Proyecto_Cinyuje/JS/Imagen.js" type="text/javascript"></script>
    </body>
</html>

</html>
