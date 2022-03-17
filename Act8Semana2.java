package tema4;
import PaqueteLectura.Lector;
public class Act8Semana2 {
  public static void main(String[] args) { 
    String pat,dest;
    Flota f = new Flota();
    Micro m = new Micro();
    System.out.println("Bienvenido al programa,por favor ingrese patente y destino del micro");
    System.out.println("para almacenar en la flota de micros - Con patente ZZZ000 deja de almacenar");
    System.out.println("-------------------------------------------------------------------------------");
    System.out.println("Ingrese patente del micro: ");
    pat = Lector.leerString();
    m.setPat(pat);
    while((!m.getPat().equals("ZZZ000"))&&(!f.estaCompleta()&&(m != null))){
     System.out.println("Ingrese destino del micro: ");
     dest = Lector.leerString();
     m.setPat(dest);   
     f.agregarMicro(m);
     System.out.println("Ingrese patente del micro: ");
     pat = Lector.leerString();
     m.setPat(pat);
    }
    System.out.println("-------------------------------------------------------------------------------");
    System.out.println("ELEMENTOS CARGADO - Puede empezar a realizar lo pedido");
    System.out.println("- BORRADO DE MICRO -");
    System.out.println("Ingrese patente del micro que quiere quitar: ");
    pat = Lector.leerString();
    if(f.eliminarMicro(pat))
     System.out.println("El micro buscado fue eliminado");
    else
     System.out.println("La patente del micro no existe,por lo tanto el micro tampoco");
    System.out.println("- BUSQUEDA DE PATENTE DE MICRO BORRADO -");
    System.out.println("Ingrese patente del micro a buscar: ");
    pat = Lector.leerString();
    System.out.println("Micro:" + f.buscarPorPatente(pat));
    System.out.println("- BUSQUEDA DE DESTINO DE MICRO -");
    System.out.println("Ingrese destino del micro a buscar: ");
    dest = Lector.leerString();
    System.out.println("Micro:" + f.buscarPorDestino(dest));
    System.out.println("-------------------------------------------------------------------------------");  
  }
    
}
