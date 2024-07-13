package lesson17;

import java.util.Random;
import java.util.Scanner;

public class RandomPasswordGenerator {

    public static String generateRandomPassword(int length) {
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        StringBuilder password = new StringBuilder();
        Random random = new Random();

        for (int i = 0; i < length; i++) {
            int index = random.nextInt(characters.length());
            password.append(characters.charAt(index));
        }

        return password.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the desired length of the password: ");
        int length = scanner.nextInt();

        String randomPassword = generateRandomPassword(length);

        System.out.println("Generated password: " + randomPassword);

    }
}
