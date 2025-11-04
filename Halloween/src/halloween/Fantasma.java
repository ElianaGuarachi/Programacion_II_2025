
package halloween;

public class Fantasma extends Espectro{
    
    private final double transparencia;
    
    public Fantasma(String nombre, int energia, int nivelEspectral, double transparencia) {
        super(nombre, energia, nivelEspectral);
        this.transparencia = transparencia;
    }
    
}
