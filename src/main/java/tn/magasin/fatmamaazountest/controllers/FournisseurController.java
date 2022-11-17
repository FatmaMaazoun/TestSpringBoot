package tn.magasin.fatmamaazountest.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.magasin.fatmamaazountest.entities.Fournisseur;
import tn.magasin.fatmamaazountest.services.IFournisseurService;

import java.util.List;

@RestController
@RequestMapping("/fournisseur")
public class FournisseurController {

    @Autowired
    IFournisseurService fournisseurService;


    @GetMapping
    public List<Fournisseur> GetFournisseur()
    {
        return fournisseurService.retrieveAllFournisseur();
    }

    @PostMapping
    public Fournisseur addFournisseur(@RequestBody Fournisseur f){
        return  fournisseurService.addFournisseur(f);
    }
    @PutMapping
    public Fournisseur updateFournisseur(@RequestBody Fournisseur f){
        return  fournisseurService.updateFournisseur(f);
    }

    @GetMapping("/{idFournisseur}")
    public Fournisseur retrieveFournisseur(@PathVariable Long idFournisseur){
        return  fournisseurService.retrieveFournisseur(idFournisseur);

    }

    @DeleteMapping("/{idFournisseur}")
    public void removeFournisseur(@PathVariable Long idFournisseur){
        fournisseurService.removeFournisseur(idFournisseur);
    }
}
