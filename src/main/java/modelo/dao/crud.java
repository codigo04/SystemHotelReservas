package modelo.dao;

//import java.util.List;

/**
 *
 * @author Francisco
 * @param <T>
 */
public interface crud<T> {
    
    //public List<T> lista();
    
    public T agregar(T t);
    
    public T actualizar(T t);
    
    public boolean eliminar(T t);
    
    public void mostar(T t);
    
}
