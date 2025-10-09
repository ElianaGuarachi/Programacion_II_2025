package clase14iterador;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Clase14Iterador {

    public static void main(String[] args) {
        
        ArrayList<Integer> numeros = new ArrayList<>(List.of(1,3,4,7,6,3,6,8,3));
        
        /*Iterator<Integer> it1 = numeros.iterator();
        for (Integer i: numeros) {
            System.out.println(i);
        }
        
        Integer second;
        while (it1.hasNext()) {   
            second = it1.next();
            System.out.println(second);
        }*/
        
        Iterator<Integer> it2 = numeros.iterator();
        while (it2.hasNext()) {            
            if (it2.hasNext() && it2.next() == 3) {
                it2.remove();
            }
        }
        
        /*for (Integer i: numeros) {
            System.out.println(i);
        }*/
        
    }
    
}
