package GestionMagasin;

import java.util.ArrayList;
import java.util.List;

public class Magasin {
    private List<Produit> produits;
    //init list
    public Magasin() {
        this.produits = new ArrayList<>();
    }

    public void ajouterProduit(Produit produit) {
        produits.add(produit);
    }
    // éléments de la liste infos
    public void afficherProduitsDisponibles() {
        for (Produit p : produits) {
            System.out.println(p.getNom() + " - " + p.getPrix() + " € (Stock: " + p.getQuantite() + ")");
        }
    }
    //retourne le nom sinon rien
    public Produit trouverProduitParNom(String nom) {
        for (Produit p : produits) {
            return p;
        }
        return null;
    }
}
