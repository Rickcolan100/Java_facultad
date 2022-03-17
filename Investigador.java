package Repaso;
public class Investigador {
  private String apenom;
  private int cat; //1..5
  private String especialidad;
  private int cantS = 0; //dimension logica
  Subsidio v[] = new Subsidio[5];
  
  public Investigador(String unApeyNom,int unaCat,String unaEspecialidad){
   this.setApenom(unApeyNom);
   this.setCat(unaCat);
   this.setEspecialidad(unaEspecialidad); 
   this.cantS = 0;
  }

  public String getApenom() {
   return apenom;
  }

  public void setApenom(String apenom) {
   this.apenom = apenom;
  }

  public int getCat() {
   return cat;
  }

  public void setCat(int cat) {
   this.cat = cat;
  }

  public String getEspecialidad() {
   return especialidad;
  }

  public void setEspecialidad(String especialidad) {
   this.especialidad = especialidad;
  }

  public int getCantS() {
   return cantS;
  }
  
  public boolean estaCompleto(){
   return this.cantS == 5;   
  }
  
  public void agregarSubsidio(Subsidio s){
   if(!this.estaCompleto()){
    this.v[this.cantS] = s;
    this.cantS++;
   }   
  }
  
  public double dineroOtorgado(){
   int i;
   double total = 0.0;
   for(i = 0; i < this.cantS;i++)
     total = total + v[i].getMont();
   return total;
  }

  public Subsidio[] getV() {  //devuelve el vector entero
   return v;
  }
  
  public String toString(){
   String aux;
   aux = " Apellido y nombre: " + this.getApenom() + " ,Categoria: " + this.getCat() + " , ";
   return aux;   
  }
       
}
