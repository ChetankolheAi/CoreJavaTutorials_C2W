import java.lang.reflect.Array;

public class Merge_two_sortedArray {
    static int[]  mergeSorted(int arr[] , int arr1[]){
        int[] arrResult = new int[arr.length+arr1.length];

        int k=0;
        int j=0;
        int i=0;
        while(k<arr.length && j<arr1.length){
            
            if(arr[k]>arr1[j]){
                arrResult[i] = arr1[j];
                j++;
            }
            i++;
        }
         while(k < arr.length){
            arrResult[i++] = arr[k++];
        }
        while(j < arr1.length){
            arrResult[i++] = arr1[j++];
        }
       
        return arrResult;


    }
    static void Display(int arr[] , int arr1[] , int arrResult[]){

        System.out.print("Array 1:- ");
        for(int qk:arr){
            System.out.print(qk +",");
        }
        System.out.println("");
        System.out.print("Array 2:- ");
        for(int qk:arr1){
            System.out.print(qk +",");
        }
        System.out.println("");
        System.out.print("Merged Array:- ");
        for(int qk:arrResult){
            System.out.print(qk +",");
        }

    }
    public static void main(String[] args){
        int arr[] = {1,2,4,5,8,9,20};
        int arr1[] = {3,4,5,15,17,22,45};
        int arrResult[]= mergeSorted(arr, arr1);
        Display(arr, arr1, arrResult);
     }
}
