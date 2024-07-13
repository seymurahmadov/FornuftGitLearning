package lesson17;

public enum CurrencyEnum {
    AZN("Manat"),
    USD("Dollar"),
    EUR("Avro");

    String value;


    CurrencyEnum(String value) {
        this.value = value;
    }
}
