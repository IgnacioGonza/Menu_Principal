package CallCenter;
/**
 *
 * @author Guille y Nacho
 */
public class OperadorJunior extends Operador {
    private boolean EntrenamientoBasico = false;
//Constructores

    public OperadorJunior(){
    }

    public OperadorJunior(String unNombreOp, String unCi,boolean elEntrenamientoBasico) {
        super(unNombreOp, unCi);
        this.EntrenamientoBasico = elEntrenamientoBasico;
    }
 // Get y Set
    public boolean getEntrenamientoBasico() {
        return EntrenamientoBasico;
    }

    public void setEntrenamientoBasico(boolean elEntrenamientoBasico) {
        this.EntrenamientoBasico = elEntrenamientoBasico;
    }
//To String

    @Override
    public String toString() {
        if(this.getEntrenamientoBasico()){
            return super.toString() + "Es Junior "+"Completo el entrenamiento basico";
        }
        else{
            return super.toString() + "Es Junior "+"No Completo el entrenamiento basico";
        }
       
    }
    
 
}
