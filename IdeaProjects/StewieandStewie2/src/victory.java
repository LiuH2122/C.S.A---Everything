import java.util.Scanner;

public class victory {
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter the number of times you would like to print the body");
        int size = inp.nextInt();
        System.out.println("///////////////////////");
        printBody(size);
    }
    private static void printBody(int num){
        for(int x = 0; x<num;x++) {
            System.out.println("|| Victory is mine! ||");
            System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");

        }
    }
}
