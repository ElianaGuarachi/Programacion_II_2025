package integradorlistas;

import java.util.ArrayList;

public class CadenaTecnologia {
       
    private final ArrayList<Sucursal> sucursales = new ArrayList<>();
    
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
}
