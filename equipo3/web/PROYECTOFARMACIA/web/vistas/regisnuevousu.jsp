<%-- 
    Document   : regisnuevousu
    Created on : 11/11/2022, 08:00:59 AM
    Author     : SENA
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
   <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" crossorigin="anonymous">
        <link href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet" crossorigin="anonymous">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" crossorigin="anonymous">
        
        <link href="/PROYECTOFARMACIA/CSS/Validar.css" rel="stylesheet" type="text/css"/>
        <title>Crear Usuario</title>
    </head>
    <body>
      
        <div class="container mt-2 border">
                <div class="row">
                    <div class="col-sm-2"></div>
                    <div class="col-sm-8 border mt-2 mb-2">
                        <form action="../CtrUsuario?accion=nuevo" class="formulario" id="formulario">
                            <div class="form-row">
                                <!-- Identificacion-->
                                <div class ="col formulario__grupo" id="grupo__identificacion">
                                    <label for="id" class="formulario__label" >Identificacion</label>
                                    <div class="formulario__grupo-input">
                                        <input type="text" class="formulario__input" name = "id" id="id" placeholder="12345678">
                                        <i class="formulario__validacion-estado fa fa-times-circle"></i>
                                    </div>
                                    <p class="formulario__input-error">La identificacion tiene que ser de 7 a 10 digitos solo se aceptan numeros</p>
                                </div>
                                <!-- correo-->
                                <div class ="col formulario__grupo" id="grupo__correo">
                                    <label for="correo" class="formulario__label" >Correo</label>
                                    <div class="formulario__grupo-input">
                                        <input type="email" class="formulario__input" name = "correo" id="correo" placeholder="abc@xyz.com">
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
                                        <input type="text" class="formulario__input" name = "nombre" id="nombre" placeholder="jhon smith">
                                        <i class="formulario__validacion-estado fa fa-times-circle"></i>
                                    </div>
                                    <p class="formulario__input-error">nombre tiene que ser letras o espacio no se aceptan numeros ni caracteres especiales</p>
                                </div>
                                <!-- Apellido-->
                                <div class ="col formulario__grupo" id="grupo__apellido">
                                    <label for="apellido" class="formulario__label" >Apellido</label>
                                    <div class="formulario__grupo-input">
                                        <input type="text" class="formulario__input" name = "apellido" id="apellido" placeholder="perez castro">
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
                                        <input type="text" class="formulario__input" name = "direccion" id="direccion" placeholder="Calle 30 #3E-164">
                                        <i class="formulario__validacion-estado fa fa-times-circle"></i>
                                    </div>
                                    <p class="formulario__input-error">La direccion puede contener letras, numeros y caracteres especiales como - #</p>
                                </div>
                                <!-- Telefono-->
                                <div class ="col formulario__grupo" id="grupo__telefono">
                                    <label for="telefono" class="formulario__label" >Telefono</label>
                                    <div class="formulario__grupo-input">
                                        <input type="text" class="formulario__input" name = "telefono" id="telefono" placeholder="3106549873">
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
                                        <input type="text" class="formulario__input" name = "usuario" id="usuario" placeholder="usuario1">
                                        <i class="formulario__validacion-estado fa fa-times-circle"></i>
                                    </div>
                                    <p class="formulario__input-error">El usuario tiene que ser de 4 a 10 caracteres, solo se aceptan letras y numeros</p>
                                </div>
                                <!-- Tipo-->
                                <div class ="col formulario__grupo" id="grupo__tipo">
                                    <label for="tipo" class="formulario__label" >Tipo</label>
                                    <select class="form-control" name="tipo">
                                        <option value="cliente">Cliente</option>
                                        
                                    </select></br>
                                </div>
                            </div>
                            <div class="form-row">
                                <!-- Contraseña-->
                                <div class ="col formulario__grupo" id="grupo__contrasena">
                                    <label for="contrasena" class="formulario__label" >Contraseña</label>
                                    <div class="formulario__grupo-input">
                                        <input type="password" class="formulario__input" name = "contrasena" id="contrasena">
                                        <i class="formulario__validacion-estado fa fa-times-circle"></i>
                                    </div>
                                    <p class="formulario__input-error">La contraseña debe contener entre 4 y 10 caracteres</p>
                                </div>
                                <!-- Repetir Contraseña-->
                                <div class ="col formulario__grupo" id="grupo__contrasena2">
                                    <label for="contrasena2" class="formulario__label" >Repetir Contraseña</label>
                                    <div class="formulario__grupo-input">
                                        <input type="password" class="formulario__input" name = "contrasena2" id="contrasena2">
                                        <i class="formulario__validacion-estado fa fa-times-circle"></i>
                                    </div>
                                    <p class="formulario__input-error">Ambas contraseñas deben ser iguales</p>
                                </div>
                                
                            </div>
                             <!-- terminos-->
                                <div class ="formulario__grupo" id="grupo__terminos">
                                    <label class="formulario__label" >
                                        <input type="checkbox" class="formulario__checkbox" name="terminos" id="terminos">
                                        Acepto terminos y condiciones
                                    </label>
                                </div>
                             <div class="formulario__mensaje" id="formulario__mensaje">
                                <p><i class="fa fa-exclamation-triangle"></i> <b>Error:</b> por favor llena corectamente el formulario</p>
                            </div>
                             <div class="form-row">
                                <!-- botones-->
                                <div class ="col mt-2 text-center formulario__grupo-btn-enviar">
                                    <button type="submit" class="btn btn-primary formulario__btn" name="accion" value="nuevos">Guardar <i class="fa fa-floppy-o" aria-hidden="true"></i></button> 
                                    <a class="btn btn-danger formulario__btn" name="regresar" href="/PROYECTOFARMACIA/CtrUsuario?accion=Listar">Regresar <i class="fa fa-undo" aria-hidden="true"></i></a>
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
        <script src="/PROYECTOFARMACIA/JS/validar1.js" type="text/javascript"></script>
        
    </body>
</html>
