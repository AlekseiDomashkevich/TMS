package lesson12.view;

import lesson12.entity.Product;

import java.util.List;

public interface View {
    void printProduct(List<Product> productList);
}
