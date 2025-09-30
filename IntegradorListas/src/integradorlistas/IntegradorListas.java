package integradorlistas;

import java.util.ArrayList;
import java.util.List;

public class IntegradorListas {

    public static void main(String[] args) {
        
        /*CadenaTecnologia compumundo = new CadenaTecnologia();
        hardcodearCadena(compumundo);
        
        System.out.println(compumundo.getDispositivos(TipoDispositivo.TABLET));
        
        System.out.println(DispositivoElectronico.toTable(compumundo.getDispositivos(TipoDispositivo.COMPUTADORA)));
        
        System.out.println(compumundo.getTablaDispositivos());*/
        
        
        ArrayList<Integer> numeros = new ArrayList<>(List.of(1,3,4,7,6,3,6,8,3));
        
        System.out.println(numeros);
        
        /*for (int i = 0; i < numeros.size(); i++) {
            if (numeros.get(i) == 3) {
                numeros.remove(i);
                break;
            }
        }
        
        for (int i = numeros.size() - 1; i >= 1; i--) {
            if (numeros.get(i) == 3) {
                numeros.remove(i);
            }
        }*/
        
        
        
        System.out.println(numeros);
        
    }
    
    public static void mostrarDispositivos(ArrayList<DispositivoElectronico> lista){
        for (DispositivoElectronico d : lista) {
            System.out.println(d);
        }
    }
    
    public static void hardcodearCadena(CadenaTecnologia cadena){
        
        //Agregar dspositivos se los pasamos a la Cadena (nombre sucursal, dispositivo)
        
        Sucursal suc1 = new Sucursal("Sucusal A");
        Sucursal suc2 = new Sucursal("Sucusal B");
        
        suc1.agregarDispositivo(new DispositivoElectronico("123", TipoDispositivo.COMPUTADORA, 1500));
        suc1.agregarDispositivo(new DispositivoElectronico("124", TipoDispositivo.TABLET, 750));
        suc1.agregarDispositivo(new DispositivoElectronico("125", TipoDispositivo.TELEFONO, 1200));
        suc1.agregarDispositivo(new DispositivoElectronico("126", TipoDispositivo.COMPUTADORA, 1500));
        
        suc2.agregarDispositivo(new DispositivoElectronico("223", TipoDispositivo.COMPUTADORA, 1500));
        suc2.agregarDispositivo(new DispositivoElectronico("223", TipoDispositivo.COMPUTADORA, 1500));
        suc2.agregarDispositivo(new DispositivoElectronico("224", TipoDispositivo.TABLET, 750));
        suc2.agregarDispositivo(new DispositivoElectronico("225", TipoDispositivo.TELEFONO, 1000));
        suc2.agregarDispositivo(new DispositivoElectronico("227", TipoDispositivo.TELEFONO, 1150));
        
        cadena.agregarSucursal(suc1);
        cadena.agregarSucursal(suc2);
    }
}
