/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.protectovideoclub;

/**
 *
 * @author ADMI
 */
public class PedidoAlquiler extends Pedido{
    private int precioAlquiler;

    public PedidoAlquiler(int idpedido, Socio socio, Pelicula pelicula, int precio) {
        super(idpedido, socio, pelicula, precio);
    }

    //constructores
    public PedidoAlquiler() {
    }

    public PedidoAlquiler(int precioAlquiler) {
        this.precioAlquiler = precioAlquiler;
    }

    PedidoAlquiler(String idpedido, String socio, String pelicula, String precio) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    //metodo getter
    public int getPrecioAlquiler() {
        precioAlquiler = 20;
        return precioAlquiler;
    }

    //metodo setter
    public void setPrecioAlquiler(int precioAlquiler) {
        this.precioAlquiler = precioAlquiler;
    }
    
    //metodo
    
    public void InformePedAlq(){
        System.out.println("PRECIO DEL ALQUILER: "+this.getPrecioAlquiler());
    }
    
}
