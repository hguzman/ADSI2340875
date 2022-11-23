<%-- 
    Document   : Carrito_Cliente
    Created on : 22/11/2022, 08:55:09 AM
    Author     : HPLAPTOP01
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0/css/all.min.css"/> 
        <link href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet"  crossorigin="anonymous">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css" integrity="sha384-xOolHFLEh07PJGoPkLv1IbcEPTNtaed2xpHsD9ESMhqIYd0nLMwNLD69Npy4HI+N" crossorigin="anonymous">
        <title>JSP Page</title>
    </head>
    <body>
        <nav class="navbar navbar-expand-lg navbar-dark bg-dark">
            <div class="container-fluid">
                <ul class="navbar-nav">
                    <li class="nav-item">
                        <a class="nav-link active navbar-brand" href="#" id="navbarDropdown" role="button" data-bs-toggle="dropdown" aria-expanded="false">
                          <img src="Imagenes/logo_cinyuje.png" width="90" alt="logo_cinyuje"/>
                        </a>
                            
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
                            <a class="nav-link" href="/Proyecto_Cinyuje/CtrProducto?accion=home">Seguir comprando</a>
                        </li> 
                    </ul>
                    <form class="d-flex" action="/Proyecto_Cinyuje/CtrProducto?accion=buscar" method="POST">
                        <input class="form-control me-2" type="search" placeholder="Search" aria-label="Search" name="busqueda">
                        <button class="btn btn-outline-primary" type="submit">Buscar</button>
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
                                <th class="text-center">Descripcion</th>
                                <th class="text-center">Precio</th>
                                <th class="text-center">Cantidad</th>
                                <th class="text-center">Subtotal</th>
                                <th class="text-center">Acciones</th>
                            </tr>
                        </thead>
                        <tbody>
                        <c:forEach var= "car" items="${carrito}">
                            <tr>
                                <td>${car.getItem()}</td>
                                <td>${car.getNombre()} <img src="${car.getFoto()}" width="120" height="100"></td>
                                <td>${car.getDescripcion()}  </td>
                                <td>${car.getPreciocompra()}</td>
                                <td>
                                    <input type="hidden" id="idpro" value="${car.getIdproducto()}">
                                    <input type="number" id="cantidad" value="${car.getCantidad()}" class="form-control text-center" min="1"></td>
                                <td>${car.getSubtotal()}</td>
                                <td>
                                    <input type="hidden" id="idp" value="${car.getIdproducto()}">
                                    <a class="btn btn-outline-danger" href="#" id="btndelete"><i class="fa fa-trash"></i></a>
                                    <a class="btn btn-outline-success" href="#" id="btnaceptar"><i class="fa fa-check-circle"></i></a>
                                </td>
                                
                            </tr>
                        </c:forEach>
                        </tbody>
                    </table>
                    </div>
                    
                    <div class="col-sm-4">
                        <div class="card">
                            <div class="card-header">
                                <h3>Generar Pedido</h3>
                            </div>
                            <div class="card_body">
                                <label>Subtotal:</label>
                                <input type="text" readonly="true" value="${totalpagar}" class="form-control">
                                <label>Descuento:</label>
                                <input type="text" readonly="true" class="form-control">
                                <label>Total a pagar:</label>
                                <input type="text" readonly="true" value="${totalpagar}" class="form-control">
                            </div>
                            <div class="card-footer">
                                <a href="#" class="btn btn-info btn-block">Realizar pedido</a>
                                <a href="/Proyecto_Cinyuje/CtrProducto?accion=pedido" class="btn btn-danger btn-block">Generar pedido</a>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
                                
   
            
       




        <script src="https://code.jquery.com/jquery-3.3.1.js"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" crossorigin="anonymous"></script>
        <script src="https://unpkg.com/sweetalert/dist/sweetalert.min.js"></script>
        <script src="/Proyecto_Cinyuje/JS/Funciones.js" type="text/javascript"></script>
        <script src="/Proyecto_Cinyuje/JS/Funciones2.js" type="text/javascript"></script>
        
    </body>
</html>
