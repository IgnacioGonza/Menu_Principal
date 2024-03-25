package CallCenter;

import java.util.*;
/**
 *
 * @author Guille y Nacho
 */
public class Prueba {
        public static void main(String[] args) {
                Sistema s1= new Sistema();
                Scanner lector = new Scanner(System.in);         
                int opcion1;
                int opcion2;
                int valor;
                boolean i=true;
                while(i==true){
                boolean repetir=true;
                boolean repetir2=true;
                boolean repetir3=true;
                    while(repetir){
                    System.out.println("Menu Principal");
                    System.out.println("");
                    System.out.println("1)Ingresar al rol Gerencial");
                    System.out.println("2)Ingresar al rol Administrativo");
                    System.out.println("3)Salir");
                    try{            
                    valor = lector.nextInt();
                    System.out.println("---------------------------------------------");                       
                    switch(valor){
                        case(1):{                    
                        System.out.println("Dentro de Rol Gerencial");
                        System.out.println("");
                        System.out.println("1)Registrar Empresa");
                        System.out.println("2)Registrar Operador Junior");
                        System.out.println("3)Registrar Operador Senior");
                        System.out.println("4)Obetener Listado de Pendientes");
                        System.out.println("5)Obetener Estadisticas");
                        System.out.println("6)Volver al Menu Principal");
                        while(repetir2){
                        try{
                        opcion1 = lector.nextInt();
                        System.out.println("---------------------------------------------");
                        switch(opcion1){
                            case(1):{
                                Prueba.agregarEmpresa(s1);
                                System.out.println("---------------------------------------------");
                                break;
                            }
                            case(2):{
                                Prueba.agregarOperadorJunior(s1);                       
                                System.out.println("---------------------------------------------");                        
                                break;
                                }
                            case(3):{
                                Prueba.agregarOperadorSenior(s1);
                                System.out.println("---------------------------------------------");
                                break;
                            }                    
                            case(4):{
                                Prueba.mostrarLlamadasPendientes(s1);
                                System.out.println("---------------------------------------------");
                                break;
                            }
                            case(5):{
                                Prueba.estadisticaMotivos(s1);
                                System.out.println("---------------------------------------------");
                                break;
                            }
                            case(6):{
                                break;
                            }                    
                        }
                                        }
                        catch(InputMismatchException e){
                            System.out.println("Dato Erroneo, por favor ingrese un numero para entrar a la opcion con el numero indicado en el menu");
                           lector.next();
                        }
                        break;
                        }
                        break;

                        }
                        case(2):{
                        System.out.println("Dentro de Rol Administrativo");
                        System.out.println("");
                        System.out.println("1)Registrar llamadas");
                        System.out.println("2)Devolucion de Llamada");
                        System.out.println("3)Listado de todas las llamadas recibidas");
                        System.out.println("4)Listado de llamadas devueltas");
                        System.out.println("5)Volver al menu principal");
                        while(repetir3){
                          try{
                            opcion2=lector.nextInt();

                            System.out.println("---------------------------------------------");
                            switch(opcion2){

                             case(1):{
                                Prueba.agregarLlamada(s1);
                                System.out.println("---------------------------------------------");
                                break;
                             }
                             case(2):{
                                Prueba.devolucionLlamadas(s1);
                                break;
                             }
                             case(3):{
                                Prueba.llamadasRecibidas(s1);
                                break;
                             }
                             case(4):{
                                Prueba.mostrarLlamadasDevueltas(s1);
                                break;
                             }
                             case(5):{
                                break;
                             }                    
                            }
                                }catch(InputMismatchException e){
                              System.out.println("Dato Erroneo, por favor ingrese un numero para entrar a la opcion con el numero indicado en el menu");
                               lector.next();
                           }
                          break;
                       }
                            break;

                        }
                        case(3):{
                        System.out.println("Gracias por usar nuestro Servicio");    
                        i=false;
                        break;
                    }




                }
                    break; 
                }
                catch(InputMismatchException e){ 
                    System.out.println("Dato Erroneo, por favor ingrese un numero para entrar a la opcion con el numero indicado en el menu");
                    lector.next();
                }  
            }


            }
        }
        //Metodo para agregar un operador senior    
        public static void agregarOperadorSenior(Sistema unSistema){
            boolean registrar=false;
            boolean ok=false;
            boolean error=true;
            int dato=0;
            OperadorSenior unOperador = new OperadorSenior();
            Scanner lector = new Scanner(System.in);
            Prueba.ValidacionCedula(unOperador);
            try{
                for(int i=0;i<unSistema.getListaDeOperadoresSenior().size();i++){
                    if(unSistema.getListaDeOperadoresSenior().get(i).getCi().equals(unOperador.getCi())){
                        System.out.println("Operador ya registrado");
                    }
            }
            }catch(IndexOutOfBoundsException e){ 
            }
            try{
                for(int i=0;i<unSistema.getListaDeOperadoresJunior().size();i++){
                    if(unSistema.getListaDeOperadoresJunior().get(i).getCi().equals(unOperador.getCi())){
                    System.out.println("Operador ya registrado");
                    registrar=true;
                    }
            }
            }catch(IndexOutOfBoundsException e){ 
            }    
            if(registrar==false){
                System.out.println("Introduzca el nombre del operador");
                unOperador.setNombreOp(lector.nextLine());
                if(unOperador.getNombreOp().equals("")){
                    unOperador.setNombreOp(lector.nextLine());
                }
                while(!ok){
                    try{
                        System.out.println("Cuantos años de experiencia tienes?");
                        dato=lector.nextInt();
                        unOperador.setAñosDeExp(dato);
                        ok=true;

                    }catch(InputMismatchException e){
                        System.out.println("Introduzca un numero entero");
                        lector.next();
                    }
                }
            unSistema.getListaDeOperadoresSenior().add(unOperador);
            System.out.println(unOperador);
            }


        }
        //Metodo para agregar un operador junior
        public static void agregarOperadorJunior(Sistema unSistema){
            boolean registrar=false;
            OperadorJunior unOperador = new OperadorJunior();
            Scanner lector = new Scanner(System.in);
            Prueba.ValidacionCedula(unOperador);
            try{
            for(int i=0;i<unSistema.getListaDeOperadoresSenior().size();i++){
                if(unSistema.getListaDeOperadoresSenior().get(i).getCi().equals(unOperador.getCi())){
                System.out.println("Operador ya registrado");   
                }
            }
            }catch(IndexOutOfBoundsException e){      
            }
            try{
                for(int i=0;i<unSistema.getListaDeOperadoresJunior().size();i++){
                    if(unSistema.getListaDeOperadoresJunior().get(i).getCi().equals(unOperador.getCi())){
                        System.out.println("Operador ya registrado");
                        registrar=true;    
                    }
            }
            }catch(IndexOutOfBoundsException e){        
            }
          if(registrar==false){
            System.out.println("Introduzca el nombre del operador");
            unOperador.setNombreOp(lector.nextLine());
            if(unOperador.getNombreOp().equals("")){
                unOperador.setNombreOp(lector.nextLine());
            }
            System.out.println("Cumplio el entrenamiento basico? (s-n)");
            boolean cumple =false;
            String entrenamiento="";
            while(cumple==false){ 
                entrenamiento=lector.next();

                if(entrenamiento.equalsIgnoreCase("s")){
                    unOperador.setEntrenamientoBasico(true);
                    cumple=true;
                }
                if(entrenamiento.equalsIgnoreCase("n")){
                    unOperador.setEntrenamientoBasico(false);
                    cumple=true;
                }
                if(!entrenamiento.equalsIgnoreCase("s") || !entrenamiento.equalsIgnoreCase("n")){
                   System.out.println("La Respuesta debe de ser S para Si o N para No");
                }
            }
            unSistema.getListaDeOperadoresJunior().add(unOperador);
            System.out.println(unOperador);
          }

          }
        //Metodo para agregar una Empresa
        public static void agregarEmpresa(Sistema unSistema){
            boolean registrar=false;
            boolean ok=false;
            Scanner lector = new Scanner(System.in);
            Empresa unaEmpresa = new Empresa();
            System.out.println("Introduzca el nombre de la empresa");   
            unaEmpresa.setNombre(lector.nextLine());
            for(int i=0;i<unSistema.getListaDeEmpresas().size();i++){
               if(unSistema.getListaDeEmpresas().get(i).getNombre().equals(unaEmpresa.getNombre())){
               System.out.println("Empresa ya registrada");
               registrar=true;
               }
            }
            if(registrar==false){    
                System.out.println("Introduzca la direccion de la empresa");
                unaEmpresa.setDireccion(lector.nextLine());
                Prueba.ValidacionPais(unaEmpresa);
                ok=true;
                System.out.println(unaEmpresa);
                unSistema.getListaDeEmpresas().add(unaEmpresa);
            }
        }
        //Metodo para agregar una Llamada
        public static void agregarLlamada(Sistema unSistema){
            boolean ok=false;
            Llamada unaLlamada = new Llamada();
            Scanner lector = new Scanner(System.in);
            System.out.println("Registro de Llamada");
            System.out.println("---------------------------------------------");
            System.out.println("Elija una Empresa");
            Prueba.mostrarListaDeEmpresas(unSistema);
            if(!unSistema.getListaDeEmpresas().isEmpty()){
                unaLlamada.setLaEmpresa(unSistema.getListaDeEmpresas().get(lector.nextInt()));
                System.out.println("Desea ser atendido por un Operador Senior o Junior?");
                Prueba.eleccionOperador(unaLlamada,unSistema);
            }
            else{
               System.out.println("Registre una Empresa y vuelta a intentarlo");
            }   
        }
        //Metodo Devolucion de llamada
        public static void devolucionLlamadas(Sistema unSistema){
            Scanner lector=new Scanner(System.in);
            Operador unOperador=new Operador();
            Llamada unaLlamada=new Llamada();
            boolean ok=true;
            int r;
            if(!unSistema.getListaDeOperadoresSenior().isEmpty()){
                System.out.println("---------------------------------------------");
                System.out.println("Lista De Operadores Senior");
                System.out.println("---------------------------------------------");    
                Prueba.mostrarListaDeOperadoresSenior(unSistema);
                System.out.println("Seleccione el Operador Senior");
                unOperador=unSistema.getListaDeOperadoresSenior().get(lector.nextInt());
                System.out.println("---------------------------------------------");    
                System.out.println("Lista de llamadas pendientes");
                if(!unSistema.getListaDeLlamadasPendientes().isEmpty()){
                for(int i=0;i<unSistema.getListaDeLlamadasPendientes().size();i++){
                    System.out.println(i+")"+unSistema.getListaDeLlamadasPendientes().get(i));
                }
                System.out.println("Seleccione la llamada pendiente que desea devolver");
                r=lector.nextInt();
                unaLlamada=unSistema.getListaDeLlamadasPendientes().get(r);
                unaLlamada.setElOperador(unOperador);
                unaLlamada.setEstado("Resuelto con demora");
                System.out.println("Cuantos dias estuvo la llamada en demora?");
                ok=false;
                while(!ok){
                    try{    
                        unaLlamada.setDemora(lector.nextInt());
                        ok=true;
                    }catch(InputMismatchException e){
                       System.out.println("Introduzca un numero por favor.");
                       lector.next();
                    }
                }
                unSistema.getListaDeLlamadasResueltas().add(unaLlamada);
                unSistema.getListaDeLlamadasPendientes().remove(r);
            }
                else{
                    System.out.println("No se registraron llamadas pendientes, registrelas y vuelva a intentar.");
                }   
            }    
            else{
              System.out.println("No hay operadores senior registrados, por favor registre uno e intente nuevamente.");
            }
        }
        //Metodo Llamadas Recibidas
        public static void llamadasRecibidas(Sistema unSistema){
            ArrayList<Llamada> llamadasRecibidas=new ArrayList<Llamada>();
            for(int i=0;i<unSistema.getListaDeLlamadasPendientes().size();i++){
                Llamada h=unSistema.getListaDeLlamadasPendientes().get(i);
                llamadasRecibidas.add(h);
            }
            for(int i=0;i<unSistema.getListaDeLlamadasResueltas().size();i++){
                Llamada h=unSistema.getListaDeLlamadasResueltas().get(i);
                llamadasRecibidas.add(h);
            }
            if(!llamadasRecibidas.isEmpty()){
                Collections.sort(llamadasRecibidas, new OrdenListas());
                for(int i=0;i<llamadasRecibidas.size();i++){
                    System.out.println(llamadasRecibidas.get(i));
            }
            }
            else{
                System.out.println("No hay llamadas registradas, registralas y vuelva a intentar.");
            }
            
        }
        //Metodo Acumulacion de Motivos
        public static void pedirMotivos(Llamada unaLlamada,Sistema unSistema){
            Scanner lector = new Scanner(System.in);
            boolean ok=false;
            System.out.println("Motivo 1-5");
            System.out.println("1) queja de producto");
            System.out.println("2) consulta de uso de producto");
            System.out.println("3) reclamo de garantía");
            System.out.println("4) consulta de precio de artículo");
            System.out.println("5) otro");
            Prueba.ValidacionMotivo(unaLlamada);
            unSistema.getMotivos()[unaLlamada.getMotivo()]++;
            System.out.println("Texto Aclaratorio sobre el motivo");
            unaLlamada.setAclaracion(lector.nextLine());
            if(unaLlamada.getAclaracion().equals("")){
                unaLlamada.setAclaracion(lector.nextLine());
            }
        }
        //Metodo que nos da una estadistica sobre los motivos de las llamadas
        public static void estadisticaMotivos(Sistema unSistema){
            System.out.println("1) queja de producto");
            System.out.println("2) consulta de uso de producto");
            System.out.println("3) reclamo de garantía");
            System.out.println("4) consulta de precio de artículo");
            System.out.println("5) otro");
            int max=0;
            for(int i=1;i<unSistema.getMotivos().length;i++){
                if(max<unSistema.getMotivos()[i]){
                    max=unSistema.getMotivos()[i];
                }     
                System.out.println("Llamadas por motivo("+i+"): "+ unSistema.getMotivos()[i]);
            } 
            System.out.println("Motivo/s mas Frecuentes");
            for(int i=1;i<unSistema.getMotivos().length;i++){
                if(max==unSistema.getMotivos()[i]){
                    System.out.println(i);
                }
                if(max==0){
                    System.out.println("Aun no se registraron llamadas");
                }
            }    
        }
        //Metodo Elegir Senior o Junior
        public static void eleccionOperador(Llamada unaLlamada,Sistema unSistema){
            String Elegir="";
            Scanner lector = new Scanner(System.in);
            boolean cumple=false;
            while(cumple!=true){
                Elegir=lector.nextLine();
                if(!Elegir.equalsIgnoreCase("Senior")||!Elegir.equalsIgnoreCase("Junior")){
                    cumple=false;
                    System.out.println("La Respuesta debe ser Senior o Junior");
                }
                if(Elegir.equalsIgnoreCase("Senior")){
                    if(!unSistema.getListaDeOperadoresSenior().isEmpty()){                           
                    Prueba.mostrarListaDeOperadoresSenior(unSistema);
                    System.out.println("Elija su operador senior");
                    unaLlamada.setElOperador(unSistema.getListaDeOperadoresSenior().get(lector.nextInt()));        
                    cumple=true;
                    boolean ok=false;    
                    System.out.println("El Nombre");
                    unaLlamada.setNombreResidente(lector.nextLine());
                    if(unaLlamada.getNombreResidente().equals("")){
                        unaLlamada.setNombreResidente(lector.nextLine());
                    }
                    while(!ok){
                        try{  
                            Prueba.ValidacionPaisdeResidente(unaLlamada);
                            ok=true;
                        }catch(InputMismatchException e){
                            System.out.println("Debe ingresar un numero del 1-50");
                            lector.next();
                        }
                    }
                    ok=false;
                    while(!ok){
                       try{
                          System.out.println("Telefono");
                          unaLlamada.setTel(lector.nextInt());
                          ok=true;
                       }catch(InputMismatchException a){
                           System.out.println("Introduzca numeros validos");
                           lector.next();
                        } 
                    }    
                    Prueba.pedirMotivos(unaLlamada,unSistema);
                    Prueba.ValidacionDia(unaLlamada);            
                    Prueba.ValidacionMes(unaLlamada);
                System.out.println("Estado?(Pendiente-Resuelta)");
                unaLlamada.setEstado(lector.nextLine());
                if(unaLlamada.getEstado().equals("")){
                    unaLlamada.setEstado(lector.nextLine());
                }
                Prueba.validacionEstado(unaLlamada);
                if(unaLlamada.getEstado().equalsIgnoreCase("pendiente")){
                    unSistema.getListaDeLlamadasPendientes().add(unaLlamada);
                }
                if(unaLlamada.getEstado().equalsIgnoreCase("Resuelta")){
                    unSistema.getListaDeLlamadasResueltas().add(unaLlamada);
                }
                    }
                    else{
                        System.out.println("Al parecer no se registro ningun operador senior, registre uno y vuelta a intentarlo o seleccione junior");
                        cumple=true;
                    }
                }
                    if(Elegir.equalsIgnoreCase("Junior")){
                        if(!unSistema.getListaDeOperadoresJunior().isEmpty()){
                        Prueba.mostrarListaDeOperadoresJunior(unSistema);
                        System.out.println("Elija su operador junior");
                        unaLlamada.setElOperador(unSistema.getListaDeOperadoresJunior().get(lector.nextInt()));          
                        cumple=true;
                        boolean ok=false;
                System.out.println("El Nombre");
                unaLlamada.setNombreResidente(lector.nextLine());
                if(unaLlamada.getNombreResidente().equals("")){
                    unaLlamada.setNombreResidente(lector.nextLine());
                }
                while(!ok){
                    try{
                    Prueba.ValidacionPaisdeResidente(unaLlamada);
                    ok=true;
                    }catch(InputMismatchException e){
                        System.out.println("Introduzca un numero del 1-50");
                        lector.next();
                    }
                }
                ok=false;
                while(!ok){
                    try{
                    System.out.println("Telefono");
                    unaLlamada.setTel(lector.nextInt());
                    ok=true;
                    }catch(InputMismatchException a){
                       System.out.println("Introduzca un numero valido, no letras");
                       lector.next();
                    } 
                }    
                Prueba.pedirMotivos(unaLlamada,unSistema);
                Prueba.ValidacionDia(unaLlamada);   
                Prueba.ValidacionMes(unaLlamada);
                System.out.println("Estado?(Pendiente-Resuelta)");
                unaLlamada.setEstado(lector.nextLine());
                if(unaLlamada.getEstado().isEmpty()){
                    unaLlamada.setEstado(lector.nextLine());
                }
                Prueba.validacionEstado(unaLlamada);
                if(unaLlamada.getEstado().equalsIgnoreCase("pendiente")){
                    unSistema.getListaDeLlamadasPendientes().add(unaLlamada);
                }
                if(unaLlamada.getEstado().equalsIgnoreCase("Resuelta")){
                    unSistema.getListaDeLlamadasResueltas().add(unaLlamada);
                }            
                        }
                        else{
                        System.out.println("Al parecer no se registro ningun operador junior, registre uno y vuelva a intentarlo o seleccion Senior");
                        cumple=true;
                    }
                    }    
            }
        }
        //Mostrar Listas
        public static void mostrarListaDeEmpresas(Sistema unSistema){
            if (unSistema.getListaDeEmpresas().isEmpty()){
                System.out.println("---------------------------------------------");
                System.out.println("No hay Empresas Registradas");
                System.out.println("---------------------------------------------");
            }
            else{
               System.out.println("Lista De Empresas");
               System.out.println("---------------------------------------------");
               int j=0;
               for(int i=0;i<unSistema.getListaDeEmpresas().size();i++){
                  System.out.println(j+++")"+unSistema.getListaDeEmpresas().get(i));
               } 
            }
        }
        //Metodo que muestra la lista de Operadores senior y junior
        public static void mostrarListaDeOperadores(Sistema unSistema){
            if (unSistema.getListaDeOperadoresSenior().isEmpty() && unSistema.getListaDeOperadoresJunior().isEmpty()){
                System.out.println("---------------------------------------------");
                System.out.println("No hay Operadores registrados");
                System.out.println("---------------------------------------------");
            }
            else{
                System.out.println("---------------------------------------------");
                System.out.println("Lista De Operadores");
                System.out.println("---------------------------------------------");
                int j=0;
                for(int i=0;i<unSistema.getListaDeOperadoresSenior().size();i++){
                    System.out.println(j+++")"+unSistema.getListaDeOperadoresSenior().get(i));
                }
                for(int i=0;i<unSistema.getListaDeOperadoresJunior().size();i++){
                    System.out.println(j+++")"+unSistema.getListaDeOperadoresJunior().get(i));
                }
            }
        }
        //Metodo que muestra lista de operadores senior
        public static void mostrarListaDeOperadoresSenior(Sistema unSistema){
             if (unSistema.getListaDeOperadoresSenior().isEmpty()){
                System.out.println("---------------------------------------------");
                System.out.println("No hay Operadores Senior registrados");
                System.out.println("---------------------------------------------");
            }
            else{ 
                System.out.println("Lista de operadores senior");
                System.out.println("---------------------------------------------");     
            int j=0;
            for(int i=0;i<unSistema.getListaDeOperadoresSenior().size();i++){
                System.out.println(j+++")"+unSistema.getListaDeOperadoresSenior().get(i));
            }
            }
        }
        //Metodo que nos muestra la lista de operadores junior
        public static void mostrarListaDeOperadoresJunior(Sistema unSistema){
             if (unSistema.getListaDeOperadoresJunior().isEmpty()){
                System.out.println("---------------------------------------------");
                System.out.println("No hay Operadores Junior registrados");
                System.out.println("---------------------------------------------");
            }
            else{ 
                System.out.println("Lista de operadores junior");
                System.out.println("---------------------------------------------");     
            int j=0;
            for(int i=0;i<unSistema.getListaDeOperadoresJunior().size();i++){
                System.out.println(j+++")"+unSistema.getListaDeOperadoresJunior().get(i));
            }
            }    
        }
        //Metodo que nos muestra las llamadas no respuestas
        public static void mostrarLlamadasPendientes(Sistema unSistema){  
           if (unSistema.getListaDeLlamadasPendientes().isEmpty()){
                System.out.println("---------------------------------------------");
                System.out.println("No hay llamadas pendientes");
                System.out.println("---------------------------------------------");
            }
           else{
                System.out.println("Lista De Llamadas Pendientes");
                System.out.println("---------------------------------------------");
                for(int i=0;i<unSistema.getListaDeLlamadasPendientes().size();i++){
                    System.out.println(unSistema.getListaDeLlamadasPendientes().get(i));
                }
            Collections.sort(unSistema.getListaDeLlamadasPendientes(),new OrdenListasFechaDecreciente());
           }
        }
        //Metodo que nos muestra una lista de las llamadas respuestas por los op senior
        public static void mostrarLlamadasDevueltas(Sistema unSistema){
           if (unSistema.getListaDeLlamadasResueltas().isEmpty()){
                System.out.println("---------------------------------------------");
                System.out.println("No hay llamadas resueltas");
                System.out.println("---------------------------------------------");
            }
           else{
                System.out.println("Lista De Llamadas devueltas");
                System.out.println("---------------------------------------------");
                for(int i=0;i<unSistema.getListaDeLlamadasResueltas().size();i++){
                        System.out.println(unSistema.getListaDeLlamadasResueltas().get(i));
                }
           }
        }
        //Validacion de Pais
        public static void ValidacionPais(Empresa unaEmpresa){
                Scanner lector = new Scanner(System.in);
                boolean datoValido = false;
                int numPais = 0;

                while(!datoValido){
                    // Pido dato
                    try{
                        System.out.println("Introduzca el Pais (Numeros del 1-50)");
                        numPais = lector.nextInt();
                        // Evaluar el rango
                        datoValido=Prueba.buenRango(numPais, 50, 1);    
                    }catch(InputMismatchException e){
                        System.out.println("Error de dato");
                        // Limpio el lector
                        lector.next();

                    }
                }
                unaEmpresa.setPais(numPais);

            }

