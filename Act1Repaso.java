package Repaso;
import PaqueteLectura.Lector;
public class Act1Repaso {
 public static void main(String[] args) {
  String apenom,especialidad,motivo;
  String aux2 = "";
  int cat,i,j;
  double monto;
  Proyecto p = new Proyecto("Aviones",22,"coso",2);
  System.out.println("Bievenido al proyecto, ingrese investigadores");
  for(i = 0; i < 2;i++){
   System.out.println("--------------------------------------------" + i + "----");   
   System.out.println("Nombre del investigador: ");
   apenom = Lector.leerString();
   System.out.println("Categoria del investigador(1..5): ");
   cat = Lector.leerInt();
   System.out.println("Especialidad del investigador: ");
   especialidad = Lector.leerString();
   System.out.println("------------------------------------------------------");  
   Investigador inv = new Investigador(apenom,cat,especialidad);
   p.agregarInvestigador(inv);
   for(j = 0;j < 2;j++){
    String aux;
    System.out.println("Otorgamiento de subsidio " + j + " al investigador ");
    System.out.println("Monto del subsidio: ");
    monto = Lector.leerDouble();
    System.out.println("Motivo del subsidio: ");
    motivo = Lector.leerString();
    Subsidio s = new Subsidio(monto,motivo);
    inv.agregarSubsidio(s);
    aux = s.toString();
    aux2 = aux;
    System.out.println("----------------------------------------------------");
   }
   System.out.println("***********************************************************");  
   System.out.println(p.toString() + inv.toString() + aux2);
   System.out.println("***********************************************************");
  } 
 }   
}
