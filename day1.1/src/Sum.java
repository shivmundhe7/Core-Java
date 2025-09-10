import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 2 numbers for multiplication: ");
        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();

        double result = num1 * num2;
        System.out.printf("Result = %.3f%n", result);

        sc.close();
    }
}
