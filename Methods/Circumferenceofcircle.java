import java.util.*;
class Circumferenceofcircle{
    public static void radius(double ra) {
       double c = 2 * Math.PI *ra;
       System.out.println(c);
    }
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);
        double ra = sc.nextInt();



        radius(ra);

    }


}