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
public class detallepedidoDAO {
    Connection con;
    Statement stmt = null;
    Conectar conexcion;
    ResultSet rs;
    PreparedStatement ps; 
    
    public void crear(detallepedido dp){
        try{
            conexcion = new Conectar();
            Connection con = conexcion.crearconexion();
            if (con != null) {
                System.out.println("Se ha establecido una conexion a la base de datos dao listar" + "\n");
            }
            ps = con.prepareStatement("insert into detalle_pedido (IdProducto, nombre, Cantidad, PrecioCompra, codigo_pedido) values(?,?,?,?,?)");
            ps.setInt(1, dp.getIdproducto());
            ps.setString(2, dp.getNombre());
            ps.setInt(3, dp.getCantidad());
            ps.setInt(4, dp.getPrecioCompra());
            ps.setInt(5, dp.getCodigo_pedido());
            ps.executeUpdate();
            
        }catch(Exception e){
            System.out.println("error al insertar datos" +e);
        }
}
}
