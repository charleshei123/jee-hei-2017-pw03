package hei.tp03.entity;

/**
 * Created by N0stress on 17/01/2017.
 */
public class Produit {

    private String nom;
    private Commande commande;

    public Produit(String nom, Commande commande) {
        this.nom = nom;
        this.commande = commande;
    }

    public Produit() {
    }
}
