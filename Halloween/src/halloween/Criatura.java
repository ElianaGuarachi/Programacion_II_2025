package halloween;

public class Criatura {
    
    private final String nombre;
    private int energia;
    
    public Criatura(String nombre, int energia){
        this.energia = energia;
        this.nombre = nombre;
    }
    
    public void recargarEnergia(int energia){
        this.energia += energia;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEnergia() {
        return energia;
    }

    @Override
    public String toString() {
        return "Criatura{" + "nombre=" + nombre + ", energia=" + energia + '}';
    }
    
}
