package clase10herencia;

public abstract class VehiculoDeCarga extends Vehiculo {
    private double carga;
    private final double maxCarga; //no se modifica
    
    public VehiculoDeCarga(String patente, String marca, int modelo, double maxCarga){
        super(patente, marca, modelo);
        this.maxCarga = maxCarga;
    }
    
    public double getCarga(){
        return carga;
    }
    
    public double getMaxCarga(){
        return carga;
    }
    
    public void cargar(double carga) {
        validarCargaNegativa(carga);
        this.carga = calcularCarga(carga);
        System.out.println(nombreClase() + " cargado");
    }
    
    protected abstract double calcularCarga(double carga);
    
    protected void validarCarga(double carga){
        if (carga > this.maxCarga) {
            throw new IllegalArgumentException("Carga excedida");
        }
    }
    
    private void validarCargaNegativa(double carga){
        if (carga < 0) {
            throw new IllegalArgumentException("Carga negativa");
        }
    }
    
    @Override
    public String toString(){
        return super.toString() + ". Carga maxima: " + maxCarga + ". Peso actual: " + carga;
    }
}
