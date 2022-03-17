package tema3;
import PaqueteLectura.Lector;
public class Act2Semana2 {
  public static void main(String[] args) {
   Balanza b;
   Producto p;   
   double mont = 0.0;
   int cant = 0,preciokg,pesokg;
   String desc;
   System.out.println("Bienvenido al programa,cargue precio en kg y peso en kg del producto para calcular su monto");
   System.out.println("Ingrese peso del producto: ");
   pesokg = Lector.leerInt();
   while(pesokg != 0){
     System.out.println("Ingrese precion en kg del producto: ");
     preciokg = Lector.leerInt();
     System.out.println("Ingrese nombre del producto: ");
     desc = Lector.leerString();
     p = new Producto(preciokg,desc);  
     b = new Balanza(mont,cant,preciokg,pesokg); 
     b.iniciarCompra();
     b.registrarProducto(p);
     System.out.println(b.devolverMontoAPagar());
     System.out.println("Ingrese peso del producto: ");
     pesokg = Lector.leerInt();
     if(pesokg == 0){
      System.out.println("A continuacion se mostrara el resumen de la compra");
      System.out.println(b.devolverResumenDeCompra());
     } 
   }
  }   
}
