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

/**
 *
 * @author HPLAPTOP01
 */
public class DetallePedidoDAO {

    Connection con;
    PreparedStatement pstm;
    Conectar conexion;
    ResultSet rs;

    public void crear(Detalle_Pedido dp) {
        try {
            conexion = new Conectar();
            con = conexion.crearconexion();
            if (con != null) {
                System.out.println("Se conecto a la base de datos de pedidos DAO");

            }

            pstm = con.prepareStatement("insert into detalle_pedidos (IdProducto, Nombre, IdPedido, Cantidad, PrecioPedido) Values(?, ?, ?, ?, ?) ");
            pstm.setInt(1, dp.getId_producto());
            pstm.setString(2, dp.getNombre());
            pstm.setInt(3, dp.getId_pedido());
            pstm.setInt(4, dp.getCantidad());
            pstm.setInt(5, dp.getPrecio_pedido());

            pstm.executeUpdate();

        } catch (Exception e) {
                System.out.println("Error al insertar detalle pedido");
        }
    }

}
