package tema2;
import PaqueteLectura.Lector;
public class Act7Semana1 {
 public static void main(String[] args) {
  String nom;
  int dni,edad;
  System.out.println("Bienvenido al programa,por favor ingrese un nombre,edad y dni");
  System.out.println("Ingrese NOMBRE: ");
  nom = Lector.leerString();
  System.out.println("Ingrese DNI: ");
  dni = Lector.leerInt();
  System.out.println("Ingrese EDAD: ");
  edad = Lector.leerInt();
  Persona p = new Persona(nom,dni,edad);
  System.out.println(p.toString());
 }   
}
