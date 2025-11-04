package ordenamiento321;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ordenamiento321 {

    public static void main(String[] args) {
        
        List<Empleado> lista = new ArrayList<>();
        cargarEmpleados(lista);
                
        Collections.sort(lista);
        
        listarEmpleados(lista);
                
                
    }
    
    public static void cargarEmpleados(List<? super Empleado> lista){
        lista.add(new Empleado(1234, "Juan", 'm', new Date(1, 2, 2020), 34, Sector.Contable, 1000));
        lista.add(new Empleado(2132, "Juana", 'f', new Date(23, 4, 2024), 21, Sector.Sistemas, 2000));
        lista.add(new Empleado(3928, "Felisa", 'f', new Date(1, 2, 2023), 21, Sector.Contable, 1450));
        lista.add(new Empleado(2833, "Mario", 'm', new Date(18, 7, 2023), 23, Sector.RRHH, 1700));
        lista.add(new Empleado(9483, "Andrea", 'f', new Date(10, 8, 2022), 25, Sector.Sistemas, 1340));
        lista.add(new Empleado(1123, "Joaquin", 'm', new Date(1, 7, 2021), 22, Sector.RRHH, 2300));
        lista.add(new Empleado(5643, "Agustina", 'f', new Date(1, 9, 2020), 27, Sector.Legales, 1180));
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
