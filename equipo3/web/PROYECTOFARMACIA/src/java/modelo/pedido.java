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
public class pedido {
    private int codigo_pedido;
    
    private String fecha_pedido;
    private int valor_pedido;
    
    private int Id;
    private int Idp;

    public int getCodigo_pedido() {
        return codigo_pedido;
    }

    public void setCodigo_pedido(int codigo_pedido) {
        this.codigo_pedido = codigo_pedido;
    }

  

    public String getFecha_pedido() {
        return fecha_pedido;
    }

    public void setFecha_pedido(String fecha_pedido) {
        this.fecha_pedido = fecha_pedido;
    }

    public int getValor_pedido() {
        return valor_pedido;
    }

    public void setValor_pedido(int valor_pedido) {
        this.valor_pedido = valor_pedido;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public int getIdp() {
        return Idp;
    }

    public void setIdp(int Idp) {
        this.Idp = Idp;
    }

    public pedido(int codigo_pedido, String hora_pedido, String fecha_pedido, int valor_pedido, String info_pedido, int Id) {
        this.codigo_pedido = codigo_pedido;
        
        this.fecha_pedido = fecha_pedido;
        this.valor_pedido = valor_pedido;
        
        this.Id = Id;
    }

    public pedido() {
    }

}