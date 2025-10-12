package integradorlistas;

//cheaqueada
public class SucursalInexistenteException extends Exception {
    
    private static final String MESSAGE = "Sucursal inexistente";
    
    public SucursalInexistenteException(String mensaje) {
        super(mensaje);
    }
    
    public SucursalInexistenteException(){
        this(MESSAGE);
    }
    
}
