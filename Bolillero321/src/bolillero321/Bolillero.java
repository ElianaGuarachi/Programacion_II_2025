package bolillero321;

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
    
    boolean quedanBolillas();

    void vaciarBolillero();

    T extraerBolilla();
        
    T extraerBolillaRepo();
    
    int cantidadBolillas();
    
    public static <T> void cargarBolillero(Bolillero<T> bolillero, T[] bolillas){
        bolillero.cargarBolillas(bolillas);
    }
}
