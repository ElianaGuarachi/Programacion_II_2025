package sistemaalmacenamiento;

import java.util.Iterator;

public interface Almacenable<T> extends Iterable<T> {
    
    void agregar(T item);
    
    boolean eliminar(T item );
    
    boolean contiene(T item);
            
    T obtener(int indice);
    
    int tamanio();
    
    void limpiar();
    
    default boolean estaVacio(){
        return tamanio() == 0;
    }
    
    /*default void mostrarContenido(){
        if (estaVacio()) {
            System.out.println("No hay elementos");
        } else {
            System.out.println("Contenido del almacen");
            for (T e : this) {
                System.out.println(e);
            }
        }
    }
    
    default void mostrarContenido2(){
        Iterator<T> i = iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }
    }*/
}
