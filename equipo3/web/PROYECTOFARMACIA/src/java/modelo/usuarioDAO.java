package modelo;

import configuracion.Conectar;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class usuarioDAO {

    
    Connection con;
    Statement stmt = null;
    PreparedStatement pstm;
    Conectar conexion;
    ResultSet rs;
    usuario usua = new usuario();
    
    public usuario validar(String usu, String pass){
        System.out.println("ingreso ");
        try{
            conexion = new Conectar();
            con = conexion.crearconexion();
            if(con != null){
                System.out.println("se ha conectado");
                
            }
            pstm = con.prepareStatement("select * from usuarios where Usuario = ? and Contrasena = ?");
            pstm.setString(1, usu);
            pstm.setString(2, pass);
            rs = pstm.executeQuery();
            while(rs.next()){
                System.out.println("ingreso ");
                if(!rs.getString("Usuario").equals("")){
                    
                    usua.setId(rs.getString("Id"));
                    usua.setCorreo(rs.getString("Correo"));
                    usua.setNombre(rs.getString("Nombre"));
                    usua.setApellido(rs.getString("Apellido"));
                    usua.setDireccion(rs.getString("Direccion"));
                    usua.setUsuario(rs.getString("Usuario"));
                    usua.setContrasena(rs.getString("Contrasena"));
                    usua.setTipo(rs.getString("Tipo"));
                    
                }
            }
        }catch(Exception e){
            System.out.println("Error al conectar a la base de datos" + e);
        }
            return usua;
    }

public List Listar(){
    ArrayList<usuario>List = new ArrayList<>();
    try{
        conexion = new Conectar();
        con =  conexion.crearconexion();
        if (con != null) {
            System.out.println("Se ha establecido conexion a la base de datos");
        }
        pstm = con.prepareStatement("select * from usuarios ");
        rs = pstm.executeQuery();
        while(rs.next()){
            usuario us = new usuario();
            us.setId(rs.getString(1));
            us.setCorreo(rs.getString(2));
            us.setNombre(rs.getString(3));
            us.setApellido(rs.getString(4));
            us.setDireccion(rs.getString(5));
            us.setTelefono(rs.getString(6));
            us.setUsuario(rs.getString(7));
            us.setContrasena(rs.getString(8));
            us.setTipo(rs.getString(9));
            List.add(us);
        }
    }catch(Exception e){
        
    }
    return List;
}


public usuario list(String id) {
        usuario usu = new usuario();
        try {
            conexion = new Conectar();
            con = conexion.crearconexion();
            if (con != null) {
                System.out.println("Se ha establecido una conexion a la base de datos 1" + "\n");
            }
            pstm = con.prepareStatement("select * from usuarios where id = ?");
            pstm.setString(1, id);
            rs = pstm.executeQuery();
            while (rs.next()) {
                
                usu.setId(rs.getString(1));
                usu.setCorreo(rs.getString(2));
                usu.setNombre(rs.getString(3));
                usu.setApellido(rs.getString(4));
                usu.setDireccion(rs.getString(5));
                usu.setTelefono(rs.getString(6));
                usu.setUsuario(rs.getString(7));
                usu.setContrasena(rs.getString(8));
                usu.setTipo(rs.getString(9));
                
            }
        } catch (Exception e) {
            System.out.println("Error al extraer los datos de la tabla " + e);
        }
        return usu;
    }

public boolean crear(usuario us){
    try{
        conexion = new Conectar();
        con = conexion.crearconexion();
        if (con != null) {
            System.out.println("se establecio conexion a la base datos");
        }
        pstm = con.prepareStatement("insert into usuarios values(?, ?, ?, ?, ?, ?, ?, ?, ?)");
            pstm.setString(1, us.getId());
            pstm.setString(2, us.getCorreo());
            pstm.setString(3, us.getNombre());
            pstm.setString(4, us.getApellido());
            pstm.setString(5, us.getDireccion());
            pstm.setString(6, us.getTelefono());
            pstm.setString(7, us.getUsuario());
            pstm.setString(8, us.getContrasena());
            pstm.setString(9, us.getTipo());
            pstm.executeUpdate();
            System.out.println("entro en crear");
    }catch(Exception e){
        System.out.println("error al insertar datos" +e);
    }
    return true;
    
}

 public List buscar(String nombre){
        List<usuario>usuario = new ArrayList();
        try{
            conexion = new Conectar();
            Connection con = conexion.crearconexion();
            if (con != null) {
                System.out.println("Se ha establecido una conexion a la base de datos dao listar" + "\n");
            }
            stmt = con.createStatement();
            rs = stmt.executeQuery("select * from usuarios where Nombre like '%"+nombre+"%'");
            while (rs.next()){
                //System.out.println("hay productos en daolistar" + "\n");
               usuario u = new usuario();
               u.setId(rs.getString(1));
               u.setCorreo(rs.getString(2));
               u.setNombre(rs.getString(3)); 
               u.setApellido(rs.getString(4));
               u.setDireccion(rs.getString(5));
               u.setTelefono(rs.getString(6));
               u.setUsuario(rs.getString(7));
               u.setContrasena(rs.getString(8));
               u.setTipo(rs.getString(9));
               usuario.add(u);
           }
        }catch(Exception e){
            
        }
        return usuario;
    }

public boolean editar(usuario us){
    try{
        conexion = new Conectar();
        con = conexion.crearconexion();
        if (con != null) {
            System.out.println("se establecio conexion a la base datos");
        }
        pstm = con.prepareStatement("update usuarios set Nombre = ?, Apellido = ?, Direccion = ?, Telefono = ?, correo = ?, Usuario = ?, Contrasena = ?, Tipo = ? where id = ?");
            pstm.setString(1, us.getNombre());
            pstm.setString(2, us.getApellido());
            pstm.setString(3, us.getDireccion());
            pstm.setString(4, us.getTelefono());
            pstm.setString(5, us.getCorreo());
            pstm.setString(6, us.getUsuario());
            pstm.setString(7, us.getContrasena());
            pstm.setString(8, us.getTipo());
            pstm.setString(9, us.getId());
            pstm.executeUpdate();
            System.out.println("Datos Modificados correctamente");
            
    }catch(Exception ex){
        System.out.println("error al modificar los datos"+ ex);
    }
    return true;
}
public boolean eliminar(String id){
     try{
        conexion = new Conectar();
        con = conexion.crearconexion();
        if (con != null) {
            System.out.println("se establecio conexion a la base datos");
        }
        pstm = con.prepareStatement("Delete from usuarios where Id =?");
        pstm.setString(1, id);
        pstm.executeUpdate();
        System.out.println("usuario eliminado correctamente");
         }catch(Exception ex){
        System.out.println("error al eliminar usuario"+ ex);
    }
    return true;
} 

}