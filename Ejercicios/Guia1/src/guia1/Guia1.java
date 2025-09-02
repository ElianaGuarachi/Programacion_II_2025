package guia1;

public class Guia1 {

    public static void main(String[] args) {
        //EJERCICIO 1
        Rectangulo rec1 = new Rectangulo(4, 6);
        Rectangulo rec2 = new Rectangulo(2, 5);
        System.out.println("Area: " + rec1.calcularArea());
        System.out.println("Perimetro: " + rec1.calcularPerimetro());
        System.out.println("Es cuadrado?: " + rec1.esCuadrado());

        //POO, que un objeto de instancia se sume con otro de instancia
        Rectangulo rec3 = rec1.sumarPerimetroDosRectangulos(rec2); 
        System.out.println("Nuevo rectangulo: " + rec3.calcularPerimetro());
        
        System.out.println("---------------------------------------------------------------------------");
        String x = rec1.toString();
        System.out.println(x);
        System.out.println(rec1);
        
        //EJERCICIO 2
        /*Circulo c1 = new Circulo(5);
        System.out.println("Circunferencia: " + c1.calcularCincurferencia());
        System.out.println("Area de circulo: " + c1.calcularArea());*/
        
    }
    
}
