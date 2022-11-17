package tn.magasin.fatmamaazountest.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.magasin.fatmamaazountest.entities.Facture;

public interface FactureRepository extends JpaRepository<Facture,Long> {
}
