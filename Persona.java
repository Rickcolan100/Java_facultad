package tema5;
public class Persona extends Personas {
 private int edad;

 public Persona(String unNom,int unDNI,int unaEdad){
  super(unNom,unDNI);
  setEdad(unaEdad);
 } 

 public int getEdad() {
  return edad;
 }

 public void setEdad(int edad) {
  this.edad = edad;
 }
 
 public String toString(){
  String aux; 
  aux = super.toString() + " y tengo " + this.getEdad() + " años.";
  return aux;
 }
}
