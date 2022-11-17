package tn.magasin.fatmamaazountest.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.magasin.fatmamaazountest.entities.Fournisseur;
import tn.magasin.fatmamaazountest.entities.Produit;
import tn.magasin.fatmamaazountest.entities.Rayon;
import tn.magasin.fatmamaazountest.entities.Stock;
import tn.magasin.fatmamaazountest.repositories.FournisseurRepository;
import tn.magasin.fatmamaazountest.repositories.ProduitRepository;
import tn.magasin.fatmamaazountest.repositories.RayonRepository;
import tn.magasin.fatmamaazountest.repositories.StockRepository;

import java.beans.Transient;
import java.util.ArrayList;
import java.util.List;

@Service
public class IProduitServiceIMP implements IProduitService {

    @Autowired
    ProduitRepository produitRepository;

    @Autowired
    RayonRepository rayonRepository;

    @Autowired
    StockRepository stockRepository;

    @Autowired
    FournisseurRepository fournisseurRepository;
    @Override
    public List<Produit> retrieveAllProduits() {
        return produitRepository.findAll();
    }

    @Override
    public Produit addProduit(Produit p, Long idRayon, Long idStock) {
        Stock stock=stockRepository.findById(idStock).orElse(null);
        Rayon rayon=rayonRepository.findById(idRayon).orElse(null);
        if(stock !=null && rayon !=null){
            p.setRayon(rayon);
            p.setStock(stock);

        }
        return produitRepository.save(p);
    }

    @Override
    public Produit retrieveProduit(Long id) {
        return produitRepository.findById(id).orElse(null);
    }

    @Override
    public void assignProduitToStock(Long idProduit, Long idStock) {
        Stock stock =stockRepository.findById(idStock).orElse(null);
        Produit produit=produitRepository.findById(idProduit).orElse(null);
        if(stock!=null && produit!=null){
           produit.setStock(stock);
           produitRepository.save(produit);

        }

    }
    @Transient
    @Override
    public void assignFournisseurToProduit(Long fournisseurId, Long produitId) {
        Produit produit=produitRepository.findById(produitId).orElse(null);
        Fournisseur fournisseur=fournisseurRepository.findById(fournisseurId).orElse(null);

        if(fournisseur!=null && produit!=null){
            if(produit.getFournisseurs()!=null)
            {produit.getFournisseurs().add(fournisseur);
            }
            else
            {
                List<Fournisseur> fournisseurs=new ArrayList<Fournisseur>();
                produit.setFournisseurs(fournisseurs);
            }
        }



    }
}
