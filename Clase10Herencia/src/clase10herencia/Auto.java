
package clase10herencia;

import java.util.Objects;

public class Auto extends Vehiculo{
   
    private boolean tieneGPS; //se crea inicializado en false
   
    public Auto(String patente, String marca, int modelo){
        super(patente, marca, modelo);
    }
    
    public void calcularRuta(String destino){
        if (tieneGPS) {
            System.out.println("Calculando ruta hacia " + destino);
        } else {
            System.out.println("Usa waze porque te compraste el auto barato");
        }
    }
    
    @Override
    public void acelerar(){
        System.out.println("Auto acelerando");
    }
    
    @Override
    public void frenar(){
        System.out.println("Auto frenando");
    }
    
    @Override
    public String toString(){
        return super.toString() + "Tiene GPS: " + tieneGPS;
    }
}
