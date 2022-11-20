package tn.magasin.fatmamaazountest.services;

import tn.magasin.fatmamaazountest.entities.Produit;

import java.util.Date;
import java.util.List;

public interface IProduitService {

    List<Produit> retrieveAllProduits();

    Produit addProduit(Produit p, Long idRayon, Long idStock);

    Produit retrieveProduit(Long id);

    void assignProduitToStock(Long idProduit, Long idStock);

    public Produit assignFournisseurToProduit(Long fournisseurId, Long produitId) ;

    float getRevenuBrutProduit(Long idProduit, Date startDate, Date endDate);
}
