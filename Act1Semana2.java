package tema3;
import PaqueteLectura.GeneradorAleatorio;
import PaqueteLectura.Lector;
public class Act1Semana2 {
 public static void main(String[] args) {
  int lado1,lado2,lado3;
  String colorR,colorL;
  System.out.println("Bienvenido al programa,genere un trianglo a calcular");
  System.out.println("A continuacion se generaran los lado");
  GeneradorAleatorio.iniciar();
  lado1 = GeneradorAleatorio.generarInt(100);
  lado2 = GeneradorAleatorio.generarInt(100);
  lado3 = GeneradorAleatorio.generarInt(100);
  System.out.println("Ingrese color de relleno");
  colorR = Lector.leerString();
  System.out.println("Ingrese color de linea");
  colorL = Lector.leerString();
  Triangulo t = new Triangulo(lado1,lado2,lado3,colorL,colorR);
  System.out.println("El area del triangulo generado es de " + t.calcularArea() + " y su perimetro es de " + t.calcularPerimetro());
 }
    
}
