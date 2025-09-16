package integrador;

public class TarjetaDebito {
    private EntidadFinanciera entidadFinanciera;
    private final String entidadBancaria;
    private Cliente titular;
    private String numero;
    private double limite;
    
    public TarjetaDebito(EntidadFinanciera entidadFinanciera, String entidadBancaria, Cliente titular, String numero, double limite){
        this.entidadFinanciera = entidadFinanciera;
        this.entidadBancaria = entidadBancaria;
        this.titular = titular;
        this.numero = numero;
        this.limite = limite;
        
    }
    
    public boolean checkLimite(double monto){
        return monto <= limite;
    }
    
    public void informarVenta(double monto){
        if (!checkLimite(monto)) {
            throw new IllegalArgumentException("No tiene limite");
        }
        limite -= monto;
    }
    
    public String getNombreCompletoTitular(){
        return this.titular.nombreCompleto();
    }
    
    
}
