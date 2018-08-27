public class DBAJ {
    public static void main(String[] args) {
        printLines();
        printCharactersThing();
        printNumbers();
        printLines();

    }
    public static void printLines(){
        //PRINTS THE DASH 40 TIMES
        for(int x = 0; x<40;x++){
            if(x==39){
                System.out.println("-");
            }
            else{
                System.out.print("-");
            }
        }

    }

    public static void printCharactersThing(){
        char[] sequencething = {
                '_', '-', '^', '-'
        };
        for(int c = 0;c<10;c++){
            // LOOPS THROUGH SEQUENCE AND PRINTS EACH CHARACTER. DONE 10 TIMES
            for(int x = 0; x<4;x++){
                if(c == 9 && x == 3){
                    System.out.println(sequencething[x]);
                }
                else{
                    System.out.print(sequencething[x]);

                }
            }
        }

    }

    public static void printNumbers(){
        for(int z = 0; z<2;z++){

            for(int y = 1; y<=10;y++)

                for(int x = 0; x<2;x++){

                    if(z==1&&y==10&&x==1){
                        if(y == 10){
                            System.out.println(0);
                        }
                        else{
                            System.out.println(y);
                        }
                    }
                    else{
                        if(y == 10){
                            System.out.print(0);
                        }
                        else{
                            System.out.print(y);
                        }
                    }
                }
        }
    }

}