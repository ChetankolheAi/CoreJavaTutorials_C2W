class _8_Rotate_Array_{
		static void reverse(int[] arr, int left, int right) {
			while (left < right) {
				int temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
				left++;
				right--;
			}
		}
        static void RotateArray(int arr[] , int D){

			if(D>arr.length){
				D = D%arr.length;
			}
			 reverse(arr, 0, D - 1);    
        	reverse(arr, D, arr.length - 1);     
        	reverse(arr, 0, arr.length - 1);      

        }

        public static void main(String[] args){


                int arr[] = {1,2,3,4,5,6,7};
                RotateArray(arr , 2);
				for(int i=0;i<arr.length;i++){

					System.out.println(arr[i]);

				}

        }

}
