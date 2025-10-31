package bolillero;

import bolillero321.BolilleroComposicion;

public class Bolillero {

    public static void main(String[] args) {
      
        BolilleroComposicion bingo = new BolilleroComposicion();
        
        cargarBolillero(bingo);
        
        System.out.println("Inicia sorteo");
        
        while (bingo.quedanBolillas()) {            
            System.out.println(bingo.extraerBolilla());
        }
        
        System.out.println("Fin sorteo");
    }
    
    public static void cargarBolillero(BolilleroComposicion bolillero){
        for (int i = 0; i < 10; i++) {
            bolillero.cargarBolilla(i);
        }
    }
    
}
