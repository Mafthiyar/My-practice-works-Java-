import java.util.*;

class power {
    public static void powerr(double n, double m) {
        double a =  Math.pow(n,m);
        System.out.println(a);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double n = sc.nextInt();
        double m = sc.nextInt();
        powerr(n,m);
    }
}

