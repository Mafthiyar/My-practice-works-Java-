import java.util.*;
class sumofodd{
    public static void Myodd(int n,int sum) {
     for(int i=1; i<=n; i++){
         if(i % 2 != 0) {
             sum = sum + i;
         }

     }System.out.println(sum);

    }
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int sum = 0;

        Myodd(n,sum);

    }


}
