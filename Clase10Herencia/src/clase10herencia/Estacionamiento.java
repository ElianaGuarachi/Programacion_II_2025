package clase10herencia;

import java.util.ArrayList;

public class Estacionamiento {
    
    private final String nombre;
    private final ArrayList<Vehiculo> vehiculos;
    
    public Estacionamiento(String nombre){
        this.nombre = nombre;
        this.vehiculos = new ArrayList<Vehiculo>(); //instanciar
    }
    
    private void checkNull(Object o, String mensaje){
        if(o == null){
            throw new IllegalArgumentException((mensaje == null) ? "Objeto nulo" : mensaje);
        }
    }
    
    public void agregarVehiculo(Vehiculo nuevoVehiculo){
        checkNull(nuevoVehiculo, null);
        if (vehiculos.contains(nuevoVehiculo)) {
            throw new IllegalArgumentException("Auto repetido");
        }
        vehiculos.add(nuevoVehiculo);
    }
    
    public int cantidadVehiculos(){
        return vehiculos.size();
    }
    
    public boolean estaVacio(){
        return vehiculos.isEmpty();
    }
    
    public ArrayList<Auto> getVehiculos(){
        return new ArrayList(vehiculos);
    }
    
    public String autosString(){
        StringBuilder lista = new StringBuilder();
        for (Vehiculo vehiculo : vehiculos) {
            lista.append(vehiculo + "\n");
        }
        return lista.toString();
    }
    
    private Vehiculo buscarVehiculo(String patente){
        for (Vehiculo vehiculo : vehiculos) {
            if (vehiculo instanceof Auto a) {
                if (a.tienePatente(patente)) {
                    return vehiculo;
                }
            }
        }
        return null;
    }
    
    public void vaciasEstacionamiento(){
        vehiculos.clear();
    }
    
}
