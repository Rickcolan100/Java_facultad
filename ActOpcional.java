package tema5;
import PaqueteLectura.Lector;
public class ActOpcional {
    public static void main(String[] args) {
     int dni,opGanElec,opGanRef,urnaGan,lista,n;
     double porcElec,porcRef;
     Electoral u = new Electoral(203,5);
     Referendum v = new Referendum(203);
     System.out.println("*********************************************************************");
     System.out.println("Bienvenido a la votacion del referendum, con dni 0 se termina la votacion");
     System.out.println("Ingrese dni: ");
     dni = Lector.leerInt();
     while(dni != 0){
       System.out.println("Ingrese numero de lista(0..4)");
       lista = Lector.leerInt();
       System.out.println("Usted esta votando en : " + lista);
       if(u.validarNumeroDeLista(lista)){
        u.votarPorLista(lista);
        System.out.println("A continuacion votara en el referendum ");
        System.out.println("n > 0: a favor - n < 0: en contra; n = 0: voto en blanco");
        System.out.println("Ingrese numero ");
        n = Lector.leerInt();
        if(n > 0)
         v.votarAFavor();
        else{
         if(n == 0)
          v.votarEnBlanco();
         else if(n < 0)
          v.votarEnContra();
         }
       } 
       System.out.println("- VOTACION REALIZADA -");
       System.out.println("Ingrese dni: ");
       dni = Lector.leerInt();   
     }
     System.out.println("--------------------------------------------------------------------");
     System.out.println("- RESULTADOS DE COMICIOS -");
     opGanElec = u.calcularGanador();
     System.out.println("La lista ganadora es la " + opGanElec);
     System.out.println("******************************************************************");
     System.out.println("Resultados del referendum ");
     opGanRef = v.calcularGanador();
     if(opGanRef == 0)
      System.out.println("La opcion a favor ha ganado");
     else{
      if(opGanRef == 1)
       System.out.println("La opcion en contra ha ganado");
      if(opGanRef == -1)
       System.out.println("Hubo empate");
     }
     System.out.println("******************************************************************");
     System.out.println("Resultados del ganador en las urnas electorales");
     porcElec = ((u.devolverVotosPorLista(opGanElec)*100)/u.calcularTotalVotos());
     System.out.println("La lista " + opGanElec + " ha ganado por " + porcElec + "%");
     System.out.println("Resultados del ganador en las urnas del referendum");
     if(opGanRef == 0){
      porcRef = ((v.getCantf()*100)/v.calcularTotalVotos());
      System.out.println("La opcion a favor del referendum ha ganado por " + porcRef + "%");
     }
     else if(opGanRef == 1){
      porcRef = ((v.getCantf()*100)/v.calcularTotalVotos());  
      System.out.println("La opcion en contra del referendum ha ganado por " + porcRef + "%");
     }
     System.out.println("******************************************************************");     
    }
     
}
   
