class _2_Sort_ArrayOf_0_1_2_{
        static void SortArrayOFZeroTwoOne(int arr[]){
		
		int CountOne =0 ;
		int CountZero = 0;
		int CountTwo = 0;
                for(int i =0 ;i<arr.length;i++){

                        if(arr[i] == 0){

                                CountZero += 1;
                        }
			else if(arr[i]==1){

				CountOne += 1;
			}
			else if(arr[i]==2){

				CountTwo += 1;
			}
                }

		for(int i=0 ;i<arr.length;i++){

			if(i<CountZero){
				arr[i] = 0;
			}
			else if(i<(CountZero+CountOne)){

				arr[i] = 1;
			}
			else if(i<(CountZero+CountOne+CountTwo)){

				arr[i] = 2;

			}	
		}

		for(int i =0;i<arr.length;i++){

			System.out.print(arr[i]+",");
		}
                


        }

        public static void main(String[] args){

                int arr[] = {0,1,2,0,1,2,2};
                SortArrayOFZeroTwoOne(arr);


        }

}
