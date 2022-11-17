package tn.magasin.fatmamaazountest.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.magasin.fatmamaazountest.entities.DetailFacture;

public interface DetailFactureRepository extends JpaRepository<DetailFacture,Long> {
}
