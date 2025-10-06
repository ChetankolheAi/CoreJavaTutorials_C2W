public class _10_Second_Smallest_Distint_Element {
    static int SecondSmallest(int arr[]){
        int min =Integer.MAX_VALUE;
        int SecondMin = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
    
            if (arr[i] < min) {
                SecondMin = min;  
                min = arr[i];
            } else if (arr[i] < SecondMin && arr[i] != min) {
                SecondMin = min;
            }
        }
        return SecondMin;
    }
    public static void main(String[] args) {
        int arr[] = {1,10,10,10};
        int ans = SecondSmallest(arr);
        if(ans == Integer.MAX_VALUE)System.out.println("No Second Smallest Found");
        else System.out.println("Second Smallest Element is:"+ans);
    }
}
