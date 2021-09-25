package lesson12;

import lesson12.entity.Product;

import java.sql.ClientInfoStatus;
import java.util.ArrayList;
import java.util.HashMap;

public class Store {
    private Product product;
    private HashMap<Integer, Product> productHashMap;

    public Store(){
        this.productHashMap = new HashMap<>();
    }

    public void addProduct(Product product){
        if(!productHashMap.containsKey(product.getId())){
            productHashMap.put(product.getId(), product);
        }
    }

    public Product getProduct(int id){
        return productHashMap.get(id);
    }

    public ArrayList<Product> getAllProduct(){
        return new ArrayList<>(productHashMap.values());
    }

    public void deleteProduct(int id){
        productHashMap.remove(id);
    }

    public void editProduct(Product product){
        productHashMap.put(product.getId(), product);
    }




}
