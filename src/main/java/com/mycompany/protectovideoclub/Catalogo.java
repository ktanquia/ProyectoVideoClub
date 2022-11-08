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
public class Catalogo {
    
    private Tienda tienda;
    private ArrayList<Item> items;

    //constructores 
    public Catalogo() {
        items = new ArrayList<>();
    }

    public Catalogo(Tienda tienda, ArrayList<Item> items) {
        this.tienda = tienda;
        this.items = items;
    }

    
    
    //metodos getter
    public Tienda getTienda() {
        return tienda;
    }

    public ArrayList<Item> getItems() {
        return items;
    }
    
    //metodos setter
    public void setTienda(Tienda tienda) {
        this.tienda = tienda;
    }


    public void setItems(ArrayList<Item> items) {
        this.items = items;
    }
    
    public void registrar (Item it){
        items.add(it);
    }
    
    public String ListarDatos(){
        return "\nCatalogo: "+this.getItems().getClass().getSimpleName();
    }
}
