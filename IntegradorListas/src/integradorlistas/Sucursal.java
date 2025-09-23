package integradorlistas;

import java.util.ArrayList;
import java.util.Objects;

public class Sucursal {
    private final String nombre;
    //private String localidad;
    private final ArrayList<DispositivoElectronico> dispositivos;
    
    /*private Sucursal(){
        this.dispositivos = new ArrayList<>();
    }
    
    public Sucursal(String nombre){
        this();
        this.nombre = nombre;
    }
    
    public Sucursal (String nombre, String localidad){
        this(nombre);
        this.localidad = localidad;
    }*/
    
    public Sucursal(String nombre){
        this.nombre = nombre;
        this.dispositivos = new ArrayList<>();
    }
    
    public void agregarDispositivo(DispositivoElectronico dispositivo){
        if (dispositivo == null) {
            throw new IllegalArgumentException("Dispositivo invalido");
        }
        dispositivos.add(dispositivo);
    }
    
    public ArrayList<DispositivoElectronico> getDispositivos() {
        return new ArrayList<>(dispositivos);
    } 
    
    @Override
    public int hashCode(){
        return Objects.hash(nombre);
    }
    
    @Override
    public boolean equals(Object obj){
        if (obj == null || !(obj instanceof Sucursal s)) {
            return false;
        }
        return nombre.equals(s.nombre);
    }
            
}
