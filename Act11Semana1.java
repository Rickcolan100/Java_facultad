package tema2;
import PaqueteLectura.Lector;
public class Act11Semana1 {
 public static void main(String[] args) {
   String loc,vis;
   int goll = 0,golv = 0,i,diml = 0,cant = 0,cantr = 0,totalb = 0;
   Partido vec[] = new Partido[20];
   System.out.println("Bienvenido al programa, ingrese partidos realizados. Con visitante en ZZZ se deja de procesar");
   System.out.println("-----------------------------------------------------------------------------------------------");
   System.out.println("Ingrese equipo local: ");
   loc = Lector.leerString();
   System.out.println("Ingrese equipo visitante: ");
   vis = Lector.leerString();
   System.out.println("Ingrese goles del equipo local: ");
   goll = Lector.leerInt();
   System.out.println("Ingrese goles del equipo visitante: ");
   golv = Lector.leerInt(); 
   while((!vis.equals("ZZZ"))&&(diml < 20)){   
    vec[diml] = new Partido(loc,vis,goll,golv);
    diml = diml + 1;
    System.out.println("Ingrese equipo local: ");
    loc = Lector.leerString();
    System.out.println("Ingrese equipo visitante: ");
    vis = Lector.leerString();
    System.out.println("Ingrese goles del equipo local: ");
    goll = Lector.leerInt();
    System.out.println("Ingrese goles del equipo visitante: ");
    golv = Lector.leerInt();
   }
   System.out.println("------------------------------------------------------------------------------------------------");
   System.out.println("A continuacion se calculara en base a los datos ingresados");
   for(i = 0;i < diml;i++){
    if(vec[i].hayEmpate())
     cant = cant + 1;
    if(vec[i].getGanador().equals("River"))
     cantr = cantr + 1;
    if(vec[i].getLocal().equals("Boca"))
     totalb = totalb + vec[i].getGolesLocal();
   }
   double porc = ((double)cant/(double)diml)*100; //PONER DOUBLE CUANDO SON DOS NUMEROS ENTEROS
   System.out.println("-------------------------------------------------------------------------------------------------");
   System.out.println("La cantidad de partidos que gano River es de " + cantr);
   System.out.println("El porcentaje de partidos empatados es de " + porc + "%");
   System.out.println("La cantidad de goles hecho por Boca de local es de " + totalb);
   System.out.println("--------------------------------------------------------------------------------------------------");
  }  
}
