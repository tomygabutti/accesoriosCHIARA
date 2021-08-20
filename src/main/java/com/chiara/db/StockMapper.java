package com.chiara.db;

public class StockMapper {
    private int id_producto;

    public StockMapper(int idProd){
        this.id_producto = idProd;
    }

    public void insert(){
        StockDAO stockDAO = new StockDAO();
        stockDAO.insert(this.id_producto);
    }

    public void delete(){
        StockDAO stockDAO = new StockDAO();
        stockDAO.delete(this.id_producto);
    }
}
