package lesson12;

import lesson12.entity.Product;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.Collectors;

public class ProductSorter {
    private Store store;

    public ProductSorter(Store store) {
        this.store = store;
    }

    public ArrayList<Product> sortByPriceFromMinToMax() {
         return (ArrayList<Product>) store.getAllProduct().stream()
                 .sorted(Comparator.comparing(Product::getPrice))
                 .collect(Collectors.toList());
    }

    public ArrayList<Product> sortByPriceFromMaxToMin() {
        var list = (ArrayList<Product>) store.getAllProduct().stream()
                .sorted(Comparator.comparing(Product::getPrice))
                .collect(Collectors.toList());
        Collections.reverse(list);
        return list;
    }
}
