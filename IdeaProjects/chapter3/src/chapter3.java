public class chapter3 {
    public static void main(String[] args){

    }
    public void printNumbers(int num)
    {
        for(int x = 1; x<=num; x++){
            System.out.print("[" + x + "] ");
        }
    }
    public void printPowersOf2(int num)
    {
        int output = 1;
        for(int x = 0; x<=num; x++){
            for(int c = 1; c<=x; c++){
                output*=2;
            }
            System.out.print(output + " ");
            output = 1;
        }
    }
    public void printPowersOfN(int base, int exponent){
        int output = 1;
        for(int x = 0; x<=exponent; x++){
            for(int c = 1; c<=x; c++){
                output*=base;

            }
            System.out.print(output + " ");

            output = 1;

        }
    }
    public void printSquare(int min, int max){
        int intToSubtract = 0;
        int helpme = 0;

        int[] minToMax = new int[max+1 - min];
        for(int x = 0; x<minToMax.length; x++){
            minToMax[x] = min+x;
        }
        for(int o = 0; o < minToMax.length; o++){
            for(int n = 0; n< minToMax.length; n++){
                System.out.print(minToMax[helpme%minToMax.length]);
                helpme+=1;
            }
            System.out.println();
            helpme+=1;
        }
        //    for(int c = min; c<=max; c++){
//
//        for(int x = c; x<=max; x++){
//
//            System.out.print(x);
//        }
//
//        for(int a = min; a<=max-intToSubtract;a++){
//
//        }


    }
    public void printGrid(int row, int col)
    {
        int nextNum = 1;

        for(int z = 1; z <= row; z ++){
            nextNum=0+z;

            for(int r = 1; r <= col; r ++){
                if(col!=1){
                    if(r == col){
                        System.out.print(nextNum);
                    }
                    else{
                        System.out.print(nextNum + ", ");
                    }
                    nextNum+=row;

                }
                else{
                    System.out.print(nextNum);
                }
            }
            System.out.println();
        }
    }

}
