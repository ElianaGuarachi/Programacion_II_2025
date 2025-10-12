/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package claseinterfaces;

/**
 *
 * @author DELL
 */
public abstract class InsectoVolador {

    private String especie;
    
    public InsectoVolador(String especie) {
        this.especie = especie;
    }
  
    public abstract void volar();
}
