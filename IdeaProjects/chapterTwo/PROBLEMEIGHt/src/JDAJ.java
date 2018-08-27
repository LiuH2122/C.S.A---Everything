public class JDAJ {
    public static void main(String[] args) {
        for (int x = 1; x <= 5; x++) {
            for(int z = 0; z<5-x; z++){
                System.out.print(" ");
            }
            for(int c = 0; c<x;c++) {
                if(c == x-1) {
                    System.out.println(x);
                }
                else{
                    System.out.print(x);

                }
            }
        }
    }
}
