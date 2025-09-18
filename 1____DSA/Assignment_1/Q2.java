//Count the Sum of Square of Odd Digit in Number
class Q2{
    static int SumOfSquareOfOddDigitInNumbers(int num){
      
        int sum = 0;
        while(num>=1){
            int digit = num%10;
            if(digit%2!=0){
                sum += digit*digit;
            }
            num=num/10;
        
        }
        return sum;

    }
    public static void main(String[] args){
            
       System.out.println(SumOfSquareOfOddDigitInNumbers(1223)); 
    }   
}