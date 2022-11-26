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
 * Clase ProductoDAO Maneja la conexión con la tabla producto en la base de
 * datos Version: 1.0.0
 *
 * @author Equipo Cinyuje
 */
public class ProductoDAO {

    Connection con;
    PreparedStatement pstm;
    Conectar conexion;
    ResultSet rs;

    /**
     * Funcion: Listar Muestra todos los productos registrados en la base de
     * datos
     *
     * @return: "producto" devuelve la lista de productos
     */
    public List Listar() {
        List<Producto> producto = new ArrayList();
        try {
            conexion = new Conectar();
            con = conexion.crearconexion();
            if (con != null) {
                System.out.println("Se conecto a la base de datos de productos DAO");

            }

            pstm = con.prepareStatement("select * from producto where Stock > 0");
            rs = pstm.executeQuery();
            while (rs.next()) {
                Producto p = new Producto();
                p.setId(rs.getInt(1));
                p.setNombre(rs.getString(2));
                p.setFoto(rs.getString(3));
                p.setDescripcion(rs.getString(4));
                p.setPrecio(rs.getInt(5));
                p.setStock(rs.getInt(6));
                p.setCategoria(rs.getInt(7));
                producto.add(p);
            }

        } catch (Exception e) {

        }
        return producto;
    }

    /**
     * Funcion: Buscar Muestra un producto de la base de datos
     *
     * @return: "producto" devuelve un producto de la lista de productos en la
     * base de datos
     */
    public List Buscar(String nombre) {
        List<Producto> producto = new ArrayList();
        try {
            conexion = new Conectar();
            con = conexion.crearconexion();
            if (con != null) {
                System.out.println("Se conecto a la base de datos de productos DAO");

            }

            pstm = con.prepareStatement("select * from producto where Nombre like '%" + nombre + "%'");
            rs = pstm.executeQuery();
            while (rs.next()) {
                Producto p = new Producto();
                p.setId(rs.getInt(1));
                p.setNombre(rs.getString(2));
                p.setFoto(rs.getString(3));
                p.setDescripcion(rs.getString(4));
                p.setPrecio(rs.getInt(5));
                p.setStock(rs.getInt(6));
                p.setCategoria(rs.getInt(7));
                producto.add(p);
            }

        } catch (Exception e) {

        }
        return producto;
    }

    /**
     * Funcion: ListarId Lista un producto de la base de datos
     *
     * @return: "p" devuelve un producto de la lista de productos en la base de
     * datos
     */
    public Producto ListarId(int id) {
        Producto p = new Producto();
        try {
            conexion = new Conectar();
            con = conexion.crearconexion();
            if (con != null) {
                System.out.println("Se conecto a la base de datos de productos DAO");

            }

            pstm = con.prepareStatement("select * from producto where id= '" + id + "'");
            rs = pstm.executeQuery();
            while (rs.next()) {

                p.setId(rs.getInt(1));
                p.setNombre(rs.getString(2));
                p.setFoto(rs.getString(3));
                p.setDescripcion(rs.getString(4));
                p.setPrecio(rs.getInt(5));
                p.setStock(rs.getInt(6));
                p.setCategoria(rs.getInt(7));

            }

        } catch (Exception e) {

        }
        return p;
    }

    public void crear(Producto pro) {
        try {
            conexion = new Conectar();
            con = conexion.crearconexion();
            if (con != null) {
                System.out.println("Se conecto a la base de datos de productos DAO");

            }

            pstm = con.prepareStatement("insert into producto (Nombre, Descripcion, Foto, Precio, Stock, Categoria) value(?,?,?,?,?,?)");
            pstm.setString(1, pro.getNombre());
            pstm.setString(2, pro.getDescripcion());
            pstm.setString(3, pro.getFoto());
            pstm.setInt(4, pro.getPrecio());
            pstm.setInt(5, pro.getStock());
            pstm.setInt(6, pro.getCategoria());
            pstm.executeUpdate();

        } catch (Exception e) {

        }
    }

    public void actualizar(Producto p) {
        try {
            conexion = new Conectar();
            con = conexion.crearconexion();
            if (con != null) {
                System.out.println("se ha conectado ha la base de datos");
            }

            pstm = con.prepareStatement("update producto set Nombre = ?, Descripcion = ?, Foto = ?, Precio = ?, Stock = ?, Categoria = ? where id = ?");

            pstm.setString(1, p.getNombre());
            pstm.setString(2, p.getDescripcion());
            pstm.setString(3, p.getFoto()); 
            pstm.setInt(4, p.getPrecio());
            pstm.setInt(5, p.getStock());
            pstm.setInt(6, p.getCategoria());
            pstm.setInt(7, p.getId());
            
            pstm.executeUpdate();

            System.out.println("Se ha modificado la info a la base de datos de actualizar producto");
        } catch (Exception e) {
            System.out.println("error al actualizar los datos" + e);
        }
      
    }
    
    
     public boolean eliminar(int id){
    
    try{
             conexion = new Conectar();
             con = conexion.crearconexion();
             if(con != null){
                 System.out.println("se ha conectado ha la base de datos");
             }
             
              pstm = con.prepareStatement("Delete from producto where id = ?");
              pstm.setInt(1, id);
              pstm.executeUpdate();
              
          
              System.out.println("Se ha modificado la info de eliminar a la base de datos");
         }catch(Exception e){
             System.out.println("error al actualizar los datos"+e);
         }
    
         return true;
    
    }
    
    
    

}
