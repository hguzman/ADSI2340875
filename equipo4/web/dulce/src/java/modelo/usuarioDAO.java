package modelo;

import configuracion.Conectar;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class usuarioDAO {

    
    Connection con;
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
                    usua.setCorreo(rs.getString("correo"));
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
         public List listar(){
             ArrayList<usuario>list = new ArrayList<>();
             try{
                 conexion = new Conectar();
                 con = conexion.crearconexion();
                 if (con != null){
                     System.out.println("se ha establecido conexcion a la base de datos ");
                 }
                 pstm = con.prepareStatement("select * from usuarios");
                 rs = pstm.executeQuery();
                 while(rs.next()){
                     usuario usu = new usuario();
                     usu.setId(rs.getString(1));
                     
                     usu.setNombre(rs.getString(2));
                     usu.setApellido(rs.getString(3));
                     usu.setCorreo(rs.getString(4));
                     usu.setDireccion(rs.getString(5));
                     usu.setTelefono(rs.getString(6));
                     usu.setUsuario(rs.getString(7));
                     usu.setContrasena(rs.getString(8));
                     usu.setTipo(rs.getString(9));
                     list.add(usu);
                     
                     
                 }
                 
             }catch(Exception e){
                 
             }
             return list;
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
                usu.setNombre(rs.getString(2));
                usu.setApellido(rs.getString(3));
                usu.setDireccion(rs.getString(4));
                usu.setTelefono(rs.getString(5));
                usu.setCorreo(rs.getString(6));
                usu.setUsuario(rs.getString(7));
                usu.setContrasena(rs.getString(8));

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
            if (con != null){
                System.out.println("se ha establecido la conexion a la base de datos ");
            }
            pstm = con.prepareStatement("insert into usuarios values(?, ?, ?, ?, ?, ?, ?, ?, ?)");
            pstm.setString(1, us.getId());
            pstm.setString(2, us.getNombre());
            pstm.setString(3, us.getApellido());
            pstm.setString(4, us.getCorreo());
            pstm.setString(5, us.getDireccion());
            pstm.setString(6, us.getTelefono());
            pstm.setString(7, us.getUsuario());
            pstm.setString(8, us.getContrasena());
            pstm.setString(9, us.getTipo());
            pstm.executeUpdate();
            System.out.println("Datos insertados correctamente");
        }catch(Exception e){
            System.out.println("Error al insertar los datos");
        }
        return true;
    }
}