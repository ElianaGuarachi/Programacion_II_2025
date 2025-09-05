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
    private String tipoCombustible;
    private double cilindrada;
    private int rpm;
    
    public Motor(int nroSerie, String tipo, double cilindrada){ 
        this.nroSerie = nroSerie;
        this.tipoCombustible = tipo;
        this.cilindrada = cilindrada;
    }
    
    public void setRpm(int revoluciones){
        this.rpm = revoluciones;
    }
    
    @Override
    public String toString(){
        return "Nro Serie: " + nroSerie + ", Tipo de combustible: " + tipoCombustible + ", Cilindrada: " + cilindrada + ", rpm: " + rpm;
    }
    
}
