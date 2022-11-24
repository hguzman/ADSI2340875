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
 * @author HPLAPTOP01
 */
public class PedidoDAO {
    Connection con;
    Statement stmt = null;
    Conectar conexion;
    ResultSet rs;
    PreparedStatement ps;
    
    public void crear(Pedido pe){
        try{
            conexion = new Conectar();
            Connection con = conexion.crearconexion();
            if (con != null) {
                System.out.println("Se ha establecido una conexion a la base de datos dao listar" + "\n");
            }
            ps = con.prepareStatement("insert into pedido (idcliente, fecha, monto, estado)Values(?,?,?,?,?)");
            ps.setString(1, pe.getIdcliente());
            ps.setString(2, pe.getFecha());
            ps.setInt(4, pe.getMonto());
            ps.setString(5, pe.getEstado());
            ps.executeUpdate();
        }catch(Exception e){
            System.out.println("Error al insertar los datos: "+e);
        }

    }
    
    public int listarId(){
        int idp = 0;
        try{
            conexion = new Conectar();
            Connection con = conexion.crearconexion();
            if (con != null) {
                System.out.println("Se ha establecido una conexion a la base de datos dao listar" + "\n");
            }
            ps = con.prepareStatement("select max (idpedido) from pedido");
            rs = ps.executeQuery();
            while (rs.next()){
                idp = rs.getInt(1);
            }
        }catch(Exception e){
            System.out.println("Error al listar los productos: "+e);
        }
        return idp;
    }
}
