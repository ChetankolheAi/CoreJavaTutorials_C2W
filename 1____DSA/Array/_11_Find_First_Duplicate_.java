import java.util.HashMap;

public class _11_Find_First_Duplicate_ {
    static int FindFirstDuplicate(int arr[]){
        HashMap<Integer, String> map = new HashMap<>();
            for(int i=0;i<arr.length;i++){
                if(map.containsKey(arr[i]))
                {   
                    return i;   
                }else{
                    map.put(arr[i],"I");
                }
            }
            return -1;

    }
    public static void main(String[] args) {
        int arr[] = {10,10,30,40,50,10};
        System.out.println(FindFirstDuplicate(arr));
    }
}
