/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ordenamiento321;

import java.util.Comparator;

/**
 *
 * @author DELL
 */
public class ComparadorGeneroSueldo implements Comparator<Empleado> {

    @Override
    public int compare(Empleado e1, Empleado e2) {
        int cmp = Character.compare(e1.getGenero(), e2.getGenero());
        if (cmp == 0) {
            cmp = Double.compare(e1.getSueldo(), e2.getSueldo());
        }
        return cmp;
    }
}
