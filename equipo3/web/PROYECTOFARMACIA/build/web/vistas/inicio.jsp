<%-- 
    Document   : Ventas_Admin
    Created on : 9/09/2022, 10:13:14 AM
    Author     : HPLAPTOP01
--%>

<%-- 
    Document   : Ventas
    Created on : 9/09/2022, 10:10:51 AM
    Author     : HPLAPTOP01
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" crossorigin="anonymous">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet"  crossorigin="anonymous">
        <link href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet"  crossorigin="anonymous">
        <title>Tienda Virtual</title>
    </head>
    <%
        /*if(session.getAttribute("log")==null || session.getAttribute("log").equals('o') || !session.getAttribute("tipo").equals("Administrador")){
            response.sendRedirect("Loging.jsp");
        }*/
        
        
    %>
    <body>
        <nav class="navbar navbar-expand-lg navbar-dark bg-primary">
            <div class="container-fluid">
               
                <ul class="navbar-nav">
                        <li class="nav-item">
                           <a class="nav-link active" href="#"  role="button"  aria-expanded="false">
                            FARMAVISION
                           </a>
                            
                        </li>
                    </ul>
                
                <div class="collapse navbar-collapse" id="navbarSupportedContent">
                    <ul class="navbar-nav me-auto mb-2 mb-lg-0">
                        <li class="nav-item">
                            <a class="nav-link active" href="/PROYECTOFARMACIA/CtrProducto?accion=home">Home</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="#">Oferta del dia</a>
                        </li>
                        
                        <li class="nav-item">
                            <a class="nav-link" href="/PROYECTOFARMACIA/CtrProducto?accion=carrito"><i class="fa fa-shopping-cart">(<label style="color: darkorange">${contador}</label>)</i>Carrito </a>
                        </li>
                    </ul>
                    <form class="d-flex" action="/PROYECTOFARMACIA/CtrProducto?accion=buscar" method="POST" >
                        <input class="form-control me-2" type="search" placeholder="Search" aria-label="Search" name="busqueda" >
                        <button class="btn btn-outline-success" type="submit" value="buscar">Search</button>
                    </form>
                    <ul class="navbar-nav">
                        <li class="nav-item dropdown">
                            <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-bs-toggle="dropdown" aria-expanded="false">
                                Mi cuenta
                            </a>
                            <ul class="dropdown-menu" aria-labelledby="navbarDropdown">
                                <li><a class="dropdown-item text-center" href="#">
                                        <img src="/PROYECTOFARMACIA/img/login.png" alt="60" width ="60"/>
                                    </a></li>
                               
                                <li><hr class="dropdown-divider"></li>
                                <li><a class="dropdown-item text-center" href="/PROYECTOFARMACIA/vistas/login.jsp">Iniciar sesion</a></li>
                                <%--<form class="form-inline" action="/PROYECTOFARMACIA/vistas/Logout.jsp" method="POST">
                                    <button name="accion" value="Salir" class="dropdown-item text-center" href="#">Salir</button>
                                </form>--%>
                            </ul>
                        </li>
                    </ul>
                </div>
            </div>
        </nav>
                        
       <div class="container mt-2">
           
           <div id="carouselExampleControls" class="carousel slide" data-bs-ride="carousel">
  <div class="carousel-inner">
    <div class="carousel-item active">
        <img src="/PROYECTOFARMACIA/img/Cap (1).png"  width="100%" height="350" class="d-block" alt="..." >
    </div>
    <div class="carousel-item">
        <img src="/PROYECTOFARMACIA/img/Cap (2).png" width="100%" height="350"  class="d-block " alt="...">
       
    </div>
    <div class="carousel-item">
        <img src="/PROYECTOFARMACIA/img/Cap (3).png" width="100%" height="350" class="d-block " alt="...">
        
    </div>
  </div>
  <button class="carousel-control-prev" type="button" data-bs-target="#carouselExampleControls" data-bs-slide="prev">
    <span class="carousel-control-prev-icon" aria-hidden="true"></span>
    <span class="visually-hidden">Previous</span>
  </button>
  <button class="carousel-control-next" type="button" data-bs-target="#carouselExampleControls" data-bs-slide="next">
    <span class="carousel-control-next-icon primary" aria-hidden="true"></span>
    <span class="visually-hidden">Next</span>
  </button>
</div>
           
            <div class="row">
                
                
                <c:forEach var="p" items="${producto}">
                    <div class="col-sm-4">
                        <div class="card">
                            <div class="card-header">
                                <label>${p.getNombre()}</label>
                            </div>
                            <div class="card-body text-center">
                               <%-- <img src="ControlImg?id=${p.getId()}" width="200" height="180"></br> --%>
                               <img src="${p.getFoto()}" width="200" height="180"></br> 
                               <i>$.${p.getPrecio()}</i>
                            </div>
                            <div class="card-footer text-center">
                                <label>${p.getDescripcion()}</label>
                                <div>
                                    <a href="/PROYECTOFARMACIA/CtrProducto?accion=agregarcarrito&id=${p.getId()}" class="btn btn-outline-info"><i class="fa fa-shopping-cart"></i> Agregar Carrito</a>
                                    <a href="/PROYECTOFARMACIA/CtrProducto?accion=Comprar&id=${p.getId()}" class="btn btn-danger">Comprar</a>
                                </div>
                            </div>
                        </div>
                    </div>
                </c:forEach>
                
            </div>
        </div>
                        
         
        
        <script src="https://code.jquery.com/jquery-3.3.1.js"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" crossorigin="anonymous"></script>
        <script src="https://unpkg.com/sweetalert/dist/sweetalert.min.js"></script>
        <script src="/MVC/js/Funciones.js" type="text/javascript"></script>
    </body>

</html>
