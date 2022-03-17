package actividadteoria;
public class EventoOcasional extends Recital{
 private String motivo;
 private String contratante;
 private String dia;
 private boolean finalizo = false;
 
 public EventoOcasional(String motivo,String contratante,String dia,String banda,int canttemas){
  super(banda,canttemas);
  setMotivo(motivo);
  setContratante(contratante);
  setDia(dia);
 }

 public String getMotivo() {
  return motivo;
 }

 public void setMotivo(String motivo) {
  this.motivo = motivo;
 }

 public String getContratante() {
  return contratante;
 }

 public void setContratante(String contratante) {
  this.contratante = contratante;
 }

 public String getDia() {
  return dia;
 }

 public void setDia(String dia) {
  this.dia = dia;
 }
 
 public void actuar(){
  if(motivo.equals("beneficencia"))
   System.out.println("Recuerden colaborar con..." + contratante);
  else
   if(motivo.equals("show de tv"))
     System.out.println("Saludos amigos televidentes");
   else 
    if(motivo.equals("show privado"))
     System.out.println("Un feliz cumpleaños para " + contratante);    
  super.actuar();
  finalizo = true;
 }
 
 public boolean finalizado(){
  return finalizo;   
 }
 
 public double calcularCosto(){
  double costo = -1;   
  if(motivo.equals("beneficencia"))
   costo = 0;
  else
   if(motivo.equals("show de tv"))
     costo = 50000;
   else 
    if(motivo.equals("show privado"))
     costo = 150000;
  return costo; 
 }
    
}
