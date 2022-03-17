package actividadteoria;
import PaqueteLectura.Lector;
public class Ejercicio2 {
 public static void main(String[] args) {
  System.out.println("-EVENTO PRIVADO-");   
  System.out.println("Ingrese dia,contratante,motivo,banda y cantidad de temas");
  String dia = Lector.leerString();
  String contratante = Lector.leerString();
  String motivo = Lector.leerString();
  String banda = Lector.leerString();
  int canttemas = Lector.leerInt();
  EventoOcasional eocasional = new EventoOcasional(motivo,contratante,dia,banda,canttemas);  
  for(int i = 0;i < canttemas;i++){
   System.out.println("Ingrese tema: ");
   String tema = Lector.leerString();
   eocasional.agregarTema(tema);
  }
  System.out.println("Costo del evento ocasional " + eocasional.calcularCosto());
  System.out.println(eocasional.finalizado());
  eocasional.actuar();
  System.out.println(eocasional.finalizado());
  
  
  System.out.println("-GIRA DE LA BANDA-"); 
  System.out.println("Ingrese nombre de la gira,banda,cantidad de fechas y cantidad de temas");
  String nomgira = Lector.leerString();
  banda = Lector.leerString();
  int cantf = Lector.leerInt();
  canttemas = Lector.leerInt();
  Gira g = new Gira(nomgira,cantf,banda,canttemas);
   System.out.println("Ingrese los temas de las giras");
  for(int i = 0;i < canttemas;i++){
   System.out.println("Ingrese tema: ");
   String tema = Lector.leerString();
   g.agregarTema(tema);
  }
  System.out.println("Ingrese las ciudades y los dias de la gira ");
  for(int i = 0;i < cantf;i++){
   System.out.println("Ingrese ciudad: ");
   String ciudad = Lector.leerString();  
   System.out.println("Ingrese dia: ");
   dia = Lector.leerString();
   g.agregarFecha(new Fecha(ciudad,dia));
  } 
  System.out.println("Costo de la gira " + g.calcularCosto());
  while(!g.finalizado()){
   g.actuar();
   System.out.println("-----------------------------"); 
  }     
 }  
}
