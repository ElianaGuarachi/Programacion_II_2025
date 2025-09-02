package guia1;

/*
 * Clase Círculo: 
    o Define una clase Círculo con un atributo radio de tipo double. 
    o Crea métodos para calcular el área y la circunferencia del círculo. 
    o Implementa un método para escalar el círculo, aumentando o disminuyendo su radio en un 
    porcentaje dado.
 */
public class Circulo {
    
    private double radio;
    private static final double PI = 3.14;
    
    public Circulo(double radio){
        validarMedida(radio);
        this.radio = radio;
    }
    
    private void validarMedida(double medida){
        if(medida <= 0){
            throw new IllegalArgumentException("Medida invalida");
        } 
    }
    
    public double calcularCincurferencia(){
        return 2 * PI * this.radio;
    }
    
    public double calcularArea(){
        return PI * this.radio * this.radio;
    }
    
}
