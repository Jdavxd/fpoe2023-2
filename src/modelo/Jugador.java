/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author julian rengifo
 */
public class Jugador {
    private String nombre;
    
    
    public Jugador(String nombre){
        this.nombre = nombre;
    }
    
    public  Jugador(){
        nombre = "Jugador 1";
    }
        
    public String getNombre(){
        return nombre;
    }    
        
  }
   
