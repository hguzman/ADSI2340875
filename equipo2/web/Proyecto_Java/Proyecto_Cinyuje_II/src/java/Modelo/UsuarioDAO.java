/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Configuracion.Conectar;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *Clase UsuarioDAO
 * Maneja la conexión con la tabla usuario en la base de datos
 * Version: 1.0.0
 * @author Equipo Cinyuje
 */
public class UsuarioDAO {
    
    Connection con;
    PreparedStatement pstm;
    Conectar conexion;
    ResultSet rs;
    Usuario usua = new Usuario();
    
    
    /**
 * Funcion: Validar
 * Valida el usuario y contraseña para la conexion con la base de datos
 * @return: "usua" devuelve el usuario
 */
 
    public Usuario Validar(String usu, String pass){
        try{
            conexion = new Conectar();
            con = conexion.crearconexion();
            if (con != null) {
                System.out.println("Se ha conectado a la base de datos");
            }
            
            pstm = con.prepareStatement("select * from usuarios where Usuario = ? and Contrasena = ?");
            pstm.setString(1, usu);
            pstm.setString(2, pass);
            rs = pstm.executeQuery();
            
            while(rs.next()){
                if (!rs.getString("Usuario").equals("")) {
                    
                    usua.setId(rs.getString("Id"));
                    usua.setCorreo(rs.getString("Correo"));
                    usua.setNombre(rs.getString("Nombre"));
                    usua.setApellido(rs.getString("Apellido"));
                    usua.setDireccion(rs.getString("Direccion"));
                    usua.setTelefono(rs.getString("Telefono"));
                    usua.setUsuario(rs.getString("Usuario"));
                    usua.setContrasena(rs.getString("Contrasena"));
                    usua.setTipo(rs.getString("Tipo"));
                }
            
            }
                
        } catch(Exception e){
            System.out.println("Error al conectarse a la base de datoos");
        }
        
        return usua;
    }
    
    /**
 * Funcion: Listar
 * Muestra todos los usuarios registrados en la base de datos
 * @return: "list" devuelve la lista de usuarios
 */
    
    public List Listar(){
        ArrayList<Usuario> list = new ArrayList();
        try{
            conexion = new Conectar();
            con = conexion.crearconexion();
            if(con != null){
                System.out.println("Se ha establecido la conexion a la base de datos");
                pstm = con.prepareStatement("select * from usuarios");                                 
                rs = pstm.executeQuery();
                while(rs.next()){
                    Usuario us = new Usuario();
                    us.setId(rs.getString(1));
                    us.setCorreo(rs.getString(2));
                    us.setNombre(rs.getString(3));
                    us.setApellido(rs.getString(4));    
                    us.setDireccion(rs.getString(5));
                    us.setTelefono(rs.getString(6));
                    us.setUsuario(rs.getString(7));
                    us.setContrasena(rs.getString(8));
                    us.setTipo(rs.getString(9));
                    list.add(us);
                }
            }
        }catch(Exception e){
        
        }       
    return list;

    }
    
     /**
 * Funcion: Listar
 * Lista un usuario por id
 * @return: "usu" devuelve un usuario
 */
    
    public Usuario list(String id) {
        Usuario usu = new Usuario();
        try {
            conexion = new Conectar();
            con = conexion.crearconexion();
            if (con != null) {
                System.out.println("Se ha establecido una conexion a la base de datos 1" + "\n");
            }
            pstm = con.prepareStatement("select * from usuarios where id = ?");
            pstm.setString(1, id);
            rs = pstm.executeQuery();
            while (rs.next()) {
                
                usu.setId(rs.getString(1));
                usu.setNombre(rs.getString(3));
                usu.setApellido(rs.getString(4));
                usu.setDireccion(rs.getString(5));
                usu.setTelefono(rs.getString(6));
                usu.setCorreo(rs.getString(2));
                usu.setUsuario(rs.getString(7));
                usu.setContrasena(rs.getString(8));
                
            }
        } catch (Exception e) {
            System.out.println("Error al extraer los datos de la tabla " + e);
        }
        return usu;
    }
    
     /**
 * Funcion: crear
 * Crea un usuario
 * @return: "true" valor diferente a 0
 */
    
    public boolean crear(Usuario us){
        try{
            conexion = new Conectar();
            con = conexion.crearconexion();
            if (con != null) {
                System.out.println("Se ha establecido una conexion a la base de datos 1" + "\n");
            }
            pstm = con.prepareStatement("insert into usuarios values(?, ?, ?, ?, ?, ?, ?, ?, ?)");
            pstm.setString(1, us.getId());
            pstm.setString(2, us.getCorreo());
            pstm.setString(3, us.getNombre());
            pstm.setString(4, us.getApellido());
            pstm.setString(5, us.getDireccion());
            pstm.setString(6, us.getTelefono());
            pstm.setString(7, us.getUsuario());
            pstm.setString(8, us.getContrasena());
            pstm.setString(9, us.getTipo());
            
            pstm.executeUpdate();
            
            
            
        }catch(Exception e){
            System.out.println("Error al insertar el usuario" +e);
        }
        
        return true;
    
    }
    
     /**
 * Funcion: editar
 * Permite editar los usuarios registrados en la base de datos
 * @return: "true" valor diferente a 0
 */
    
    public boolean editar(Usuario us){
         try{
             conexion = new Conectar();
             con = conexion.crearconexion();
             if(con != null){
                 System.out.println("se ha conectado ha la base de datos");
             }
             
              pstm = con.prepareStatement("update usuarios set Nombre = ?, Apellido = ?, Correo = ?, Direccion = ?, Telefono= ?, Usuario = ?, Contrasena = ?, Tipo = ? where id = ?");
              
              pstm.setString(1, us.getNombre());
              pstm.setString(2, us.getApellido());
              pstm.setString(3, us.getCorreo());
              pstm.setString(4, us.getDireccion());
              pstm.setString(5, us.getTelefono());
              pstm.setString(6, us.getUsuario());
              pstm.setString(7, us.getContrasena());
              pstm.setString(8, us.getTipo());
              pstm.setString(9, us.getId());
              pstm.executeUpdate();
              System.out.println("Se ha modificado la info a la base de datos");
         }catch(Exception e){
             System.out.println("error al actualizar los datos"+e);
         }
         return true;
     }
    
     /**
 * Funcion: eliminar
 * Permite eliminar los usuarios registrados en la base de datos
 * @return: "true" valor diferente a 0
 */
    
    public boolean eliminar(String id){
    
    try{
             conexion = new Conectar();
             con = conexion.crearconexion();
             if(con != null){
                 System.out.println("se ha conectado ha la base de datos");
             }
             
              pstm = con.prepareStatement("Delete from usuarios where id = ?");
              pstm.setString(1, id);
              pstm.executeUpdate();
              
          
              System.out.println("Se ha modificado la info de eliminar a la base de datos");
         }catch(Exception e){
             System.out.println("error al actualizar los datos"+e);
         }
    
         return true;
    
    }

    

    
}
