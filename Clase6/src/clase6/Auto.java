package clase6;

/**
 *
 * @author DELL
 */
public class Auto {
    
    private String patente;
    private String marca;
    private Color color;
    private int modelo;
    private Motor motor; //Si es una composicion no puede estar Motor en null
    
    public Auto(String patente, String marca, Color color, int modelo, Motor motor){ 
        this.patente = patente;
        this.marca = marca;
        this.color = color;
        this.modelo = modelo;
        this.motor = motor;
    }
    
    public void acelerar(){
        motor.acelerar();
    }
    
    @Override
    public String toString(){
        return "Patente: " + patente + ", Marca: " + marca + ", Color: " + color + ", Modelo: " + modelo + "\n" + motor.toString();
    }
}
