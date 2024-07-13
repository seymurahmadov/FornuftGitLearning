package lesson21;

import java.util.*;
import java.util.stream.Collectors;

public class PersonMain {


    public static void main(String[] args) {
        List<Person> personList = Arrays.asList(
                new Person("Anar", 24),
                new Person("Nermin", 30),
                new Person("Vusal", 22),
                new Person("Vaqif", 48),
                new Person("Amil", 35),
                new Person("Samir", 26),
                new Person("Vuqar", 42),
                new Person("Ilqar", 38)
        );

//        personList.forEach(item -> System.out.println(item.name));


        personList.stream()
                .sorted(Comparator.comparing(person -> person.age ))
                .forEach(System.out::println);














        List<Car> cars = new ArrayList<>();
        cars.add(new Car(1, "Mercedes"));
        cars.add(new Car(2, "BMW"));
        cars.add(new Car(3, "Hyundai"));
        cars.add(new Car(4, "Porsche"));
        cars.add(new Car(5, "Maseratti"));
        cars.add(new Car(6, "Ford"));


        Map<Integer, String> collect = cars.stream()
                .collect(Collectors.toMap(car -> car.id, car -> car.name));


    }




}
