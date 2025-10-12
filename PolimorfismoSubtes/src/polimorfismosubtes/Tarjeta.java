package polimorfismosubtes;

public abstract class Tarjeta {
    
    private final CentralSubte central;
    
    public Tarjeta(CentralSubte central){
        this.central = central;
    }
    
    protected CentralSubte getCentral(){
        return central;
    }
    
    protected abstract boolean puedoViajar();
    
    protected abstract void descontarViaje();
    
    protected abstract String mensajeNoPuedoViajar();
    
    public void Viajar() {
        if (!puedoViajar()) {
            throw new NoPuedoViajarException();
        }        
        descontarViaje();
        System.out.println("Viajando...");
    }
    
}
