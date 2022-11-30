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
public class DetallePedidoDAO {
    Connection con;
    Statement stmt = null;
    Conectar conexion;
    ResultSet rs;
    PreparedStatement ps;
    
    public void crear(DetallePedido dp){
        try{
            conexion = new Conectar();
            Connection con = conexion.crearconexion();
            if (con != null) {
                System.out.println("Se ha establecido una conexion a la base de datos dao listar" + "\n");
            }
            ps = con.prepareStatement("insert into detalle_pedido (idpedido, idproducto, nombre, cantidad, precio)Values(?,?,?,?,?)");
            ps.setInt(1, dp.getIdpedido());
            ps.setInt(2, dp.getIdproducto());
            ps.setString(3, dp.getNombre());
            ps.setInt(4, dp.getCantidad());
            ps.setInt(5, dp.getPrecio());
            ps.executeUpdate();
        }catch(Exception e){
            System.out.println("Error al insertar los datos: "+e);
        }

    }
}