import java.rmi.*;
import java.rmi.registry.*;
import CodeMetier.*;
public class NotreServeur{
public static void main(String[] args) throws Exception {
// création de l’objet
Hello ObjetLocal = new Hello();
Naming.rebind("rmi://localhost:3500/toto",ObjetLocal);
System.out.println("Servant Published, wainting for invocations...");
}
}