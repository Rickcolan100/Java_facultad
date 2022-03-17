package tema5;
public class Entrenador extends Empleado{
 private int cant;
 
 public Entrenador(String unNom,double unSueldo,int unCant){
  super(unNom,unSueldo);
  setCant(unCant);
 }

 public int getCant() {
  return cant;
 }

 public void setCant(int cant) {
  this.cant = cant;
 }
 
 public double calcularSueldoACobrar(){
  double s = 0;   
  if((this.getCant() >= 1)&&(this.getCant() <= 4))
   return this.getSueldo() + 5000;
  if((this.getSueldo() >= 5)&&(this.getSueldo() <= 10))
   return this.getSueldo() + 30000;
  return this.getSueldo();
 }
  
 public String toString(){
  String aux;
  aux = super.toString() + " - CANTIDAD DE CAMPENONATOS GANADOS: " + this.getCant();
  return aux;
 }  
    
}
