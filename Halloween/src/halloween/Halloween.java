package halloween;

import java.util.ArrayList;
import java.util.List;

public class Halloween {

    public static void main(String[] args) {
        
        Criatura c1 = new Criatura("Alma errante", 67);
        Criatura c2 = new Criatura("Metamorfo", 72);
        Espectro e1 = new Espectro("Oscuridad profunda", 81, 9);
        Espectro e2 = new Espectro("Silbido espectral", 65, 8);
        Fantasma f1 = new Fantasma("Casper", 45, 3, .7);
        Fantasma f2 = new Fantasma("Lamento agonico", 90, 10, .9);
        
        List<Criatura> criaturas = new ArrayList<>();
        List<Espectro> espectros = new ArrayList<>();
        List<Fantasma> fantasmas = new ArrayList<>();
        List<Aterrable> aterrables = new ArrayList<>();
        List<Object> objetos = new ArrayList<>();
        
        criaturas.add(c1);
        criaturas.add(c2);
        criaturas.add(e1);
        
        espectros.add(f1);
        espectros.add(f2);
        espectros.add(e1);
        
        fantasmas.add(f1);
        fantasmas.add(f2);
        
        aterrables.add(f1);
        aterrables.add(e2);
        
        //GestionListas.mostrarLista(criaturas);
        mostrarCriaturas(espectros);
        recargarEnergia(criaturas, 10);
        System.out.println("#################################################");
        mostrarCriaturas(criaturas);
        
    }
    
    //upper bounded wildcard comodin de limite superior
    public static void mostrarCriaturas(List<? extends Criatura> lista){
        for (Criatura elemento : lista) {
            System.out.println(elemento);
        }
    }
    
    public static void mostrarEspectros(List<? extends Espectro> lista){
        for (Espectro elemento : lista) {
            System.out.println(elemento);
        }
    }
    
    public static void recargarEnergia(List<? extends Criatura> criaturas, int energia){
        for (Criatura cria : criaturas) {
            cria.recargarEnergia(energia);
        }
    }
    
}
