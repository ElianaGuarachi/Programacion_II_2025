package integradorlistas;

import java.util.ArrayList;
import java.util.List;

public class Compumundo {

    public static void main(String[] args) {
        
        CadenaTecnologia compumundo = new CadenaTecnologia();
        try {
            hardcodearCadena(compumundo);           
        } catch (SucursalRepetidaException e) {
            System.out.println(e.getMessage());
        }

        
        System.out.println(compumundo.getDispositivos(TipoDispositivo.TABLET));
        
        System.out.println(DispositivoElectronico.toTable(compumundo.getDispositivos(TipoDispositivo.COMPUTADORA)));
        
        System.out.println(compumundo.getTablaDispositivos());
        
        Utils.separadorLargo();
        
        try {
            System.out.println(compumundo.borrarDispositivo("Sucursal A", "126"));
        
            System.out.println(compumundo.getTablaDispositivos());
        
            double por[] = compumundo.porcDispositivosPorTipo("Sucursal B");
        
            for (TipoDispositivo tipo : TipoDispositivo.values()) {
            System.out.println("%s: %.2f".formatted(tipo.name(), por[tipo.ordinal()]));
        }
        } catch (SucursalInexistenteException e) {
            
            System.out.println("Sucursal no identificada");
        }
        /*for (double n : compumundo.porcDispositivosPorTipo("Sucursal A")) {
            System.out.println(n);
        }*/
        
        
        
    }
    
    public static void mostrarDispositivos(ArrayList<DispositivoElectronico> lista){
        for (DispositivoElectronico d : lista) {
            System.out.println(d);
        }
    }
    
    public static void hardcodearCadena(CadenaTecnologia cadena)  throws SucursalRepetidaException{
        
        //Agregar dspositivos se los pasamos a la Cadena (nombre sucursal, dispositivo)
        
        Sucursal suc1 = new Sucursal("Sucursal A");
        Sucursal suc2 = new Sucursal("Sucursal B");
        
        suc1.agregarDispositivo(new DispositivoElectronico("123", TipoDispositivo.COMPUTADORA, 1500));
        suc1.agregarDispositivo(new DispositivoElectronico("124", TipoDispositivo.TABLET, 750));
        suc1.agregarDispositivo(new DispositivoElectronico("125", TipoDispositivo.TELEFONO, 1200));
        suc1.agregarDispositivo(new DispositivoElectronico("126", TipoDispositivo.COMPUTADORA, 1500));
        
        suc2.agregarDispositivo(new DispositivoElectronico("223", TipoDispositivo.COMPUTADORA, 1500));
        suc2.agregarDispositivo(new DispositivoElectronico("228", TipoDispositivo.COMPUTADORA, 1500));
        suc2.agregarDispositivo(new DispositivoElectronico("224", TipoDispositivo.TABLET, 750));
        suc2.agregarDispositivo(new DispositivoElectronico("225", TipoDispositivo.TELEFONO, 1000));
        suc2.agregarDispositivo(new DispositivoElectronico("227", TipoDispositivo.TELEFONO, 1150));
        
        cadena.agregarSucursal(suc1);
        cadena.agregarSucursal(suc2);
        cadena.agregarSucursal(suc1);
    }
}
