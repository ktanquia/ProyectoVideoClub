/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.protectovideoclub;

import java.util.Date;

/**
 *
 * @author ADMI
 */
public class Tarjeta {
    
    private int saldo;
    private int idTarjeta;
    private Date fechaVencimiento;

    
    //CONSTRUCTOR
    public Tarjeta() {
    }

    public Tarjeta(int saldo, int idTarjeta, Date fechaVencimiento) {
        this.saldo = saldo;
        this.idTarjeta = idTarjeta;
        this.fechaVencimiento = fechaVencimiento;
    }
    
    

    //METODO GETTER
    public int getSaldo() {
        return saldo;
    }

     public int getIdTarjeta() {
        return idTarjeta;
    }
     
    public Date getFechaVencimiento() {
        return fechaVencimiento;
    } 
    
    
    //METODO SETTER
    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

   

    public void setIdTarjeta(int idTarjeta) {
        this.idTarjeta = idTarjeta;
    }

    

    public void setFechaVencimiento(Date fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }
    
    
    //METODOS
    public int SaldoTotal(int saldo, PedidoAlquiler pa, PedidoVenta pv){
       int saldoT = 0;
       
       if(saldo>=pa.getPrecioAlquiler()){
           saldoT = saldo - pa.getPrecioAlquiler();
       }else if(saldo>=pv.getPrecioVenta()){
           saldoT= saldo - pv.getPrecioVenta();
           return saldoT;
       }
           return saldoT;
    }
    
    
    public void InformeTarjeta (int saldo, PedidoAlquiler pa, PedidoVenta pv){
            System.out.println("ID TARJETA: "+this.getIdTarjeta());
            System.out.println("FECHA DE VENCIMIENTO: "+this.getFechaVencimiento());
            System.out.println("SALDO TOTAL: "+this.SaldoTotal(saldo, pa, pv));
        
    }
    
    
 }
    
    

