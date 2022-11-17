/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package configuracion;

import java.sql.DriverManager;
import java.sql.Connection;

/**
 *
 * @author HPLAPTOP01
 */
public class Conectar {
    
    private String driver = "com.mysql.jdbc.Driver";
    private String cadenaConeccion = "jdbc:mysql://localhost/proyecto_dulceria";
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
    
    
    public Connection crearconexion(){
      return con;
    }
    
    public void desconectar(){
        con = null;
        if (con == null) {
            System.out.println("Se ha desconectado correctamente");
            
        }
    }
    
}
