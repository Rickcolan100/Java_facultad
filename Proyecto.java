package Repaso;
public class Proyecto {
  private String nom;
  private int cod;  
  private String director;
  private int cantI = 0; //dimension logica
  Investigador vec[] = new Investigador[50];
  
  public Proyecto(String unNom,int unCod,String unDirector, int unaCantidad){
   this.setNom(unNom);
   this.setCod(unCod);
   this.setDirector(unDirector);
   this.setCantI(unaCantidad);
  }
  
  public void setCantI(int cantI) {
   this.cantI = cantI;
  }

  public String getNom() {
   return nom;
  }

  public void setNom(String nom) {
   this.nom = nom;
  }

  public int getCod() {
   return cod;
  }

  public void setCod(int cod) {
   this.cod = cod;
  }
  
  public String getDirector() {
   return director;
  }

  public void setDirector(String director) {
   this.director = director;
  }
  
  public boolean estaCompleto(){
   return this.cantI == 50;   
  }
  
  public void agregarInvestigador(Investigador i){
   if(!this.estaCompleto()){
    this.vec[this.cantI] = i;   
    this.cantI++;   
   }         
  }
  
  public double dineroTotalOtorgado(){
   int i;
   double total = 0.0;
   for(i = 0;i < this.cantI;i++)
     total = vec[i].dineroOtorgado() + total;
   return total;
  }
  
  public Investigador buscarInvestigador(String apeynom){
   int i;
   for(i = 0;i < this.cantI;i++){
    if(this.vec[i].getApenom().equals(apeynom))
     return this.vec[i];  
   }   
   return null;   
  }
  
  public int cantidadDeSubisidios(String apeynom){
   Investigador inv = this.buscarInvestigador(apeynom);
   if(inv != null)
     return inv.getCantS();
   return -1;
  }
  
  public void otorgarTodos(String apeynom){
   int i;   
   Investigador inv = this.buscarInvestigador(apeynom);
   Subsidio[] v = inv.getV();
   int cant = inv.getCantS();
   if(inv != null){
    for(i = 0; i < cant;i++){
     if(!v[i].estaOtorgado())
      v[i].Otorgar();
    }
   } 
  }
  
  public String toString(){
   String aux,aux2;   
   aux = "Nombre del proyecto: " + this.getNom() + " ,Codigo del proyecto: " + this.getCod() + " ,Nombre y apellido del director " + this.getDirector();
   aux2 = aux + " ,cantidad de dinero aportado al proyecto: " + this.dineroTotalOtorgado();
   return aux2;   
  }

}
