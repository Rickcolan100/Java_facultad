package tema5;
public class MainVisorFiguras {
  public static void main(String[] args) {
   VisorFiguras visor = new VisorFiguras();
   
   Cuadrado c1 = new Cuadrado(10,"Violeta","Rosa");        
   Rectangulo r= new Rectangulo(20,10,"Azul","Celeste");        
   Cuadrado c2= new Cuadrado(30,"Rojo","Naranja");
   
   visor.mostrar(c1);  //Area: 100.0 CR: Violeta CL: Rosa Lado: 10.0      
   visor.mostrar(r);   //Area: 200.0 CR: Azul CL: Celeste Base: 20.0 Altura: 10.0     
   visor.mostrar(c2);  //Area: 900.0 CR: Rojo CL: Naranja Lado: 30.0
   
   System.out.println(visor.getMostradas()); //3  
   
   //IMPRIME EL CONTENIDO DEL OBJECTO Y LA CANTIDAD DE VECES QUE APARECE CITANDO EL METDODO toString 
   //POR QUE EL METODO ESTA PREDETERMINADO POR EL LENGUAJE ENTONCES LE HACE FACIL COMUNICAR
  }
    
}
