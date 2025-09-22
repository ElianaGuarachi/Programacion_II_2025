package clase10herencia;

public class Moto extends Vehiculo {

    private boolean bloqueada;
    
    public Moto(String patente, String marca, int modelo) {
        super(patente, marca, modelo);
        this.bloqueada = true;
    }
    
}
