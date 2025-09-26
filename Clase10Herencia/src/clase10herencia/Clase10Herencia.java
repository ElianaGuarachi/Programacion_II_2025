/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase10herencia;

/**
 *
 * @author DELL
 */
public class Clase10Herencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            
        Estacionamiento garage = new Estacionamiento("Parking VIP");
        
        System.out.println(garage.cantidadVehiculos());
        
        cargarEstacionamiento(garage);
        
        System.out.println(garage.cantidadVehiculos());
        
        for (Vehiculo v : garage.getVehiculos()) {
            if (v instanceof Moto m) {
                m.bloquear();
            }
            if (v instanceof VehiculoDeCarga vc) {
                vc.cargar(200);
                vc.cargar(356);
            }
            System.out.println(v);
        }
        
        //System.out.println(garage.autosString());
    }
    
    public static void cargarEstacionamiento(Estacionamiento e){
        Auto auto1 = new Auto("ABC123", "Honda", 2023);
        Auto auto2 = new Auto("GJF789", "Honda", 2023);
        Auto auto3 = new Auto("DSE456", "Honda", 2023);
        Auto auto4 = new Auto("BMLF45", "Honda", 2023);
        Auto auto5 = new Auto("DSF963", "Honda", 2023);
        
        Moto m1 = new Moto("ASD456", "Honda", 2019);
        Moto m2 = new Moto("FDS789", "Suzuki", 2021);
        Moto m3 = new Moto("NHT456", "Kawazaki", 2021);
        
        Camion c1 = new Camion("SDF456", "Pepe", 2024, 5000);
        
        Tren t1 = new Tren("BVC546", "AA", 1995,100000,Combustible.ELECTRICO);
        
        e.agregarVehiculo(auto1);
        e.agregarVehiculo(auto2);
        e.agregarVehiculo(auto3);
        e.agregarVehiculo(auto4);
        e.agregarVehiculo(auto5);
        e.agregarVehiculo(m1);
        e.agregarVehiculo(m2);
        e.agregarVehiculo(m3);
        e.agregarVehiculo(c1);
        e.agregarVehiculo(t1);
    }
    
}
