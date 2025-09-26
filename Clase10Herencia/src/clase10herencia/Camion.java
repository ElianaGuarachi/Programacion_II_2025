package clase10herencia;

public class Camion extends VehiculoDeCarga {
    
    public Camion(String patente, String marca, int modelo, double maxCarga){
        super(patente, marca, modelo,maxCarga);
    }
    
    @Override
    public double calcularCarga(double nuevaCarga) {
        double cargaFinal = getCarga() + nuevaCarga;
        validarCarga(cargaFinal);
        return cargaFinal;
    }
    
    @Override
    public void acelerar(){
        System.out.println("Camion acelerando");
    }
    
    @Override
    public void frenar(){
        System.out.println("Camion frenando");
    }
    
    @Override
    public String toString(){
        return super.toString();
    }
    
}
