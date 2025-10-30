package empresalogistica;

public class EmpresaTercerizada implements TransportadorPaquete, Felicitacion{
    
    private final String nombre;
    private final long CUIT;
    
    public EmpresaTercerizada(String nombre, long CUIT){
        this.nombre = nombre;
        this.CUIT = CUIT;
    }

    @Override
    public void transportarPaquetes(String destino) {
        System.out.println("Somos" + nombre + "y estamos entregando paquetes");
    }

    @Override
    public void felicitar() {
        
    }
    
}
