package actividadteoria;
public abstract class Recital {
 private String banda;
 private String []temas;
 private int dimf_temas;
 private int diml_temas;
 
 public Recital(String banda,int canttemas){
  setBanda(banda);
  dimf_temas = canttemas;
  temas = new String[dimf_temas];
  dimf_temas = 0;
 }
 
 public String getBanda() {
  return banda;
 }

 public void setBanda(String banda) {
  this.banda = banda;
 }

 public int getDimf_temas() {
  return dimf_temas;
 }

 public int getDiml_temas() {
  return diml_temas;
 }
 
 public void agregarTema(String tema){
  temas[diml_temas] = tema;
  diml_temas++;
 }
 
 public void actuar(){
  for(int i = 0;i < diml_temas;i++){
   System.out.println("y ahora tocaremos..." + temas[i]);
  }     
 }
 
 public abstract boolean finalizado();
 
 public abstract double calcularCosto();
 
}
