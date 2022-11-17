package tn.magasin.fatmamaazountest.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.magasin.fatmamaazountest.entities.Stock;

public interface StockRepository extends JpaRepository<Stock,Long> {
}
