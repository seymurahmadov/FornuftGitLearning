package lesson17;

import java.util.Scanner;
import java.util.regex.Pattern;

enum InputCategory {
    NUMBER("Number"),
    TEXT("Text"),
    SPECIAL_CHARACTER("Special Character");

    private String description;

    InputCategory(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}

// Class for input validation
class InputValidator {
    private static final Pattern numberPattern = Pattern.compile("\\d+");
    private static final Pattern textPattern = Pattern.compile("[a-zA-Z]+");
    private static final Pattern specialCharacterPattern = Pattern.compile("[^a-zA-Z0-9]");

    public boolean validateNumberInput(String input) {
        return numberPattern.matcher(input).matches();
    }

    public boolean validateTextInput(String input) {
        return textPattern.matcher(input).matches();
    }

    public boolean validateSpecialCharacterInput(String input) {
        return specialCharacterPattern.matcher(input).matches();
    }

    public InputCategory categorizeInput(String input) {
        if (validateNumberInput(input)) {
            return InputCategory.NUMBER;
        } else if (validateTextInput(input)) {
            return InputCategory.TEXT;
        } else if (validateSpecialCharacterInput(input)) {
            return InputCategory.SPECIAL_CHARACTER;
        } else {
            throw new IllegalArgumentException("Invalid input");
        }
    }
}

// Main class for reading and categorizing user inputs
 class InputValidationApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        InputValidator validator = new InputValidator();

        System.out.println("Enter inputs (type 'exit' to quit):");

        while (true) {
            System.out.print("Input: ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("exit")) {
                break;
            }

            try {
                InputCategory category = validator.categorizeInput(input);
                System.out.println("Category: " + category.getDescription());
            } catch (IllegalArgumentException e) {
                System.out.println("Invalid input. Please try again.");
            }
        }

        scanner.close();
    }
}