public class _25_EvenNumber_Even_Index {
    static void EvenOdd(int arr[]){
        int OddNumber = -1;
        int EvenNumber = -1;
        for(int i=0;i<arr.length;i++){
            if((arr[i]%2!=0 && i%2!=0) ||(arr[i]%2==0 && i%2==0)){
                continue;
            }
            else if(arr[i]%2!=0 && i%2==0){
                OddNumber = i;
                if(EvenNumber!=-1){
                    int temp = arr[i];
                    arr[i] = arr[EvenNumber];
                    arr[EvenNumber] = temp;
                    EvenNumber = -1;
                    OddNumber = -1;
                }
            }
            else if(arr[i]%2==0 && i%2!=0){
                EvenNumber= i;
                if(OddNumber!=-1){
                    int temp = arr[i];
                    arr[i] = arr[OddNumber];
                    arr[OddNumber] = temp;
                    OddNumber = -1;
                    EvenNumber = -1;
                }
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+",");
        }
    }
    public static void main(String[] args) {
        int arr[]={3,6,12,1,5,8};
        EvenOdd(arr);
    }
}


//O(N) TC
//O(1) SC