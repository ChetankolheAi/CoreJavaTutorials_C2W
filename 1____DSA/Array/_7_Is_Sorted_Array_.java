class _7_Is_Sorted_Array_{
        static int IsArraySorted(int arr[]){

                
                for(int i=0;i<arr.length-1;i++){

                        if(arr[i]>arr[i+1]){
				return 0;
			}
                                
                }
		return 1;
             
        }

        public static void main(String[] args){


                int arr[] = {1,2,3,4,5,6,7,8,9};
                System.out.println(IsArraySorted(arr));


        }

}
