package lesson12;

import lesson12.entity.Product;
import lesson12.storage.FileStorage;
import lesson12.storage.Storage;

import java.io.File;
import java.sql.ClientInfoStatus;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;

public class Store {
    private HashMap<Integer, Product> productHashMap;
    private String filePath;
    Storage storage;

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public void setStorage(Storage storage) {
        this.storage = storage;
        storage.setFilePath(filePath);
    }

    public void addProduct(Integer id, String name, Integer price) {
        productHashMap = storage.getAll();
        var product = new Product(id, name, price);
        product.setEditTime(product.getCreateTime());
        productHashMap.putIfAbsent(product.getId(), product);
        storage.save(productHashMap);
    }


    public Product getProduct(int id) {
        productHashMap = storage.getAll();
        return productHashMap.get(id);
    }

    public ArrayList<Product> getAllProduct() {
        productHashMap = storage.getAll();
        return new ArrayList<>(productHashMap.values());
    }

    public void deleteProduct(int id) {
        productHashMap = storage.getAll();
        productHashMap.remove(id);
        storage.save(productHashMap);
    }

    public void editProduct(Integer id, String name, Integer price) {
        productHashMap = storage.getAll();
        productHashMap.get(id).setName(name);
        productHashMap.get(id).setPrice(price);
        productHashMap.get(id).setEditTime(LocalDateTime.now());
        storage.save(productHashMap);
    }


}
