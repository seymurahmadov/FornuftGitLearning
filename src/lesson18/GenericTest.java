package lesson18;

public class GenericTest <T, U> {
    T value;
    U value2;

    public GenericTest(T value, U value2) {
        this.value = value;
        this.value2 = value2;
    }

    public GenericTest(T value) {
        this.value = value;
    }


    public <E> void printArrays(E[] array) {


        for (E item : array) {
            System.out.println(item);
        }
    }
}
