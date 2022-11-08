/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.protectovideoclub;

/**
 *
 * @author ADMI
 */
public class PedidoVenta extends Pedido {
    private int precioVenta;

    //constructor
    public PedidoVenta() {
    }

    public PedidoVenta(int precioVenta) {
        this.precioVenta = precioVenta;
    }

    //metodo getter
    public int getPrecioVenta() {
        precioVenta = 50;
        return precioVenta;
    }

    //metodo setter
    public void setPrecioVenta(int precioVenta) {
        this.precioVenta = precioVenta;
    }
    
    //metodos
    
    public void InformePedVenta(){
        System.out.println("PRECIO DE VENTA: "+this.getPrecioVenta());
    }
    
}
