package tema5;
public class Circulo extends Figura{
 double radio;
 
 public Circulo(double unR,String unCR,String unCL){
  super(unCR,unCL);
  setRadio(unR);
 }
 
 public double getRadio() {
  return radio;
 }

 public void setRadio(double radio) {
  this.radio = radio;
 }
 
 public double calcularArea(){
  double a = (Math.PI*(Math.pow(this.getRadio(), 2))); 
  return a;   
 }
 
 public double calcularPerimetro(){
  double p = (2*(Math.PI*this.getRadio()));
  return p;
 }
 
 public String toString(){
  String aux;
  aux = super.toString() + " Radio: " + this.getRadio();
  return aux;
 }
 
    
}
