package tn.magasin.fatmamaazountest.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.magasin.fatmamaazountest.entities.Client;
import tn.magasin.fatmamaazountest.repositories.ClientRepository;

import java.util.List;

@Service
public class IClientServiceIMP implements IClientService{

    @Autowired
    ClientRepository clientRepository;

    @Override
    public List<Client> retrieveAllClients() {
        return clientRepository.findAll();
    }

    @Override
    public Client addClient(Client c) {
        return clientRepository.save(c);
    }

    @Override
    public void deleteClient(Long id) {
        clientRepository.deleteById(id);

    }

    @Override
    public Client updateClient(Client c) {
        return clientRepository.save(c);
    }

    @Override
    public Client retrieveClient(Long id) {
        return clientRepository.findById(id).orElse(null);
    }
}
