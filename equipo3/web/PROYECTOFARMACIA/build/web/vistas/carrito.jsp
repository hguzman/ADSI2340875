<%-- 
    Document   : carrito
    Created on : 20/09/2022, 09:36:53 AM
    Author     : SENA
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
        <title>JSP Page</title>
    </head>
    <body>
        <nav class="navbar navbar-expand-lg navbar-dark bg-dark">
            <div class="container-fluid">

                <ul class="navbar-nav">
                    <li class="nav-item dropdown">
                        <a class="nav-link active dropdown-toggle navbar-brand" href="#" id="navbarDropdown" role="button" data-bs-toggle="dropdown" aria-expanded="false">
                            Carrito
                        </a>
                        <ul class="dropdown-menu" aria-labelledby="navbarDropdown">
                            <li><a class="dropdown-item" href="/PROYECTOFARMACIA/CtrProducto?accion=Listar"  data-bs-target="#item"><i class="fa fa-shopping-basket" aria-hidden="true"></i> Productos</a></li>
                            <li><a class="dropdown-item" href="#"><i class="fa fa-cubes" aria-hidden="true"></i> Categorias</a></li>
                                <%--<li><hr class="dropdown-divider"></li>--%>
                            <li><a class="dropdown-item" href="/PROYECTOFARMACIA/CtrUsuario?accion=Listar"><i class="fa fa-users" aria-hidden="true"></i> Usuarios</a></li>
                        </ul>
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
                            <a class="nav-link" href="/PROYECTOFARMACIA/CtrProducto?accion=home"> Seguir Comprando </a>
                        </li>
                    </ul>
                    <form class="d-flex" action="/PROYECTOFARMACIA/CtrProducto?accion=buscar" method="POST">
                        <input class="form-control me-2" type="search" placeholder="Search" aria-label="Search" name="busqueda">
                        <button class="btn btn-outline-success" type="submit" value="buscar">Search</button>
                    </form>
                    <ul class="navbar-nav">
                        <li class="nav-item dropdown">
                            <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-bs-toggle="dropdown" aria-expanded="false">
                                ${usuario.getNombre()}
                            </a>
                            <ul class="dropdown-menu" aria-labelledby="navbarDropdown">
                                <li><a class="dropdown-item text-center" href="#">
                                        <img src="/PROYECTOFARMACIA/Imagen/usuario4-peque.png" alt="60" width ="60"/>
                                    </a></li>
                                <li><a class="dropdown-item text-center" href="#">${usuario.getUsuario()}</a></li>
                                <li><a class="dropdown-item text-center" href="#">${usuario.getTipo()}</a></li>
                                <li><hr class="dropdown-divider"></li>
                                <li><a class="dropdown-item text-center" href="/PROYECTOFARMACIA/vistas/Logout.jsp">Salir</a></li>
                                    <%--<form class="form-inline" action="/PROYECTOFARMACIA/vistas/Logout.jsp" method="POST">
                                        <button name="accion" value="Salir" class="dropdown-item text-center" href="#">Salir</button>
                                    </form>--%>
                            </ul>
                        </li>
                    </ul>
                </div>
            </div>
        </nav>
        <div class="container mt-4"> 
            <h3>Carrito</h3>
            <br>

            <div class="row">
                <div class="col-sm-8">
                    <table class="table table-hover">
                        <thead>
                            <tr>
                                <th class="text-center">Item</th>
                                <th class="text-center">Articulo</th>
                                <th class="text-center">Description</th>
                                <th class="text-center">Precio</th>
                                <th class="text-center">Cantidad</th>
                                <th class="text-center">Subtotal</th>
                                <th class="text-center">Acciones</th>
                            </tr>
                        </thead>
                        <tbody>
                            <c:forEach var="Car" items="${car}">
                            <tr>
                                <td>${Car.getItem ()}</td>
                                <td>${Car.getNombre()} <img src="${Car.getFoto()}" width="100" height="100"> </td>
                                <td>${Car.getDescripcion()}</td>
                                <td>${Car.getPreciocompra()}</td>
                                <td>
                                    <input type="hidden" id="idpro" value="${Car.getIdproducto()}">
                                    <input type="number" id="cantidad" value="${Car.getCantidad()}" class="form-control text-center" min="1"></td>
                                <td>${Car.getSubtotal()}</td>
                                <td>
                                    <input type="hidden" id="idp" value="${Car.getIdproducto()}">
                                    <a class="btn btn-outline-danger" href="#" id="btndelete"> <i class="fa fa-trash"></i></a>
                                    <a class="btn btn-outline-success" href="#" id="btnaceptar"> <i class="fa fa-check"></i></a>
                                </td>
                            </tr>
                            </c:forEach>
                        </tbody>
                    </table>
                </div>
                    <div class="col-sm-4">
                        <div class="card">
                            <div class="card-header">
                                <h3>Generar compra</h3>
                            </div>
                            <div class="card-body">
                                <label>Subtotal:</label>
                                <input type="text" readonly="true" value="${totalpagar}" class="form-control">
                                <label>Descuento:</label>
                                <input type="text" readonly="true" class="form-control">
                                <label>Total pagar:</label>
                                <input type="text" readonly="true" value="${totalpagar}" class="form-control">
                            </div>
                            <div class="card-footer">
                                <a href="#" class="btn btn-info btn-block"> Realizar pago </a>
                                 <a href="#" class="btn btn-danger btn-block"> Generar compra</a>
                            </div>
                        </div>
                    </div>
                </div>

            </div>
        </div>
         <script src="https://code.jquery.com/jquery-3.3.1.js"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" crossorigin="anonymous"></script>
        <script src="https://unpkg.com/sweetalert/dist/sweetalert.min.js"></script>
        <script src="/MVC/js/Funciones.js" type="text/javascript"></script>  
        <script src="/PROYECTOFARMACIA/JS/javas2.js" type="text/javascript"></script>
        <script src="/PROYECTOFARMACIA/JS/javas.js" type="text/javascript"></script>
    </body>
</html>
