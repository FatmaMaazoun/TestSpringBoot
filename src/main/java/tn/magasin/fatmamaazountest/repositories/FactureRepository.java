package tn.magasin.fatmamaazountest.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import tn.magasin.fatmamaazountest.entities.Facture;

import java.util.List;

public interface FactureRepository extends JpaRepository<Facture,Long> {

     /*@Query("select f from Facture f where f.client.idClient =:id")
     List<Facture> getFacturesByClient(@Param("id") Long idClient) ;*/

    List<Facture> getFacturesByClient_IdClient(Long idclient);
    }
