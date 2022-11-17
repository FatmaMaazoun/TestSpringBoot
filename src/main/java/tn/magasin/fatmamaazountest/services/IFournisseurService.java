package tn.magasin.fatmamaazountest.services;

import tn.magasin.fatmamaazountest.entities.Fournisseur;

import java.util.List;

public interface IFournisseurService {

    List<Fournisseur> retrieveAllFournisseur();

    Fournisseur updateFournisseur (Fournisseur f);

    Fournisseur addFournisseur (Fournisseur f);

    Fournisseur retrieveFournisseur (Long idFournisseur);

    void removeFournisseur(Long idFournisseur);
}
