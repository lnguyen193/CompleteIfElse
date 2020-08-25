import java.util.Scanner;

public class CompleteIfElse {
    public static void main(String[] args) {
        Scanner keyBd = new Scanner(System.in);
        String testNum = "Enter a number: ";
        System.out.println(testNum);

        int number = keyBd.nextInt();


        if (number > 10) {
            System.out.println("Number is positive.");
        }
        else if (number < 10) {
            System.out.println("Number is not positive.");

        }else if (number == 10) {
            System.out.println("Number is equal 10.");

        }

        System.out.println("Application finished.");
    }

}
