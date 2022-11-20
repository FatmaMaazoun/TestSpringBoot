package tn.magasin.fatmamaazountest.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.magasin.fatmamaazountest.entities.Client;
import tn.magasin.fatmamaazountest.entities.Facture;
import tn.magasin.fatmamaazountest.repositories.ClientRepository;
import tn.magasin.fatmamaazountest.repositories.FactureRepository;

import java.util.List;

@Service
public class IServiceFactureIMP implements  IServiceFacture {

    @Autowired
    FactureRepository factureRepository;

    @Autowired

    ClientRepository clientRepository;

    @Override
    public List<Facture> retrieveAllFactures() {
        return factureRepository.findAll();
    }

    @Override
    public void cancelFacture(Long id) {
        Facture facture=factureRepository.findById(id).orElse(null);
        if(facture!=null){
        facture.setActive(false);
        factureRepository.save(facture);
        }

    }

    @Override
    public Facture retrieveFacture(Long id) {
        return factureRepository.findById(id).orElse(null);
    }

    @Override
    public List<Facture> getFacturesByClient(Long idClient) {
       /* Client client=clientRepository.findById(idClient).orElse(null);
        if(client!=null)
        {return client.getFactures();
        }
        return null;
        */
        //return factureRepository.getFacturesByClient(idClient);
        return factureRepository.getFacturesByClient_IdClient(idClient);
    }

}
