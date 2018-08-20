import java.util.Scanner;

public class bmicalculator {

    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        double height;
        double weight;
        double bmi;

        System.out.println("What is your height in inches?");
        height = reader.nextDouble();
        System.out.println("What is your weight in pounds: ");
        weight = reader.nextDouble();

        bmi = weight / (height * height)*703;

        System.out.println("BMI: ");
        System.out.println(bmi);
    }
}
