import java.util.Scanner;

public class week5qn8
{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();

        System.out.println("\nMultiplication Table of " + num);
        System.out.println("--------------------------------");
        for (int i = 1; i <= 10; i++) {
            System.out.println(num * i);
        }

    }
}   
