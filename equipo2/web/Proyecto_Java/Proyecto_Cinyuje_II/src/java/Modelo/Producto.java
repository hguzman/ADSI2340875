/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *Clase Producto
 * Define los datos que contienen los productos
 * Version: 1.0.0
 * @author Equipo Cinyuje
 */
public class Producto {
    
    private int id;
    private String nombre;
    private String foto;
    private String descripcion;
    private int precio;
    private int stock;
    private int categoria;

    public Producto() {
    }

    public Producto(int id, String nombre, String foto, String descripcion, int precio, int stock, int categoria) {
        this.id = id;
        this.nombre = nombre;
        this.foto = foto;
        this.descripcion = descripcion;
        this.precio = precio;
        this.stock = stock;
        this.categoria = categoria;
    }
    
    /**
 * Funcion: getId
 * Obtiene el Id del producto
 * @return: devuelve el id de un producto
 */

    public int getId() {
        return id;
    }
    
     /**
 * Funcion: getNombre
 * Obtiene el nombre del producto
 * @return: devuelve el nombre de un producto
 */

    public String getNombre() {
        return nombre;
    }
     /**
 * Funcion: getFoto
 * Obtiene la foto del producto
 * @return: devuelve la foto de un producto
 */

    public String getFoto() {
        return foto;
    }
    
     /**
 * Funcion: getDescripcion
 * Obtiene la descripción del producto
 * @return: devuelve la descripción de un producto
 */

    public String getDescripcion() {
        return descripcion;
    }
    
     /**
 * Funcion: getPrecio
 * Obtiene el precio del producto
 * @return: devuelve el precio de un producto
 */

    public int getPrecio() {
        return precio;
    }
    
     /**
 * Funcion: getStock
 * Obtiene el stock del producto
 * @return: devuelve el stock, o cantidad que queda disponible de un producto
 */

    public int getStock() {
        return stock;
        
    }
    
     /**
 * Funcion: getCategoria
 * Obtiene el la categoria del producto
 * @return: devuelve el la categoria de un producto
 */

    public int getCategoria() {
        return categoria;
    }
    
     /**
 * Funcion: setId
 * Establece el Id del producto
 */

    public void setId(int id) {
        this.id = id;
    }
    
    /**
 * Funcion: setNombre
 * Establece el nombre del producto
 */

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    /**
 * Funcion: setFoto
 * Establece la foto del producto
 */

    public void setFoto(String foto) {
        this.foto = foto;
    }
    
    /**
 * Funcion: setDescripcion
 * Establece la descripción del producto
 */

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    /**
 * Funcion: setPrecio
 * Establece el precio del producto
 */

    public void setPrecio(int precio) {
        this.precio = precio;
    }
    
    /**
 * Funcion: setStock
 * Establece el stock del producto
 */

    public void setStock(int stock) {
        this.stock = stock;
    }
    
   
 /**
 * Funcion: setCategoria
 * Establece la categoria del producto
 */
    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }
    
    
    
    
}
