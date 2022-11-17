/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Configuracion;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *Clase Conectar
 * Sirve para conectar la base de datos con el proyecto
 * Version: 1.0.0
 * @author Equipo Cinyuje
 */
public class Conectar {
    private String driver = "com.mysql.jdbc.Driver";
    private String cadenaConeccion = "jdbc:mysql://localhost/cinyuje";
    private String usuario = "root";
    private String contraseña = "";
    public Connection con;
    
    
    
    public Conectar(){
        try{           
            Class.forName(driver);
            con = DriverManager.getConnection(cadenaConeccion, usuario, contraseña);
            
            if (con != null) {
                System.out.println("La conexion a la base de datos fue exitosa");
            }
            
        }catch(Exception e){
            System.out.println("Error al conectarsee a la base de datos" + e);
        }
    
    }
    
    /**
 * Funcion: crearconexion
 * @return: con devuelve una conexion a la base de datos
 */
    public Connection crearconexion(){
      return con;
    }
    
    /**
 * Funcion: desconectar
 * Esta función desconecta la base de datos
 */
    
    public void desconectar(){
        con = null;
        if (con == null) {
            System.out.println("Se ha desconectado correctamente");
            
        }
    }
    
}
