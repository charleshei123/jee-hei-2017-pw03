package hei.tp03.entity;

import com.google.common.base.Strings;

import javax.persistence.*;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * Created by N0stress on 17/01/2017.
 */

@Entity
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idClient;

    @Column
    private String nom;

    @Column
    private String prenom;

    @OneToMany(cascade={CascadeType.ALL}, mappedBy="client")
    private List<Commande> commandes;


    public Client(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }

    public Client() {

    }

    public String getNom() {
        return nom;
    }

    public void setCommandes(List<Commande> commandes) {
        this.commandes = commandes;
    }

    public void setIdClient(long idClient) {
        this.idClient = idClient;
    }

    public long getIdClient() {
        return idClient;
    }
}
