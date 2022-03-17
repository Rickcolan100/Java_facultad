package tema4;
import PaqueteLectura.Lector;
public class Act7Semana2 {
    public static void main(String[] args) {
      int num;
      Micro m = new Micro("ABC123","Mar del plata","5:00");
      System.out.println("Comienza la carga de asientos ");
      System.out.println("-----------------------------------------------------");
      System.out.println("Con asiento -1 deja de ocupar asientos ");
      System.out.println("Ingrese un asiento: ");
      num = Lector.leerInt();
      while((num != -1)&&(m.validarAsiento(num))&&(m != null)){
       if(m.validarAsiento(num)){
        m.ocuparAsiento(num);
        System.out.println("El asiento " + num + " fue ocupado");
       }
       else{
        System.out.println("El asiento " + num + " esta ocupado");
        System.out.println("El primer asiento libre esta en " + m.primerAsientoLibre());
       }
       System.out.println("Ingrese un asiento: ");
       num = Lector.leerInt();
       System.out.println("Cantidad de asientos ocupados " + m.getCanta());        
      }
    }    
}
