import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
  
        ArrayList<Car> cars = new ArrayList<>();
        cars.add(new Car("Toyota", 9));
        cars.add(new Car("Volkswagen", 11));
        cars.add(new Car("Renault", 6));
        cars.add(new Car("Jaguar", 5));
        cars.add(new Car("Nisan", 1));
        System.out.println("No sorted List :"+ cars);
        Collections.sort(cars);
        System.out.println("Sorted Car List based on its Id :"+ cars);
    }    
}