        //Validacion de Mes
        public static void ValidacionMes(Llamada unaLlamada){
            Scanner lector = new Scanner(System.in);
            boolean datoValido = false;
            int numMes = 0;

                while(!datoValido){
                    // Pido dato
                    try{
                        System.out.println("Introduzca el Mes(Numeros del 1-12)");
                        numMes = lector.nextInt();
                        // Evaluar el rango
                        datoValido=Prueba.buenRango(numMes, 12, 1);    
                    }catch(InputMismatchException e){
                        System.out.println("Error de dato");
                        // Limpio el lector
                        lector.next();

                    }
                }
                unaLlamada.setMes(numMes);

        }

        //Validacion de Dia
        public static void ValidacionDia(Llamada unaLlamada){
            Scanner lector = new Scanner(System.in);
            boolean datoValido = false;
            int numDia = 0;
             while(!datoValido){
                try{
                    System.out.println("Introduzca el Dia (Numeros del 1-30)");
                    numDia = lector.nextInt();
                    datoValido=Prueba.buenRango(numDia, 30, 1);    
                }catch(InputMismatchException e){
                    System.out.println("Error de dato");
                    lector.next();

                    }
                }
                unaLlamada.setDia(numDia);

        }
        //Validacion de Cedula
        public static void ValidacionCedula(Operador unOperador){
                Scanner lector=new Scanner(System.in);
                String cedula;
                int cedNumerica = 0;
                boolean correcto = false;
                while(!correcto){
                    System.out.println("Ingrese una cedula de 8 digitos");
                    try{
                        cedNumerica = lector.nextInt();
                        correcto = buenRango(cedNumerica,99999999,10000000);
                    }catch(InputMismatchException e){
                        System.out.println("Error, introdusca un numero valido");
                        lector.next();
                    }
                }
                cedula = "" + cedNumerica;
                unOperador.setCi(cedula);
            }
        //Validacion de Pais de Residente
        public static void ValidacionPaisdeResidente(Llamada unaLlamada){
            Scanner lector = new Scanner(System.in);
            boolean datoValido = false;
            int numPais = 0;
            while(!datoValido){
                // Pido dato
                try{
                    System.out.println("Introduzca el Pais (Numeros del 1-50)");
                    numPais = lector.nextInt();
                    // Evaluar el rango
                    datoValido=Prueba.buenRango(numPais, 50, 1);    
                }catch(InputMismatchException e){
                    System.out.println("Error de dato");
                    // Limpio el lector
                    lector.next();

                }
            }
            unaLlamada.setPaisdelResidente(numPais);

        } 
        //Metodo Llamadas pendientes registradas
        public static void LlamadaPendientesRegistradas(Sistema unSistema){
            if (unSistema.getListaDeLlamadasPendientes().isEmpty()){
                System.out.println("---------------------------------------------");
                System.out.println("No hay llamadas pendientes");
                System.out.println("---------------------------------------------");
            }
            else{
                System.out.println("---------------------------------------------");
                System.out.println("Lista de llamadas no resueltas");
                for(int i=0;i<unSistema.getListaDeLlamadasPendientes().size();i++){
                    System.out.println(unSistema.getListaDeLlamadasPendientes().get(i));
            }
            System.out.println("---------------------------------------------");
            }
        }
        //Metodo de llamadas devueltas registardas
        public static void LlamadaDevueltasRegistradas(Sistema unSistema){
            if (unSistema.getListaDeLlamadasResueltas().isEmpty()){
                System.out.println("---------------------------------------------");
                System.out.println("No hay llamadas resueltas");
                System.out.println("---------------------------------------------");
            }
            else{
            System.out.println("---------------------------------------------");
            System.out.println("Lista de llamadas resueltas");
            for(int i=0;i<unSistema.getListaDeLlamadasResueltas().size();i++){
                System.out.println(unSistema.getListaDeLlamadasResueltas().get(i));
            }
            System.out.println("---------------------------------------------");
            }
        }
        //Validar Motivos
        public static void ValidacionMotivo(Llamada unaLlamada){
            Scanner lector = new Scanner(System.in);
            boolean datoValido = false;
            int numMotivo = 0;
             while(!datoValido){
                try{
                    System.out.println("Introduzca el Motivo (Numeros del 1-5)");
                    numMotivo = lector.nextInt();
                    datoValido=Prueba.buenRango(numMotivo, 5, 1);    
                }catch(InputMismatchException e){
                    System.out.println("Error de dato");
                    lector.next();

                    }
                }
                unaLlamada.setMotivo(numMotivo);
        } 
        //Validar Estado
        public static void validacionEstado(Llamada unaLlamada){
            Scanner lector=new Scanner(System.in); 
            boolean respuestaCorrecta=false;
            while(!respuestaCorrecta){

                if(unaLlamada.getEstado().equalsIgnoreCase("pendiente")|| unaLlamada.getEstado().equalsIgnoreCase("resuelta")){
                        respuestaCorrecta=true;
                    }    
                if(!unaLlamada.getEstado().equalsIgnoreCase("pendiente") && !unaLlamada.getEstado().equalsIgnoreCase("resuelta")){
                    System.out.println("El estado debe ser Pendiente o Resuelta");
                    unaLlamada.setEstado(lector.nextLine());
                    if(unaLlamada.getEstado().equals("")){
                        unaLlamada.setEstado(lector.nextLine());
                    }    

                }
                else{
                    respuestaCorrecta=true;
                }
            } 
            }                             
        public static boolean buenRango(int numero,int maximo,int minimo){
            boolean esBueno = false;
            if((numero>=minimo) && (numero<=maximo)){
                esBueno = true;
            }else{
                System.out.println("Numero fuera de rango" + "("+minimo+","+maximo+")");
            }
            return esBueno;
        }
     
}

    
        
