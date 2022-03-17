package tema5;
import PaqueteLectura.Lector;
public class Act2Semana3 {
  public static void main(String[] args) {
   String nom;
   double sueldo;
   int cantc,cantp,ngol;
   System.out.println("Bienvenido al programa,ingrese datos para calcular sueldos");
   System.out.println("- ENTRENADOR - ");
   System.out.println("Ingrese nombre: ");
   nom = Lector.leerString();
   System.out.println("Ingrese sueldo basico: ");
   sueldo = Lector.leerDouble();
   System.out.println("Ingrese cantidad de campeonatos ganados: ");
   cantc = Lector.leerInt();
   Entrenador e = new Entrenador(nom,sueldo,cantc);
   System.out.println("El sueldo a cobrar es de :"  + e.calcularSueldoACobrar());
   System.out.println(e.toString());
   System.out.println("-----------------------------------------------------------------------");
   System.out.println("- JUGADOR - ");
   System.out.println("Ingrese nombre: ");
   nom = Lector.leerString();
   System.out.println("Ingrese sueldo basico: ");
   sueldo = Lector.leerDouble();
   System.out.println("Ingrese cantidad de partidos: ");
   cantp = Lector.leerInt();
   System.out.println("Ingrese numero de goles: ");
   ngol = Lector.leerInt();
   Jugador j = new Jugador(nom,sueldo,cantp,ngol);
   System.out.println("El sueldo a cobrar es de :"  + j.calcularSueldoACobrar());
   System.out.println(j.toString());
   System.out.println("-----------------------------------------------------------------------");
   
  }
    
}
