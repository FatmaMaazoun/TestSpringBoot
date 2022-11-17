package tn.magasin.fatmamaazountest.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.magasin.fatmamaazountest.entities.Produit;

public interface ProduitRepository extends JpaRepository<Produit,Long> {

}
