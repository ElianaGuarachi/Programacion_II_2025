package halloween;

public class Espectro extends Criatura implements Aterrable {
    
    private final int nivelEspectral;

    public Espectro(String nombre, int energia, int nivelEspectral) {
        super(nombre, energia);
        this.nivelEspectral = nivelEspectral;
    }
    
    public void materializar(){
        System.out.println("Materializar");
    }
    
    @Override
    public void recargarEnergia(int energia){
        super.recargarEnergia(energia * 2);
    }

    @Override
    public String toString() {
        return "Espectro{" + "nivelEspectral=" + nivelEspectral + '}';
    }
    
    @Override
    public void aterrar() {
        System.out.println("Aterrar");
    }

    
    
}
