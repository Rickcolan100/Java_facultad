package tema1;
import PaqueteLectura.Lector;
public class Act1Semana1 {
    public static void main(String[] args) {
     int i,num,fact = 1,act; //falta calcular el de impares
     System.out.println("Bienvenido al programa,por favor ingrese un numero para calcular su factorial");
     System.out.println("Ingrese un numero: ");
     num = Lector.leerInt();
     while(num != 0){ 
      act =    
      fact = num;   
      for(i = num;i > 0; i++){    
       fact = fact*(num - i);
      } 
      System.out.println("El factorial de " + act + " es " + fact); //No se guarda variable despues calcular el factorial
      System.out.println("Ingrese un numero: ");
      num = Lector.leerInt();
   }
 }   
}
