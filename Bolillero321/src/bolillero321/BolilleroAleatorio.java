package bolillero321;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Random;

public class BolilleroAleatorio<T> implements Bolillero<T> {
    
    private final Random aleatorio = new Random();
    private final List<T> bolillas = new ArrayList<>();
    
    @Override
    public void cargarBolilla(T bolilla){
        Objects.requireNonNull(bolilla, "Bolilla nula");
        bolillas.add(bolilla);
    }

    @Override
    public void vaciarBolillero(){
        bolillas.clear();
    }    

    @Override
    public T extraerBolilla(){
        checkVacio();
        esperarUnSegundo();
        return bolillas.remove(indiceAleatorio());
    }
        
    @Override
    public T extraerBolillaRepo(){
        checkVacio();
        esperarUnSegundo();
        return bolillas.get(indiceAleatorio());
    }
    
    private void checkVacio(){
        if (!quedanBolillas()) {
            throw new NoSuchElementException("No quedan bolillas");
        }
    }
    
    @Override
    public int cantidadBolillas(){
        return bolillas.size();
    }
    
    private int indiceAleatorio(){
        return aleatorio.nextInt(cantidadBolillas());
    }

    private void esperarUnSegundo(){
        int segundo = 1000;
        try {
            Thread.sleep(segundo);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
    
}
