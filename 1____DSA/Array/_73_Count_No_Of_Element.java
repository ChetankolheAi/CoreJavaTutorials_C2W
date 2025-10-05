public class _73_Count_No_Of_Element{
    static int Count(int arr[] , int num1 , int num2){
        int i=0;
        int j=arr.length-1;
        while(i<j && (arr[i]!=num1 || arr[j]!=num2)){
            if(arr[i]!=num1)i++;
            if(arr[j]!=num2)j--;
        }
        return (j-i)-1;
    }
    public static void main(String[] args) {
        int arr[] ={4,2,1,10,6};
        System.out.println(Count(arr,4,6));

    }
}