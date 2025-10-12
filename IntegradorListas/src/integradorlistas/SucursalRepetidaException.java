package integradorlistas;

public class SucursalRepetidaException extends RuntimeException {
    
    private static final String MESSAGE = "Sucursal repetida";
    
    public SucursalRepetidaException(String mensaje) {
        super(mensaje);
    }
    
    public SucursalRepetidaException(){
        this(MESSAGE);
    }
            
}
