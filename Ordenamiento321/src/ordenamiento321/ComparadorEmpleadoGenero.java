package ordenamiento321;

import java.util.Comparator;

public class ComparadorEmpleadoGenero implements Comparator<Empleado> {

    @Override
    public int compare(Empleado e1, Empleado e2) {
        return Character.compare(e1.getGenero(), e2.getGenero());
    }
}
