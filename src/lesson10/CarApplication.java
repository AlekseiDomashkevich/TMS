package lesson10;

public class CarApplication {
    public static void main(String[] args) {
        var toyota = new Car("Toyota", 40000, 250);
        var subaru = new Car("Subaru", 45000, 270);
        var audi = new Car("Audi", 70000, 320);


        try {
            toyota.toStart();
        }catch (CarNotStartException e){
            e.printStackTrace();
        }

        try{
            subaru.toStart();
        }catch (CarNotStartException e){
            e.printStackTrace();
        }

        try {
            audi.toStart();
        }catch (CarNotStartException e){
            e.printStackTrace();
        }


    }
}
