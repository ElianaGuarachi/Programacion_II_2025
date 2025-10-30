package empresalogistica;

public class DronEntrega extends DispositivoElectronico implements TransportadorPaquete {
    
    public DronEntrega(String marca){
        super(marca);
    }

    @Override
    public void encender() {
        super.encender();
    }

    @Override
    public void transportarPaquetes(String destino) {
        encender();
        System.out.println("Soy un drone, transportando a destino");
    }
    
    @Override
    protected String mensajeEncendido(){
        return "Encendiendo drone";
    }
    
}
