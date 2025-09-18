//Strong Number
class Q4_Strong_Number_{
    static int Factorial(int num){
        int fact = 1;
        for(int i =1;i<=num;i++){
            fact = fact * i;
        }
        return fact;
    }
    static Boolean StrongNumber(int num){
        int temp = num;
        int sum = 0;
        while(num>=1){
            int digit = num%10;
            int fact = Factorial(digit);
            sum = sum+fact;
            num=num/10;
        
        }
        if(sum == temp){
            return true;
        }
        return false;

    }
    public static void main(String[] args){
            
       System.out.println(StrongNumber(56)); 
    }   
}