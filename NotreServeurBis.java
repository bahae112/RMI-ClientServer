import java.rmi.*;
import java.rmi.registry.*;
import CodeMetier.*;
import java.util.*;
import java.io.*;
public class NotreServeurBis{
public static void main(String[] args) throws Exception {
// création de l’objet
Scanner s=new Scanner(System.in);
System.out.print("Donner le nom du Serveur: ");
String NomServeur=s.nextLine();
Hello ObjetLocal = new Hello(NomServeur);
Naming.rebind("rmi://localhost:3500/totoBis",ObjetLocal);
System.out.println("Servant Published, wainting for invocations...");

}
}

