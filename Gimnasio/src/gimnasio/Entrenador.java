package gimnasio;

import java.time.LocalDate;

public abstract class Entrenador {
    
    private int legajo;
    private String nombre;
    private String apellido;
    private LocalDate fechaIngreso;
    
    public Entrenador(int legajo, String nombre, String apellido, LocalDate fechaIngreso) {
        this.legajo = legajo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaIngreso = fechaIngreso;
    }
    
    public String nombreCompleto(){
        return nombre + " " + apellido;
    }
    
    public abstract double calcularSueldo();
    
}
