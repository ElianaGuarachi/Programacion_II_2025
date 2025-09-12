package clase8;

/**
 *11/09/2025
 */
public class Clase8 {

    public static void main(String[] args) {
        
        Estacionamiento garage = new Estacionamiento("Parking VIP");
        
        Auto auto1 = new Auto("ABC123", "Honda", 2023);
        Auto auto2 = new Auto("GJF789", "Honda", 2023);
        Auto auto3 = new Auto("DSE456", "Honda", 2023);
        Auto auto4 = new Auto("BMLF45", "Honda", 2023);
        Auto auto5 = new Auto("DSF963", "Honda", 2023);
        
        garage.agregarAuto(auto1);
        garage.agregarAuto(auto2);
        garage.agregarAuto(auto3);
        garage.agregarAuto(auto4);
        garage.agregarAuto(auto5);
        
        
        System.out.println(garage.autosString());
        
        
    }
    
}
