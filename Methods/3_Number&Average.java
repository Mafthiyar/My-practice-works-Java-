import java.util.*;
class Average{
    public static int MyAverage(int a, int b, int c){
        int ave = (a+b+c) / 3;
        return ave;
    }
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int ave = MyAverage(a,b,c);

        System.out.println(ave);

    }


}