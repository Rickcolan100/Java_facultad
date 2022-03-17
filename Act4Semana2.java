package tema3;
import PaqueteLectura.Lector;
public class Act4Semana2 {
 public static void main(String[] args) {
   int r;
   String cr,cl;
   System.out.println("Ingrese radio del circulo");
   r = Lector.leerInt();
   System.out.println("Ingrese color de relleno del circulo");
   cr = Lector.leerString();
   System.out.println("Ingrese color de linea del circulo");
   cl = Lector.leerString();
   Circulo c = new Circulo(r,cr,cl);
   System.out.println("El area del cirulo es de " + c.calcularArea());
   System.out.println("El perimetro del circulo es de " + c.calcularPerimetro());
  }
    
}
