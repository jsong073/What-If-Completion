import java.util.Scanner;

public class PairProcess {

    public static void main(String[] args) {
        int num1, num2;
        int sum = 0;
        int product = 0;
        double average = 0.0;
        String overUnderSymbol = "";

        Scanner keyboard = new Scanner(System.in);

        System.out.print("First number? : ");
        num1 = keyboard.nextInt();

        System.out.print("Second number? : ");
        num2 = keyboard.nextInt();

        sum = num1 + num2;
        product = num1 * num2;
        average = (double)sum / 2;

        String sumOutput = "sum";

        if (sum > 200) {
            overUnderSymbol += "*";
        }
        if (sum < 1000) {
            overUnderSymbol += "~";
        }

        System.out.println("The sum of your two numbers is: " + sum + overUnderSymbol);
        System.out.println("The product of your two numbers is: " + product);
        System.out.println("The average of your two numbers is: " + average);

    }

}