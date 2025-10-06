

public class _9_Freq_Equal_TO_Greater_nByTwo {
     static int Solve(int arr[]){
        int Freq[] = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            Freq[arr[i]]++;
        }

     
        for(int i=0;i<Freq.length;i++){
            if(Freq[i]>= (arr.length/2)){
                return i;
            }
        }
        return -1;

    }
    public static void main(String[] args) {
        int arr[] ={3,1,3,3,2};
        int ans = Solve(arr);
        System.out.println("Number Which Occur More than NBy2 :"+ ans);
    }
}
