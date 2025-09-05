package clase4;

//Clase Televisor mas robusto

public class Televisor {
    
    //Todos los objetos que existen heredan la clase object, es el que consigue espacio en memoria por ejemplo
    //Los metodos estaticos de clase (no crean instancias) no pueden trabajar con los metodos de instancia
    
    private final String marca;
    private double tamanio;
    private final int nroSerie;
    private int canal; //Como atributo de la clase, ya esta inicializado en 0
    private int volumen;
    private boolean estaEncendido;
    private boolean mute;
    
    //static: disponible desde la clase, sin instanciar uno.
    //Todo lo que es estatico existe antes de crear un objeto
    private final static int MAX_CANAL = 99; //constante universal para todos los objetos Televisor
    private final static int MIN_CANAL = 1; //constante universal para todos los objetos Televisor
    private final static int MAX_VOLUMEN = 10;
    private final static int MIN_VOLUMEN = 1;
    private final static int INITIAL_SERIE = 100000;
    private static int nextSerie = INITIAL_SERIE;
    
    //El contructor no tiene retorno
    //El constructor primero reserva espacio en memoria, luego inicializa las variables
    public Televisor(String marca, double tamanio){
        validarTamanio(tamanio);
        this.tamanio = tamanio;
        this.marca = marca;
        this.nroSerie = getAndIncrementNextSerie();
    }
    
    private static int getAndIncrementNextSerie(){
        return nextSerie++;
    }
    
    public void power(){
        estaEncendido = !estaEncendido;
        System.out.println(estaEncendido ? "Encendido" : "Apagado");
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
    
    private void validarCanal(int canalIngresado){
        if(canalIngresado < MIN_CANAL || canalIngresado > MAX_CANAL){
            throw new IllegalStateException("Canal invalido");
        } 
    }
    
    public void mostrarInfo(){
        System.out.println(marca);
        System.out.println(canal);
        System.out.println(estaEncendido);
        System.out.println(volumen);
        System.out.println(tamanio);
        System.out.println(nroSerie);
    }
    
    public String getMarca(){
        return this.marca;
    }
    
    public void mostrarCanal(){
        System.out.println("Canal: " + canal);
    }
    
    private void mostrarVolumen(){
        System.out.println((mute) ? "Mute" : "Volumen: " + volumen);
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
        
        if(mute){
            mute = !mute;
        }
    }
    
    public void bajarVolumen(){
        if (volumen > MIN_VOLUMEN) {
            volumen--;
        }
        if (volumen == MIN_VOLUMEN) {
            mute = true;
        }
    }
    
    public void mutear() {
        validarEncendido();
        if (volumen > 0) {
            mute = !mute;
        }
    }
    
    public void setearCanal(int canal){
        validarEncendido();
        validarCanal(canal);
        this.canal = canal;
    }
}
