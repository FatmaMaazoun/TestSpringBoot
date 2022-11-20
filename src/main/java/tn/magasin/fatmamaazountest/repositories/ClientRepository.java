package tn.magasin.fatmamaazountest.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import tn.magasin.fatmamaazountest.entities.CategorieClient;
import tn.magasin.fatmamaazountest.entities.Client;

import java.util.Date;

public interface ClientRepository extends JpaRepository<Client,Long> {

@Query("select sum(f.montantFacture) from Facture f,Client c where c.categorieProfession=:categorieClient" +
        " and f.dateFacture between :startDate " +
        " and :endDate " )
    public float getChiffreAffaireParCategorieClient(@Param("categorieClient") CategorieClient categorieClient, @Param("startDate") Date startDate,@Param("endDate") Date endDate);
}
