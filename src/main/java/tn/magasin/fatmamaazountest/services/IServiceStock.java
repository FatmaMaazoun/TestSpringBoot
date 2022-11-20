package tn.magasin.fatmamaazountest.services;

import tn.magasin.fatmamaazountest.entities.Stock;

import java.util.List;

public interface IServiceStock {
    List<Stock> retrieveAllStocks();

    Stock addStock(Stock s);

    Stock updateStock(Stock u);

    Stock retrieveStock(Long id);
}
