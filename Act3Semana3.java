package tema5;
import PaqueteLectura.Lector;
public class Act3Semana3 {
 public static void main(String[] args) {
  String nom,tra;
  int dni,edad;
  System.out.println("Bienvenido al country,ingrese sus datos:");
  System.out.println("- PERSONA -");
  System.out.println("Ingrese su nombre: ");
  nom = Lector.leerString();
  System.out.println("Ingrese su DNI: ");
  dni = Lector.leerInt();
  System.out.println("Ingrese su edad: ");
  edad = Lector.leerInt();
  Persona p = new Persona(nom,dni,edad);
  System.out.println(p.toString());
  System.out.println("-------------------------------------------------------------------------");
  System.out.println("- TRABAJADOR -");
  System.out.println("Ingrese su nombre: ");
  nom = Lector.leerString();
  System.out.println("Ingrese su DNI: ");
  dni = Lector.leerInt();
  System.out.println("Ingrese su edad: ");
  edad = Lector.leerInt();
  System.out.println("Ingrese su trabajo: ");
  tra = Lector.leerString();
  Trabajador t = new Trabajador(nom,dni,edad,tra);
  System.out.println(t.toString());
  System.out.println("-------------------------------------------------------------------------");
 }
    
}
