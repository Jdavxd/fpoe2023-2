/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import javax.swing.JTextField;

/**
 *
 * @author julian rengifo
 */
public class Jugador {
    private String nombre;
    private int ronda = 1;
    private int intentosBuenos = 0;
    private int intentosMalos = 0;
    
    
    public Jugador(String nombre){
        this.nombre = nombre;
    }

    public Jugador(JTextField nombreJugador) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public String getNombre() {
        return nombre;
    }
        
    public void setNombre(String nombre){
        this.nombre = nombre;
    }


    public void sumaIntentosBuenos(){
        this.intentosBuenos +=1;
    }
    
    public void sumarIntentosMalos(){
        this.intentosMalos +=1;
    }
    
    public int getIntentosBuenos(){
        return intentosBuenos;
    }
    
    public void setInentosBuenos(int intentosBuenos){
        this.intentosBuenos = intentosBuenos;
    }
    
    public int getIntentosMalos(){
        return intentosMalos;
    }
    
    public void setInentosMalos(int intentosMalos){
       this.intentosMalos = intentosMalos;
    }
   
    public int getRonda (){
        return ronda;
    }    
    
    public void setRonda (int ronda){
        this.ronda = ronda;
  }
}
