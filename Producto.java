package ar.edu.unlp.info.oo1.ejercicio3_balanzaBis;

public class Producto {
 private double peso;
 private double precioPorKilo;
 private String descripcion;
 
 public Producto() {
	 
 }
 
 public double getPeso() {
		return peso; 
 }
 
 public void setPeso(double peso) {
		this.peso = peso;
 }
 
 public double getPrecioPorKilo() {
		return precioPorKilo;
 }

 public void setPrecioPorKilo(double precioPorKilo) {
		this.precioPorKilo = precioPorKilo;
 }
 
 public String getDescripcion() {
		return descripcion;
 }
	
 public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
 }
 
 public String toString() {
   return "Producto [ Nombre: " + descripcion() + ", Precio: " +  precio() + " ].";
 }
 
 public double precio() {
  double calculo = this.getPeso() * this.getPrecioPorKilo();
  return calculo;
 }
 
 public String descripcion() {
  return this.getDescripcion();	 
 }
 
}
