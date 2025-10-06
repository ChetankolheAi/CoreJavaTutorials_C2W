public class _45_Sum_Of_Distinct_Element {
    public static void main(String[] args) {
        int arr[] ={1,2,3,4,5};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            boolean isDuplicate = false;

            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    isDuplicate = true;
                    break;
                }
            }

    
            if (!isDuplicate) {
                sum += arr[i];
            }
        }
        System.out.println("Sum of distinct elements: " + sum);

    }
}
