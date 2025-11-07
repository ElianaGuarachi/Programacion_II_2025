/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemaalmacenamiento;

import java.util.Objects;

/**
 *
 * @author DELL
 */
public class Producto {
    
    private final int id;
    private final String nombre;
    private final double precio;
    private final Tipo tipo;

    public Producto(int id, String nombre, double precio, Tipo tipo) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Producto{" + "id=" + id + ", nombre=" + nombre + ", precio=" + precio + ", tipo=" + tipo + '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Producto p)) {
            return false;
        }
        return(this.id == p.id);
    }
    
    
    
}
