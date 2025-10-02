class _1_Find_Missing_Element_In_0_N{
	static int FindMissingNum(int arr[]){
		int n = arr.length+1;		
		int sum =0; 
		for(int i =0 ;i<arr.length;i++){

			sum += arr[i];
		}

		int ans = n*(n+1)/2;
		System.out.println(ans);
		return ans-sum;


	}
	
	public static void main(String[] args){

		int arr[] = {1,3,2,5,6,7,8,11,10,4};
		System.out.println(FindMissingNum(arr));


	}

}
