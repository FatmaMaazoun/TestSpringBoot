package tn.magasin.fatmamaazountest.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.magasin.fatmamaazountest.entities.Client;
import tn.magasin.fatmamaazountest.entities.Fournisseur;
import tn.magasin.fatmamaazountest.services.IClientService;

import java.util.List;

@RequestMapping("/client")
@RestController
public class ClientController {

    @Autowired
    IClientService clientService;


    @GetMapping
    public List<Client> GetClientd()
    {
        return clientService.retrieveAllClients();
    }

    @PostMapping
    public Client addClient(@RequestBody Client c){
        return  clientService.addClient(c);
    }
    @PutMapping
    public Client updateClient(@RequestBody Client c){
        return  clientService.updateClient(c);
    }

    @GetMapping("/{idClient}")
    public Client retrieveClient(@PathVariable Long idClient){
        return  clientService.retrieveClient(idClient);

    }

    @DeleteMapping("/{idClient}")
    public void removeClient(@PathVariable Long idClient){
        clientService.deleteClient(idClient);
    }
}
