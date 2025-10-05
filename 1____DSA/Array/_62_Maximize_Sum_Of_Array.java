import java.util.Arrays;

public class _62_Maximize_Sum_Of_Array {
    
   private static int Arrange(int[] arr) {
        int Sum=0;
        for(int i=0;i<arr.length;i++){
       
            Sum+=i*arr[i];
        }
        return Sum;
   }
   public static void main(String[] args) {
        int arr[] ={5,3,2,4,1};
        Arrays.sort(arr);        
        System.out.println(Arrange(arr));
    }

}

