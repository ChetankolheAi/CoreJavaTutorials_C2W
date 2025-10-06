public class _42_First_Last_Occurance_Of_X {
    public static void main(String[] args) {
     int[] arr = {1, 2, 3, 2, 4, 2, 5};
        int X = 2;

        int firstIndex = -1;
        int lastIndex = -1;

       
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == X) {
                if (firstIndex == -1) {
                    firstIndex = i; 
                }
                lastIndex = i;
            }
        }

        if (firstIndex != -1) {
            System.out.println("First occurrence of " + X + " is at index: " + firstIndex);
            System.out.println("Last occurrence of " + X + " is at index: " + lastIndex);
        } else {
            System.out.println(X + " not found in the array.");
        }
    }
}
