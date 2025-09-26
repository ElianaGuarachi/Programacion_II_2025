package clase10herencia;

public class Moto extends Vehiculo {

    private boolean bloqueada;
    
    public Moto(String patente, String marca, int modelo) {
        super(patente, marca, modelo);
        
    }
    
    public void bloquear() {
        this.bloqueada = true;
        System.out.println("Moto asegurada");
    }
    
    @Override
    public void acelerar(){
        System.out.println("Moto acelerando");
    }
    
    @Override
    public void frenar(){
        System.out.println("Moto frenando");
    }
    
    @Override
    public String toString(){
        return super.toString() + ((bloqueada) ? "Asegurada" : "Desbloqueada");
    }
}
