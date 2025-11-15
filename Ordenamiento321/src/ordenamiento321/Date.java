package ordenamiento321;

public class Date {
    
    private final int dia;
    private final int mes;
    private final int anio;
    private static String format = "%02d/%02d/%d";

    public Date(int dia, int mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }

    @Override
    public String toString() {
        return format.formatted(dia, mes , anio);
    }
    
    
    public int compareTo(Date d) {

        return 0;
    }
}
