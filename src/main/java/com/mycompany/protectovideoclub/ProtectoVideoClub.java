/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.protectovideoclub;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author ADMI
 */
public class ProtectoVideoClub {

    private final List<Catalogo> catalogos;
    private final List<Pedido> pedidos;
    private final List<Socio> socios;
    
    
    static Pedido ped=new Pedido();
    static Catalogo cat=new Catalogo();
    static Socio soc=new Socio();
    
    public ProtectoVideoClub(){
         catalogos=new ArrayList<>();
         pedidos=new ArrayList<>();
         socios=new ArrayList<>();
    }
     
     public void registrarC(Catalogo cat){
         catalogos.add(cat);
        
     }
     public void registrarP(Pedido ped){
         pedidos.add(ped);
     }
     public void registrarS(Socio soc){
         socios.add(soc);
     }
     public List<Catalogo>getcatalogos (){
         return catalogos;
         
     }
     
     public List<Pedido>getpedidos (){
         return pedidos;
         
     }
     
     public List<Socio>getsocios(){
         return socios;
         
     }
     
     //menu
    static Scanner teclado = new Scanner (System.in);
    static ProtectoVideoClub vd=new ProtectoVideoClub();
    public static void salir (){
         System.out.println("\n PROGRAMA FINAIZADO");
         System.exit(0);
     } 
     
     public static void errorOpcion(){
         System.out.println("\n OPCION INCORRECTA");
         menu();
     }
     public static void catalogo(){
     for(Catalogo cat:vd.getcatalogos()){
         System.out.println(cat.ListarDatos());
     }
     }
     
     public static void mostrar(){
        Socio soc=new Socio();
        Pelicula p=new Pelicula();
         for(Pedido ped:vd.getpedidos()){
             System.out.println(ped.InformePedido(p, soc));
         }
     }
    
     public static void menu(){
         System.out.println("BIENVENIDO");
         System.out.println("-----------------------------");
         System.out.println("1.AGREGAR SOCIO");
         System.out.println("2.AGREGAR PELICULA");
         System.out.println("3.CATALOGO");
         System.out.println("4.PEDIDO");
         System.out.println("5.MOSTRAR");
         System.out.println("6.SALIR");
         System.out.println("ELIJA LA OPCION: ");
         int op = teclado.nextInt();
         switch(op){
             case 1 -> agregarSocio();
             case 2 -> agregarPelicula();
             case 3 -> {
                catalogo();
                menu();
             }
             case 4 -> pedido();
             case 5 -> {
                 mostrar();
                 menu();
             }  
             case 6 -> salir();
             default -> errorOpcion();
         }
         
    }
     
     public static void agregarSocio(){
        System.out.println("\nSECCION SOCIO\n");   
        System.out.println("Ingrese el nombre:");
        String nombre=teclado.next();
        System.out.println("Ingrese el apellido:");
        String apellido=teclado.next();
        System.out.println("Ingrese DNI:");
        String dni=teclado.next();
        System.out.println("Ingrese direccion:");
        String direccion=teclado.next();
        System.out.println("Ingrese telefono:");
        String telefono=teclado.next();
        System.out.println("Ingrese email:");
        String email=teclado.next();
        System.out.println("Ingrese fecha de nacimineot:");
        String fechaNacimiento=teclado.next();
        System.out.println("Ingrese edad:");
        String edad=teclado.nextLine();
        System.out.println("Ingrese id socio:");
        String idSocio=teclado.next();
        
    Socio soc=new Socio(nombre, apellido, dni, direccion, telefono, email, fechaNacimiento, edad,idSocio);
    vd.registrarS(soc);
        
    System.out.println("----------------------------------");
    System.out.println("-----------SOCIO GUARDADO---------");
    System.out.println("----------------------------------");
    menu();
     }
     
     public static void agregarPelicula(){
        System.out.println("\nSECCION PELICULA\n");   
        System.out.println("Ingrese el nombre:");
        String nombre=teclado.next();
        System.out.println("Ingrese el genero:");
        String genero=teclado.next();
        System.out.println("Ingrese clasificacion:");
        String clasificacion=teclado.next();
        System.out.println("Ingrese año:");
        String año=teclado.next();
   
        
    Pelicula p=new Pelicula(nombre, genero, clasificacion, año);
    vd.registrarC(cat);
        
    System.out.println("----------------------------------");
    System.out.println("--------PELICULA GUARDADO---------");
    System.out.println("----------------------------------");
    menu();
     }
     
     
     public static void pedido(){
         System.out.println("1.alquiler");
        System.out.println("2.venta");
        System.out.println("Elija la opción: ");
        int opcion = teclado.nextInt();
        
        switch (opcion){
            case 1 -> Alquiler();
            case 2 -> Venta();
                    default -> {
             }
        }
    }
     
    public static void Alquiler(){
        Socio soc=new Socio();
        Pelicula p=new Pelicula();
        System.out.println("\nSECCION ALQUILER\n");   
        System.out.println("Ingrese id pedido:");
        String idpedido=teclado.next();
        System.out.println("Ingrese Socio:");
        String socio=teclado.nextLine();
        System.out.println("Ingrese pelicula:");
        String pelicula=teclado.next();
        System.out.println("Ingrese precio Alquiler:");
        String precio=teclado.next();
        PedidoAlquiler peda =new PedidoAlquiler(idpedido, socio, pelicula, precio) ;
        vd.registrarP(ped);
        
    System.out.println("----------------------------------");
    System.out.println("--------PEDIDO GUARDADO---------");
    System.out.println("----------------------------------");
    menu();
    }
    public static void Venta(){
        Socio soc=new Socio();
        Pelicula p=new Pelicula();
        System.out.println("\nSECCION ALQUILER\n");   
        System.out.println("Ingrese id pedido:");
        String idpedido=teclado.next();
        System.out.println("Ingrese Socio:");
        String socio=teclado.nextLine();
        System.out.println("Ingrese pelicula:");
        String pelicula=teclado.next();
        System.out.println("Ingrese precio Venta:");
        String precio=teclado.next();
        PedidoAlquiler pedv =new PedidoAlquiler(idpedido, socio, pelicula, precio) ;
        vd.registrarP(ped);
        
    System.out.println("----------------------------------");
    System.out.println("--------PEDIDO GUARDADO---------");
    System.out.println("----------------------------------");
    menu();
    }
     
    public static void main(String[] args) {
      ProtectoVideoClub vd;
      vd=new ProtectoVideoClub();
      ProtectoVideoClub.menu();
    }
    
}
