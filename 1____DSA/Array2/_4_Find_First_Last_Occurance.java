
public class _4_Find_First_Last_Occurance {
    static void FindIndex(int arr[] , int X){
        int first = -1;
        int last =0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] == X && first==-1){
                first = i;
            }
            else if(arr[i]==X){
                last = i;
            }
        }
        if(first ==-1){
            System.out.println("No Element Found");
        }
        else{
            System.out.println("First Occurance :- "+ first);
            System.out.println("Last Occurance:- "+last);
        }
    }
        public static void main(String[] args) {
            int arr[]={1,7,5,4};
            int X = 3;
            FindIndex(arr , X);
        }
}
