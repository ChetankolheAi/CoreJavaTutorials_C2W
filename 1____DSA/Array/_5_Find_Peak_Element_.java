//Peak Element

class _5_Find_Peak_Element_{
        static int FindPeakElement(int nums[]){
          int i =0;
        int j =nums.length-1;

        while(i<j){
            int mid = i+(j-i)/2;
            if(nums[mid]>nums[mid+1]){
                j = mid;
            }
            else{
                i=mid+1;
            }
        }
        return i;
	}

        public static void main(String[] args){

                
                int arr[] = {1,2,3,4,5};
                System.out.println(FindPeakElement(arr));


        }

}
