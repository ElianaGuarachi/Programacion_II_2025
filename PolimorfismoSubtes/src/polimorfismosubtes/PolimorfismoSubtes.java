package polimorfismosubtes;

public class PolimorfismoSubtes {

    public static void main(String[] args) {
        
        double precioInicial = 1000;
        
        CentralSubte central = new CentralSubte(precioInicial);
        
        TarjetaRecargable tarjeta = new TarjetaRecargable(central);
        
        TarjetaFija tf = new TarjetaFija(central, 4);
        
        System.out.println(tf.getViajes());
        
        tf.viajar();
        tf.viajar();
        tf.viajar();
        tf.viajar();
        
        System.out.println(tf.getViajes());
        
        tf.viajar();
        
    }
    
}
