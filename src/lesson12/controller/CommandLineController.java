package lesson12.controller;

import lesson12.ProductSorter;
import lesson12.Store;
import lesson12.storage.FileStorage;
import lesson12.view.CommandLineView;
import lesson12.view.View;

import java.util.Scanner;

public class CommandLineController implements IController {
    private Scanner scanner;
    private Store store;
    private View view;

    public CommandLineController() {
        this.scanner = new Scanner(System.in);
        this.store = new Store();
        store.setFilePath("./Store.out");
        store.setStorage(new FileStorage());
        this.view = new CommandLineView();
    }

    private int scanId() {

        while (true) {
            System.out.println("Введите ID");
            try {
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Неверный формат данных");
            }
        }
    }

    private int scanPrice() {
        while (true) {
            System.out.println("Введите цену");
            try {
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Неверный формат данных");
            }
        }
    }

    private String scanName() {
        System.out.println("Введите название товара");
        return scanner.nextLine();
    }


    @Override
    public void start() {
        System.out.println("Добро пожаловать в магазин!");
        while (true) {
            System.out.println("Выберите необходимое действие и введите число.");
            System.out.println("" +
                    "1 - Добавить товар. " +
                    "2 - Просмотреть список товаров. " +
                    "3 - Редактировать товар. " +
                    "4 - Удалить товар. " +
                    "5 - Выход");
            switch (scanner.nextLine()) {
                case "1" -> {
                    var id = scanId();
                    if (store.getProduct(id) == null) {
                        store.addProduct(id, scanName(), scanPrice());
                        System.out.printf("Продукт с ID %d добавлен\n\n", id);
                    } else {
                        System.out.printf("Продукт с ID %d уже существует!\n\n", id);
                    }

                }
                case "2" -> {
                    if (store.getAllProduct().size() == 0) {
                        System.out.println("Список товаров пуст\n");
                    } else {
                        System.out.println("Выберите как отсортировать список товаров:");
                        System.out.println("""
                                1 - По цене, сначала дешевые.
                                2 - По цене, сначала дорогие.
                                3 - По добавлению, сначала новые.
                                4 - По добавлению, сначала старые.
                                5 - По изменению, сначала новые.
                                6 - По изменению, сначала старые.
                                """);
                        var sorter = new ProductSorter(store);
                        switch (scanner.nextLine()) {
                            case "1" -> view.printProduct(sorter.sortByPriceFromMinToMax());
                            case "2" -> view.printProduct(sorter.sortByPriceFromMaxToMin());
                            case "3" -> view.printProduct(sorter.sortByCreateTimeFromNewToOld());
                            case "4" -> view.printProduct(sorter.sortByCreateTImeFromOldToNew());
                            case "5" -> view.printProduct(sorter.sortByEditTimeFromNewToOld());
                            case "6" -> view.printProduct(sorter.sortByEditTimeFromOldToNew());
                            default -> System.out.println("Неверное значение, попробуйте еще раз!\n");
                        }
                    }
                }
                case "3" -> {
                    var id = scanId();
                    if (store.getProduct(id) != null) {
                        store.editProduct(id, scanName(), scanPrice());
                        System.out.printf("Товар с ID %d отредактирован.\n", id);
                    } else {
                        System.out.printf("Товар с ID %d не найден в базе.\n", id);
                    }

                }
                case "4" -> {
                    var id = scanId();
                    if (store.getProduct(id) != null) {
                        store.deleteProduct(id);
                        System.out.printf("Товар с ID %d удален.\n\n", id);
                    } else {
                        System.out.printf("Товар с ID %d не найден в базе.\n\n", id);
                    }


                }
                case "5" -> {
                    System.out.println("Работа завершена, спасибо что выбрали наш Магазин!");
                    return;
                }
                default -> System.out.println("Неверное значение! Попробуйте еще раз!");
            }
        }

    }
}
