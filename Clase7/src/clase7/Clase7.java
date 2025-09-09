package clase7;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *08/09/2025
 */
public class Clase7 {

    public static void main(String[] args) {
         
        //VECTORES
        Scanner input = new Scanner(System.in);
        
        int numero;
        int TAM = 1;
        int[] numeros = new int[TAM]; //crea inicializados todos en 0
        int dim = 0;
        
        System.out.println("Ingrese un numero positivo o -1 para terminar");
        numero = input.nextInt();
        
        while (dim < TAM && numero != -1) {            
            numeros[dim++] = numero; //dim++ es posincremento, primero usa el valor y luego ++
            System.out.println("Ingrese un numero positivo o -1 para terminar");
            numero = input.nextInt();
        }
        
        for (int i = 0; i < dim; i++) { //dim para la cantidad de elementos que cargue
            System.out.println(numeros[i]);
        }
        
        for (int valor : numeros) { //recorrido en la totalidad
            System.out.println(valor);
        }
        
        //ARRAYLIST

        ArrayList<Integer> lista = new ArrayList();
        
        lista.add(23);
        lista.add(22);
        lista.add(21);
        lista.add(20);
        
        for (Integer valor : lista) {
            System.out.println(valor);
        }
        
        
        
    }
    
}
