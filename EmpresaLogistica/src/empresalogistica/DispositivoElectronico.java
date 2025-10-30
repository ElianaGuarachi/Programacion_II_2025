package empresalogistica;

public class DispositivoElectronico {
    
    private String marca;
    private boolean encendido;
    
    public DispositivoElectronico(String marca){
        this.marca = marca;
    }
    
    public boolean estaEncendido(){
        return this.encendido;
    }
    
    public void encender(){
        this.encendido = true;
    }
    
    protected String mensajeEncendido(){
        return "Dispositivo Electronico drone";
    }
    
}
