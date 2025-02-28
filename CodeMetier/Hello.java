package CodeMetier;
import java.rmi.*;
import java.rmi.server.*;
public class Hello extends UnicastRemoteObject implements InterfaceDeHello {
	int NbrInvocations=0;	
    String NomServeur;
    public Hello(String NS) throws RemoteException {
		super();
        NomServeur=NS;
		}
public int SayIt(String NC)throws RemoteException {
System.out.println(NomServeur+": Bonjour les amis, de la part de "+NC);
return(++NbrInvocations);
}
}


