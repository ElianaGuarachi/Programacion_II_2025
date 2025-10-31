/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bolillero321;

/**
 *
 * @author DELL
 */
public class FormulaUno {
    
    private final String piloto;
    private final Escuderia escuderia;

    public FormulaUno(String piloto, Escuderia escuderia) {
        this.piloto = piloto;
        this.escuderia = escuderia;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FormulaUno{");
        sb.append("piloto=").append(piloto);
        sb.append(", escuderia=").append(escuderia);
        sb.append('}');
        return sb.toString();
    }
    
}
