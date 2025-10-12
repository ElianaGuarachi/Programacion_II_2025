package claseinterfaces;


public class Avion implements Volador {

    private String marca;
    private String matricula;
    private int cantPasajeros;
    private int horasVuelos;
    
    public Avion(String marca, String matricula, int cantPasajeros, int horasVuelos) {
        this.marca = marca;
        this.matricula = matricula;
        this.cantPasajeros = cantPasajeros;
        this.horasVuelos = horasVuelos;
    }
    
    public void volar(){
        
        System.out.println("Soy un avion y vuelo");
       
    }
    
    public int getPasajeros(){
        return cantPasajeros;
    }
    
    public String getMarca(){
        return marca;
    }
    
    public void realizarMantenimiento(){
        if (horasVuelos > 4000) {
            System.out.println("En mantenimiento");
        } else {
            System.out.println("No hace falta hacer mantenimiento");
        }
    }
    
    
}
