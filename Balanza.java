package ar.edu.unlp.info.oo1.ejercicio3_balanzaBis;

import java.util.ArrayList;
import java.util.List;

public class Balanza {
 private int cantidadDeProductos;
 private double precioTotal;
 private double pesoTotal;
 private List<Producto> productos = new ArrayList<Producto>();
 private Ticket ticket;
 private Producto p;

 
 public Balanza(){
	 
 }
 
 public int getCantidadDeProductos() { 
	return cantidadDeProductos;
 }
 
 public void setCantidadDeProductos(int cantidadDeProductos) {
 	this.cantidadDeProductos++;
 }
 
 public double getPrecioTotal() {
	return precioTotal;
 }
 
 public void setPrecioTotal(double precioTotal) {
	this.precioTotal = precioTotal;
 }
 
 public double getPesoTotal() {
	return pesoTotal;
 }
 
 public void setPesoTotal(double pesoTotal) {
	this.pesoTotal = pesoTotal;
 }

 public void agregarProducto(Producto item) { 
  this.productos.add(item);
  this.cantidadDeProductos++;
 }
 
 public String toString() {
  return "Balanza [Precio total: " + getPrecioTotal() + ", Peso total: " + getPesoTotal() + ", Cantidad de productos: " + getCantidadDeProductos() + " ]."; 
 }

 public Ticket emitirTicket() {
  for(Producto producto : productos)
	producto.toString();
  this.toString();
  ticket.toString();
  return this.ticket;
 }
 
 public Producto PrecioTotal() {
   double total = 0;
   for(Producto producto : productos) 
	total =+ producto.precio();
   this.setPrecioTotal(total);
   return this.p;
 }
 
 public Producto PesoTotal() {
  double total = 0;	 
  for(Producto producto : productos) 
    total =+ producto.getPeso();
  this.setPesoTotal(total);
  return this.p;
 }

 public void ponerEnCero() {
   this.cantidadDeProductos = 0;
   this.pesoTotal = 0;
   this.precioTotal = 0;
   this.productos.clear();
 } 
 
}
