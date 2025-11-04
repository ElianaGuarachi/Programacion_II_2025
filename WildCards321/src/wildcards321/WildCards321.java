package wildcards321;

import java.util.ArrayList;
import java.util.List;

public class WildCards321 {

    public static void main(String[] args) {
        
        List<Integer> numeros = new ArrayList<>(List.of(1,4,5,6,98,78,954));
        List<String> nombres = new ArrayList<>(List.of("Juan", "Pedro", "Maria"));
        
        mostrarLista(nombres);
        
    }
    
    public static <T> void mostrarLista(List<T> lista){
        for (T elemento : lista) {
            System.out.println(elemento);
        }
    }
    
    public static void mostrarLista2(List<?> lista){
        for (Object elemento : lista) {
            System.out.println(elemento);
        }
    }
    
}
