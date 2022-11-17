/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *Clase Usuario
 * Define los datos que contienen los usuarios
 * Version: 1.0.0
 * @author Equipo Cinyuje
 */
public class Usuario {

    private String Id;
    private String Correo;
    private String Nombre;
    private String Apellido;
    private String Direccion;
    private String Telefono;
    private String Usuario;
    private String Contrasena;
    private String Tipo;
    
     /**
 * Funcion: Usuario
 * Método constructor Usuario usado  inicializar
 */

    public Usuario(String Id, String Correo, String Nombre, String Apellido, String Direccion, String Telefono, String Usuario, String Contrasena, String Tipo) {
        this.Id = Id;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Direccion = Direccion;
        this.Telefono = Telefono;
        this.Usuario = Usuario;
        this.Contrasena = Contrasena;
        this.Tipo = Tipo;
        this.Correo = Correo;
        
    }
    
     /**
 * Funcion: Usuario
 * Constructor Usuario, vacio
 */

    public Usuario() {
    }
    
     /**
 * Funcion: getId
 * Obtiene el Id del usuario
 * @return: devuelve el id de un usuario
 */

    public String getId() {
        return Id;
    }
    
    /**
 * Funcion: getCorreo
 * Obtiene el correo del usuario
 * @return: devuelve el correo de un usuario
 */

    public String getCorreo() {
        return Correo;
    }

     /**
 * Funcion: getNombre
 * Obtiene el nombre de un usuario
 * @return: devuelve el nombre de un usuario
 */

    public String getNombre() {
        return Nombre;
    }
    
     /**
 * Funcion: getApellido
 * Obtiene el apellido del usuario
 * @return: devuelve el apellido de un usuario
 */

    public String getApellido() {
        return Apellido;
    }
    
     /**
 * Funcion: getDireccion
 * Obtiene la dirección del usuario
 * @return: devuelve la dirección de un usuario
 */

    public String getDireccion() {
        return Direccion;
    }
    
     /**
 * Funcion: getTelefono
 * Obtiene el telefono del usuario
 * @return: devuelve el relefono de un usuario
 */

    public String getTelefono() {
        return Telefono;
    }
    
     /**
 * Funcion: getUsuario
 * Obtiene el usuario
 * @return: devuelve un usuario
 */

    public String getUsuario() {
        return Usuario;
    }
    
     /**
 * Funcion: getContrasena
 * Obtiene la contraseña del usuario
 * @return: devuelve la contraseña de un usuario
 */

    public String getContrasena() {
        return Contrasena;
    }
    
     /**
 * Funcion: getTipo
 * Obtiene el tipo usuario Administrador y, o Cliente
 * @return: devuelve el tipo usuario
 */

    public String getTipo() {
        return Tipo;
    }
    
    /**
 * Funcion: setId
 * Establece el Id del usuario
 */

    public void setId(String Id) {
        this.Id = Id;
    }
    
     /**
 * Funcion: setCorreo
 * Establece el correo del usuario
 */
    
     public void setCorreo(String Correo) {
        this.Correo = Correo;
    }
     
     /**
 * Funcion: setNombre
 * Establece el nombre del usuario
 */

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    
     /**
 * Funcion: setApellido
 * Establece el apellido del usuario
 */

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }
    
     /**
 * Funcion: setDireccion
 * Establece la dirección del usuario
 */
    
    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }
    
     /**
 * Funcion: setTelefono
 * Establece el telefono del usuario
 */

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }
    
    /**
 * Funcion: setUsuario
 * Establece el usuario
 */

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }
    
    /**
 * Funcion: setContrasena
 * Establece la contraseña del usuario
 */

    public void setContrasena(String Contrasena) {
        this.Contrasena = Contrasena;
    }
    
    /**
 * Funcion: setTipo
 * Establece el tipo de usuario
 */

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }
}
