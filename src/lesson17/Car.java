package lesson17;

public class Car {
    String name;
    String color;
    Integer price;
    CurrencyEnum currencyEnum;

    public Car(String name, String color, Integer price, CurrencyEnum currencyEnum) {
        this.name = name;
        this.color = color;
        this.price = price;
        this.currencyEnum = currencyEnum;
    }


    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", currencyEnum=" + currencyEnum +
                '}';
    }
}
