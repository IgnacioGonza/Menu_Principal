package CallCenter;

import java.util.ArrayList;
/**
 *
 * @author Guille y Nacho
 */
public class Sistema {
private ArrayList<OperadorSenior> listaDeOperadoresSenior;
private ArrayList<OperadorJunior> listaDeOperadoresJunior;
private ArrayList<Empresa> listaDeEmpresas; 
private ArrayList<Llamada> listaDeLlamadasResueltas; 
private ArrayList<Llamada> listaDeLlamadasPendientes; 
private int[] motivos;


public Sistema() {
    listaDeOperadoresSenior=new ArrayList<OperadorSenior>();
    listaDeOperadoresJunior=new ArrayList<OperadorJunior>();
    listaDeEmpresas=new ArrayList<Empresa>();
    listaDeLlamadasResueltas=new ArrayList<Llamada>();
    listaDeLlamadasPendientes=new ArrayList<Llamada>();
    motivos=new int[6];
}

public ArrayList<Llamada> getListaDeLlamadasResueltas(){
    return listaDeLlamadasResueltas;
}
public ArrayList<Llamada> getListaDeLlamadasPendientes(){
    return listaDeLlamadasPendientes;
}
public ArrayList<Empresa> getListaDeEmpresas(){
    return listaDeEmpresas;
}
public ArrayList<OperadorJunior> getListaDeOperadoresJunior() {
    return listaDeOperadoresJunior;
    
}
public ArrayList<OperadorSenior> getListaDeOperadoresSenior(){
    return listaDeOperadoresSenior;
}
public int[] getMotivos(){
    return motivos;
}
    
    
}
