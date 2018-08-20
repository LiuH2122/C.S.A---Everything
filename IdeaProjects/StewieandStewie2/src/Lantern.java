public class Lantern {
    public static void main(String[] args){
        printPyramid();
        System.out.println(" ");
        printPyramid();
        printLanternThing();
        printStars(13);
        System.out.println(" ");
        printPyramid();
        printStars(5);
        printLanternThing();
        printLanternThing();
        printStars(5);
        printStars(5);
    }
    public static void printPyramid(){
        printStars(5);
        printStars(9);
        printStars(13);
    }
    public static void loopPrint(String character, int times, boolean nL){
        for(int x = 0; x<times;x++){
            if(x == times-1 && (nL || times == 13)) {
                System.out.println(character);
            }
            else{
                System.out.print(character);
            }
        }
    }
    public static void printStars(int stars){
        int spacePrint = (13-stars)/2;
        loopPrint(" ", spacePrint, false);
        loopPrint("*", stars, false);
        loopPrint(" ", spacePrint, true);
    }
    public static void printLanternThing(){
        System.out.println("* | | | | | *");
    }
}
