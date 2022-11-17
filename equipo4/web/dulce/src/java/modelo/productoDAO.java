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
            rs = stmt.executeQuery("select * from producto");
            while (rs.next()){
                //System.out.println("hay productos en daolistar" + "\n");
               producto p = new producto();
               p.setId(rs.getString(1));
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
               p.setId(rs.getString(1));
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
            rs = stmt.executeQuery("select * from producto where Id = '"+id+"'");
            while (rs.next()){
                //System.out.println("hay productos en daolistar" + "\n");
               
               p.setId(rs.getString(1));
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
}
