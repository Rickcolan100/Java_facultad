package tema5;
public class Electoral extends Urna{
  private int cant; //DIMENSION LOGICA DE LA LISTA 
  int cantv[] = new int[5];
  
  public Electoral(int unNum,int cantl){
   super(unNum);
   this.cant = 0;
   this.cantv = new int[cantl];
  }

  public int getCant() {
   return cant;
  }

  public void setCant(int cant) {
   this.cant = cant;
  }
  
  public boolean validarNumeroDeLista(int num){
   return ((num >= 0)&&(num < this.cant));  
  }
  
  public int devolverVotosPorLista(int num){
   int numero = this.cantv[num];
   return numero;   
  }
 
  public void votarPorLista(int num){
   this.cantv[num]++;   
  }
  
  public int calcularGanador(){
   int posmax = -1,i;
   int max = -1;
   for(i = 0;i < this.cant;i++){
    if(this.cantv[i] < max){
     max = this.cantv[i];
     posmax = i;        
    }   
   }
   return posmax;
  }  
  
  public int calcularTotalVotos(){
   int total= 0,i;
   for(i = 0;i < this.cant;i++){
    total = total + this.cantv[i] + this.getCantb();   
   }
   return total;
  }
  
  
}
