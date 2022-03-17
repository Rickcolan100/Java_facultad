package tema4;
public class Autor {
 private String nom;
 private String bio;
 
 public Autor(String unNom, String unaBio){
  nom = unNom;
  bio = unaBio;
 }
 
 public Autor(){
     
 }

 public String getNom() {
  return nom;
 }

 public void setNom(String nom) {
  this.nom = nom;
 }

 public String getBio() {
  return bio;
 }

 public void setBio(String bio) {
  this.bio = bio;
 }
 
 @Override
 public String toString(){
  String aux; 
  aux = "El nombre del autor es " + this.getNom() + " y su biografia es " + this.getBio();
  return aux;   
 }
}
