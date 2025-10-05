public class _55_Maximum_Product_OF_Two_Number {
     static int maxProduct(int[] arr) {
    
        int max1 = Integer.MIN_VALUE; 
        int max2 = Integer.MIN_VALUE; 

        for (int num : arr) {
            if (num > max1) {
                max2 = max1; 
                max1 = num;
            } else if (num > max2) {
                max2 = num;
            }
        }

        return max1 * max2;
    }

    public static void main(String[] args) {
        int[] arr = {42 ,100 , 22, 1,3,4};
        System.out.println("Max product: " + maxProduct(arr)); // Output: 9 * 7 = 63
    }
}
