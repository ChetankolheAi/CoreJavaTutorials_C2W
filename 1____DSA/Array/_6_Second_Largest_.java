class _6_Second_Largest_{
        static int SecondLargest(int arr[]){

                int max = Integer.MIN_VALUE;
		int max2 = Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++){
			
			if(arr[i]>max){
				max = arr[i];
			}

		}
		for(int i =0 ;i<arr.length;i++){

			if(arr[i]>max2 && arr[i]<max){
				max2 = arr[i];

			}
		}
		return max2;
        }

        public static void main(String[] args){


                int arr[] = {12,35,1,10,34,1};
                System.out.println(SecondLargest(arr));


        }

}
