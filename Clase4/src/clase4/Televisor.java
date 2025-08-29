package clase4;

//Clase Televisor mas robusto

public class Televisor {
    
    //Todos los objetos que existen heredan la clase object, es el que consigue espacio en memoria por ejemplo
    
    private final String marca;
    private double tamanio;
    private int canal; //Como atributo de la clase, ya esta inicializado en 0
    private int volumen;
    private boolean estaEncendido;
    private boolean mute;
    
    //static: disponible desde la clase, sin instanciar uno
    private final static int MAX_CANAL = 99; //constante universal para todos los objetos Televisor
    private final static int MIN_CANAL = 1; //constante universal para todos los objetos Televisor
    private final static int MAX_VOLUMEN = 10;
    private final static int MIN_VOLUMEN = 1;
    
    //El contructor no tiene retorno
    //El constructor primero reserva espacio en memoria, luego inicializa las variables
    public Televisor(String marca, double tamanio){
        validarTamanio(tamanio);
        this.tamanio = tamanio;
        this.marca = marca;
    }
    
    public void power(){
        estaEncendido = !estaEncendido;
    }
    
    private void validarTamanio(double tamanio){
        if(tamanio <= 0){
            throw new IllegalArgumentException("Tamanio invalido");
        } 
    }
    
    private void validarEncendido(){
        if(!estaEncendido){
            throw new IllegalStateException("Televisor apagado");
        } 
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
    
    public void mostrarCanal(){
        System.out.println("Canal: " + canal);
    }
    
    public void mostrarVolumen(){
        System.out.println("Volumen: " + volumen);
    }
    
    public void subirCanal(){
        validarEncendido();
        if(canal < MAX_CANAL){
            canal++;
        } else {
            canal = MIN_CANAL;
        }
        mostrarCanal();
    }
    
    public void bajarCanal(){
        validarEncendido();
        if(canal > MIN_CANAL){
            canal--;
        } else {
            canal = MAX_CANAL;
        }
        mostrarCanal();
    }
    
    public void subirVolumen(){
        validarEncendido();
        if(volumen < MAX_VOLUMEN){
            volumen++;
        }
        mostrarVolumen();
    }
    
    public void bajarVolumen(){
        //PENSAR
    }
    
    public void setearCanal(){
        //PENSAR
    }
}
