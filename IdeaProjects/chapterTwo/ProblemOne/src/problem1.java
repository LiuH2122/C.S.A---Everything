public class problem1 {
    public static void main(String[] args){
        // VARIABLES FOR THE EQUATION

        //initial position
        double s0 = 2.5;
        //initial velocity
        double v0 = 25.0;
        //rate of acceleration
        double a = 1.8;
        //time
        double t = 10.0;
        //---------------------------

        //calculates the position of s at a given time t.

        double s = s0+v0*t+0.5*(a*(t*t));

        System.out.println(s);
    }
}
