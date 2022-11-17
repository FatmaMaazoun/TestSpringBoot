package tn.magasin.fatmamaazountest.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.magasin.fatmamaazountest.entities.Fournisseur;

public interface FournisseurRepository extends JpaRepository<Fournisseur,Long> {
}
