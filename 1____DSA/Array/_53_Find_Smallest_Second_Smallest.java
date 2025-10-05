public class _53_Find_Smallest_Second_Smallest {
     static void SmallestANDsecondSmallest(int[] arr) {
        if (arr == null || arr.length < 2) {
            throw new IllegalArgumentException("Array must have at least two elements");
        }

        int min1 = Integer.MAX_VALUE; // smallest
        int min2 = Integer.MAX_VALUE; // second smallest

        for (int num : arr) {
            if (num < min1) {
                min2 = min1;  // old min becomes second min
                min1 = num;
            } else if (num < min2 && num != min1) {
                min2 = num;
            }
        }

        System.out.println(min1);
        System.out.println(min2);

    }

    public static void main(String[] args) {
        int[] arr = {5, 1, 9, 7, 3};
        SmallestANDsecondSmallest(arr);
    
    }
}
