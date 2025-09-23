/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package integradorlistas;

/**
 *
 * @author DELL
 */
public class DispositivoElectronico {
    
    private final String id;
    private final TipoDispositivo tipo;
    private double precio;
    
    public DispositivoElectronico(String id, TipoDispositivo tipo, double precio){
        this.id = id;
        this.tipo = tipo;
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "DispositivoElectronico{" + "id=" + id + ", tipo=" + tipo + ", precio=" + precio + '}';
    }
    
}
