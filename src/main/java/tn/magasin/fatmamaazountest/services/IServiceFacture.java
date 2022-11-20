package tn.magasin.fatmamaazountest.services;

import tn.magasin.fatmamaazountest.entities.Facture;

import java.util.List;

public interface IServiceFacture {

    List<Facture> retrieveAllFactures();
    void cancelFacture(Long id);
    Facture retrieveFacture(Long id);
    List<Facture> getFacturesByClient(Long idClient);
}
