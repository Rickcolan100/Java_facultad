package actividadteoria;
public class Estanteria {
  private int dimf_F;
  private int dimf_C;
  private Libro [][]matriz;
    
  public Estanteria(int N,int M){
   this.inicializar(N,M);
  }
  
  public Estanteria(){
   this.inicializar(5,10);    
  }
  
  private void inicializar(int N,int M){
   dimf_F = N;
   dimf_C = M;
   matriz = new Libro[dimf_F][dimf_C];
   for(int i = 0;i < dimf_F;i++){
    for(int j = 0;i < dimf_C;j++)
     matriz[i][j] = null;   
   }        
  }
  
  public void almacenarLibro(Libro l,int estante,int lugar){
   matriz[estante][lugar] = l;   
  }
  
  public Libro sacarLibro(String titulo){
   int i = 0,j = 0;
   Libro aux = null;
   Boolean encontre = false;
   while((i < dimf_F)&&(!encontre)){
    j = 0;   
    while((j < dimf_C)&&(!encontre)){
     if((matriz[i][j] != null)&&(matriz[i][j].getTitulo().equals(titulo))){
      encontre = true;
      aux = matriz[i][j];  
      matriz[i][j] = null;
     }
     else j++;
    }
    if(!encontre)
     i++;   
   }
   return aux;
  }
  
  public Libro calcularLibroMasGrande(){
   Libro lmax = null;
   int max = -1;
   for(int i = 0;i < dimf_F;i++){
    for(int j = 0;i < dimf_C;j++){
     if((matriz[i][j] != null)&&(matriz[i][j].getCantidadPaginas() > max)){
      max = matriz[i][j].getCantidadPaginas();  
      lmax = matriz[i][j];
     } 
    }    
   }  
   return lmax;   
  }
  
  public int calcularEstanteMasPesado(){
   Libro lmax = null;
   int max = -1,emax = 0,pesototal = 0;
   for(int i = 0;i < dimf_F;i++){
    pesototal = 0;   
    for(int j = 0;i < dimf_C;j++){
     if(matriz[i][j] != null){
      pesototal = pesototal + matriz[i][j].getPeso();  
     } 
    }
    if(pesototal > max){
     max = pesototal;
     emax = i;
    }  
   }  
   return emax;      
  }
  
    
}
