import java.util.*;

public class scanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 numbers for multiplication");
        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();
        System.out.println(num1 * num2);
    }
}
