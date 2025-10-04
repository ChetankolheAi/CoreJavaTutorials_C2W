import java.util.HashMap;

public class _29_Key_Pair {
    static boolean KeyPair(int arr[] , int k){
            HashMap<Integer, String> map = new HashMap<>();
            for(int i=0;i<arr.length;i++){
                map.put(arr[i],"I");
            }
            for(int i=0;i<arr.length;i++){
                int Remaining = k-arr[i];
                if(map.containsKey(Remaining)){
                    return true;
                }
            }
            return false;

    }
    public static void main(String[] args) {
        int arr[]={1,2,4,5};
        int X = 16;
        System.out.println( KeyPair(arr, X));
       
    }
}
