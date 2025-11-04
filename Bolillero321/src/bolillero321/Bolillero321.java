package bolillero321;

public class Bolillero321 {
    
    public static void main(String[] args) {
        
        //String[] apellidos = new String[]{"Guarachi", "Sarzuri", "Gonzalez", "Ramirez"};
        //Integer[] numeros = new Integer[]{23, 45, 78, 89, 56, 74};
        
        FormulaUno[] pilotos = new FormulaUno[]{
            new FormulaUno("Colapinto", Escuderia.ALPINE),
            new FormulaUno("Piloto 2", Escuderia.ASTON_MARTIN),
            new FormulaUno("Piloto 3", Escuderia.FERRARI),
            new FormulaUno("Russell", Escuderia.MERCEDES),
            new FormulaUno("Pilote 5", Escuderia.RED_BULL)
        };
        
        Bolillero<FormulaUno> bingo = new BolilleroAleatorio();
        //Bolillero<FormulaUno> bingo = new BolilleroSecuencial();
        
        Bolillero.cargarBolillero(bingo, pilotos);
        
        System.out.println("%.2f%%".formatted(bingo.porcBolillasRestantes(pilotos.length)));
        
        System.out.println("Inicia sorteo");
        
        while (bingo.quedanBolillas()) {            
            System.out.println(bingo.extraerBolilla());
        }
        
        
        
        System.out.println("Fin sorteo");
    }
    
}
