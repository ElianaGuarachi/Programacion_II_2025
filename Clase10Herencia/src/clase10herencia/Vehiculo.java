

package clase10herencia;

import java.util.Objects;

public abstract class Vehiculo {

    private String patente;
    private String marca;
    private int modelo;
    
    public Vehiculo(String patente, String marca, int modelo) {
        //Se termino de construir el vehiculo y luego inicializara (espacio de memoria en el heap)
        this.patente = patente;
        this.marca = marca;
        this.modelo = modelo;
    }
    
    public String getPatente(){
       return patente;
    }
    
    public String getMarca(){
       return this.marca;
    }
      
    public int getModelo(){
       return this.modelo;
    }
    
    public abstract void acelerar();
    public abstract void frenar();
    
    @Override
    public boolean equals(Object o){
       if (o == null || !(o instanceof Vehiculo vehiculo)) {
           return false;
       }
   
       return patente.equals(vehiculo.patente) && marca.equals(vehiculo.marca) && modelo == vehiculo.modelo;
    }
    
    @Override
    public int hashCode(){
        return Objects.hash(patente, marca, modelo);
    }
    
    public boolean tienePatente(String patente){
       return getPatente().equals(patente);
    }
    
    @Override
    public String toString(){
        return nombreClase() + " = " + "patente=" + patente + ", marca=" + marca + ", modelo=" + modelo;
    }
    
    protected String nombreClase(){
        return getClass().getName().split("\\.")[1];
    }
}
