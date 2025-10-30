package empresalogistica;

public class CamionReparto extends Vehiculo implements TransportadorPaquete {
    
    private boolean cargado;
    
    public CamionReparto(String patente){
        super(patente);
    }
    
    public boolean estaCargado(){
        return this.cargado;
    }
    
    public void cargarPaquete(){
        this.cargado = true;
    }
    
    @Override
    public void conducirRapido(){
        System.out.println("");
    }

    @Override
    public void transportarPaquetes(String destino) {
        System.out.println("Entregar paquete a " + destino);
    }
     
    
}
