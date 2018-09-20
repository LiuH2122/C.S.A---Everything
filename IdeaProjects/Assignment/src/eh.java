import java.util.Scanner;

public class eh {

    public static void main(String[] args){
        int numOfInputs = 0;
        double sumOfInputs = 0;
        double lastInputs;
        double largestInput;
        double smallestInput;
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter a number to add to the total(Enter 0 to quit)");
        lastInputs = reader.nextDouble();
        largestInput = lastInputs;
        smallestInput = lastInputs;
        while(lastInputs != 0){
            numOfInputs += 1;
            sumOfInputs += lastInputs;
            largestInput = largestInput < lastInputs ? lastInputs:largestInput;
            smallestInput = smallestInput > lastInputs ? lastInputs:smallestInput;
            System.out.println("Enter a number to add to the total(Enter 0 to quit)");
            lastInputs = reader.nextDouble();
        }
        if(numOfInputs == 0){
            System.out.println("You didn't enter an input");
        }
        else{
            System.out.println("The sum of all inputs: " + sumOfInputs);
            System.out.println("The total number of all inputs: " + numOfInputs);

            System.out.println("The average of all inputs: " + sumOfInputs/numOfInputs);
            System.out.println("The highest of all inputs: " + largestInput);
            System.out.println("The lowest of all inputs: " + smallestInput);




        }

    }

}
