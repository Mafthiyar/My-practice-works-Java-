import java.util.*;

public class Main{
    static int modulus(int a, int b, int m){
        
        int v = (a*b) % m;
        return v;
        
    }
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int m = sc.nextInt();
        
        System.out.println(modulus(a,b,m));
    }
}