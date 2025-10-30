package gimnasio;

import java.util.ArrayList;

public class GimnasioTester {

    private String nombre;
    private ArrayList<Entrenador> entrenadores;
    
    public GimnasioTester(String nombre) {
        this.nombre = nombre;
        this.entrenadores = new ArrayList();
    }
    
    public void agregarEntrenador(Entrenador e){
        if (e == null) {
            throw new IllegalArgumentException();
        }
        entrenadores.add(e);
    }
    
}
