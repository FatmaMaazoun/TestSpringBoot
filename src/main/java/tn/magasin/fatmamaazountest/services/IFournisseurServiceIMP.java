package tn.magasin.fatmamaazountest.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.magasin.fatmamaazountest.entities.Fournisseur;
import tn.magasin.fatmamaazountest.repositories.FournisseurRepository;

import java.util.List;

@Service
public class IFournisseurServiceIMP  implements IFournisseurService{
    @Autowired
    FournisseurRepository fournisseurRepository;

    @Override
    public List<Fournisseur> retrieveAllFournisseur() {
        return fournisseurRepository.findAll();
    }

    @Override
    public Fournisseur updateFournisseur(Fournisseur f) {
        return fournisseurRepository.save(f);
    }

    @Override
    public Fournisseur addFournisseur(Fournisseur f) {
        return fournisseurRepository.save(f);
    }

    @Override
    public Fournisseur retrieveFournisseur(Long idFournisseur) {
        return fournisseurRepository.findById(idFournisseur).orElse(null);
    }

    @Override
    public void removeFournisseur(Long idFournisseur) {
        fournisseurRepository.deleteById(idFournisseur);


    }
}
