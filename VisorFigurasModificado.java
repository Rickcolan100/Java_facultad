package tema5;
public class VisorFigurasModificado {
  private int guardadas;    
  private Figura [] vector;
  
  public VisorFigurasModificado(){
   vector = new Figura[5];
   this.guardadas = 0;
  }    
     
  public void guardar(Figura f){
   if(this.quedaEspacio()){
    vector[this.guardadas] = f;
    guardadas++;
   }
  }
  
  public boolean quedaEspacio(){
   return guardadas != 5;   
  }    
  
  public void mostrar(){
   int i;   
   for(i = 0;i < guardadas;i++)
    System.out.println(vector[i].toString());
  }
    
  public int getGuardadas() {        
   return guardadas;    
  }
}
