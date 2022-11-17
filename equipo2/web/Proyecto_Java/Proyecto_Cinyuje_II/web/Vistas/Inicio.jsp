<%-- 
    Document   : Inicio
    Created on : 28/09/2022, 09:36:38 AM
    Author     : HPLAPTOP01
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0/css/all.min.css"/> 
        <link href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet"  crossorigin="anonymous">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css" integrity="sha384-xOolHFLEh07PJGoPkLv1IbcEPTNtaed2xpHsD9ESMhqIYd0nLMwNLD69Npy4HI+N" crossorigin="anonymous">
        <link href="/Proyecto_Cinyuje/CSS/Promo.css" rel="stylesheet" type="text/css"/>
        <title>Cinyuje</title>
    </head>

    <%
        /* if (session.getAttribute("log") == null || session.getAttribute("log").equals('0') || !session.getAttribute("tipo").equals("Administrador")) {
                response.sendRedirect("Login.jsp");
            } */
    %>

    <body>
        <nav class="navbar navbar-expand-lg navbar-dark bg-dark">
            <div class="container-fluid">
                <ul class="navbar-nav">
                    <li class="nav-item dropdown">
                        <a class="nav-link active dropdown-toggle navbar-brand" href="#" id="navbarDropdown" role="button" data-bs-toggle="dropdown" aria-expanded="false">
                            <img src="Imagenes/logo_cinyuje.png" width="90" alt="logo_cinyuje"/>
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





        <div id="carouselExampleIndicators" class="carousel slide" data-bs-ride="true">
            <div class="carousel-indicators">
                <button type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide-to="0" class="active" aria-current="true" aria-label="Slide 1"></button>
                <button type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide-to="1" aria-label="Slide 2"></button>
                <button type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide-to="2" aria-label="Slide 3"></button>
            </div>
            <div class="carousel-inner">
                <div class="carousel-item">
                    <img src="Imagenes/Cinyuje.png" class="d-block w-100" alt="...">
                </div>
                <div class="carousel-item">
                    <img src="Imagenes/Welcome.png" class="d-block w-100" alt="...">
                </div>
                <div class="carousel-item active">
                    <img src="Imagenes/black_friday.png" class="d-block w-100" alt="...">
                </div>
            </div>
            <button class="carousel-control-prev" type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide="prev">
                <span class="carousel-control-prev-icon" aria-hidden="true"></span>
                <span class="visually-hidden">Previous</span>
            </button>
            <button class="carousel-control-next" type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide="next">
                <span class="carousel-control-next-icon" aria-hidden="true"></span>
                <span class="visually-hidden">Next</span>
            </button>
        </div>

        <div id="category_list">
            <ul class="nav justify-content-center">
                <li class="nav-item">
                    <a class="nav-link active" aria-current="page" href="#" id="categoryItem" category="recordatorios"><img src="Imagenes/Categoria_3.png" width="150" alt="..."></a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="#" id="categoryItem" category="anchetas"> <img src="Imagenes/Categoria_1.png" width="150" alt="..."> </a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="#" id="categoryItem" category="globos"><img src="Imagenes/Categoria_2.png" width="150" alt="..."></a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="#" id="categoryItem" category="decoraciones"><img src="Imagenes/Categoria_4.png" width="150" alt="..."></a>
                </li>
            </ul>
        </div>



        <div class="container mt-2">
            <div class="row">
                <c:forEach var= "p" items="${producto}" >
                    <div class="col-sm-4" id="tarjetas">
                        <div class="card">
                            <div class="card-header">
                                <label>${p.getNombre()}</label>
                            </div>
                            <div class="card-body text-center">
                                <img src="${p.getFoto()}" width="200" height="180"><br>
                                <div id="precio">
                                    <i>$${p.getPrecio()}</i>
                                </div>


                            </div>
                            <div class="card-footer text-center">
                                <label>${p.getDescripcion()}</label>
                                <a href="/Proyecto_Cinyuje/CtrProducto?accion=AgregarCarrito&id=${p.getId()}" class="btn btn-outline-light"> Agregar al carrito <i class="fa fa-cart-plus" aria-hidden="true"></i> </a>
                                <a href="/Proyecto_Cinyuje/CtrProducto?accion=Comprar&id=${p.getId()}" class="btn btn-warning"> Realizar pedido </a>
                            </div>

                        </div> 
                    </div>
                </c:forEach>
            </div>
        </div>



        <script src="/Proyecto_Cinyuje/JS/Filtro.js" type="text/javascript"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>

    </body>
</html>
