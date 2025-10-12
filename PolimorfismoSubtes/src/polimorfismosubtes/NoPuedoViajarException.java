
package polimorfismosubtes;

public class NoPuedoViajarException extends RuntimeException {
    
    private static final String MESSAGE = "No more rides exception";
    
    public NoPuedoViajarException(){
        this(MESSAGE);
    }
    
    public NoPuedoViajarException(String mensaje){
        super(mensaje);
    }
    
}
