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
    
    public void viajar() {
        if (!puedoViajar()) {
            throw new NoPuedoViajarException(mensajeNoPuedoViajar());
        }        
        descontarViaje();
        System.out.println("Viajando...");
    }
    
}
