package tema2;
import PaqueteLectura.Lector;
public class Act8Semana1 {
    public static void main(String[] args) {
     String nom;   
     int dni,edad,i;
     int min = 999 ,cant = 0,posmin = 0;
     Persona vec[] = new Persona[15];
     System.out.println("Bienvenido al programa,ingrese 15 personas ");
     System.out.println("--------------------------------------------------------------------------");
     for(i = 0;i < 15;i++){
      System.out.println("Ingrese nombre ");
      nom = Lector.leerString();
      System.out.println("Ingrese dni ");
      edad = Lector.leerInt();
      System.out.println("Ingrese edad ");
      dni = Lector.leerInt();
      vec[i] = new Persona(nom,dni,edad);
     }
     for(i = 0;i < 15;i++){
      if(vec[i].getEdad() > 65)
       cant += 1;
      if(vec[i].getDNI() < min){
       min = vec[i].getDNI();
       posmin = i;
      }
     }
     System.out.println("------------------------------------------------------------");
     System.out.println("La cantidad de personas con edad mayor a 65 es de " + cant);
     System.out.println("La persona con el dni mas bajo es: " + vec[posmin].toString());
     
    }
    
}
