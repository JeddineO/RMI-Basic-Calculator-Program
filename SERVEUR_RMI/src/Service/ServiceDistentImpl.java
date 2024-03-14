package Service;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class ServiceDistentImpl extends UnicastRemoteObject implements InterfServiceDistant {
    public ServiceDistentImpl() throws RemoteException {
    }

    @Override
    public int somme(int a, int b) {
        return a+b;
    }

    @Override
    public int soustraction(int a, int b) {
        return a-b;
    }

    @Override
    public int multiplication(int a, int b) {
        return a*b;
    }

    @Override
    public double division(int a, int b) {
        if(b!=0)
            return a/b;
        return 0;
    }
}
