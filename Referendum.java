package tema5;
public class Referendum extends Urna{
  private int cantc;
  private int cantf;
  
  public Referendum(int unNum){
   super(unNum);
   this.cantc = 0;
   this.cantf = 0;
  }

  public int getCantc() {
   return cantc;
  }

  public void setCantc(int cantc) {
   this.cantc = cantc;
  }

  public int getCantf() {
   return cantf;
  }

  public void setCantf(int cantf) {
   this.cantf = cantf;
  }
  
  public void votarAFavor(){
   this.cantf++;   
  }
  
  public void votarEnContra(){
   this.cantc++;   
  }
   
  public int calcularGanador(){
   if(this.cantf > this.cantc)
    return 1;
   if(this.cantc > this.cantf)
    return 0;
   return -1;   
  }
  
  public int calcularTotalVotos(){
   return this.getCantc() + this.getCantf() + this.getCantb();
  }
    
}
