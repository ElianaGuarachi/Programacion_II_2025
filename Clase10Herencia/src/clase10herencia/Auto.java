
package clase10herencia;

import java.util.Objects;

public class Auto extends Vehiculo{
   
    private boolean tieneGPS; //se crea inicializado en false
   
    public Auto(String patente, String marca, int modelo){
        super(patente, marca, modelo);
    }
     

}
