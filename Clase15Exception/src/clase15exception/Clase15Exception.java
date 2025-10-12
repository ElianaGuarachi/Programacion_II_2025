package clase15exception;

public class Clase15Exception {

    /**
     * 06/10/2025
     */
    public static void main(String[] args) {
        
        try {
            int f = factorial(17);
            System.out.println("Factorial: " + f);
            
        } catch (IntegerOverflowException | ArithmeticException ex) {
            System.out.println(ex.getMessage());
        } 
        
    }
    
    public static int factorial(int n) throws IntegerOverflowException{
        if (n < 0) {
            throw new ArithmeticException("No esta definido el factorial de 0");
        }
        if (n > 16) {
            //throw new IllegalArgumentException("El factorial de 17 excede un entero");
            throw new IntegerOverflowException("El factorial de 17 excede un entero");
        }
        
        int fact = 1;
        for (int i = 2; i < n; i++) {
            fact *= i;
        }
        return fact;
    }
    
}
