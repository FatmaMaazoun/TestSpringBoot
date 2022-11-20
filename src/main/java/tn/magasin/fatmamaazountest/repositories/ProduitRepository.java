package tn.magasin.fatmamaazountest.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import tn.magasin.fatmamaazountest.entities.Produit;

import java.util.Date;

public interface ProduitRepository extends JpaRepository<Produit,Long> {
    @Query("SELECT sum(df.prixTotal) FROM DetailFacture df where df.produit=:produit and df.facture.dateFacture between :startDate"+" and :endDate and df.facture.active=true")
    public float getRevenuBrutProduit(@Param("produit") Produit produit, @Param("startDate") Date startDate, @Param("endDate") Date endDate);
}
