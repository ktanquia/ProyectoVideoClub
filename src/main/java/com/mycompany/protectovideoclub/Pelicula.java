/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.protectovideoclub;

/**
 *
 * @author ADMI
 */
public class Pelicula {
    
    private String nombre;
    private String genero;
    private String clasificacion;
    private int año;
    private int precioAlquiler;
    private int precioVenta;

    //CONSTRUCTOR

    public Pelicula() {
    }

    public Pelicula(String nombre, String genero, String clasificacion, int año, int precioAlquiler, int precioVenta) {
        this.nombre = nombre;
        this.genero = genero;
        this.clasificacion = clasificacion;
        this.año = año;
        this.precioAlquiler = precioAlquiler;
        this.precioVenta = precioVenta;
    }

    Pelicula(String nombre, String genero, String clasificacion, String año) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    
    //METODOS GETTER
    public String getNombre() {
        return nombre;
    }

     public String getGenero() {
        return genero;
    }
     
    public String getClasificacion() {
        return clasificacion;
    
    }    
     
    public int getAño() {
        return año;
    }
    
    public int getPrecioAlquiler() {
        return precioAlquiler;
    }
      
    public int getPrecioVenta() {
        return precioVenta;
    }
    
    
    //METODOS SETTER
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

   
    public void setGenero(String genero) {
        this.genero = genero;
    }

  

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    

    public void setAño(int año) {
        this.año = año;
    }

    

    public void setPrecioAlquiler(int precioAlquiler) {
        this.precioAlquiler = precioAlquiler;
    }

    

    public void setPrecioVenta(int precioVenta) {
        this.precioVenta = precioVenta;
    }
    
    
}
