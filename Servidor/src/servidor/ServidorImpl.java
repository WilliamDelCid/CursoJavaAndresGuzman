package servidor;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

public class ServidorImpl extends UnicastRemoteObject implements Servidor {

    private static ArrayList<Persona> listPersonas(){
        ArrayList<Persona> lista = new ArrayList<>();
        lista.add(new Persona(1, "William", "antonio@gmail.com", "Jefe", "1200"));
        return lista;
     }

     private static String getPersona(int id){
        return "Nombre: " + listPersonas().get(id-1).getNombre()+"\n"
                +"Correo: " + listPersonas().get(id-1).getCorreo()+"\n";
     };

    public ServidorImpl() throws RemoteException {
    }

//    public static void main(String[] args) throws Exception {
//    ServidorImpl servidor = new ServidorImpl();
//        System.out.println(servidor.consultar(2));;
//    }

    @Override
    public String consultar(int id) throws Exception {
        if (id<listPersonas().size()+1){
            return getPersona(id);
        }else{
            return "No existe datos del empleado";
        }
    }
}
