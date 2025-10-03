class _12_No_Of_Occurance{
		static void FindOccurance(int arr[] ,int X){
            int count = 0;
            for(int i=0;i<arr.length;i++){

                if(arr[i]==X){
                    count++;
                }
            }
            System.out.println(count);
        } 
        public static void main(String[] args){


                int arr[] = {1,1,2,2,2,2,3};
                int X = 2;
                FindOccurance(arr , X);


        }

}
