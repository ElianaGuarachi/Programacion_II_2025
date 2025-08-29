package clase4;

public class Clase4 {
    /*
        APUNTES
        Las varibales primitivas se pasan por valor.
        Los objetos pasan la direccion de memoria.
    */
    

    //Todos los valores del metodo se cargan en el stack, se usan y luego desaparecen (se desapilan)
    /*public static void duplicar(int numero){ //parametro
        numero = numero * 2;
        System.out.println("Dentro de duplicar: " + numero);
    }*/
    
    //Se llama a la funcion, se suma en el stack, se crea un objeto Caja con la direccion de memoria del objeto
    public static void duplicar(Caja numero){
        numero.numero = numero.numero * 2; //va a la direccion de memoria, se fija la variable numero, agarra el 10 y lo duplica, luego lo asigna a la misma variable
        System.out.println("Dentro de duplicar: " + numero.numero);
        
        //El proceso termina, vuelve a main pero se borra del stack
    }

    public static void main(String[] args) {
        //int numero = 10; //int es variable primitiva
        
        //Objeto de la clase Caja
        Caja numero = new Caja();
        numero.numero = 10; //variable numero del objeto numero, donde se guarda la direccion de memoria
        
        System.out.println("Antes de duplicar: " + numero.numero);
        
        duplicar(numero); //argumento
        
        System.out.println("---------------------------------------------------------------");
        
        System.out.println("Despues de duplicar: " + numero.numero);
        
        System.out.println("------------------------------------------------------------------------------------------");
        
        try {
            Televisor tv1 = new Televisor("Samsung", 55);
            tv1.power();
            tv1.bajarCanal();
            /*for(int i = 0; i < 100; i++){
                tv1.subirCanal();
            }*/
        }
        catch(IllegalArgumentException ex){
            System.out.println(ex.getMessage());
        }
        
        
        
    }
    
}
