package ordenamiento321;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Ordenamiento321 {

    public static void main(String[] args) {
        
        List<Integer> numeros = new ArrayList<>(List.of(23,45,78,89,56,78,15,4,5));
        List<String> nombres = new ArrayList<>(List.of("Juan", "Eliana", "Carlos"));
        List<Empleado> lista = new ArrayList<>();
        cargarEmpleados(lista);
        
        //Comparator<Empleado> c = new ComparadorGeneroSueldo();
        Comparator<Empleado> c = new Comparator<>(){
            @Override
            public int compare(Empleado e1, Empleado e2) {
                return e1.getNombre().compareTo(e2.getNombre());
            }
            
        };
        
        Comparator<Empleado> cmp = (e1, e2) -> Integer.compare(e1.getEdad(), e2.getEdad());
        
        Collections.sort(lista, (e1, e2) -> {
            int cmp2 = e1.getSector().compareTo(e2.getSector());
            if (cmp2 == 0) {
                cmp2 = Double.compare(e2.getSueldo(), e1.getSueldo());
            }
            return cmp2;
        });
        
        //Collections.sort(lista, new ComparadorGeneroSueldo());
        /*Collections.sort(lista, new Comparator<>(){
            
            @Override
            public int compare(Empleado e1, Empleado e2){
                return e1.getFechaIngreso().compareTo(e2.getFechaIngreso());
            }
        });*/
        
        ordenarLista(lista, cmp);
        //ordenarLista(nombres);
        //lista.sort(c);
        //mostrarLista(nombres);
        listarEmpleados(lista);
                
                
    }
    
    //Burbujeo? 
    public static <T extends Comparable<? super T>> void ordenarLista(List<T> lista){
        for (int i = 0; i < lista.size() - 1; i++) {
            for (int j = i + 1; j < lista.size(); j++) {
                if (lista.get(i).compareTo(lista.get(j)) > 0) { //izq mas grande y lo resto es positivo por ende mayor
                    T aux = lista.get(i);
                    lista.set(i, lista.get(j));
                    lista.set(j, aux);
                }   
            }
        }
    }
    
    public static <T extends Comparable<? super T>> void ordenarLista(List<T> lista, Comparator<T> c){
        for (int i = 0; i < lista.size() - 1; i++) {
            for (int j = i + 1; j < lista.size(); j++) {
                if ( c.compare(lista.get(i), lista.get(j)) > 0) {
                    T aux = lista.get(i);
                    lista.set(i, lista.get(j));
                    lista.set(j, aux);
                }   
            }
        }
    }
    
    public static void cargarEmpleados(List<? super Empleado> lista){
        lista.add(new Empleado(1234, "Juan", 'm', new Date(1, 2, 2020), 34, Sector.CONTABLE, 1000));
        lista.add(new Empleado(2132, "Juana", 'f', new Date(23, 4, 2024), 21, Sector.SISTEMAS, 2000));
        lista.add(new Empleado(3928, "Felisa", 'f', new Date(1, 2, 2023), 21, Sector.CONTABLE, 1450));
        lista.add(new Empleado(2833, "Mario", 'm', new Date(18, 7, 2023), 23, Sector.RRHH, 1700));
        lista.add(new Empleado(9483, "Andrea", 'f', new Date(10, 8, 2022), 25, Sector.SISTEMAS, 1340));
        lista.add(new Empleado(1123, "Joaquin", 'm', new Date(1, 7, 2021), 22, Sector.RRHH, 2300));
        lista.add(new Empleado(5643, "Agustina", 'f', new Date(1, 9, 2020), 27, Sector.LEGALES, 1180));
    }
    
    public static void listarEmpleados(List<? extends Empleado> lista){
        for (Empleado empleado : lista) {
            System.out.println(empleado);
        }
    }
    
    public static void mostrarLista(List<?> objetos){
        for (Object elemento : objetos) {
            System.out.println(elemento);
        }
    }
}
