package bolillero321;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Random;

/* No deberia usarse*/
public class BolilleroHerencia extends ArrayList<Integer> {
    
    private final Random aleatorio = new Random();
    
    public void cargarBolilla(Integer bolilla){
        Objects.requireNonNull(bolilla, "Bolilla nula");
        add(bolilla);
    }
    
    public void cargarBolillas(Integer[] bolillas){
        Objects.requireNonNull(bolillas, "Bolilla nula");
        vaciarBolillero();
        for (Integer bolilla : bolillas) {
            cargarBolilla(bolilla);
        }
    }
    
    public boolean quedanBolillas(){
        return !isEmpty();
    }

    
    public void vaciarBolillero(){
        clear();
    }    

    public Integer extraerBolilla(){
        esperarUnSegundo();
        return remove(indiceAleatorio());
    }
        
    public Integer extraerBolillaRepo(){
        return get(indiceAleatorio());
    }
    
    public int cantidadBolillas(){
        return size();
    }
    
    private int indiceAleatorio(){
        return aleatorio.nextInt(cantidadBolillas());
    }
    
    /*private void esperarUnSegundo() throws InterruptedException{ //Este molestaria a quien lo llame
        int segundo = 1000;
        Thread.sleep(segundo);
    }*/
    
    private void esperarUnSegundo(){
        int segundo = 1000;
        try {
            Thread.sleep(segundo);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}
