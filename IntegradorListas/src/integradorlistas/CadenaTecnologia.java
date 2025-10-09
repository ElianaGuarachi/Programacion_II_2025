package integradorlistas;

import java.util.ArrayList;

public class CadenaTecnologia {
       
    private final ArrayList <Sucursal> sucursales = new ArrayList<>();
    
    public void agregarSucursal(Sucursal sucursal){
        if(sucursal == null || sucursales.contains(sucursal)){
            throw new IllegalArgumentException("Sucursal invalida");
        }
        sucursales.add(sucursal);
    }
    
    public ArrayList<DispositivoElectronico> getDispositivos() {
        ArrayList<DispositivoElectronico> toReturn = new ArrayList<>();
        for (Sucursal suc : sucursales) {
            toReturn.addAll(suc.getDispositivos());
        }
        return toReturn;
    } 
    
    public ArrayList<DispositivoElectronico> getDispositivos(TipoDispositivo tipoBuscado) {
        ArrayList<DispositivoElectronico> toReturn = new ArrayList<>();
        for (Sucursal suc : sucursales) {
            toReturn.addAll(suc.getDispositivos(tipoBuscado));
        }
        return toReturn;
    } 
    
    public String getTablaDispositivos(){
        return DispositivoElectronico.toTable(getDispositivos());
    }
    
    public Sucursal buscarSucursal(String nombre){
        for (Sucursal suc : sucursales) {
            if (suc.tieneNombre(nombre)) {
                return suc;
            }
        }
        return null;
    }
    
    public DispositivoElectronico borrarDispositivo(String nombreSucursal, String idDispositivo){
        Sucursal suc = buscarSucursal(nombreSucursal);
        if (suc == null) {
            throw new IllegalArgumentException("Sucursal inexistente");
        }
        return suc.borrarDispositivoIt(idDispositivo);
    }
    
    public double[] porcDispositivosPorTipo(String nombreSucursal){
        Sucursal suc = buscarSucursal(nombreSucursal);
        if (suc == null) {
            throw new IllegalArgumentException("Sucursal inexistente");
        }
        return suc.porcDispositivosPorTipo();
    }

}
