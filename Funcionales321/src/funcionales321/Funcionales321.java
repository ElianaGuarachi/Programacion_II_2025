package funcionales321;

public class Funcionales321 {

    public static void main(String[] args) {
        
        Integer x = 20;
        Integer y = 30;
        
        OperacionBinaria<Double, Double> resta = new OperacionBinaria<Double, Double>(){
            public Double operar(Double o1, Double o2){
                return o1 - o2;
            }
        };
        
        realizarOperacion(x, y, new Suma());
        realizarOperacion(x.doubleValue(), y.doubleValue(), resta);
        realizarOperacion("Hola", " Mundo", (a, b) -> a + b);
        realizarOperacion(10, 2, new Division());
        realizarOperacion("Hola", " Mundo", (a, b) -> a.length() + b.length());
        
        System.out.println("------------------------------------------------------------------");
        
        discriminar(x, a -> x % 2 == 0);
        
    }
    
    public static <T, R> void realizarOperacion(T op1, T op2, OperacionBinaria<T, R> operacion){
        
        R resultado = operacion.operar(op1, op2);
        System.out.println("Resultado: " + resultado);
        
    }
    
    public static <T> void discriminar(T elemento, Patovica<T> patovica){
        
        System.out.println((patovica.admitir(elemento)) ? "Pasa" : "No pasa");
        
    }
    
}
