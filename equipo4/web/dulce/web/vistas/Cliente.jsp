<%-- 
    Document   : Cliente
    Created on : 28/09/2022, 09:56:57 AM
    Author     : HPLAPTOP01
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" crossorigin="anonymous">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet"  crossorigin="anonymous">
        <link href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet"  crossorigin="anonymous">
        <link href="/dulce/CSS/estilos.css" rel="stylesheet" type="text/css"/>
        <title>Cliente</title>
    </head>
    
        <%
        /*if(session.getAttribute("log")==null || session.getAttribute("log").equals('o') || !session.getAttribute("tipo").equals("Cliente")){
            response.sendRedirect("login.jsp");
        }*/
        
    %>
    <body style="background: linen;">
        <nav class="navbar navbar-expand-lg navbar-dark " style="background: deeppink;">
            <div class="container-fluid">
               
                <ul class="navbar-nav">
                        <li class="nav-item " >
                           <a class="nav-link active " style="color: black" href="#"  role="button" data-bs-toggle="dropdown" aria-expanded="false">
                            DULCERIA
                           </a>
                            <ul class="dropdown-menu" aria-labelledby="navbarDropdown">
                                <li><a class="dropdown-item" href="/dulce/CtrProducto?accion=Listar"  data-bs-target="#item"><i class="fa fa-shopping-basket" aria-hidden="true"></i> Productos</a></li>
                                
                            </ul>
                        </li>
                    </ul>
                
                <div class="collapse navbar-collapse" id="navbarSupportedContent">
                    <ul class="navbar-nav me-auto mb-2 mb-lg-0">
                        <li class="nav-item">
                            <a class="nav-link active" style="color: black" href="/dulce/CtrProducto?accion=home">Home</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" style="color: black" href="#">Oferta del dia</a>
                        </li>
                        
                        <li class="nav-item">
                            <a class="nav-link" style="color: black" href="/dulce/CtrProducto?accion=carrito"><i class="fa fa-shopping-cart">(<label style="color: darkorange">${contador}</label>)</i>Carrito </a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" style="color: black" target="_blank" href="/dulce/CtrProducto?accion=Ayuda"><i class="fa fa-question"></i>Ayuda </a>
                        </li>
                    </ul>
                    <form class="d-flex" action="/dulce/CtrProducto?accion=buscar" method="POST">
                        <input class="form-control me-2" type="search" placeholder="Search" aria-label="Search" name="busqueda">
                        <button class="btn btn-outline-dark bg-light" type="submit" value="buscar" >Search</button>
                    </form>
                    <ul class="navbar-nav">
                        <li class="nav-item dropdown">
                            <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-bs-toggle="dropdown" aria-expanded="false">
                                ${usuario.getNombre()}
                            </a>
                            <ul class="dropdown-menu" aria-labelledby="navbarDropdown">
                                <li><a class="dropdown-item text-center" href="#">
                                        <img src="/dulce/img/login.png" alt="60" width ="60"/>
                                    </a></li>
                                <li><a class="dropdown-item text-center" href="#">${usuario.getUsuario()}</a></li>
                                <li><a class="dropdown-item text-center" href="#">${usuario.getTipo()}</a></li>
                                <li><hr class="dropdown-divider"></li>
                                <li><a class="dropdown-item text-center" href="/dulce/vistas/Logout.jsp">Salir</a></li>
                                <%--<form class="form-inline" action="/dulce/vistas/Logout.jsp" method="POST">
                                    <button name="accion" value="Salir" class="dropdown-item text-center" href="#">Salir</button>
                                </form>--%>
                            </ul>
                        </li>
                    </ul>
                </div>
            </div>
        </nav>
                                                 
       <div class="container mt-2">
           <div id="carouselExampleIndicators" class="carousel slide" data-bs-ride="true">
            <div class="carousel-indicators">
              <button type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide-to="0" class="active" aria-current="true" aria-label="Slide 1"></button>
              <button type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide-to="1" aria-label="Slide 2"></button>
              <button type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide-to="2" aria-label="Slide 3"></button>
            </div>
            <div class="carousel-inner">
              <div class="carousel-item active">
                  <img src="/dulce/img/dulces.jpg" class="d-block w-100 " alt="..." height="400" >
              </div>
              <div class="carousel-item">
                <img src="/dulce/img/gomitas.jpg" class="d-block w-100" alt="..." height="400">
              </div>
              <div class="carousel-item">
                  <img src="/dulce/img/galletas_muu.jpg" class="d-block w-100" alt="..." height="400">
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
        <div>
            <div class="row mt-5">
                
                
                <c:forEach var="p" items="${producto}">
                    <div class="col-sm-4">
                        <div class="card row mt-2" style="margin-left: 2px">
                            <div class="card-header text-center" style="background: deeppink">
                                <label>${p.getNombre()}</label>
                            </div>
                            <div class="card-body text-center" style="background: lavenderblush">
                               <%-- <img src="ControlImg?id=${p.getId()}" width="200" height="180"></br> --%>
                               <img src="${p.getFoto()}" width="200" height="180"></br> 
                               <i>$.${p.getPrecio()}</i>
                            </div>
                            <div class="card-footer text-center" style="background: deeppink">
                                <label>${p.getDescripcion()}</label>
                                <div>
                                    <a href="/dulce/CtrProducto?accion=agregarcarrito&id=${p.getId()}" class="btn btn-outline-dark" style="background: lightpink"><i class="fa fa-shopping-cart"></i> Agregar Carrito</a>
                                    <a href="/dulce/CtrProducto?accion=Comprar&id=${p.getId()}" class="btn btn-outline-dark bg-light">Comprar</a>
                                </div>
                            </div>
                        </div>
                    </div>
                </c:forEach>
                
            </div>
        
        </div>
           <div id="pie_pagina">
               <h4><i class="fa fa-solid fa-address-book"></i>Informacion de contacto</h4>
               <ul id="lista">
                   <li><h5><i class="fa fa-whatsapp"></i><label>Whatsapp: 3244494567</label></h5></li>
                   <li><h5><i class="fa fa-solid fa-envelope"></i><label>Correo: EriBenitez2307@gmail.com</label></h5></li>
                   
               </ul>
           </div>
        <script src="https://code.jquery.com/jquery-3.3.1.js"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" crossorigin="anonymous"></script>
        <script src="https://unpkg.com/sweetalert/dist/sweetalert.min.js"></script>
        <script src="/dulce/js/Funciones.js" type="text/javascript"></script>
    </body>
</html>
