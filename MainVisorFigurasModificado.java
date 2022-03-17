package tema5;
public class MainVisorFigurasModificado {
  public static void main(String[] args) {
    System.out.println("A continuacion se cargara el vector de figuras");
    VisorFigurasModificado vsr = new VisorFigurasModificado();
    Figura f = new Cuadrado(10,"Violeta","Rosa");  
    vsr.guardar(f);
    Figura g = new Cuadrado(30,"Rojo","Naranja");
    vsr.guardar(g);
    Figura h = new Rectangulo(20,10,"Azul","Celeste"); 
    vsr.guardar(h);
    System.out.println("- YA SE CARGO -");
    System.out.println("A continuacion se mostrara el vector de figuras");
    vsr.mostrar();
  }
    
}
