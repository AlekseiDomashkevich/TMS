package lesson10;

public class CarNotStartException extends RuntimeException {
    public CarNotStartException(String name){
        super(name + " has been not start");
    }
}
