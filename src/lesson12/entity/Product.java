package lesson12.entity;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Product implements Serializable {
    private Integer id;
    private String name;
    private Integer price;
    private LocalDateTime createTime;
    private LocalDateTime editTime;


    public Product(Integer id, String name, Integer price) {
        this.id = id;
        this.name = name;
        this.price = price;
        createTime = LocalDateTime.now();
    }



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public LocalDateTime getEditTime(){
        return this.editTime;
    }

    public void setEditTime(LocalDateTime editTime){
        this.editTime = editTime;
    }

    public LocalDateTime getCreateTime(){
        return this.createTime;
    }

    @Override
    public String toString() {
        return "ID = " + id +
                ", название ='" + name + '\'' +
                ", цена = " + price +
                ", дата создания = " + createTime +
                ", дата последнего изменения = " + editTime;
    }
}
