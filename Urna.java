package tema5;
public abstract class Urna {
 private int num;
 private int cantb;
 
 public Urna(int unNum){
  setNum(unNum); 
  this.cantb = 0;  
 }

 public int getNum() {
  return num;
 }

 public void setNum(int num) {
  this.num = num;
 }
 
 public int getCantb() {
  return cantb;
 }

 public void setCantb(int cantb) {
  this.cantb = cantb;
 }
 
 public void votarEnBlanco(){
  this.cantb++;   
 }
 
 public abstract int calcularGanador();
 public abstract int calcularTotalVotos();
    
}
