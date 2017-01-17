package hei.tp03.dao;

import hei.tp03.entity.Commande;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by N0stress on 17/01/2017.
 */
public interface CommandeDAO extends JpaRepository<Commande, Long> {
}
