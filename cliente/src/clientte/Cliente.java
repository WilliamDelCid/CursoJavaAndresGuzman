package clientte;

import servidor.Servidor;

import java.rmi.Naming;
import java.util.Scanner;

public class Cliente {
        public static String consultar(int id) throws Exception{
            String resultado = null;
            String rmiObjectName = "rmi://localhost/Datos";
            Servidor servidor = (Servidor) Naming.lookup(rmiObjectName);
            resultado = servidor.consultar(id);
            return resultado;
        };
    public static void main(String[] args) throws Exception {
        String op = null;
        int id = -1;
        Scanner scanner = null;
        do{
            scanner = new Scanner(System.in);
            System.out.println("Buscar datos del empleado");
            id = scanner.nextInt();
            System.out.println(consultar(id));

            System.out.println("Desea salir si(s) / no(n)");
            op=scanner.next();
        }while (op.equals("n"));
        scanner.close();
    }

}
