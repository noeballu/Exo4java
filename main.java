/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GestionMagasin;

/**
 *
 * @author Noé
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Magasin magasin = new Magasin();
        Panier panier = new Panier();

        // Produits de base dans le magasin
        magasin.ajouterProduit(new Produit(1, "Clavier", 50.0, 10));
        magasin.ajouterProduit(new Produit(2, "Souris", 25.0, 15));
        magasin.ajouterProduit(new Produit(3, "Ecran", 150.0, 5));

        int choix = 0;

        while (choix != 5) {
            System.out.println("\n--- Menu Magasin ---");
            System.out.println("1. Afficher les produits disponibles");
            System.out.println("2. Ajouter un produit au panier");
            System.out.println("3. Afficher le panier");
            System.out.println("4. Passer la commande");
            System.out.println("5. Quitter");
            System.out.print("Votre choix : ");

            choix = scanner.nextInt();
            scanner.nextLine(); // Nettoie la ligne

            if (choix == 1) {
                magasin.afficherProduitsDisponibles();
            } else if (choix == 2) {
                System.out.print("Name to add: ");
                String nom = scanner.nextLine();
                Produit p = magasin.trouverProduitParNom(nom);
                if (p != null) {
                    panier.ajouterProduit(p);
                } else {
                    System.out.println("error");
                }
            } else if (choix == 3) {
                panier.afficherPanier();
                System.out.println("Total :" + panier.calculerTotal() + " €");
            } else if (choix == 4) {
                Commande commande = new Commande(1, "Client", panier);
                commande.afficherDetailsCommande();
            } else if (choix == 5) {
                System.out.println("Byebye");
            } else {
                System.out.println("invalid");
            }
        }

        scanner.close();
    }
}
