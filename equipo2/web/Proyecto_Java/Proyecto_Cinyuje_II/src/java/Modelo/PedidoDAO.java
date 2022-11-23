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
 *
 * @author HPLAPTOP01
 */
public class PedidoDAO {

    Connection con;
    PreparedStatement pstm;
    Conectar conexion;
    ResultSet rs;

   

    public void crear(Pedido ped) {
        try {
            conexion = new Conectar();
            con = conexion.crearconexion();
            if (con != null) {
                System.out.println("Se conecto a la base de datos de pedidos DAO");

            }

            pstm = con.prepareStatement("insert into pedidos (IdCliente, IdPago, FechaPedido, Monto, Estado) value(?,?,?,?,?)");
            pstm.setString(1, ped.getId_cliente());
            pstm.setInt(2, ped.getId_pago());
            pstm.setString(3, ped.getFecha_pedido());
            pstm.setInt(4, ped.getMonto());
            pstm.setString(5, ped.getEstado());
        
            pstm.executeUpdate();

        } catch (Exception e) {

        }
    }

    
}
