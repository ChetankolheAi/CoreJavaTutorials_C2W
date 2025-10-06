

public class _5_Replace_All_Zero_With_Five {
    static int replace(int num){
        int rev = 0;
        while(num>0){
            int digit = num%10;
            if(digit ==0)digit=5;
            num/=10;
            rev = rev*10+digit;
        }
        int rev2 = 0;
        while(rev>0){

            int digit = rev%10;
            rev/=10;
            rev2=rev2*10+digit;
        }
        return rev2;
    }
    public static void main(String[] args) {
        int arr[] ={1004,120,500,121};
        for(int i=0;i<arr.length;i++){
            int ReplaceNumber = replace(arr[i]);
            arr[i] = ReplaceNumber;
        }
        System.out.println("Replaced Array is:- ");
        for(int i:arr){
            System.out.print(i+",");
        }

    }
}
