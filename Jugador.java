package tema5;
public class Jugador extends Empleado{
 private int cantp;
 private int ngol;
 
 public Jugador(String unNom,double unSueldo,int unCantp,int unNgol){
  super(unNom,unSueldo);
  setCantp(unCantp);
  setNgol(unNgol);
 }

 public int getCantp() {
  return cantp;
 }

 public void setCantp(int cantp) {
  this.cantp = cantp;
 }

 public int getNgol() {
  return ngol;
 }

 public void setNgol(int ngol) {
  this.ngol = ngol;
 }
 
 public double calcularSueldoACobrar(){
  double prom = 0;
  prom = this.getNgol()/this.getCantp();
  if(prom > 0.5)
   return this.getSueldo()*2;
  return this.getSueldo();
 }
 
 public String toString(){
  String aux;
  aux = super.toString() + " - CANTIDAD DE PARTIDOS: " + this.getCantp() + " - NUMERO DE GOLES: " + this.getNgol();
  return aux;
 } 
    
}
