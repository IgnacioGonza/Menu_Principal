package CallCenter;
/**
 *
 * @author Guille y Nacho
 */
public class Operador{
     //Variables de instancia
    private String nombreOp;
    private String ci;
    //Constructores
    public Operador(){
        this.setCi("");
        this.setNombreOp("");
    }
    
    public Operador(String unNombreOp, String unCi){
        this.setNombreOp(unNombreOp);
        this.setCi(unCi);
    }
    //Modificacion y acceso 
    public void setCi(String unCi){
        ci=unCi;
    }
    public String getCi(){
        return ci;
    }
    public void setNombreOp(String unNombreOp){
        nombreOp=unNombreOp;
    }
    public String getNombreOp(){
        return nombreOp;
    }
    //impresion
    @Override
    public String toString(){
        return "Nombre de Operador: "+this.getNombreOp()+","+"Cedula de identidad: "+this.getCi();
    }
}
