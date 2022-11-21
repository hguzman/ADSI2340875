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
    Conectar conexcion;
    ResultSet rs;
    PreparedStatement ps;
    
    public List listar(){
        List<producto>producto = new ArrayList();
        try{
            conexcion = new Conectar();
            Connection con = conexcion.crearconexion();
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
            conexcion = new Conectar();
            Connection con = conexcion.crearconexion();
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
            
        }
        return producto;
    }
    
    public producto listarId(int id){
        producto p = new producto();
        try{
            conexcion = new Conectar();
            Connection con = conexcion.crearconexion();
            if (con != null) {
                System.out.println("Se ha establecido una conexion a la base de datos dao listar" + "\n");
            }
            stmt = con.createStatement();
            rs = stmt.executeQuery("select * from producto where Idp = '"+id+"'");
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
            
        }
        return p;
    }
    public void crear(producto pro){
        try{
            conexcion = new Conectar();
            Connection con = conexcion.crearconexion();
            if (con != null) {
                System.out.println("Se ha establecido una conexion a la base de datos dao listar" + "\n");
            }
            ps = con.prepareStatement("insert into producto (Nombre, Descripcion, Foto, Precio, Stock) values(?,?,?,?,?)");
            ps.setString(1, pro.getNombre());
            ps.setString(2, pro.getDescripcion());
            ps.setString(3, pro.getFoto());
            ps.setInt(4, pro.getPrecio());
            ps.setInt(5, pro.getStock());
            ps.executeUpdate();
        }catch(Exception e){
            System.out.println("error al insertar datos" +e);
        }
    }
    
    public boolean eliminar(int id){
     try{
        conexcion = new Conectar();
        con = conexcion.crearconexion();
        if (con != null) {
            System.out.println("se establecio conexion a la base datos");
        }
        ps = con.prepareStatement("Delete from producto where idp =?");
        ps.setInt(1, id);
        ps.executeUpdate();
        System.out.println("producto eliminado correctamente");
         }catch(Exception ex){
        System.out.println("error al eliminar prodcuto"+ ex);
    }
    return true;
}
     public void actualizar(producto p){
        try{
            conexcion = new Conectar();
            Connection con = conexcion.crearconexion();
            if (con != null) {
                System.out.println("Se ha establecido una conexion a la base de datos dao listar" + "\n");
            }
            ps = con.prepareStatement("update producto set Nombre = ?, Descripcion = ?, Foto = ?, Precio = ?, Stock = ? where Idp = ?" );
            ps.setString(1, p.getNombre());
            ps.setString(2, p.getDescripcion());
            ps.setString(3, p.getFoto());
            ps.setInt(4, p.getPrecio());
            ps.setInt(5, p.getStock());
            ps.setInt(6, p.getId());
            ps.executeUpdate();
        }catch(Exception e){
            System.out.println("error al insertar datos" +e);
        }
    }
}