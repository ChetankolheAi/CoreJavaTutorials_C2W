public class _8_Most_frequent {
    static int Solve(int arr[]){
        int Freq[] = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            Freq[arr[i]]++;
        }

        int MaxFreq = 0;
        int Element = 0;
        for(int i=0;i<Freq.length;i++){
            if(MaxFreq<Freq[i]){
                MaxFreq = Freq[i];
                Element = i;
            }
        }
        return Element;

    }
    public static void main(String[] args) {
        int arr[] ={4,3,4,3,4,3,4};
        int ans = Solve(arr);
        System.out.println("Most Occurance Number is :"+ans);
    }
}
