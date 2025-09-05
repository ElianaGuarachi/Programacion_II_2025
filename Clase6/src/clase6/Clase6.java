/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase6;

/**
 * 04/09/2025
 */
public class Clase6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Motor motor1 = new Motor(13456, "Nafta", 2.0);
        Auto auto1 = new Auto("ABC123", "Renault", "Negro", 2024, motor1);
        Auto auto2 = new Auto("FGH795", "Fiat", "Blanco", 2020, new Motor(523689, "Nafta", 4.0));
        
        //lo siguiente esta mal
        motor1.setRpm(2000);
        
        System.out.println(auto1);
        System.out.println(auto2);
        
    }
    
}
