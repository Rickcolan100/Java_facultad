package Repaso;
public class Subsidio {
  private double mont;
  private String motivo;
  private boolean otorgado; //true otorgado - flase no otorgado  
  
  public Subsidio(double unMont,String unMotivo){
    this.setMont(unMont);
    this.setMotivo(unMotivo);
    this.otorgado = false;
  }

  public double getMont() {
   return mont;
  }

  public void setMont(double mont) {
   this.mont = mont;
  }

  public String getMotivo() {
   return motivo;
  }

  public void setMotivo(String motivo) {
   this.motivo = motivo;
  } 
  
  public boolean estaOtorgado() {
   return otorgado;
  }
  
  public void Otorgar(){
   this.otorgado = true;  
  }
  
  public String toString(){
   String aux;
   aux = " Monto del subsidio otorgado: " + this.getMont() + " , por el motivo: " + this.getMotivo();
   return aux;
  }
    
}
