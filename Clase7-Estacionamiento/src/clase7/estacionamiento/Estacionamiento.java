package clase7.estacionamiento;

import clase7.estacionamiento.Auto;
import java.util.ArrayList;

/**
 * 08/09/2025
 */
public class Estacionamiento {
    
    private String nombre;
    private ArrayList<Auto> autos;
    
    public Estacionamiento(String nombre){
        this.nombre = nombre;
        this.autos = new ArrayList<Auto>();
    }
}
