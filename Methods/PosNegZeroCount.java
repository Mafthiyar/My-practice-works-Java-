import java.util.*;
class PosNegZeroCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pos = 0;
        int neg = 0;
        int zero = 0;

        while(true){
            System.out.print("enter number :");
            String a = sc.nextLine();

            if(a.equalsIgnoreCase("quit")){
                break;
            }

            int n = Integer.parseInt(a);

            if(n > 0){
                pos++;
            }else if(n<0){
                neg++;
            }else{
                zero++;
            }

        }

        System.out.println(pos);
        System.out.println(neg);
        System.out.println(zero);


    }
}