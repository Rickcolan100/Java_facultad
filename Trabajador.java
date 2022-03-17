package tema5;
public class Trabajador extends Personas {
 private int edad;
 private String trabajo;
 
 public Trabajador(String unNom,int unDNI,int unaEdad,String unTrabajo){
  super(unNom,unDNI);
  setEdad(unaEdad);
  setTrabajo(unTrabajo);
 }

 public int getEdad() {
  return edad;
 }

 public void setEdad(int edad) {
  this.edad = edad;
 }

 public String getTrabajo() {
  return trabajo;
 }

 public void setTrabajo(String trabajo) {
  this.trabajo = trabajo;
 }

   
 public String toString() {
  return super.toString() + " y tengo " + this.getEdad() + ".Soy " + this.getTrabajo();
 }
 
 
 
 
}
