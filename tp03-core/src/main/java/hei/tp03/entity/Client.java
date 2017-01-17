package hei.tp03.entity;

import com.google.common.base.Strings;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * Created by N0stress on 17/01/2017.
 */
public class Client {

    private String nom;
    private String prenom;
    private List<Commande> commandes;


    public Client(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }

    public Client() {

    }
}
