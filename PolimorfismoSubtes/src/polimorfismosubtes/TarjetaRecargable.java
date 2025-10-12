
package polimorfismosubtes;

public class TarjetaRecargable extends Tarjeta{
    
    private double saldo;
    
    public TarjetaRecargable(CentralSubte central){
        super(central);
    }
    
    public void recargar(double monto){
        if (monto <= 0) {
            
        }
        saldo += monto;
    }
    
    public double getSaldo(){
        return saldo;
    }
    
    protected double precioViaje(){
        return getCentral().consultarPrecioViaje();
    }
    
    @Override
    protected boolean puedoViajar(){
        return saldo >= precioViaje();
    }
    
    @Override
    protected void descontarViaje(){
        saldo -= precioViaje();
    }
    
    protected String mensajeNoPuedoViajar(){
        return "";
    }
}
