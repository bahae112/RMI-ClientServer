import CodeMetier.*;
import java.rmi.*;
import java.util.*;
import java.io.*;
public class NotreClient{
public static void main(String[] args) 
{
	try {
		Remote ObjetDistant = Naming.lookup("rmi://localhost:3500/totoBis");
		if (ObjetDistant instanceof InterfaceDeHello) 
			{
				Scanner s=new Scanner(System.in);
				System.out.print("Donner le nom du client: ");
				String NC=s.nextLine();
				int retour=((InterfaceDeHello) ObjetDistant).SayIt(NC); 
				System.out.println("Nbre invocations= "+retour);			
			}
	} 
catch (Exception e) {
}
}}
