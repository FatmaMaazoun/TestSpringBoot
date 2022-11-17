package tn.magasin.fatmamaazountest.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tn.magasin.fatmamaazountest.entities.Produit;
import tn.magasin.fatmamaazountest.services.IProduitService;

import java.util.List;

@RestController
@RequestMapping("/produit")
public class ProduitController {

    @Autowired
    IProduitService produitService;


    @GetMapping
    public List<Produit> GetProduits()
    {
        return produitService.retrieveAllProduits();
    }

    @PostMapping("/{idStock}/{idRayon}")
    public Produit addProduit(@RequestBody Produit p,@PathVariable Long idStock,@PathVariable Long idRayon){
        return  produitService.addProduit(p,idRayon,idStock);
    }
    @GetMapping("/{idProduit}")
    public Produit retrieveProduit(@PathVariable Long idProduit){
        return  produitService.retrieveProduit(idProduit);

    }
    @PostMapping("/assign/{idStock}/{idProduit}")
    public ResponseEntity assignProduitToSotck(@PathVariable Long idProduit,@PathVariable Long idStock){
          produitService.assignProduitToStock(idProduit,idStock);
          return new ResponseEntity<>(HttpStatus.OK);
    }

    @PostMapping("/assignFP/{fournisseurId}/{produitId}")
    public ResponseEntity assignFournisseurToProduit(Long fournisseurId, Long produitId) {
        produitService.assignFournisseurToProduit(fournisseurId,produitId);
        return new ResponseEntity<>(HttpStatus.OK);
    }




}
