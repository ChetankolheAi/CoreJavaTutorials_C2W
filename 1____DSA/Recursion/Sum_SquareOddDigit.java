import java.util.Scanner;
    
    public class Sum_SquareOddDigit {
        static int OddDigitSqSum(int num){
            if(num==0) return 0;
            
            int digit = num%10;
            //If Else using Ternarly Operator
            int sum =(digit%2!=0?   OddDigitSqSum(num/10)+digit*digit :  OddDigitSqSum(num/10));
        
            //Simple If Else;
            // if(digit%2!=0)
            //     sum = OddDigitSqSum(num/10)+digit*digit; 
            // else
            //     sum = OddDigitSqSum(num/10);
            return sum;
        }
        public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number:- ");
        int Number = sc.nextInt();
        System.out.println(OddDigitSqSum(Number));
    }
}
