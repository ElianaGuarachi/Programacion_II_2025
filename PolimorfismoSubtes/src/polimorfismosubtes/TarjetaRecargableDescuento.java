package polimorfismosubtes;

public class TarjetaRecargableDescuento extends TarjetaRecargable {
    
    private double descuento;
    
    public TarjetaRecargableDescuento (CentralSubte central, double descuento){
        super(central);
        this.descuento = descuento;
    }
    
    @Override
    protected double precioViaje(){
        return super.precioViaje() * (1 - descuento);
    }
}
