package tema5;
public class Triangulo extends Figura{
  private double lado1;
  private double lado2;
  private double lado3;
  
  public Triangulo(double unLado1,double unLado2,double unLado3,String unColorR,String unColorL){
   super(unColorR,unColorL);      
   setLado1(unLado1);
   setLado2(unLado2);
   setLado3(unLado3);   
  }

  public double getLado1() {
   return lado1;
  }

  public void setLado1(double lado1) {
   this.lado1 = lado1;
  }

  public double getLado2() {
   return lado2;
  }

  public void setLado2(double lado2) {
   this.lado2 = lado2;
  }

  public double getLado3() {
   return lado3;
  }

  public void setLado3(double lado3) {
   this.lado3 = lado3;
  }
  
  public double calcularArea(){
   double s = this.getLado1() + this.getLado2() + this.getLado3();
   double area = Math.sqrt(s*((s - this.getLado1())*(s - this.getLado2())*(s - this.getLado3())));
   return area;   
  }
  
  public double calcularPerimetro(){
   double s = this.getLado1() + this.getLado2() + this.getLado3();
   return s;   
  }
  
  public String toString(){
   String aux;
   aux = super.toString() + " Lado 1: " + this.getLado1() + ",Lado 2: " + this.getLado2() + ",Lado 3: " + this.getLado3();
   return aux;
  }
  
    
}
