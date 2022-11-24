<%-- 
    Document   : crearproducto
    Created on : 15/11/2022, 07:30:48 AM
    Author     : HPLAPTOP01
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
        
        <link href="/dulce/CSS/Validar_Usuario.css" rel="stylesheet" type="text/css"/>
        <title>Crear Producto</title>
    </head>
    <body>
        
        <div class="container mt-2 border">
                <div class="row">
                    <div class="col-sm-2"></div>
                    <div class="col-sm-8 border mt-2 mb-2">
                        <form action="../CtrProducto?accion=agregar" class="formulario" id="formulario">
                            
                                
                                <!-- Nombre-->
                                <div class ="col formulario_grupo" id="grupo_nombre">
                                    <label for="nombre" class="formulario__label" >Nombre</label>
                                    <div class="formulario__grupo-input">
                                        <input type="text" class="formulario__input" name = "nombre" id="nombre">
                                        <i class="formulario__validacion-estado fa fa-times-circle"></i>
                                    </div>
                                    
                                </div>
                            
                            
                            
                                <!-- Descripcion-->
                                <div class ="col formulario_grupo" id="grupo_descipcion">
                                    <label for="descripcion" class="formulario__label" >Descripcion</label>
                                    <div class="formulario__grupo-input">
                                        <input type="text" class="formulario__input" name = "descripcion" id="descripcion">
                                        <i class="formulario__validacion-estado fa fa-times-circle"></i>
                                    </div>
                                    
                                </div>
                                
                                <!-- Precio-->
                                <div class ="col formulario_grupo" id="grupo_precio">
                                    <label for="precio" class="formulario__label" >Precio</label>
                                    <div class="formulario__grupo-input">
                                        <input type="number" class="formulario__input" name = "precio" id="precio">
                                        <i class="formulario__validacion-estado fa fa-times-circle"></i>
                                    </div>
                                    
                                </div>
                                
                                <!--Foto-->
                                <div class ="col formulario_grupo" id="grupo_foto">
                                    <label for="foto" class="formulario__label" >Foto</label>
                                    <div class="formulario__grupo-input">
                                        <input type="file" class="formulario__input" name = "foto" id="foto">
                                        <input type="hidden" name = "fotoid" id="fotoid" value="">
                                        <i class="formulario__validacion-estado fa fa-times-circle"></i>
                                    </div>
                                    
                                </div>
                            
                                <!-- Stock-->
                                <div class ="col formulario_grupo" id="grupo_stock">
                                    <label for="stock" class="formulario__label" >Stock</label>
                                    <div class="formulario__grupo-input">
                                        <input type="number" class="formulario__input" name = "stock" id="stock">
                                        <i class="formulario__validacion-estado fa fa-times-circle"></i>
                                    </div>
                                    
                                </div>
                                
    
                                <!-- botones-->
                                <div class ="col mt-2 text-center formulario__grupo-btn-enviar">
                                    <button type="submit" class="btn btn-primary formulario__btn" name="accion" value="agregar">Guardar <i class="fa fa-floppy-o" aria-hidden="true"></i></button> 
                                    <a class="btn btn-danger formulario__btn" name="regresar" href="/dulce/CtrProducto?accion=Listar">Regresar <i class="fa fa-undo" aria-hidden="true"></i></a>
                                    <p class="formulario_mensaje-exito" id="formulario_mensaje-exito">Informacion enviada exitosamente</p>
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