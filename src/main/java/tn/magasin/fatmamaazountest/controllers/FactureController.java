package tn.magasin.fatmamaazountest.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.magasin.fatmamaazountest.entities.Facture;
import tn.magasin.fatmamaazountest.entities.Fournisseur;
import tn.magasin.fatmamaazountest.services.IServiceFacture;

import java.util.List;

@RequestMapping("/facture")
@RestController
public class FactureController {

    @Autowired
    IServiceFacture serviceFacture;

    @GetMapping
    public List<Facture> GetFactures()
    {
        return serviceFacture.retrieveAllFactures();
    }

    @GetMapping("/{id}")
    public Facture retrieveFacture(@PathVariable  Long id )
    {
        return serviceFacture.retrieveFacture(id);
    }

    @PutMapping("/{id}")
    public void cancelFacture(@PathVariable  Long id )
    {
         serviceFacture.cancelFacture(id);
    }

    @GetMapping("getbyclient/{id}")
    public List<Facture> getFacturesByClient(@PathVariable  Long id) {
        return serviceFacture.getFacturesByClient(id);
    }


}
