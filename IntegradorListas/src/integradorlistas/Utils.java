package integradorlistas;

public class Utils {
    
    public static String sepHotizontal(int largo){
        return sepHotizontal(largo, '-');
    }
    
    public static String sepHotizontal(int largo, char caracter){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < largo; i++) {
            sb.append(caracter);
        }
        sb.append('\n');
        return sb.toString();
    }
}
