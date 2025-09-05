package clase4;

/**
 *
 * 04/09/2025
 * Ejemplo de agregacion
 * Los ciclos de vida de ambos no estan atados
 */
public class ControlRemoto {
    
    private Televisor tv;
    
    public ControlRemoto(){
        
    }
    
    public void setTv(Televisor tv){
        this.tv = tv;
    }
    
    public void validarTv(){
        if(tv == null){
            throw new NullPointerException("No instancia una tele");
        } 
    }
    
    public void encender(){
        if(this.tv != null){
            tv.power();
        }
    }
    
    public void subirCanal(){
        if(this.tv != null){
            tv.subirCanal();
        }
    }
    
}
