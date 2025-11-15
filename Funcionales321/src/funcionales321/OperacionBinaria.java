package funcionales321;

@FunctionalInterface
public interface OperacionBinaria<T, R> {
    
    R operar(T o1, T o2);
    
}
