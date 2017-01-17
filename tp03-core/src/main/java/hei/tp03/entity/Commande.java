package hei.tp03.entity;

import java.util.List;

/**
 * Created by N0stress on 17/01/2017.
 */
public class Commande {

    private boolean validee;
    private Client client;
    private List<Produit> produits;

    public Commande(Client client) {
        this.client = client;
    }

    public Commande() {
    }
}
