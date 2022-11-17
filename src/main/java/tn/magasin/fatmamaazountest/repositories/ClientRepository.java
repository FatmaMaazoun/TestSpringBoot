package tn.magasin.fatmamaazountest.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.magasin.fatmamaazountest.entities.Client;

public interface ClientRepository extends JpaRepository<Client,Long> {
}
