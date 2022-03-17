package tema2;
import PaqueteLectura.Lector;
public class Act9Semana1 {
 public static void main(String[] args) {
  String nom;
  int dni,edad,dia = 0,turno = 0,i,j;
  Persona mat[][] = new Persona[5][8];
  System.out.println("Bienvenido al programa,ingrese personas para el casting y asignele dia y turno.Con ZZZ deja de anotar ");
  System.out.println("--------------------------------------------------------------------------");
  System.out.println("Ingrese nombre ");
  nom = Lector.leerString();
  while((!nom.equals("ZZZ"))&&(dia < 5)){
   while((!nom.equals("ZZZ"))&&(turno < 8)){   
    System.out.println("Ingrese dni ");
    dni = Lector.leerInt();
    System.out.println("Ingrese edad ");
    edad = Lector.leerInt();
    mat[dia][turno] = new Persona(nom,dni,edad); 
    System.out.println("Ingrese nombre ");
    nom = Lector.leerString();
    turno++;
   } 
   dia++;
   turno = 0;
  }
  System.out.println("**********************************************************************************");
  System.out.println("A continuacion se mostrara las personas asignadas a los turnos del casting");
  System.out.println("**********************************************************************************");
  for(i = 0;i < 5;i++){
   System.out.println("Dia " + i);   
   for(j = 0;i < 8;j++){
    System.out.println("--------------------------");
    System.out.println("Turno " + j);
    System.out.println(mat[i][j].toString());
    System.out.println("--------------------------");
   }         
  }
 }
    
}
