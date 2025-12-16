import java.util.*;

class solution{
    public static void main (String[] args){
        Scanner sc =new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        try{
            int c = a / b;
            System.out.println("answer : " + c);
        }catch(ArithmeticException e){
            System.out.println("cannot divisible by 0 !");
        }
    }
}