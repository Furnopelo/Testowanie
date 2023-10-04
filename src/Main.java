import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj pierwszą liczbę:");
        double number1 = scanner.nextDouble();

        System.out.println("Podaj drugą liczbę:");
        double number2 = scanner.nextDouble();

        double result = number1 * number2;

        System.out.println("Wynik mnożenia = " + result);

        System.out.printf("Wynik mnożenia liczby %.3f i %.3f = %.2f \n", number1, number2, result);
    }
}