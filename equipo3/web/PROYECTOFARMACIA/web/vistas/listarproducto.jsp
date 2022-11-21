<%-- 
    Document   : listarproducto
    Created on : 11/11/2022, 08:48:28 AM
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
        <title>Listar producto</title>
    </head>

    <body>

        <nav class="navbar navbar-expand-lg navbar-dark bg-primary">
            <div class="container-fluid">

                <ul class="navbar-nav">
                    <li class="nav-item dropdown">
                        <a class="nav-link active dropdown-toggle navbar-brand" href="#" id="navbarDropdown" role="button" data-bs-toggle="dropdown" aria-expanded="false">
                            FARMAVISION
                        </a>
                        <ul class="dropdown-menu" aria-labelledby="navbarDropdown">
                            <li><a class="dropdown-item" href="/PROYECTOFARMACIA/CtrProducto?accion=Listar"  data-bs-target="#item"><i class="fa fa-shopping-basket" aria-hidden="true"></i> Productos</a></li>
                            
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
                            <a class="nav-link" href="/PROYECTOFARMACIA/CtrProducto?accion=carrito"><i class="fa fa-shopping-cart">(<label style="color: darkorange">${contador}</label>)</i>Carrito </a>
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
        <div>
            <div>
                <table class="table">
                    <thead class="thead-dark border">
                        <tr>
                            <th scope="col" colspan="7" class="text-center border">Productos</th>
                            <th scope="col" class="text-center border">  <a class="btn btn-primary ml-2" href="/PROYECTOFARMACIA/vistas/crearproducto.jsp"> <i class="fa fa-user-plus" aria-hidden="true"></i> </a> </th>
                        </tr>
                        
                        <tr>
                            <th scope="col" class="text-center border">Idp</th>
                            <th scope="col" class="text-center border">Nombre</th>
                            <th scope="col" class="text-center border">Foto</th>
                            <th scope="col" class="text-center border">Descripcion</th>
                            <th scope="col" class="text-center border">Precio</th>
                            <th scope="col" class="text-center border">Stock</th>
                            <th scope="col" class="text-center border">Acciones</th>
                            
                        </tr>
                    </thead>
                    <tbody>
                        
                        <c:forEach var = "pro" items="${producto}">
                        <tr>
                            <th scope="row" class="border">${pro.getId()}</th>
                            <td class="border">${pro.getNombre()}</td>
                            <td class="border"><img src ="${pro.getFoto()}" width ="100" height ="80" atl="foto no puede mostrar"</td>
                            <td class="border">${pro.getDescripcion()}</td>
                            <td class="border">${pro.getPrecio()}</td>
                            <td class="border">${pro.getStock()}</td>
                            <td scope="col" class="text-center-border">
                                <input type="hidden" name="id" id="id" value="${pro.getId()}">
                                <a class="btn btn-warning" href="/PROYECTOFARMACIA/CtrProducto?accion=editar&id=${pro.getId()}"><i class="fa fa-pencil" aria-hidden="true"></i></a>
                                <a class="btn btn-danger" href="#" id="delpro"><i class="fa fa-trash" aria-hidden="true"></i></a>
                            </td>
                            
                            
                        </tr>
                        </c:forEach>
                    </tbody>
                </table>
            </div>
        </div>

        <script src="https://code.jquery.com/jquery-3.3.1.js"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" crossorigin="anonymous"></script>
        <script src="https://unpkg.com/sweetalert/dist/sweetalert.min.js"></script>
        <script src="/PROYECTOFARMACIA/JS/javas3.js" type="text/javascript"></script>
        <script src="/PROYECTOFARMACIA/JS/javas4.js" type="text/javascript"></script>
    </body>

</html>
