package CallCenter;
/**
 *
 * @author Guille y Nacho
 */
public class Empresa {
    //Variables de instancia
    private String nombre;
    private String direccion;
    private int pais;
    //Constructores
    public Empresa(){
        this.setPais(0);
        this.setDireccion("");
        this.setNombre("");
    }
    
    public Empresa(String unNombre, String unaDireccion, int unPais){
        this.setDireccion(unaDireccion);
        this.setNombre(unNombre);
        this.setPais(unPais);
    }
    //Modificacion y acceso 
    public void setPais(int unPais){
        pais=unPais;
    }
    public int getPais(){
        return pais;
    }
    public void setDireccion(String unaDireccion){
        direccion=unaDireccion;
    }
    public String getDireccion(){
        return direccion;
    }
    public void setNombre(String unNombre){
        nombre=unNombre;
    }
    public String getNombre(){
        return nombre;
    }
    //impresion
    @Override
    public String toString(){
        return "Nombre de Empresa: "+this.getNombre()+","+"Direccion: "+this.getDireccion()+","+"Pais: "+this.getPais();
    }        
}
    
    
    

