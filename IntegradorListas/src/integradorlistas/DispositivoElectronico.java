/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package integradorlistas;

import java.util.ArrayList;

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
    
    public boolean esTipo(TipoDispositivo tipo){
        return this.tipo.equals(tipo);
    }
    
    public TipoDispositivo getTipo(){
        return tipo;
    }
    
    public boolean tieneId(String id){
        return this.id.equals(id);
    }

    @Override
    public String toString() {
        return "DispositivoElectronico{" + "id=" + id + ", tipo=" + tipo + ", precio=" + precio + '}'+'\n';
    }
    
    private String toTableRow(){
        return "|%5s   |%16s    |%10.2f  |\n".formatted(id, tipo, precio);
    }
    
    private static String getHeaderRow(){
        return "|   Id   |       Tipo         |   Precio   |\n";
    }
    
    public static String toTable(ArrayList<DispositivoElectronico> lista){
        StringBuilder sb = new StringBuilder();
        String header = getHeaderRow();
        String separador = Utils.sepHotizontal(header.length() - 1);
        sb.append(separador);
        sb.append(header);
        sb.append(separador);
        for (DispositivoElectronico d : lista) {
            sb.append(d.toTableRow());
        }
        sb.append(separador);
        return sb.toString();
    }
    
}
