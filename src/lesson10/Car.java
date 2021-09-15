package lesson10;

public class Car {
    private String brand;
    private double price;
    private int maxSpeed;

    public Car() {

    }

    public Car(String brand, double price, int maxSpeed) {
        this.brand = brand;
        this.price = price;
        this.maxSpeed = maxSpeed;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void toStart() {
        if ((int) (Math.random() * 20) % 2 == 0) {
            throw new CarNotStartException(brand);
        } else {
            System.out.println(brand + " has been started!");
        }
    }
}
