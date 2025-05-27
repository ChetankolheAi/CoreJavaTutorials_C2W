



class ForLoopA{

	public static void main(String[] args){
		
		int n = 10;
		int l = n/2;
		for(int i=0 ; i < n; i++){

			for(int j = i ; j < n ; j++){

				
				System.out.print(" ");


			}

				System.out.print("*");
			for(int k = 0  ; k < i ; k++ ){
				
				if( i == l){
				
					System.out.print("*");

				}
				else{


					System.out.print(" ");
				}


			}
			 for(int k = 0  ; k < i ; k++ ){

                                if( i == l){

                                        System.out.print("*");

                                }
                                else{


                                        System.out.print(" ");
                                }


                        }
			System.out.print("*");
			System.out.println("");	


		}
	}


}
