package tema4;
import PaqueteLectura.Lector;
import tema3.Circulo;
public class Act9Semana2 {
    public static void main(String[] args) {
      //INSTACIAMIENTO CON CONSTRUCTOR VACIO Y LLENO EN CIRCULO  
      int r;
      String cl,cr;
      //INSTANCIAMIENTO DE CONSTRUCTOR VACIO
      System.out.println("Bienvenido al programa, Ingrese primero datos al constructor vacio ");
      Circulo cir = new Circulo();
      System.out.println("Ingrese radio del circulo ");
      r = Lector.leerInt();
      cir.setRadio(r);
      System.out.println("Ingrese color de linea ");
      cl = Lector.leerString();
      cir.setColorL(cl);
      System.out.println("Ingrese color de relleno ");
      cr = Lector.leerString();
      cir.setColorR(cr);
      System.out.println("El area del circulo es " + cir.calcularArea());
      System.out.println("El perimetro del circulo es de " + cir.calcularPerimetro());
      System.out.println("---------------------------------------------------------------------- ");
      //INSTANCIAMIENTO CON CONSTRUCTOR LLENO
      System.out.println("Ingrese primero datos al constructor lleno ");
      System.out.println("Ingrese radio del circulo ");
      r = Lector.leerInt();
      System.out.println("Ingrese color de linea ");
      cl = Lector.leerString();
      System.out.println("Ingrese color de relleno ");
      cr = Lector.leerString();
      Circulo c = new Circulo(r,cl,cr);
      System.out.println("El area del circulo es " + c.calcularArea());
      System.out.println("El perimetro del circulo es de " + c.calcularPerimetro());
      System.out.println("---------------------------------------------------------------------- ");
      
    }
    
}
