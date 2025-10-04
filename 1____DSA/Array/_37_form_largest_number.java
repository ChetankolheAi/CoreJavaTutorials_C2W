import java.util.HashMap;

public class _37_form_largest_number {
    static int FormLargestNumber(int arr[]){
        HashMap<Integer ,Integer>map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])) map.put(arr[i],map.get(arr[i])+1);
            else map.put(arr[i],1);
        }
        int ReqAns =0;
        for(int i=9;i>=0;i--){
            int Freq =0;
            if(map.containsKey(i))Freq = map.get(i);  
            while(Freq>0){
                ReqAns = ReqAns*10+i;
                Freq--;
            }
        }
        return ReqAns;
    }
    public static void main(String[] args) {
        int arr[] ={9,0,1,3,0};
        System.out.println(FormLargestNumber(arr));
    }
}
