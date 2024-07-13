package lesson20;

import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {

        Car car1 = new Car(1L, "Toyota", "Camry", 5);
        Car car2 = new Car(2L, "Honda", "Civic", 3);
        Car car3 = new Car(3L, "Ford", "Mustang", 7);
        Car car4 = new Car(4L, "Chevrolet", "Malibu", 7);
        Car car5 = new Car(5L, "BMW", "3 Series", 4);
        Car car6 = new Car(6L, "Audi", "A4", 6);
        Car car7 = new Car(7L, "Mercedes", "C-Class", 7);
        Car car8 = new Car(8L, "Nissan", "Altima", 7);
        Car car9 = new Car(9L, "Hyundai", "Elantra", 9);
        Car car10 = new Car(10L, "Kia", "Optima", 10);

        List<Car> cars = new ArrayList<>();


        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);
        cars.add(car5);
        cars.add(car6);
        cars.add(car7);
        cars.add(car8);
        cars.add(car9);
        cars.add(car10);



        Collections.sort(cars, new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {

                if (o1.getAge() - o2.getAge() !=0) {
                return o1.getAge() - o2.getAge();

                }else {
                    return o1.getMake().compareTo(o2.getMake());
                }
            }
        });



        for (Car car : cars) {
            System.out.println(car);
        }

    }
}
