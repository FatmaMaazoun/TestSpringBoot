package tn.magasin.fatmamaazountest.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.magasin.fatmamaazountest.entities.Stock;
import tn.magasin.fatmamaazountest.repositories.StockRepository;

import java.util.List;

@Service
public class IServiceStockIMP implements IServiceStock {

    @Autowired
    StockRepository stockRepository;

    @Override
    public List<Stock> retrieveAllStocks() {
        return stockRepository.findAll();
    }

    @Override
    public Stock addStock(Stock s) {
        return stockRepository.save(s);
    }

    @Override
    public Stock updateStock(Stock s) {
        return stockRepository.save(s);
    }

    @Override
    public Stock retrieveStock(Long id) {
        return stockRepository.findById(id).orElse(null);
    }
}
