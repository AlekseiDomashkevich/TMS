package lesson12.storage;

import lesson12.entity.Product;

import java.util.HashMap;

public interface Storage {

    void setFilePath(String filePath);
    void save(HashMap<Integer, Product> map);

    HashMap<Integer, Product> getAll();
}
