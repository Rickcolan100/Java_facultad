package tema1;
import PaqueteLectura.GeneradorAleatorio;
public class Act6Semana1 {
    public static void main(String[] args) {
      int vec[] = new int[5];
      int op,max = -1,i,opmax = 0;
      GeneradorAleatorio.iniciar();
      System.out.println("Bienvenido al programa,por favor ingrese operacion bancaria a realizar.Con 5 cierra el banco");
      System.out.println("Operacion bancaria realizandose ");
      op = GeneradorAleatorio.generarInt(6);
      while(op != 5){
       vec[op] = vec[op] + 1;
       System.out.println("Operacion bancaria realizandose ");
       op = GeneradorAleatorio.generarInt(6);
      }
      System.out.println("A continuacion se va a mostrar los clientes que hicieron operaciones antes del cierre del banco");
      for(i = 0;i < 5;i++){
       if(vec[i] > max){
        max = vec[i];
        opmax = i;
       } 
       System.out.println("La operacion bancaria " + i + " tuvo " + vec[i] + " clientes realizandola");
      }
      System.out.println("La operacion con mas clientes fue " + opmax + " con " + vec[opmax]);
    }
    
}
