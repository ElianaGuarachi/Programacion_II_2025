package polimorfismosubtes;

public class PolimorfismoSubtes {

    public static void main(String[] args) {
        
        double precioInicial = 1000;
        
        CentralSubte central = new CentralSubte(precioInicial);
        
        /*TarjetaRecargableDescuento trd = new TarjetaRecargableDescuento(central, 0.30);
        
        trd.recargar(2000);
        
        trd.viajar();
        trd.viajar();
        
        trd.recargar(100);
        
        trd.viajar();
        trd.viajar();
        
        System.out.println(trd.getSaldo());*/
        
        
        
        /*TarjetaFija tf = new TarjetaFija(central, 4);
        
        System.out.println(tf.getViajes());
        
        tf.viajar();
        tf.viajar();
        tf.viajar();
        tf.viajar();
        
        System.out.println(tf.getViajes());
        
        tf.viajar();*/
        
        TarjetaRecargable tarjeta = new TarjetaRecargable(central);
        
        System.out.println("Saldo: "+ tarjeta.getSaldo());
        
        tarjeta.recargar(3000);
        
        System.out.println("Saldo: " + tarjeta.getSaldo());
        
        tarjeta.viajar();
        tarjeta.viajar();
        tarjeta.viajar();
        
        System.out.println("Saldo: " + tarjeta.getSaldo());
        
        tarjeta.viajar();
    }
    
}
