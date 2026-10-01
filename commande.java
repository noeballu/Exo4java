/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GestionMagasin;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Noé
 */
public class Commande {
    private int idCommande;
    private String client;
    private List<Produit> produitsCommandes;
    private double total;
    
    public Commande(int idCommande, String client, Panier panier) {
        this.idCommande = idCommande;
        this.client = client;
        this.produitsCommandes = new ArrayList<>(panier.getProduits());
        this.total = panier.calculerTotal();
    }
    //affiche les infos en prenant aussi les éléments de la liste
    public void afficherDetailsCommande() {
        System.out.println("Idcommande°" + idCommande);
        System.out.println("Client: " + client);
        for (Produit p : produitsCommandes) {
            System.out.println("- " + p.getNom() + " x" + p.getQuantite());
        }
        System.out.println("Total: " + total + " €");
    }
}
