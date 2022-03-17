package tema4;
public class Micro {
 private String patente;
 private String dest;
 private String hsal; 
 private Boolean a[] = new Boolean[20]; //TRUE ASIENTO OCUPADO - FALSE ASIENTO LIBRE
 private int canta; //DIML del vector de asientos
 
 public Micro(String unPat, String unDest, String unHsal){
  this.patente = unPat;
  this.dest = unDest;
  this.hsal = unHsal;
  this.canta = 0;
 }
 
 public Micro(String unPat, String unDest){
  this.patente = unPat;
  this.dest = unDest;
 } 
 
 public Micro(){
     
 }

 public int getCanta() {  //DEVUELVE LA DIMENSION LOGICA
  return canta;
 }

 public String getDest() {
  return dest;
 }

 public void setDest(String dest) {
  this.dest = dest;
 }

 public String getHsal() {
  return hsal;
 }

 public void setHsal(String hsal) {
  this.hsal = hsal;
 }

 public String getPat() {
  return patente;
 }

 public void setPat(String pat) {
  this.patente = pat;
 }
 
 public void liberarAsiento(int num){
  if(this.validarAsiento(num)){   
   this.a[num] = false;
   this.canta--;
  }
 }
 
 public void ocuparAsiento(int num){
  if(this.validarAsiento(num)){ 
   this.a[num] = true;
   this.canta++;
  } 
 }
 
 public int primerAsientoLibre(){
  int i = 0,pos = -1;   
  while((i < 20)&&(this.a[i])){
   i++;
  }
  if(i != 20)
   pos = i;
  return pos;
 }
  
 public boolean estadoMicro(){
  return this.canta == 20;
 }
 
 public boolean validarAsiento(int num){
  return ((num >= 0)&&(num <= 19));   
 }
 
 @Override
 public String toString(){
  String aux; 
  aux = "El micro con patente - " + this.getPat() + " - parte con destino a " + this.getDest();
  return aux;
 }
  
}
