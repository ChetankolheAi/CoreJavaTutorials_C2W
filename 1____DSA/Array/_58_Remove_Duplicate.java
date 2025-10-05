import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class _58_Remove_Duplicate {

    public static int[] removeDuplicates(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for (int num : arr) {
            set.add(num);
        }

        int[] result = new int[set.size()];
        int i = 0;
        for (int num : set) {
            result[i++] = num;
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {4, 2, 5, 2, 1, 4, 3};
        int[] res = removeDuplicates(arr);
        System.out.println(Arrays.toString(res));
    }
}


