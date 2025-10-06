public class _11_Second_Largest{
    static int SecondSmallest(int arr[]){
        int max =Integer.MIN_VALUE;
        int SecondMax = Integer.MAX_VALUE;
        
        for(int i=0;i<arr.length;i++){
            int num = arr[i];
            if (num > max) {
                SecondMax = max; 
                max = num;
            } else if (num > SecondMax && num != max) {
                SecondMax = num;
            }
        }
        return SecondMax;
    }
    public static void main(String[] args) {
        int arr[] = {10,5,1,10};
        int ans = SecondSmallest(arr);
        if(ans == Integer.MAX_VALUE)System.out.println("No Second Largest Found");
        else System.out.println("Second Largest Element is:"+ans);
    }
}