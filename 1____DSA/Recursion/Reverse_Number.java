import java.util.*;
public class Reverse_Number {
    static int ReverseNumber(int num , int reverseNum ){

        if(num==0)return reverseNum;
  
        return ReverseNumber(num/10 , reverseNum*10+num%10);
        
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int Number = sc.nextInt();
        System.out.println(ReverseNumber(Number , 0));
    }
}
