package clase8;

import clase8.Auto;
import java.util.ArrayList;

/**
 * 11/09/2025
 */
public class Estacionamiento {
    
    private final String nombre;
    private final ArrayList<Auto> autos;
    
    public Estacionamiento(String nombre){
        this.nombre = nombre;
        this.autos = new ArrayList<Auto>(); //instanciar
    }
    
    private void checkNull(Object o, String mensaje){
        if(o == null){
            throw new IllegalArgumentException((mensaje == null) ? "Objeto nulo" : mensaje);
        }
    }
    
    public void agregarAuto(Auto nuevoAuto){
        checkNull(nuevoAuto, null);
        if (autos.contains(nuevoAuto)) {
            throw new IllegalArgumentException("Auto repetido");
        }
        autos.add(nuevoAuto);
    }
    
    public int cantidadAutos(){
        return autos.size();
    }
    
    public boolean estaVacio(){
        return autos.isEmpty();
    }
    
    public ArrayList<Auto> getAutos(){
        return new ArrayList(autos);
    }
    
    public String autosString(){
        StringBuilder lista = new StringBuilder();
        for (Auto auto : autos) {
            lista.append(auto + "\n");
        }
        return lista.toString();
    }
    
    /*
    public Auto sacarAuto(String patente){
        Auto toReturn = null;
        for (Auto auto : autos) {
            if (auto.getPatente().equals(patente)) {
                return auto;
            }
        }
        return toReturn;
    }
    
    public int indiceAuto(String patente){
        Auto auto;
        int indice = -1;
        int i = 0;
        while (i < autos.size() && indice == -1) {            
            auto = autos.get(i);
            if (auto.getPatente().equals(patente)) {
                indice = i;
            }
            i++;
        }
        return indice;
    }
    
    public Auto sacarAuto2(String patente){
        int indice = indiceAuto(patente);
        Auto auto = null;
        if (indice != -1) {
            auto = autos.remove(indice);
        }
        return auto;
    }
    */
    
    private Auto buscarAuto(String patente){
        for (Auto auto : autos) {
            if (auto.tienePatente(patente)) {
                return auto;
            }
        }
        return null;
    }
    
    public boolean estaAuto(String patente){
        return buscarAuto(patente) != null;
    }
    
    public Auto sacarAuto3(String patente){
        return autos.remove(autos.indexOf(buscarAuto(patente)));
    }
    
    public void vaciasEstacionamiento(){
        autos.clear();
    }
    
}
