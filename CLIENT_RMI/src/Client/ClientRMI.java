package Client;

import Service.InterfServiceDistant;

import java.rmi.Naming;


public class ClientRMI {

    public static void main(String args[])
    {
        try {
            InterfServiceDistant stub =(InterfServiceDistant) Naming.lookup("rmi://192.168.0.117:1099/Ref");
            System.out.println(" 1 + 2 = "+stub.somme(1,2));
            System.out.println(" 6 - 4 = "+stub.soustraction(6,4));
            System.out.println(" 6 * 9 = "+stub.multiplication(6,9));
            System.out.println(" 6 / 3 = "+stub.division(6,3));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

}
