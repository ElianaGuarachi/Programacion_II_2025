
package polimorfismosubtes;

public class TarjetaRecargable extends Tarjeta{
    
    private double saldo;
    
    public TarjetaRecargable(CentralSubte central){
        super(central);
    }
    
    public void recargar(double monto){
        if (monto <= 0) {
            throw new IllegalArgumentException("Monto invalido");
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
    
    @Override
    protected String mensajeNoPuedoViajar(){
        return "Saldo insuficiente....";
    }
}
