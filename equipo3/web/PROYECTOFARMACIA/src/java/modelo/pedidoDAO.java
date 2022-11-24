/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import configuracion.Conectar;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author SENA
 */
public class pedidoDAO {
    Connection con;
    Statement stmt = null;
    Conectar conexcion;
    ResultSet rs;
    PreparedStatement ps;  
    
    public void crear(pedido ped){
        try{
            conexcion = new Conectar();
            Connection con = conexcion.crearconexion();
            if (con != null) {
                System.out.println("Se ha establecido una conexion a la base de datos dao listar" + "\n");
            }
            ps = con.prepareStatement("insert into pedido (codigo_pedido , fecha_pedido, valor_pedido, Id) values(?,?,?,?)");
            ps.setInt(1, ped.getCodigo_pedido());
            ps.setString(2, ped.getFecha_pedido());
            ps.setInt(3, ped.getValor_pedido());
            ps.setInt(4, ped.getId());
            ps.executeUpdate();
            
        }catch(Exception e){
            System.out.println("error al insertar datos" +e);
        }
    }
    public int listarId(){
        int idp = 0;
        try{
            conexcion = new Conectar();
            Connection con = conexcion.crearconexion();
            if (con != null) {
                System.out.println("Se ha establecido una conexion a la base de datos dao listar" + "\n");
            }
            ps = con.prepareStatement("select MAX(codigo_pedido) from pedido");
            rs = ps.executeQuery();
            while(rs.next()){
                idp = rs.getInt(1);
            }
                
           
        }catch(Exception e){
            System.out.println("error al insertar datos" +e);
        }
        return idp;
    }
}
