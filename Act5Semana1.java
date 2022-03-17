package tema1;
import PaqueteLectura.GeneradorAleatorio;
import PaqueteLectura.Lector;
public class Act5Semana1 {
    public static void main(String[] args) {
     int dep[][] = new int[8][4];
     int piso,oficina,i,j;
     System.out.println("Bienvenido al programa,por favor ingrese oficina y piso al que quiere concurrir.Con Piso 9 no entra mas");
     System.out.println("Ingrese piso: ");
     piso = GeneradorAleatorio.generarInt(9);
     System.out.println("Ingrese oficina: ");
     oficina = GeneradorAleatorio.generarInt(3);
     while(piso != 9){
      dep[piso][oficina] += 1;
      System.out.println("Ingrese piso: ");
      piso = GeneradorAleatorio.generarInt(9); //error con la matriz al ingresar a un piso
      System.out.println("Ingrese oficina: ");
      oficina = GeneradorAleatorio.generarInt(3);
     }
     System.out.println("A continuacion se mostrara la gente que ha ingresado al edificio");
     for(i = 0;i < 10;i++){
      for(j = 0;j < 10;j++)
       System.out.println("En el piso " + i + ",oficina " + j + "entraron " + dep[i][j] + "personas");
     }     
    }
    
}
