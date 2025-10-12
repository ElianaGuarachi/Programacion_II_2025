
package claseinterfaces;

public class Mosquito extends InsectoVolador implements Volador{

    private int diasVividos;
    private char genero;
    private boolean tengoDengue;
    
    public Mosquito(String especie, int diasVividos, char genero) {
        super(especie);
        this.diasVividos = diasVividos;
        this.genero = genero;
    }
    
    public void volar(){
        System.out.println("Soy un mosquito y vuelo");
    }
    
    public void picar(){
        if (tengoDengue) {
            System.out.println("Estas al horno");
        } else {
            System.out.println("Mira que te pico...");
        }
    }
    
    public void zumbar(){
        System.out.println("bbzzzzz");
    }
    
    public boolean conDengue(){
        return tengoDengue;
    }
    
}
