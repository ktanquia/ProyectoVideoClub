/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.protectovideoclub;

/**
 *
 * @author ADMI
 */
public class Socio {
    
    private String nombre;
    private String apellido;
    private String dni;
    private String direccion;
    private String telefono;
    private String email;
    private String fechaNacimiento;
    private int edad;
    private int idSocio;
    private Tarjeta tarjeta;

    //CONSTRUCTOR

    public Socio() {
    }

    public Socio(String nombre, String apellido, String dni, String direccion, String telefono, String email, String fechaNacimiento, int edad, int idSocio, Tarjeta tarjeta) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
        this.fechaNacimiento = fechaNacimiento;
        this.edad = edad;
        this.idSocio = idSocio;
        this.tarjeta = tarjeta;
    }

    Socio(String nombre, String apellido, String dni, String direccion, String telefono, String email, String fechaNacimiento, String edad, String idSocio) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    
    
    //METODOS GETTER
    public String getNombre() {
        return nombre;
    }

     public String getApellido() {
        return apellido;
    }
     
     public String getDni() {
        return dni;
    }
     
     public String getDireccion() {
        return direccion;
    }
     
     public String getTelefono() {
        return telefono;
    }

     public String getEmail() {
        return email;
    }
     
      public String getFechaNacimiento() {
        return fechaNacimiento;
    }
      
      public int getEdad() {
        return edad;
    }
     
       public int getIdSocio() {
        return idSocio;
    }
       
       public Tarjeta getTarjeta() {
        return tarjeta;
    }
       
    
    //METODOS SETTER
       
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

   

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    

    public void setDni(String dni) {
        this.dni = dni;
    }

    

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    

    public void setEmail(String email) {
        this.email = email;
    }

   

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    

    public void setEdad(int edad) {
        this.edad = edad;
    }

   

    public void setIdSocio(int idSocio) {
        this.idSocio = idSocio;
    }

    

    public void setTarjeta(Tarjeta tarjeta) {
        this.tarjeta = tarjeta;
    }
    
    //METODOS
    
    public void InformeSocio(Tarjeta t){
            System.out.println("ID SOCIO: "+this.getIdSocio());
            System.out.println("NOMBRE: "+this.getNombre());
            System.out.println("APELLIDO: "+this.getApellido());
            System.out.println("DNI: "+this.getDni());
            System.out.println("DIRECCION: "+this.getDireccion());
            System.out.println("EMAIL: "+this.getEmail());
            System.out.println("FECHA DE NACIMIENTO: "+this.getFechaNacimiento());
            System.out.println("TELEFONO: "+this.getTelefono());
            System.out.println("TARJETA: "+t.getIdTarjeta());
    
    }
    
    
}
