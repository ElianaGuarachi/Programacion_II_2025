package gimnasio;

import java.time.LocalDate;

public class PersonalTrainer extends Entrenador {
    
    private double sueldoMinimo;
    private int cantClientes;
    private double montoCliente;
    
    public PersonalTrainer(int legajo, String nombre, String apellido, LocalDate fechaIngreso, double sueldoMinimo, int cantClientes, double montoCliente) {
        super(legajo, nombre, apellido, fechaIngreso);
        this.sueldoMinimo = sueldoMinimo;
        this.cantClientes = cantClientes;
        this.montoCliente = montoCliente;
    }

    @Override
    public double calcularSueldo() {
        double sueldoPorNumClientes = this.montoCliente * this.cantClientes;
        return sueldoMinimo > sueldoPorNumClientes ? sueldoMinimo : sueldoPorNumClientes;
    }
    
    
}
