package integrador;

public class Ticket {
    
    private final String cliente;
    private final double total;
    private final int cuotas;
    
    public Ticket(String cliente, double total, int cuotas){
        validarCuota(cuotas);
        this.cliente = cliente;
        this.total = total;
        this.cuotas = cuotas;
    }
    
    private void validarCuota(int cuotas){
        if (cuotas <= 0) {
            throw new IllegalArgumentException("Cuota invalida");
        }
    }
    
    private double montoCuota(){
        return total / cuotas;
    }
    
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Cliente: ");
        sb.append(cliente);
        sb.append("\n");
        sb.append("Total: $%.2f".formatted(total));
        sb.append("\n");
        sb.append("Monto cuota: $%.2f".formatted(montoCuota()));
        return sb.toString();
    }
}
