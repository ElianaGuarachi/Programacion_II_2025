
package empresalogistica;


public class Vehiculo {

    private final String patente;
    
    public Vehiculo(String patente) {
        this.patente = patente;
    }
    
    public void conducirRapido(){
        System.out.println("Vehiculo "+ patente + " circula a maxima velocidad");
    }
    
    
}
