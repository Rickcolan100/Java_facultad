package tema4;
import PaqueteLectura.Lector;
import tema3.Entrenador;
public class Act6Semana2 {
  public static void main(String[] args) {
     //INSTACIAMIENTO CON CONSTRUCTOR VACIO Y LLENO EN ENTRENADOR
     String nom;
     int cant;
     double sueldo;
     //INSTANCIAMIENTO CON CONSTRUCTOR VACIO
     System.out.println("Bienvenido al programa, Ingrese primero datos al constructor vacio ");
     Entrenador en = new Entrenador();
     System.out.println("Ingrese nombre ");
     nom = Lector.leerString();
     en.setNom(nom);
     System.out.println("Ingrese sueldo ");
     sueldo = Lector.leerDouble();
     en.setSueldob(sueldo);
     System.out.println("Ingrese cantidad de campeonatos ganados ");
     cant = Lector.leerInt();
     en.setCant(cant);
     System.out.println("El sueldo basico a cobrar es de " + en.calcularSueldoACobrar());
     System.out.println("---------------------------------------------------------------------- ");
     //INSTANCIAMIENTO CON CONSTRUCTOR LLENO 
     System.out.println("Ingrese primero datos al constructor lleno ");
     System.out.println("Ingrese nombre ");
     nom = Lector.leerString();
     System.out.println("Ingrese sueldo ");
     sueldo = Lector.leerDouble();
     System.out.println("Ingrese cantidad de campeonatos ganados ");
     cant = Lector.leerInt();
     Entrenador e = new Entrenador(nom,sueldo,cant);
     System.out.println("El sueldo basico a cobrar es de " + e.calcularSueldoACobrar());
     System.out.println("---------------------------------------------------------------------- ");
  }
    
}
