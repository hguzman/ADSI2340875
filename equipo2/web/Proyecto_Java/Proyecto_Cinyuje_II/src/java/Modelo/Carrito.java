/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *Clase Carrito
 * Sirve para guardar productos, mostar su información general, antes de realizar el pedido 
 * Version: 1.0.0
 * @author Equipo Cinyuje
 */
public class Carrito {
    private int item;
    private int idproducto;
    private String nombre;
    private String descripcion;
    private String foto;
    private int preciocompra;
    private int cantidad;
    private int subtotal;
    
    
       /**
 * Funcion: Carrito
 * Método constructor Carrito usado para inicializar
 */

    public Carrito(int item, int idproducto, String nombre, String descripcion, String foto, int preciocompra, int cantidad, int subtotal) {
        this.item = item;
        this.idproducto = idproducto;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.foto = foto;
        this.preciocompra = preciocompra;
        this.cantidad = cantidad;
        this.subtotal = subtotal;
    }
    
    
 /**
 * Funcion: Carrito
 * Método constructor Carrito vacío
 */
    public Carrito() {
    }
    
    /**
 * Funcion: setItem
 * Establece el item
 */

    public void setItem(int item) {
        this.item = item;
    }
    
    /**
 * Funcion: setIdproducto
 * Establece el id del producto
 */

    public void setIdproducto(int idproducto) {
        this.idproducto = idproducto;
    }
    
    /**
 * Funcion: setNombre
 * Establece el nombre del producto
 */

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    /**
 * Funcion: setDescripcion
 * Establece la descripcion del producto
 */

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    /**
 * Funcion: setFoto
 * Establece la foto del producto
 */


    public void setFoto(String foto) {
        this.foto = foto;
    }
    
    /**
 * Funcion: setPreciocompra
 * Establece el precio de compra del producto
 */


    public void setPreciocompra(int preciocompra) {
        this.preciocompra = preciocompra;
    }
    
    /**
 * Funcion: setCantidad
 * Establece la cantidad de productos en el carrito
 */


    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
     /**
 * Funcion: setSubtotal
 * Establece el subtotal
 */

    public void setSubtotal(int subtotal) {
        this.subtotal = subtotal;
    }
    
     /**
 * Funcion: getItem
 * Obtiene el item
 * @return: devuelve el item
 */

    public int getItem() {
        return item;
    }
    
     /**
 * Funcion: getIdproducto
 * Obtiene el Id del producto
 * @return: devuelve el id de un producto
 */

    public int getIdproducto() {
        return idproducto;
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
 * Funcion: getDescripcion
 * Obtiene la descripción del producto
 * @return: devuelve la descripción de un producto
 */

    public String getDescripcion() {
        return descripcion;
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
 * Funcion: getPreciocompra
 * Obtiene el precio de la compra
 * @return: devuelve el precio de la compra
 */

    public int getPreciocompra() {
        return preciocompra;
    }
    
    /**
 * Funcion: getCantidad
 * Obtiene la cantidad
 * @return: devuelve la cantidad
 */

    public int getCantidad() {
        return cantidad;
    }
    
    /**
 * Funcion: getSubtotal
 * Obtiene el subtotal
 * @return: devuelve el subtotal
 */

    public int getSubtotal() {
        return subtotal;
    }
    
    
    
    
    
    
    
    
    
}
