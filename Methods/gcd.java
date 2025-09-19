import java.util.*;

class gcd {
    public static void high(double n, double m) {
        while (m != 0){
            double temp = m;
            m = n % m;
            n = temp;
        }
        System.out.println(n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double n = sc.nextInt();
        double m = sc.nextInt();
        high(n,m);
    }
}
