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
public class Pedido {
    private int id_pedido;
    private String id_cliente;
    private int id_pago;
    private String fecha_pedido;
    private int monto;
    private String estado;

    public Pedido() {
    }

    public void setId_pedido(int id_pedido) {
        this.id_pedido = id_pedido;
    }

    public void setId_cliente(String id_cliente) {
        this.id_cliente = id_cliente;
    }

    public void setId_pago(int id_pago) {
        this.id_pago = id_pago;
    }

    public void setFecha_pedido(String fecha_pedido) {
        this.fecha_pedido = fecha_pedido;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getId_pedido() {
        return id_pedido;
    }

    public String getId_cliente() {
        return id_cliente;
    }

    public int getId_pago() {
        return id_pago;
    }

    public String getFecha_pedido() {
        return fecha_pedido;
    }

    public int getMonto() {
        return monto;
    }

    public String getEstado() {
        return estado;
    }
    
    
    
    
    
    
}
