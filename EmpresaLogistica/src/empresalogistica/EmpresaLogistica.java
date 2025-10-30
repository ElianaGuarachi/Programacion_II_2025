package empresalogistica;

import javax.swing.text.Caret;

/**
 *
 */
public class EmpresaLogistica {

    public static void main(String[] args) {
        
        EmpresaDeLogistica empresa = new EmpresaDeLogistica("Mercado envios");
        
        cargarEmpresa(empresa);
        
        
        
    }
    
    public static void cargarEmpresa(EmpresaDeLogistica e){
        e.agregarTransportador(new CamionReparto("abc123"));
        e.agregarTransportador(new DronEntrega("Acme"));
        e.agregarTransportador(new CamionReparto("Vng898"));
        //e.agregarTransportador(new Delivery("Juancito"));
    }
    
}
