
package clase8;

import java.util.Objects;

/**
 *
 * Es propio del Auto validar que no se instancie un objeto sin los datos necesarios
 */
public class Auto {
    
    private final String patente;
    private final String marca;
    private final int modelo;
   
    public Auto(String patente, String marca, int modelo){
       this.patente = patente;
       this.marca = marca;
       this.modelo = modelo;
    }
   
    public String getPatente(){
       return this.patente;
    }
    
    public String getMarca(){
       return this.marca;
    }
      
    public int getModelo(){
       return this.modelo;
    }
    
    public boolean tienePatente(String patente){
       return patente.equals(patente);
    }
   
   @Override
   public String toString(){
       return "Patente: " + patente + ", marca: " + marca + ", modelo: " + modelo;
   }
   
   @Override
   public boolean equals(Object o){
       if (o == null || !(o instanceof Auto auto)) {
           return false;
       }
   
       return patente.equals(auto.patente) && marca.equals(auto.marca) && modelo == auto.modelo;
   }
}
