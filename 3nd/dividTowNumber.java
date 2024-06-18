import java.util.Scanner;


public class dividTowNumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.printf("Enter First Number: ");
        float a = input.nextFloat();
        System.out.printf("Enter Second Number: ");
        float b = input.nextFloat();

        float result = a / b;
        System.out.println("The Result: " + a + " / " + b + " = " + result);
    }

}
