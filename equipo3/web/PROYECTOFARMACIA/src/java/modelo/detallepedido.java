/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author SENA
 */
public class detallepedido {
    private int IdDetalle;
    private int Idproducto;
    private String nombre;
    private int Cantidad;
    private int PrecioCompra;
    private int codigo_pedido;

    public int getIdDetalle() {
        return IdDetalle;
    }

    public void setIdDetalle(int IdDetalle) {
        this.IdDetalle = IdDetalle;
    }

    public int getIdproducto() {
        return Idproducto;
    }

    public void setIdproducto(int Idproducto) {
        this.Idproducto = Idproducto;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int Cantidad) {
        this.Cantidad = Cantidad;
    }

    public int getPrecioCompra() {
        return PrecioCompra;
    }

    public void setPrecioCompra(int PrecioCompra) {
        this.PrecioCompra = PrecioCompra;
    }

    public int getCodigo_pedido() {
        return codigo_pedido;
    }

    public void setCodigo_pedido(int codigo_pedido) {
        this.codigo_pedido = codigo_pedido;
    }

    public detallepedido(int IdDetalle, int Idproducto, String nombre, int Cantidad, int PrecioCompra, int codigo_pedido) {
        this.IdDetalle = IdDetalle;
        this.Idproducto = Idproducto;
        this.nombre = nombre;
        this.Cantidad = Cantidad;
        this.PrecioCompra = PrecioCompra;
        this.codigo_pedido = codigo_pedido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public detallepedido() {
    }
}
