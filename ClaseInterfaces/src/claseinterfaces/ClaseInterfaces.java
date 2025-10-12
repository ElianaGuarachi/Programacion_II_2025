package claseinterfaces;

//import java.util.ArrayList;

/**
 *9/10/2025
 */
public class ClaseInterfaces {

    public static void main(String[] args) {
        // TODO code application logic here
        
        Mosquito m = new Mosquito("Mosca 1", 3, 'f');
        Avion a = new Avion("Boering", "", 345, 1000);
        Superman s = new Superman("Superman", "Clark", "Tierra");
        
        m.volar();
        m.picar();
        m.zumbar();
        
        a.volar();
        System.out.println(a.getPasajeros());
        a.realizarMantenimiento();
        
        //Object o = new Object();
        
        hacerVolar(a);
        hacerVolar(m);
        hacerVolar(s);
        
        Volador v = a; 
        v = m;
        v = s; //En una referencia de volador puedo guardar voladores
        
        Avion a2 = (Avion) v; //sabe que avion hereda de v, no controla el contenido de v sino el tipo
        
        
        //ArrayList<Mosquito> mosquitos = new ArrayList();
        //ArrayList<Avion> aviones = new ArrayList();
        
        
    }
    
    /*public static void hacerVolar(Object x){
        if (x instanceof Mosquito m) {
            m.volar();
        }
        
        if (x instanceof Avion a) {
            a.volar();
        }
    }*/
    
    public static void hacerVolar(Volador v){
        v.volar();
    }
    
    /*public static void hacerVolar(Mosquito x){
        x.volar();
    }*/
    
}
