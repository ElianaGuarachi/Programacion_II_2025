package halloween;

import java.util.List;

public interface GestionListas {
    
    public static void mostrarLista(List<?> objetos){
        for (Object objeto : objetos) {
            System.out.println(objeto);
        }
    }
    
    /*public static <T> mostrarListaGenerico(List<T> lista){
        for (T elemento : lista) {
            System.out.println(elemento);
        }
    }*/
    
}
