package ar.edu.unlp.info.oo1.ejercicio3_balanzaBis;

public class Ticket {
 private java.time.LocalDate fecha;
 private int cantidadDeProductos;
 private double pesoTotal;
 private double precioTotal;
 Balanza b;
 
 public Ticket() {
	 
 }
 
 public java.time.LocalDate getFecha() {
	return fecha;
 }
 
 public void setFecha(java.time.LocalDate fecha) {
	this.fecha = fecha;
 }
 
 public int getCantidadDeProductos() {
	return cantidadDeProductos;
 }
 
 public void setCantidadDeProductos(int cantidadDeProductos) {
	this.cantidadDeProductos = cantidadDeProductos;
 }

 public double getPesoTotal() {
	return pesoTotal;
 }

 public void setPesoTotal(double pesoTotal) {
	this.pesoTotal = pesoTotal;
 }
 
 public double getPrecioTotal() {
	return precioTotal;
 }
 
 public void setPrecioTotal(double precioTotal) {
	this.precioTotal = precioTotal;
 } 
 
 public Double pesoTotal() {
  return this.pesoTotal = b.getPesoTotal();
 }
 
 public Double precioTotal() {
  return this.precioTotal = b.getPrecioTotal();
 }
 
 public int cantidadDeProductos(){
  return this.cantidadDeProductos = b.getCantidadDeProductos();	 
 }
 
 public Double impuesto() {
  double iva;
  this.precioTotal = b.getPrecioTotal();
  iva = (this.precioTotal *(0.21)); 
  return iva;
 }
 
 public String toString() {
  return " Ticket emitido {FECHA: " + getFecha().getDayOfMonth() + ", Cantidad de productos: " + cantidadDeProductos() + ", Peso total: " + pesoTotal() + ", Precio Total: " + precioTotal()
   + "Precio con Impuestos al 21 %: " + impuesto() + "}." ;	 
 }
 
 
 
}
