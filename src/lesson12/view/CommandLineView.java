package lesson12.view;

import lesson12.entity.Product;

import java.time.format.DateTimeFormatter;
import java.util.List;

public class CommandLineView implements View{
    private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

    @Override
    public void printProduct(List<Product> productList) {
        System.out.println("Список продуктов:");
        for(Product product : productList){
            System.out.println("ID = " + product.getId() +
                    ", название ='" + product.getName() + '\'' +
                    ", цена = " + product.getPrice() +
                    ", дата создания = " + product.getCreateTime().format(formatter) +
                    ", дата последнего изменения = " + product.getEditTime().format(formatter));
        }
        System.out.println();
    }
}
