package tn.magasin.fatmamaazountest.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.magasin.fatmamaazountest.entities.DetailProduit;

public interface DetailProduitRepository extends JpaRepository<DetailProduit,Long> {
}
