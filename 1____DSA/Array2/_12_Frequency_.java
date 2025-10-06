public class _12_Frequency_{
    static void Solve(int arr[]){
        int Freq[] = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            Freq[arr[i]]++;
        }

        for(int i=0;i<Freq.length;i++){
            if(Freq[i]>0){
                System.out.println(i+" Appers "+Freq[i]+" Times");
              
            }
        }
        

    }
    public static void main(String[] args) {
        int arr[] ={1,2,3,3,4,1};
        Solve(arr);
    }
}