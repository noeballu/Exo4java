package GestionMagasin;

/**
 *
 * @author Noé
 */
public class Produit {
    private int id;
    private String nom;
    private double prix;
    private int quantite;

    public Produit(int id, String nom, double prix, int quantite) {
        this.id = id;
        this.nom = nom;
        this.prix = prix;
        this.quantite = quantite;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public double getPrix() {
        return prix;
    }

    public int getQuantite() {
        return quantite;
    }

    // Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    // Affichage
    public void afficherDetails() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "Produit{" + "id=" + id + ", nom='" + nom + '\'' + ", prix=" + prix + ", quantite=" + quantite + '}';
    }
}
