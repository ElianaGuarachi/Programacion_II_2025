package integrador;

/**
 *
 * @author DELL
 */
public class Integrador {

    public static void main(String[] args) {
        // TODO code application logic here
        Cliente cliente = new Cliente("12345678", "Juan", "Perez", "1126532653", "juanperez@gmail.com");
        Posnet posnet = new Posnet();
        TarjetaDebito tarjeta = new TarjetaDebito(EntidadFinanciera.MASTERCARD, "Banco del Sol", cliente, "1234 4567 4567 7894", 30000);
        
        Ticket t = posnet.efectuarPago(tarjeta, 20000, 1);
        System.out.println(t);
        
        
        
        
        
        
        
        
        
    }
    
}
