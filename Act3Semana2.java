package tema3;
import PaqueteLectura.Lector;
public class Act3Semana2 {
  public static void main(String[] args) {
   String nom;
   double sueldo;
   int cant;
   System.out.println("Ingrese nombre ");
   nom = Lector.leerString();
   System.out.println("Ingrese sueldo basico ");
   sueldo = Lector.leerDouble();
   System.out.println("Ingrese cantidad de partidos ganados ");
   cant = Lector.leerInt();
   Entrenador e = new Entrenador(nom,sueldo,cant);
   System.out.println("----------------------------------------------------------------------");
   System.out.println("El sueldo basico con plue a cobrar es de " + e.calcularSueldoACobrar());
  }
    
}
