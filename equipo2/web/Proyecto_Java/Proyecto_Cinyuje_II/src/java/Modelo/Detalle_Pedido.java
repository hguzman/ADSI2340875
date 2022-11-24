/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author HPLAPTOP01
 */
public class Detalle_Pedido {
    private int id_detalle;
    private int id_producto;
    private String nombre;
    private int id_pedido;
    private int cantidad;
    private int precio_pedido;

    public Detalle_Pedido() {
    }
    

    public Detalle_Pedido(int id_detalle, int id_producto, String nombre, int id_pedido, int cantidad, int precio_pedido) {
        this.id_detalle = id_detalle;
        this.id_producto = id_producto;
        this.id_pedido = id_pedido;
        this.cantidad = cantidad;
        this.precio_pedido = precio_pedido;
        this.nombre = nombre;
    }

    public void setId_detalle(int id_detalle) {
        this.id_detalle = id_detalle;
    }

    public void setId_producto(int id_producto) {
        this.id_producto = id_producto;
    }

    public void setId_pedido(int id_pedido) {
        this.id_pedido = id_pedido;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setPrecio_pedido(int precio_pedido) {
        this.precio_pedido = precio_pedido;
    }

    public int getId_detalle() {
        return id_detalle;
    }

    public int getId_producto() {
        return id_producto;
    }

    public int getId_pedido() {
        return id_pedido;
    }

    public int getCantidad() {
        return cantidad;
    }

    public int getPrecio_pedido() {
        return precio_pedido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    
    
    
    
    
    
    
}
