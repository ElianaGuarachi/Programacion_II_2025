
package empresalogistica;

import java.util.ArrayList;

public class EmpresaDeLogistica {
    
    private final static String DESTINO = "Centro ciudad";
    private final String nombre;
    private final ArrayList<TransportadorPaquete> transportadores;
    
    public EmpresaDeLogistica(String nombre){
        this.nombre = nombre;
        this.transportadores = new ArrayList();
    }
    
    public void iniciarEntrega(){
        for (TransportadorPaquete transportador : transportadores) {
            transportador.transportarPaquetes(DESTINO);
        }
    }
    
    public void agregarTransportador(TransportadorPaquete t){
        if (transportadores.contains(t)) {
            throw new IllegalArgumentException("Transportador ya esta en la lista");
        }
        transportadores.add(t);
    }
    
    public void felicitarDeliveries(){
        for (TransportadorPaquete transportador : transportadores) {
            if(transportador instanceof Delivery d){
                System.out.println("Felicidades");
            }
        }
    }
    
    public void cargarBaterias(){
        
    }
    
    public void cargarCombustible(){
        
    }
}
