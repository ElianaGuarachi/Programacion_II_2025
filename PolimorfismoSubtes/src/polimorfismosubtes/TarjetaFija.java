package polimorfismosubtes;

public class TarjetaFija extends Tarjeta {
    
    private int viajes;
    
    public TarjetaFija(CentralSubte central, int viajes){
        super(central);
        this.viajes = viajes;
    }
    
    public int getViajes(){
        return viajes;
    }
    
    @Override
    protected boolean puedoViajar(){
        return viajes > 0;
    }
    
    @Override
    protected void descontarViaje(){
        viajes--;
    }

    @Override
    protected String mensajeNoPuedoViajar() {
        return "No quedan viajes";
    }
}
