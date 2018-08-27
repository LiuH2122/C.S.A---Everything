public class problem2 {
    public static void main(String[] args){
        //The outputs
        int output = 1;
        //The number to go up by
        int counter = 3;
        //Loop until output reaches 100
        while(output<=100){
            System.out.print(" " + output);
            //add counter to output
            output+=counter;
            //increment counter by 2
            counter +=2;
        }
    }
}
