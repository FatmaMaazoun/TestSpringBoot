package tn.magasin.fatmamaazountest.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.magasin.fatmamaazountest.entities.Stock;
import tn.magasin.fatmamaazountest.services.IServiceStock;

import java.util.List;

@RestController
@RequestMapping("/stock")
public class StockController {

    @Autowired
    IServiceStock serviceStock;

    @GetMapping
    public List<Stock> GetAllStocks(){
        return serviceStock.retrieveAllStocks();
    }

    @PostMapping
    public Stock addStocks(@RequestBody Stock stock){
        return serviceStock.addStock(stock);
    }

    @PutMapping
    public Stock UpdateStock(@RequestBody Stock stock){
        return serviceStock.updateStock(stock);
    }


    @GetMapping("{idStock}")
    public Stock GetStock(@PathVariable Long idStock){
        return serviceStock.retrieveStock(idStock);
    }

}
