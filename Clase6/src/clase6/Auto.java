package clase6;

/**
 *
 * @author DELL
 */
public class Auto {
    
    private String patente;
    private String marca;
    private String color;
    private int modelo;
    private Motor motor; //Si es una composicion no puede estar Motor en null
    
    public Auto(String patente, String marca, String color, int modelo, Motor motor){ 
        this.patente = patente;
        this.marca = marca;
        this.color = color;
        this.modelo = modelo;
        this.motor = motor;
    }
    
    @Override
    public String toString(){
        return "Patente: " + patente + ", Marca: " + marca + ", Color: " + color + ", Modelo: " + modelo + "\n" + motor.toString();
    }
}
