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
        
        Motor motor1 = new Motor(13456, Combustible.NAFTA, 2.0);
        Auto auto1 = new Auto("ABC123", "Renault", Color.AZUL, 2024, motor1);
        
        System.out.println(auto1);
        
        auto1.acelerar();
        auto1.acelerar();
        
        System.out.println(auto1);
        
    }
    
}
