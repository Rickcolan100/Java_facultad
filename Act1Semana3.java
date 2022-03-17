package tema5;
import PaqueteLectura.Lector;
public class Act1Semana3 {
  public static void main(String[] args) {
    double lado,lado1,lado2,lado3,radio;
    String cl,cr;
    System.out.println("Bienvenido al programa,complete datos para calcular perimetro,area y su representacion");
    System.out.println("- TRIANGULO -");
    System.out.println("Ingrese lado 1: ");
    lado1 = Lector.leerDouble();
    System.out.println("Ingrese lado 2: ");
    lado2 = Lector.leerDouble();
    System.out.println("Ingrese lado 3: ");
    lado3 = Lector.leerDouble();
    System.out.println("Ingrese color de relleno: ");
    cr = Lector.leerString();
    System.out.println("Ingrese color de linea: ");
    cl = Lector.leerString();
    Triangulo t = new Triangulo(lado1,lado2,lado3,cr,cl);
    System.out.println("Area del triangulo: " + t.calcularArea());
    System.out.println("Perimetro del triangulo: " + t.calcularPerimetro());
    System.out.println(t.toString());
    System.out.println("--------------------------------------------------------------------------------");
    System.out.println("- CUADRADO - ");
    System.out.println("Ingrese lado 1: ");
    lado = Lector.leerDouble();
    System.out.println("Ingrese color de relleno: ");
    cr = Lector.leerString();
    System.out.println("Ingrese color de linea: ");
    cl = Lector.leerString();
    Cuadrado c = new Cuadrado(lado,cr,cl);
    System.out.println("Area del triangulo: " + c.calcularArea());
    System.out.println("Perimetro del triangulo: " + c.calcularPerimetro());
    System.out.println(c.toString());
    System.out.println("--------------------------------------------------------------------------------");
    //Act8Semana3
    System.out.println("- CIRCULO - ");
    System.out.println("Ingrese radio: ");
    radio = Lector.leerDouble();
    System.out.println("Ingrese color de relleno: ");
    cr = Lector.leerString();
    System.out.println("Ingrese color de linea: ");
    cl = Lector.leerString();
    Circulo cir = new Circulo(radio,cr,cl);
    System.out.println("Area del circulo: " + cir.calcularArea());
    System.out.println("Perimetro del circulo: " + cir.calcularPerimetro());
    System.out.println(cir.toString());
    System.out.println("--------------------------------------------------------------------------------");
  }
    
}
