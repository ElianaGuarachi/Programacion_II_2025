package guia1;

/**
 Clase Rectángulo: 
- Crea una clase Rectángulo con atributos ancho y alto de tipo double. 
- Implementa métodos para calcular el área y el perímetro del rectángulo. 
- Escribe un método esCuadrado() que devuelva true si el rectángulo es un cuadrado, es decir, si 
ancho y alto son iguales. 
 */
public class Rectangulo {
    
    private double base;
    private double altura;
    
    public Rectangulo(double base, double altura){
        validarMedida(base);
        validarMedida(altura);
        this.altura = altura;
        this.base = base;
    }
    
    private void validarMedida(double medida){
        if(medida <= 0){
            throw new IllegalArgumentException("Medida invalida");
        } 
    }
    
    public double calcularPerimetro(){
        return (this.base + this.altura) * 2;
    }
    
    public double calcularArea(){
        return this.base * this.altura;
    }
    
    public boolean esCuadrado(){
        return this.altura == this.base;
    }
    
    //Forma correcta de POO
    public Rectangulo sumarPerimetroDosRectangulos(Rectangulo nuevoRectangulo){
        return new Rectangulo(this.base + nuevoRectangulo.base, this.altura + nuevoRectangulo.altura);
    }
    
    public static Rectangulo sumarPerimetroDosRectangulos(Rectangulo rec1, Rectangulo rec2){
        return rec1.sumarPerimetroDosRectangulos(rec2);
    }
    
    @Override
    public String toString() {
        return "Base: " + base + ", Altura: " + altura;
    }
}
