package actividadteoria;
public class Libro {
   private String titulo;
   private Autor primerAutor; 
   private int peso; //en gramos
   private int cantidadPaginas;
   
   public Libro(String titulo,Autor primerAutor,int peso,int cantidadPaginas){
    this.titulo = titulo;
    this.primerAutor = primerAutor;
    this.peso = peso;
    this.cantidadPaginas = cantidadPaginas;
   }
      
   public String getTitulo(){
        return titulo;
   }
  
   public Autor getPrimerAutor(){
        return primerAutor;
   } 

   public int getCantidadPaginas() {
        return cantidadPaginas;
   }

   public int getPeso() {
        return peso;
   }
    
   public void setTitulo(String unTitulo){
        titulo = unTitulo;
   }
 
   public void setPrimerAutor(Autor unPrimerAutor){
         primerAutor=unPrimerAutor;
   } 

   public void setCantidadPaginas(int cantidadPaginas) {
        this.cantidadPaginas = cantidadPaginas;
   }

   public void setPeso(int peso) {
        this.peso = peso;
   }
 
   @Override
   public String toString(){
    String aux; // Variable auxiliar utilizada por el metodo. No es parte del estado
    aux=titulo + " escrito por " + primerAutor.getNom() + " cantidad de páginas " + cantidadPaginas + " peso " + peso;
    return ( aux);
   }
          
}
