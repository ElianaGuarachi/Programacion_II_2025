/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gimnasio;

import java.time.LocalDate;

/**
 *
 * @author DELL
 */
public class EntrenadorEquipo extends Entrenador {
    
    private static final double PORC_1 = 0.04;
    private static final double PORC_2 = 0.12;
    private static final double ANTIGUEDAD_1 = 3;
    private static final double ANTIGUEDAD_2 = 6;
    private double sueldoFijo;

    public EntrenadorEquipo(int legajo, String nombre, String apellido, LocalDate fechaIngreso, double sueldoFijo) {
        super(legajo, nombre, apellido, fechaIngreso);
        this.sueldoFijo = sueldoFijo;
    }

    @Override
    public double calcularSueldo() {
        return 0;
    }
    
    
    
}
