package polimorfismosubtes;

public class CentralSubte {
    
    private double precioViaje;

    public CentralSubte(double precioViaje) {
        this.precioViaje = precioViaje;
    }
    
    public double consultarPrecioViaje(){
        return precioViaje;
    }
    
    public void setPrecioViaje(double nuevoPrecio){
        if (precioViaje <= 0) {
            throw new IllegalArgumentException("Precio invalido");
        }
        precioViaje = nuevoPrecio;
    }
    
}
