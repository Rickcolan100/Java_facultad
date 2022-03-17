package tema4;
public class Flota {
 private int cantm = 0; //DIMENSION LOGICA DE LA FLOTA
 private Micro mic[] = new Micro[15];
  
  public Flota(){
      
  }

  public int getCantm() {
   return cantm;
  }

  public void setCantm(int cantm) {
   this.cantm = cantm;
  }
 
  public boolean estaCompleta(){
   return this.cantm == 15;   
  }
  
  public void agregarMicro(Micro m){
   if(!this.estaCompleta()){   
    this.mic[this.cantm] = m;
    System.out.println("Cantidad de micros agregados: " + this.cantm);
    this.cantm++;
   } 
  }
  
  public boolean eliminarMicro(String pat){
   int i = 0,j,pos = 0;   
   boolean ok,valido = false;
   ok = false;
   while((i < this.cantm)&&(!this.mic[i].getPat().equals(pat))&&(mic[i] != null)){
    if(this.mic[i].getPat().equals(pat)){
     pos = i;   
     ok = true;
    } 
    i++;    
   } 
   if(ok == true){
    valido = ok;   
    for(j = pos;j < this.cantm-1;j++)
     mic[j] = mic[j+1];
    this.cantm--;
   } 
   return valido;
  }
 
  public Micro buscarPorPatente(String pat){ 
   int i = 0;
   while((i < this.cantm)&&(!mic[i].getPat().equals(pat))&&(mic[i] != null)){
    if(mic[i].getPat().equals(pat))
     return this.mic[i];
    i++;   
   }
   return null;
  }
 
  public Micro buscarPorDestino(String dest){   
   int i = 0;
   while((i < this.cantm)&&(!mic[i].getDest().equals(dest))&&(mic[i] != null)){
    if(mic[i].getDest().equals(dest))
     return this.mic[i];
    i++;    
   }   
   return null;   
  }
  
}
