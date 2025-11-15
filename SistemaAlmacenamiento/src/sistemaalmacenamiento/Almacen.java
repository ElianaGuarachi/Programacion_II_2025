package sistemaalmacenamiento;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public class Almacen<T> implements Almacenable<T> {

    private List<T> items = new ArrayList<>();
    
    @Override
    public void limpiar(){
        items.clear();
    }
    
    @Override
    public void agregar(T item) {
        Objects.requireNonNull(item, "Elemento nulo");
        items.add(item);
    }

    @Override
    public boolean eliminar(T item) {
        return items.remove(item);
    }

    @Override
    public boolean contiene(T item) {
        return items.contains(item);
    }

    @Override
    public T obtener(int indice) {
        validarIndice(indice);
        return items.get(indice);
    }
    
    private void validarIndice(int indice){
        if (indice >= tamanio() || indice < 0) {
            throw new IndexOutOfBoundsException("El indice ingresado supera el tamanio de la lista");
        }
    }

    @Override
    public int tamanio() {
        return items.size();
    }

    @Override
    public Iterator<T> iterator() {
        return new ArrayList<T>(items).iterator(); //items.iterator() 
    }
    
}
