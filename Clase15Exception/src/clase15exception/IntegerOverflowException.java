
package clase15exception;

public class IntegerOverflowException extends RuntimeException {
    
    private static final String MESSAGE = "Desbordamiento de tipo integer";
    
    public IntegerOverflowException(){
        this(MESSAGE);
    }
    
    public IntegerOverflowException(String mensaje){
        super(mensaje);
    }
    
}
