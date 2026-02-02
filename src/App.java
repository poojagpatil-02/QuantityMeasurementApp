// public class App {
//     public static void main(String[] args) throws Exception {
//         System.out.println("Hello, World!");
//     }
// }


import java.util.*;
public class App{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double firstValue = getValidDouble(scanner, "Enter the first value in feet: ");
        double secondValue = getValidDouble(scanner, "Enter the second value in feet: ");

        if (Double.compare(firstValue, secondValue) == 0) {
            System.out.println("The values are equal.");
        } else {
            System.out.println("The values are NOT equal.");
        }

        scanner.close();
    }

    private static double getValidDouble(Scanner scanner, String prompt) {
        System.out.print(prompt);
        while (!scanner.hasNextDouble()) {
            System.out.println("Invalid input. Please enter a numerical value.");
            scanner.next(); // Clear invalid input
        }
        return scanner.nextDouble();
    }
}


