package CodeMetier;
import java.rmi.*;
public interface InterfaceDeHello extends Remote {
    public int SayIt(String NC) throws RemoteException;
}
