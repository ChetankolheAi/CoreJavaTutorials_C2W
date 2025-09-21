
public class EvenDigitSum {
    static int SumEven(int num){
        //Base Case // Eventually The Num will Become 0
        if(num==0)return 0;

        //Simple Digit Seperation Logic
       int digit  = num%10;
       num = num/10;

        //sum will Store the Sum of Last Iteration
       int sum = SumEven(num);

       if(digit%2==0){

            //If digit of this iteration is  Even then Return Last Iteration Sum + this Iteration Even Digit to next Iteration

            return sum+digit; //Digit with Even Value of this Iteration
       }

       //If digit of this iteration is not Even then Return Last Iteration Sum 
       return sum+0;
    }
    public static void main(String[] args){
        System.out.println(SumEven(678));
    }
}
