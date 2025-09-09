
package clase7.estacionamiento;

/**
 *
 * @author DELL
 */
public class Auto {
    
   private String patente;
   private String marca;
   private int modelo;
   
   public Auto(String patente, String marca, int modelo){
       this.patente = patente;
       this.marca = marca;
       this.modelo = modelo;
   }
   
   @Override
   public String toString(){
       return "Patente: " + patente + ", marca: " + marca + ", modelo: " + modelo;
   }
    
}
