package tema4;
import PaqueteLectura.Lector;
import tema3.Triangulo;
public class Act5Semana2 {
  public static void main(String[] args) {
    //INSTACIAMIENTO CON CONSTRUCTOR VACIO Y LLENO EN TRIANGULO
    int l1,l2,l3;
    String cl,cr;
    //INSTANCIAMIENTO CON CONSTRUCTOR VACIO
    Triangulo tri = new Triangulo();
    System.out.println("Bienvenido al programa, Ingrese primero datos al constructor vacio ");
    System.out.println("Ingrese lado 1 ");
    l1 = Lector.leerInt();
    tri.setLado1(l1);
    System.out.println("Ingrese lado 2 ");
    l2 = Lector.leerInt();
    tri.setLado2(l2);
    System.out.println("Ingrese lado 3 ");
    l3 = Lector.leerInt();
    tri.setLado3(l3);
    System.out.println("Ingrese color de relleno ");
    cr = Lector.leerString();
    tri.setColorR(cr);
    System.out.println("Ingrese color de linea ");
    cl = Lector.leerString();
    tri.setColorR(cr);
    System.out.println("El area del triangulo es de " + tri.calcularArea());
    System.out.println("El perimetro del triangulo es de " + tri.calcularPerimetro());
    System.out.println("---------------------------------------------------------------------- ");
    //INSTANCIAMIENTO CON CONSTRUCTOR LLENO 
    System.out.println("Ingrese primero datos al constructor lleno ");
    System.out.println("Ingrese lado 1 ");
    l1 = Lector.leerInt();
    System.out.println("Ingrese lado 2 ");
    l2 = Lector.leerInt();
    System.out.println("Ingrese lado 3 ");
    l3 = Lector.leerInt();
    System.out.println("Ingrese color de relleno ");
    cr = Lector.leerString();
    System.out.println("Ingrese color de linea ");
    cl = Lector.leerString();
    Triangulo t = new Triangulo(l1,l2,l3,cl,cr);
    System.out.println("El area del triangulo es de " + t.calcularArea());
    System.out.println("El perimetro del triangulo es de " + t.calcularPerimetro());
    System.out.println("---------------------------------------------------------------------- ");
  }
    
}
