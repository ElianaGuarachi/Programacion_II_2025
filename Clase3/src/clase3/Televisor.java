package clase3;

public class Televisor {
    
    //Todos los objetos que existen heredan la clase object, es el que consigue espacio en memoria por ejemplo
    
    private String marca;
    private double tamanio;
    private int canal;
    private int volumen;
    private boolean estaEncendido;
    
    //El contructor no tiene retorno
    public Televisor(String marca, double tamanio){
        this.marca = marca;
        this.tamanio = tamanio;
    }
    
    public void mostrarInfo(){
        System.out.println(marca);
        System.out.println(canal);
        System.out.println(estaEncendido);
        System.out.println(volumen);
        System.out.println(tamanio);
    }
    
    public String getMarca(){
        return this.marca;
    }
}
