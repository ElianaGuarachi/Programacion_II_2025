package clase3;

public class Clase3 {
    
    /*private static void mostrarTelevisor(Televisor tv){
        //JAVA le da un valor por defecto a los variables del objeto, por eso no reclama
        //null solo se puede usar con referencias
        //tv tiene la copia de la referencia de tv1
        System.out.println(tv.marca);
        System.out.println(tv.canal);
        System.out.println(tv.estaEncendido);
        System.out.println(tv.volumen);
    }*/

    public static void main(String[] args) {
       
        //Instancia de Televisor (objeto), guarda espacio en memoria (heap) para la clase. En el stack se guarda la referencia
        Televisor tv1 = new Televisor("Samsung", 55);
        Televisor tv2 = new Televisor("Pilco", 32); 
        
        //mostrarTelevisor(tv1);
        //Ahora muestra los datos desde el objeto televisor
        
        tv1.mostrarInfo();
        
        System.out.println(tv1.getMarca());
        
        System.out.println("---------------------------------------------------------------");
        
        tv2.mostrarInfo();
        
    }
    
}
