import java.util.Scanner;

public class SumTwoNumber {
    public static void main(String[] args) {

        Scanner acceptingNumber =  new Scanner(System.in);
        System.out.printf("Enter First Number: ");
        float firstNumber = acceptingNumber.nextFloat();
        System.out.printf("Enter Second Number: ");
        float secondNumber = acceptingNumber.nextFloat();

        float totalResult = firstNumber + secondNumber ;

        System.out.println("The Result " + firstNumber + " + " + secondNumber + " = " + totalResult);


    }
}
