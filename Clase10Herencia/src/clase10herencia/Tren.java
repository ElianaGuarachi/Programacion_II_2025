package clase10herencia;

public class Tren extends VehiculoDeCarga{
    
    private final Combustible tipoCombustible;
    
    public Tren(String patente, String marca, int modelo, double maxCarga, Combustible tipoCombustible){
        super(patente, marca, modelo, maxCarga);
        this.tipoCombustible = tipoCombustible;
    }
    
    @Override
    public double calcularCarga(double nuevaCarga) {
        validarCarga(nuevaCarga);
        return nuevaCarga;
    }
    
    public void sonarSilbato(){
        System.out.println("Chuuuuuuuuuuu");
    }
    
    @Override
    public void acelerar(){
        System.out.println("Tren acelerando");
    }
    
    @Override
    public void frenar(){
        System.out.println("Tren frenando");
    }
    
    @Override
    public String toString(){
        return super.toString() + ". Combustible: " + tipoCombustible;
    }
}
