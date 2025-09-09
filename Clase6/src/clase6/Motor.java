/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase6;

/**
 *
 * @author DELL
 */
public class Motor {
    private int nroSerie;
    private Combustible combustible;
    private double cilindrada;
    private int rpm;
    
    public Motor(int nroSerie, Combustible tipo, double cilindrada){ 
        this.nroSerie = nroSerie;
        this.combustible = tipo;
        this.cilindrada = cilindrada;
    }
    
    public int getRpm(int revoluciones){
        return this.rpm;
    }
    
    public void acelerar(){
        this.rpm += 1000;
    }
    
    //No modificar de manera directa, rompe POO
    /*public void setRpm(int revoluciones){
        this.rpm = revoluciones;
    }*/
    
    @Override
    public String toString(){
        return "Nro Serie: " + nroSerie + ", Tipo de combustible: " + combustible + ", Cilindrada: " + cilindrada + ", rpm: " + rpm;
    }
    
}
