class _3_Finding_All_Duplicates_{
        static void DuplicateArray(int arr[])
	{
                int result[] = new int[arr.length];
                for(int i =0 ;i<arr.length;i++){

                        result[i] = -1;
                }

                for(int i = 0;i< arr.length;i++){
			
			result[arr[i]] += 1;

		}	
		boolean isDuplicateOccur = false;
		for(int i = 0;i< result.length ;i++){
			
			if(result[i]>0){
				
				System.out.print(i+",");
				isDuplicateOccur = true;
			}
			
		}
		if(!isDuplicateOccur){
			
			System.out.print(-1);

		}

               	


        }

        public static void main(String[] args){

                int arr[] = {0,1,2,3};
                DuplicateArray(arr);


        }

}
