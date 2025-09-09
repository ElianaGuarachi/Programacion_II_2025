/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase7;

/**
 *
 * @author DELL
 */
public class Impresora {
    
    private boolean online;
    
    public void setOnline(){
        online = true;
    }
    
    private void validarOnline(){
        if(!online){
            throw new IllegalStateException("Impresora offline");
        }
    }
    
    public void imprimir(Documento doc){
        validarOnline();
        System.out.println(doc.getTitulo());
        System.out.println(doc.getCuerpo());
    }
    
    public Documento escanear(){
        validarOnline();
        return new Documento("Titulo escaneado", "Cuerpo del documento escaneado");
    }
    
    public void copiar(){
        imprimir(escanear());
    }
    
}
