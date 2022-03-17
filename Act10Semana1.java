package tema2;
import PaqueteLectura.Lector;
public class Act10Semana1 {
 public static void main(String[] args) {
  int i;   
  String pal;
  String vec[] = new String[10];
  System.out.println("Bienvenido al programa,ingrese 10 palabras para decifrar el mensaje secreto");
  System.out.println("--------------------------------------------------------------------------");
  for(i =  0;i < 10;i++){
   System.out.println("Ingrese la palabra ");
   pal = Lector.leerString();
   vec[i] = pal;
  }
  System.out.println("--------------------------------------------------------------------------");
  System.out.println("A continuacion se imprimira el mensaje secreto ");
  System.out.println("--------------------------------------------------------------------------");
  for(i = 0;i < 10;i++)
   System.out.println(vec[i].charAt(0));
  System.out.println("****************************************************************************");
 } 
}
