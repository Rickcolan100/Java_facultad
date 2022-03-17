package actividadteoria;
public class Gira extends Recital{
 private String nom;
 private Fecha fechas[];
 private int dimf_fecha;
 private int diml_fecha;
 private int actual;
 
 public Gira(String nom,int cantfechas,String banda,int canttemas){
  super(banda,canttemas);   
  setNom(nom);
  dimf_fecha = cantfechas;
  fechas = new Fecha[dimf_fecha];
  diml_fecha = 0;
  actual = 0;
 }

 public String getNom() {
  return nom;
 }

 public void setNom(String nom) {
  this.nom = nom;
 }

 public int getDimf_fecha() {
  return dimf_fecha;
 }

 public int getDiml_fecha() {
  return diml_fecha;
 }

 public int getActual() {
  return actual;
 }
 
 public void agregarFecha(Fecha f){
  fechas[diml_fecha] = f;
  diml_fecha++;
 }
 
 public void actuar(){
  System.out.println("Buenas noches..." + fechas[actual].getCiudad());
  super.actuar();
  actual++;
 }
 
 public boolean finalizado(){
  return (actual == diml_fecha);   
 }
 
 public double calcularCosto(){
  return (30000*diml_fecha);  
 }
 
}
