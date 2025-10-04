public class _35_Converting_0_to_5 {
    static int Covert0to5(int num){
        if(num==0)return 5;
        int rev = 0;
        while(num>0){
            int digit=num%10;
            num/=10;
            rev = rev*10+digit;
        }
        int rev2 =0;
        while(rev>0){
            int digit=rev%10;
            rev/=10;
            if(digit == 0)digit=5;

            rev2 = rev2*10+digit;
        }
        
        return rev2;
    }
    public static void main(String[] args) {
        int num = 1005;
        System.out.println(Covert0to5(num));
    }
}
