<%-- 
    Document   : crearusuario
    Created on : 4/10/2022, 09:40:45 AM
    Author     : SENA
--%>
<%@page import="configuracion.Conectar"%>
<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" crossorigin="anonymous">
        <link href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet" crossorigin="anonymous">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" crossorigin="anonymous">
        
        <link href="/PROYECTOFARMACIA/CSS/Validar.css" rel="stylesheet" type="text/css"/>
        <title>Editar Producto</title>
    </head>
    <body>
      
        <div class="container mt-2 border">
                <div class="row">
                    <div class="col-sm-2"></div>
                    <div class="col-sm-8 border mt-2 mb-2">
                        <form action="/PROYECTOFARMACIA/CtrProducto?accion=actualizar" class="formulario" id="formulario">
                            
                                <div class ="col formulario__grupo" id="grupo__identificacion">
                                    <label for="id" class="formulario__label" >Identificacion</label>
                                    <div class="formulario__grupo-input">
                                        <input type="hidden" class="formulario__input" name = "id" id="id" value="${producto.getId()}">
                                        <i class="formulario__validacion-estado fa fa-times-circle"></i>
                                    </div>
                                    <p class="formulario__input-error">La identificacion tiene que ser de 7 a 10 digitos solo se aceptan numeros</p>
                                </div>
               
                                <!-- Nombre-->
                                <div class ="col formulario__grupo" id="grupo__nombre">
                                    <label for="nombre" class="formulario__label" >Nombre</label>
                                    <div class="formulario__grupo-input">
                                        <input type="text" class="formulario__input" name = "nombre" id="nombre" value="${producto.getNombre()}" required>
                                        <i class="formulario__validacion-estado fa fa-times-circle"></i>
                                    </div>
                                    <p class="formulario__input-error">El correo solo puede contener letras, numero, punto guiones y guion bajo</p>
                                </div>
                           
                           
                             
                                <!-- Descripcion-->
                                <div class ="col formulario__grupo" id="grupo__descipcion">
                                    <label for="descripcion" class="formulario__label" >Descripcion</label>
                                    <div class="formulario__grupo-input">
                                        <input type="text" class="formulario__input" name = "descripcion" id="descripcion" value="${producto.getDescripcion()}" required>
                                        <i class="formulario__validacion-estado fa fa-times-circle"></i>
                                    </div>
                                    <p class="formulario__input-error">La direccion puede contener letras, numeros y caracteres especiales como - #</p>
                                </div>
                                
                                <!-- Precio-->
                                <div class ="col formulario__grupo" id="grupo__precio">
                                    <label for="precio" class="formulario__label" >Precio</label>
                                    <div class="formulario__grupo-input">
                                        <input type="number" class="formulario__input" name = "precio" id="precio" value="${producto.getPrecio()}" required>
                                        <i class="formulario__validacion-estado fa fa-times-circle"></i>
                                    </div>
                                    <p class="formulario__input-error">El usuario tiene que ser de 4 a 10 caracteres, solo se aceptan letras y numeros</p>
                                </div>
                               
                                 <!--Foto-->
                                <div class ="col formulario__grupo" id="grupo__foto">
                                    <label for="foto" class="formulario__label" >Foto</label>
                                    <div class="formulario__grupo-input">
                                        <input type="file" class="formulario__input" name = "foto" id="foto" value="${producto.getFoto()}">
                                        <input type="hidden" id="fotoId" name="fotoId" value="">
                                        <i class="formulario__validacion-estado fa fa-times-circle"></i>
                                    </div>
                                    <p class="formulario__input-error">Ambas contraseñas deben ser iguales</p>
                                </div>
                             
                                <!-- Stock-->
                                <div class ="col formulario__grupo" id="grupo__stock">
                                    <label for="stock" class="formulario__label" >Stock</label>
                                    <div class="formulario__grupo-input">
                                        <input type="number" class="formulario__input" name = "stock" id="stock" value="${producto.getStock()}" required>
                                        <i class="formulario__validacion-estado fa fa-times-circle"></i>
                                    </div>
                                    <p class="formulario__input-error">Ambas contraseñas deben ser iguales</p>
                                </div>
     
                                <!-- botones-->
                                <div class ="col mt-2 text-center formulario__grupo-btn-enviar">
                                    <button type="submit" class="btn btn-primary formulario__btn" name="accion" value="actualizar">Guardar <i class="fa fa-floppy-o" aria-hidden="true"></i></button> 
                                    <a class="btn btn-danger formulario__btn" name="regresar" href="/PROYECTOFARMACIA/CtrProducto?accion=Listar">Regresar <i class="fa fa-undo" aria-hidden="true"></i></a>
                                    <p class="formulario__mensaje-exito" id="formulario__mensaje-exito">Informacion enviada exitosamente</p>
                                </div>
                                                               
                            </div>
                        </form>  

                    </div>
                </div>
        </div>
        <script src="https://code.jquery.com/jquery-3.3.1.js"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" ></script>
        <script src="https://unpkg.com/sweetalert/dist/sweetalert.min.js"></script>
       
        
    </body>

</html>
