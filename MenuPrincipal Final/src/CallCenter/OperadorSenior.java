package CallCenter;

/**
 *
 * @author Guille y Nacho
 */
public class OperadorSenior extends Operador{
    private int AñosDeExp;
//Constructores
    public OperadorSenior() {
    }

    public OperadorSenior(String unNombreOp, String unCi, int losAñosDeExp) {
        super(unNombreOp, unCi);
        this.AñosDeExp = losAñosDeExp;
    }
//Gets y sets

    public int getAñosDeExp() {
        return AñosDeExp;
    }

    public void setAñosDeExp(int losAñosDeExp) {
        this.AñosDeExp = losAñosDeExp;
    }
//To String
    @Override
    public String toString() {
        return super.toString() + "Es Senior y tiene "+AñosDeExp+" años de experiencia ";
    }
    
}
