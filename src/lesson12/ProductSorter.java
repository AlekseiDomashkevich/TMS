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
       return (ArrayList<Product>) store.getAllProduct().stream()
               .sorted(Collections.reverseOrder(Comparator.comparing(Product::getPrice)))
               .collect(Collectors.toList());
    }

    public ArrayList<Product> sortByCreateTimeFromNewToOld(){
       return  (ArrayList<Product>) store.getAllProduct().stream()
                .sorted(Comparator.comparing(Product::getCreateTime))
                .collect(Collectors.toList());
    }

    public ArrayList<Product> sortByCreateTImeFromOldToNew(){
        return  (ArrayList<Product>) store.getAllProduct().stream()
                .sorted(Collections.reverseOrder(Comparator.comparing(Product::getCreateTime)))
                .collect(Collectors.toList());
    }

    public ArrayList<Product> sortByEditTimeFromNewToOld(){
        return  (ArrayList<Product>) store.getAllProduct().stream()
                .sorted(Comparator.comparing(Product::getEditTime))
                .collect(Collectors.toList());
    }

    public ArrayList<Product> sortByEditTimeFromOldToNew(){
        return (ArrayList<Product>) store.getAllProduct().stream()
                .sorted(Collections.reverseOrder(Comparator.comparing(Product::getEditTime)))
                .collect(Collectors.toList());
    }
}
