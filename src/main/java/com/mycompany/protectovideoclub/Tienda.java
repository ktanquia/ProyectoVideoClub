/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.protectovideoclub;

import java.util.ArrayList;

/**
 *
 * @author ADMI
 */
public class Tienda {
    
    private String nombre;
    private String direccion;
    private ArrayList<Catalogo> catalogos;

    //constructores
    public Tienda() {
        catalogos = new ArrayList<>();
    }

    public Tienda(String nombre, String direccion, ArrayList<Catalogo> catalogos) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.catalogos = catalogos;
    }

    
    
    //metodo getter
    public String getNombre() {
        nombre="VIDEO CLUB EEVEE";
        return nombre;
    }

     public String getDireccion() {
         direccion="PROYECTADA S/N - B°EVITA";
        return direccion;
    }
     
      public ArrayList<Catalogo> getCatalogos() {
        return catalogos;
    }
      
      
    //metodos setter
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

   

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }


    public void setCatalogos(ArrayList<Catalogo> catalogos) {
        this.catalogos = catalogos;
    }
    
    //metodos
    
   public void registrarTienda (Catalogo cat){
       catalogos.add(cat);
   
   }
   
   
   
}
