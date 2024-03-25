package CallCenter;
import java.util.*;
/**
 *
 * @author Guille y Nacho
 */
public class OrdenListasFechaDecreciente implements Comparator <Llamada>{
    @Override
    public int compare(Llamada unaLlamada, Llamada otraLlamada){
        int r = otraLlamada.getMes() - unaLlamada.getMes();
        if (r==0){
            r = otraLlamada.getDia() - unaLlamada.getDia();
        }
        return r;
    }
    
}