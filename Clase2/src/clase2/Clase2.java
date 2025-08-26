/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase2;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Clase2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // variables
        System.out.println(9 / 2);
        System.out.println(9.0 / 2);
        
        int x = 9;
        System.out.println((float)x / 2);
        
        //castear: convertir un dato numerico a otro numerico
        //parsear: convertir un string a otro
        
        //Tomar datos desde consola
        /*Scanner input = new Scanner(System.in);
        System.out.println("Ingrese su edad: ");
        
        int edad = input.nextInt();
        
        if(edad >= 13 && edad < 18){
            System.out.println("Es un adolescemte");
        }*/
        
        // Funcion de sumar
        int a = 20;
        int b = 30;
        
        System.out.println(sumar(a, b));
        
        Scanner input = new Scanner(System.in);
        int numero = 0;
        while(numero != -1){
            System.out.print("Ingrese un numero positivo o -1 para salir");
            numero = input.nextInt();
        }
        System.out.print("Fin del programa");
    }
    
    static int sumar(int x, int y){
        return x + y;
    }
    
}
