package bolillero321;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public interface Bolillero<T> {
    
    void cargarBolilla(T bolilla);
    
    default public void cargarBolillas(T[] bolillas){
        Objects.requireNonNull(bolillas, "Bolilla nula");
        vaciarBolillero();
        for (T bolilla : bolillas) {
            cargarBolilla(bolilla);
        }
    }
    
    default boolean quedanBolillas(){
        return cantidadBolillas() > 0;
    }
    
    default List<T> extraerVarias(int cant){
        if (cant < 0 && cant > cantidadBolillas()) {
            throw new IllegalArgumentException("Cantidad invalida");
        }
        List<T> toReturn = new ArrayList<>();
        for (int i = 0; i < cant; i++) {
            toReturn.add(extraerBolilla());
        }
        return toReturn;
    }
    
    default double porcBolillasRestantes(int cantOriginal){
        return cantidadBolillas() / cantOriginal * 100;
    }

    void vaciarBolillero();

    T extraerBolilla();
        
    T extraerBolillaRepo();
    
    int cantidadBolillas();
    
    public static <T> void cargarBolillero(Bolillero<T> bolillero, T[] bolillas){
        bolillero.cargarBolillas(bolillas);
    }
}
