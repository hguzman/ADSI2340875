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
import java.util.ArrayList;
import java.util.List;





public class productoDAO {
    Connection con;
    Statement stmt = null;
    Conectar conexion;
    ResultSet rs;
    PreparedStatement ps;
    
    public List listar(){
        List<producto>producto = new ArrayList();
        try{
            conexion = new Conectar();
            Connection con = conexion.crearconexion();
            if (con != null) {
                System.out.println("Se ha establecido una conexion a la base de datos dao listar" + "\n");
            }
            stmt = con.createStatement();
            rs = stmt.executeQuery("select * from producto where Stock >0");
            while (rs.next()){
                //System.out.println("hay productos en daolistar" + "\n");
                producto p = new producto();
                p.setId(rs.getInt(1));
                p.setNombre(rs.getString(2));
               //p.setFoto(rs.getBinaryStream(3));
                p.setFoto(rs.getString(3));
                //System.out.println("Foto: "+rs.getString(3));
                p.setDescripcion(rs.getString(4));
                p.setPrecio(rs.getInt(5));
                p.setStock(rs.getInt(6));
                producto.add(p);
            }
        }catch(Exception e){
            
        }
        return producto;
    }
    
    public List buscar(String nombre){
        List<producto>producto = new ArrayList();
        try{
            conexion = new Conectar();
            Connection con = conexion.crearconexion();
            if (con != null) {
                System.out.println("Se ha establecido una conexion a la base de datos dao listar" + "\n");
            }
            stmt = con.createStatement();
            rs = stmt.executeQuery("select * from producto where Nombre like '%"+nombre+"%'");
            while (rs.next()){
                //System.out.println("hay productos en daolistar" + "\n");
                producto p = new producto();
                p.setId(rs.getInt(1));
                p.setNombre(rs.getString(2));
               //p.setFoto(rs.getBinaryStream(3));
                p.setFoto(rs.getString(3));
               //System.out.println("Foto: "+rs.getString(3));
                p.setDescripcion(rs.getString(4));
                p.setPrecio(rs.getInt(5));
                p.setStock(rs.getInt(6));
                producto.add(p);
            }
        }catch(Exception e){
            System.out.println("Error al buscar los productos: "+e);
        }
        return producto;
    }
    
    public producto listarId(int id){
        producto p = new producto();
        try{
            conexion = new Conectar();
            Connection con = conexion.crearconexion();
            if (con != null) {
                System.out.println("Se ha establecido una conexion a la base de datos dao listar" + "\n");
            }
            stmt = con.createStatement();
            rs = stmt.executeQuery("select * from producto where Id = '"+id+"'");
            while (rs.next()){
                //System.out.println("hay productos en daolistar" + "\n");
                
                p.setId(rs.getInt(1));
                p.setNombre(rs.getString(2));
               //p.setFoto(rs.getBinaryStream(3));
                p.setFoto(rs.getString(3));
               //System.out.println("Foto: "+rs.getString(3));
                p.setDescripcion(rs.getString(4));
                p.setPrecio(rs.getInt(5));
                p.setStock(rs.getInt(6));
                
            }
        }catch(Exception e){
            System.out.println("Error al listar los productos: "+e);
        }
        return p;
    }
    
    public void crear(producto pro){
        try{
            conexion = new Conectar();
            Connection con = conexion.crearconexion();
            if (con != null) {
                System.out.println("Se ha establecido una conexion a la base de datos dao listar" + "\n");
            }
            ps = con.prepareStatement("insert into producto (nombre, foto, descripcion, precio, stock )Values(?,?,?,?,?)");
            ps.setString(1, pro.getNombre());
            ps.setString(2, pro.getFoto());
            ps.setString(3, pro.getDescripcion());
            ps.setInt(4, pro.getPrecio());
            ps.setInt(5, pro.getStock());
            
            ps.executeUpdate();
        }catch(Exception e){
            System.out.println("Error al insertar los datos: "+e);
        }

    }
    public void actualizar(producto p){
        try{
            conexion = new Conectar();
            Connection con = conexion.crearconexion();
            if (con != null) {
                System.out.println("Se ha establecido una conexion a la base de datos dao listar" + "\n");
            }
            ps = con.prepareStatement("update producto set nombre = ?, foto = ?, descripcion = ?, precio = ?, stock = ?, where id = ? ");
            ps.setString(1, p.getNombre());
            ps.setString(2, p.getFoto());
            ps.setString(3, p.getDescripcion());
            ps.setInt(4, p.getPrecio());
            ps.setInt(5, p.getStock());
            ps.setInt(6, p.getId());
            ps.executeUpdate();
        }catch(Exception e){
            System.out.println("Error al actualizar los datos: "+e);
        }
    }
    public boolean eliminarpro(int id){
        try{
            conexion = new Conectar();
            con = conexion.crearconexion();
            if (con != null){
                System.out.println("se ha establecido la conexion a la base de datos ");
            }
            ps = con.prepareStatement("Delete from producto where id = ?");
            ps.setInt(1, id);
            ps.executeUpdate();
            System.out.println("Producto eliminado correctamente");
        }catch(Exception e){
            System.out.println("Error al eliminar producto");
        }
        return true;
    }
}
