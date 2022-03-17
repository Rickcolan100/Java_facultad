package tema5;
public abstract class Personas {
 private String nom;
 private int dni;
 
 public Personas(String unN,int unDNI){
  setNom(unN);
  setDNI(unDNI);
 }

 public String getNom() {
  return nom;
 }

 public void setNom(String nom) {
  this.nom = nom;
 }

 public int getDNI() {
  return dni;
 }

 public void setDNI(int dni) {
  this.dni = dni;
 }
 
 public String toString(){
  String aux;
  aux = "Mi nombre es " + this.getNom() + ", mi DNI: " + this.getDNI();
  return aux;
 }
 
}
