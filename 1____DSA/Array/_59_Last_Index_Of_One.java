public class _59_Last_Index_Of_One {

    static int lastIndex(int[] arr) {
        int last = -1; 
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                last = i;
            }
        }
        return last;
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 1, 0, 1};
        System.out.println("Last index of 1: " + lastIndex(arr)); 
    }

}
