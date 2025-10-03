import java.util.*;
public class _21_Non_Repeating_Element_ {
        static int findUnique(int arr[]) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int x : arr) {
            if (map.containsKey(x)) {
                map.put(x, map.get(x) + 1); //Count++;
            } else {
                map.put(x, 1);
            }
        }

        for (int key : map.keySet()) {
            if (map.get(key) == 1) {
                return key;
            }
        }
        return -1; 
    }
    public static void main(String[] args) {
        int arr1[] = {2, 2,3,4,4};
       
        int ans = findUnique(arr1);   
        System.out.println("Unique element: " + ans);  
    }
}
