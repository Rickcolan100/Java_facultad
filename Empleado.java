package tema5;
public abstract class Empleado {
 private String Nom;
 private double Sueldo;
 
 public Empleado(String unNom,double unSueldo){
  setNom(unNom);   
  setSueldo(unSueldo);   
 }

 public String getNom() {
  return Nom;
 }

 public void setNom(String Nom) {
  this.Nom = Nom;
 }

 public double getSueldo() {
  return Sueldo;
 }

 public void setSueldo(double Sueldo) {
  this.Sueldo = Sueldo;
 }
 
 public String toString(){
  String aux;
  aux = "Nombre: " + this.getNom() + " - SUELDO A COBRAR: " + this.calcularSueldoACobrar();
  return aux;
 }
 
 public abstract double calcularSueldoACobrar();

}
