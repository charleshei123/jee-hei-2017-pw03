package hei.tp03.entity;

import org.springframework.data.annotation.Id;

import javax.persistence.*;
import java.util.List;

/**
 * Created by N0stress on 17/01/2017.
 */

@Entity
public class Commande {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idCommande;

    @Column
    private boolean validee;

    @ManyToOne
    private Client client;

    @OneToMany(cascade={CascadeType.ALL}, mappedBy="commande")
    private List<Produit> produits;


    public Commande(Client client) {
        this.client = client;
    }

    public Commande() {
    }
}
