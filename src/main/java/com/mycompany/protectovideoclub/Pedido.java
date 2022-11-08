/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.protectovideoclub;

/**
 *
 * @author ADMI
 */
public class Pedido {
    
    private int idpedido;
    private Socio socio;
    private Pelicula pelicula;
    private int precio;

    
    //CONSTRUCTOR
    public Pedido() {
    }

    public Pedido(int idpedido, Socio socio, Pelicula pelicula, int precio) {
        this.idpedido = idpedido;
        this.socio = socio;
        this.pelicula = pelicula;
        this.precio = precio;
    }

    
    //METODOS GETTER
    public int getIdpedido() {
        return idpedido;
    }
    
    public Socio getSocio() {
        return socio;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }
    
    public int getPrecio() {
        return precio;
    }
    
    //METODOS SETTER
    public void setIdpedido(int idpedido) {
        this.idpedido = idpedido;
    }

    

    public void setSocio(Socio socio) {
        this.socio = socio;
    }

    

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    

    public void setPrecio(int precio) {
        this.precio = precio;
    }
    
    //METODOS
    
    public String InformePedido (Pelicula p, Socio s){
        return "\nID PEDIDO: "+this.getIdpedido()+"\nNOMBRE DE SOCIO: "+s.getNombre()+"\nID SOCIO: "+s.getIdSocio()+"\nNOMBRE DE LA PELICULA: "+p.getNombre()+"\nPRECIO: "+this.getPrecio();
            
    }
    
}
