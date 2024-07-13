package lesson18;

public class GenericMain {
    public static void main(String[] args) {


        GenericTest<Integer, String> genericTest = new GenericTest(4,"Gunel");

        GenericTest<Double, String> genericTest2 = new GenericTest(true,"Gunel");




        Integer [] intArray = {1,2,3,4,5};
        String[] arrayString = {"Aysu", "Gunel","Bextiyar","Teymur", "Elnur","Nuray","Gunel","Qedim","Resul"};



        genericTest2.printArrays(arrayString);


    }


}
