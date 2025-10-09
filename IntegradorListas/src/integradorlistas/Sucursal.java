package integradorlistas;

import java.util.ArrayList;
import java.util.Iterator;
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
    
    public boolean tieneNombre(String nombre){
        return this.nombre.equals(nombre);
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
    
    public ArrayList<DispositivoElectronico> getDispositivos(TipoDispositivo tipoBuscado) {
        ArrayList<DispositivoElectronico> toReturn = new ArrayList<>();
        for (DispositivoElectronico dispositivo : dispositivos) {
            if (dispositivo.esTipo(tipoBuscado)) {
                toReturn.add(dispositivo);
            }
        }
        return toReturn;
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
    
    public DispositivoElectronico borrarDispositivo(String id){
        DispositivoElectronico eliminado = null;
        int i = 0;
        boolean borrado = false;
        while (i < dispositivos.size() && !borrado ) {  
            if ((eliminado = dispositivos.get(i++)).tieneId(id)) {
                borrado = dispositivos.remove(eliminado);
            }
            i++;
        }
        return borrado ? eliminado : null;
    }  

    /*public DispositivoElectronico borrarDispositivoIt(String id){
        Iterator<DispositivoElectronico> iterador = dispositivos.iterator();
        DispositivoElectronico toReturn = null;
        boolean borrado = false;
        while (iterador.hasNext() && !borrado) {
            toReturn = iterador.next();
            if (toReturn.equals(id)) {
                iterador.remove();
            }
            
        }
        return borrado ? toReturn : null;
    }  */  
    
    public DispositivoElectronico borrarDispositivoIt(String id){
        for (DispositivoElectronico d: dispositivos) {
            if (d.tieneId(id)) {
                dispositivos.remove(d);
                System.out.println("Borrado exitoso");
                return d;
            }
            
        }
        return null;
    }
    
    public DispositivoElectronico borrarDispositivoModerno(String id){
        dispositivos.removeIf((d) -> d.tieneId(id));
        return null;///solo para sacar el error
    }
    
    public double[] porcDispositivosPorTipo(){
        TipoDispositivo[] tipos = TipoDispositivo.values();
        double[] porcentajes = new double[tipos.length];
        int[] contadores = new int[tipos.length];
        
        for (DispositivoElectronico d : dispositivos) {
            contadores[d.getTipo().ordinal()]++;
        }
        
        for (int i = 0; i < tipos.length; i++) {
            porcentajes[i] = calcularPorcentaje(contadores[i]);
        }
        
        return porcentajes;   
    }
    
    private double calcularPorcentaje(int cantidad){
        return (double) cantidad * 100 / dispositivos.size();
    }
}
