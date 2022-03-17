package actividadteoria;
public class Autor {
 private String nom;
 private String bio;
 
 public Autor(String nom, String bio) {
    this.nom = nom;
    this.bio = bio;
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

    
}
