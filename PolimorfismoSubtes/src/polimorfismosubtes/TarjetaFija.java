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
    
    public void viajar(){
        //
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
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
