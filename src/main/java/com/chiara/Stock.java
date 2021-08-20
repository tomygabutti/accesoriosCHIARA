package com.chiara;

import com.chiara.db.ProductoDAO;
import com.chiara.db.StockDAO;
import com.chiara.db.StockMapper;

import java.util.ArrayList;
import java.util.List;

public class Stock{
    private static Stock instancia;
    private List<Producto> productos = new ArrayList<>();

    public Stock(){

    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }

    public void addProducto(Producto producto) {
        this.productos.add(producto);
    }

    public void removeProducto(Producto producto){
        this.productos.remove(producto);
    }

    public static Stock getInstance(){
        if(instancia == null){
            instancia = new Stock();
        }
        return instancia;
    }
    //Inserta en la tabla stock una lista de producto

    public void stockToStockMapperInsert(){
        //StockDAO stockDAO = new StockDAO();
        for (Producto prod : productos){
            StockMapper stockMapper = new StockMapper(prod.getCodigo());
            stockMapper.insert();
        }
    }
    //Elimina de la tabla stock una lista de productos

    public void stockToStockMapperDelete(){
        //StockDAO stockDAO = new StockDAO();
        for (Producto prod : productos){
            StockMapper stockMapper = new StockMapper(prod.getCodigo());
            stockMapper.delete();
        }
    }

}
