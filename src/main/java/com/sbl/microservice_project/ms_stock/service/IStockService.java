package com.sbl.microservice_project.ms_stock.service;

import com.sbl.microservice_project.ms_stock.entities.Stock;

import java.util.List;
import java.util.Map;

public interface IStockService {
    Stock createStock(Stock stock);
    Stock updateStock(Map<Object, Object> fields, long id);
    Stock retriveStockById(long id);
    List<Stock> retriveAllStock();
    void removeStock(long id);
}
