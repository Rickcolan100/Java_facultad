package actividadteoria;
import PaqueteLectura.Lector;
public class Ejercicio1 {
 public static void main(String[] args) {
  Estanteria e = new Estanteria(5,3);
  System.out.println("Bienvenido al programa,ingrese 7 libros");
  for (int i=0; i< 7; i++){      
    System.out.println("Ingrese el peso: ");
    int peso = Lector.leerInt();    
    System.out.println("Ingrese el titulo: ");
    String titulo = Lector.leerString();
    System.out.println("Ingrese el nombre: ");
    String nom = Lector.leerString();
    System.out.println("Ingrese la biografia: ");
    String bio = Lector.leerString();
    System.out.println("Ingrese la cantidad de paginas: ");
    int cantPaginas = Lector.leerInt();
    System.out.println("Ingrese el estante: ");
    int x = Lector.leerInt();
    System.out.println("Ingrese el lugar del estante: ");
    int y = Lector.leerInt();
    Autor a = new Autor(nom,bio);
    Libro l = new Libro(titulo,a,peso,cantPaginas);
    e.almacenarLibro(l,x,y); //X E Y SERIAN VALIDOS
  } 
  Libro odisea = e.sacarLibro("2001 Odisea del Espacio");
  if(odisea != null){
   System.out.println(odisea.toString());
  }
  Libro masgrande = e.calcularLibroMasGrande();
  if(masgrande != null){
   System.out.println(masgrande.getTitulo());
  }
  System.out.println("El estante mas pesado es: " + e.calcularEstanteMasPesado());
 } 
    
}
