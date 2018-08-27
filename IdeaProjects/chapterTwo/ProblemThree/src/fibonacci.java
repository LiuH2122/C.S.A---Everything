public class fibonacci {
    public static void main(String[] args){
        //MAKES A LOTTA INTS

        int[] sequence = new int[12];

        // LOOPS THROUGH SEQUENCE
        for(int x = 0; x<sequence.length;x++){
            if(x-2>=0){
                //ADDS THE LAST TWO NUMBERS IF IT'S NOT THE FIRST TWO NUMBERS.
                sequence[x] = sequence[x-1]+sequence[x-2];
            }
            else{
                sequence[x] = 1;
            }
            System.out.print(" " + sequence[x]);

        }
    }
}
