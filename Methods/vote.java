import java.util.*;
class vote{
    public static void vot(int age) {
       if(age > 18 ){
           System.out.println("eligibel to vote");
       }else{
           System.out.println("not eligible to vote");
       }
    }
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);
        int age = sc.nextInt();



        vot(age);

    }


}