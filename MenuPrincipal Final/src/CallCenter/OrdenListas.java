package CallCenter;
import java.util.*;
/**
 *
 * @author Guille y Nacho
 */
public class OrdenListas implements Comparator <Llamada>{
    @Override
    public int compare(Llamada unaLlamada, Llamada otraLlamada){
        int r = unaLlamada.getMes() - otraLlamada.getMes();
        if (r==0){
            r = unaLlamada.getDia() - otraLlamada.getDia();
        }
        return r;
    }
    
}
