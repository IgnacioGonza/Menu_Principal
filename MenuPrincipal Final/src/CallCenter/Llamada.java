package CallCenter;
/**
 *
 * @author Guille y Nacho
 */
public class Llamada{
    
    //Variables de instancia
    private int dia;
    private int mes;
    private int tel;
    private int paisdelResidente;
    private String nombreResidente;
    private int motivo;
    private String estado;
    private String aclaracion;
    private Empresa laEmpresa;
    private Operador elOperador;
    private int demora;
    //Constructores
    public Llamada(){
        this.setDia(0);
        this.setMes(0);
        this.setTel(0);
        this.setPaisdelResidente(0);
        this.setNombreResidente("");
        this.setMotivo(0);  
        this.setAclaracion("Sin Definir");
        this.setEstado("Sin Definir");
        this.setDemora(0);
    }
    
    public Llamada(String unNombreResidente, int unDia, int unMes, int unTel, int unMotivo, int unPaisdelResidente,String unaAclaracion,int unaDemora,String unEstado){
        this.setDia(unDia);
        this.setTel(unTel);
        this.setPaisdelResidente(unPaisdelResidente);
        this.setNombreResidente(unNombreResidente);
        this.setMotivo(unMotivo);
        this.setAclaracion(unaAclaracion);
        this.setDemora(unaDemora);
        this.setEstado(unEstado);
        this.setMes(unMes);

    }
    //Modificacion y acceso 
    public void setDia(int undia){
        dia=undia;
    }
    public int getDia(){
        return dia;
    }
    public void setMes(int unmes){
        mes=unmes;
    }
    public int getMes(){
        return mes;
    }
    public void setTel(int untel){
        tel=untel;
    }
    public int getTel(){
        return tel;
    }
    public int getPaisdelResidente(){
        return paisdelResidente;
    }
    public void setPaisdelResidente(int unPaisdelResidente){
        paisdelResidente=unPaisdelResidente;
    }
    public void setNombreResidente(String unNombreResidente){
        nombreResidente=unNombreResidente;
    }
    public String getNombreResidente(){
        return nombreResidente;
    }
    public void setMotivo(int unMotivo){
        motivo=unMotivo;       
    }
    public int getMotivo(){
        return motivo;
    }
    public Empresa getLaEmpresa(){
        return laEmpresa;
    }
    public void setLaEmpresa(Empresa unaEmpresa){
        laEmpresa=unaEmpresa;
    }
    public Operador getElOperador(){
        return elOperador;
    }
    public void setElOperador(Operador unOperador){
        elOperador=unOperador;
    }
    public String getAclaracion(){
        return aclaracion;
    }
    public void setAclaracion(String unaAclaracion){
        aclaracion=unaAclaracion;
    }
    public String getEstado(){
        return estado;
    }
    public void setEstado(String unEstado){
        estado=unEstado;
    }
    public int getDemora(){
        return demora;
    }
    public void setDemora(int unaDemora){
        demora=unaDemora;
    }
     //impresion
    @Override
    public String toString(){
        if(this.getDemora()==0){
         return "La llamada se realizo: "+this.getDia()+"/"+this.getMes()+", Telefono: "+this.getTel()+", Desde el Pais: "+this.getPaisdelResidente()+", A nombre de: "+this.getNombreResidente()+", por el motivo:"+this.getMotivo()+"comentario sobre el motivo: "+this.getAclaracion()+"El estado de la llamada es:"+this.getEstado();
        }
        else{
         return "La Llamada se realizo: "+this.getDia()+"/"+this.getMes()+", Telefono: "+this.getTel()+", Desde el Pais: "+this.getPaisdelResidente()+", A nombre de: "+this.getNombreResidente()+", por el motivo:"+this.getMotivo()+"comentario sobre el motivo: "+this.getAclaracion()+", La llamada tardo en responderse: "+this.getDemora()+"Dias";
       }       
    }
}