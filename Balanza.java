package tema3;
public class Balanza {
 private double mont;
 private int cant;
 private int preciokg;
 private int pesokg;
 private String resumen;
 private Producto p;
 
  public Balanza(double unMont,int unCant,int unPrecioKg, int unPesoKg){
   mont = unMont;
   cant = unCant;
   preciokg = unPrecioKg;
   pesokg = unPesoKg;   
  }

  public double getMont() {
        return mont;
  }

  public void setMont(double mont) {
        this.mont = mont;
  }

  public int getCant() {
        return cant;
  }

  public void setCant(int cant) {
        this.cant = cant;
  }

  public int getPreciokg() {
        return preciokg;
  }

  public void setPreciokg(int preciokg) {
        this.preciokg = preciokg;
  }

  public double getPesokg() {
        return pesokg;
  }

  public void setPesokg(int pesokg) {
        this.pesokg = pesokg;
  }
  
  public void iniciarCompra(){
    mont = 0.0;
    cant = 0;
  }
  
  public void registrarProducto(Producto p){
    double precio = (this.getPesokg()*this.getPreciokg());    
    this.mont = precio;
    this.cant++;
    this.resumen = p.getDescripcion() + " - " + this.mont;
  }
 
  public String devolverMontoAPagar(){
   String aux;
   aux = "El monto de la compra actual es de " + this.getMont();
   return aux;
  }
  
  public String devolverResumenDeCompra(){
   String aux,act = "";
   act = act + this.resumen;
   aux = act + " ,El monto total de la compra es de " + this.getMont() + ", por la compra de " + this.getCant() + " productos." ;
   return aux;
  }
 
    
}
