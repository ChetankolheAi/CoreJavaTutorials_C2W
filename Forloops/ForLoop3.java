

import java.util.*;
class ForLoop3{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for (int i =0 ;i<n;i++){ //i for row
			for(int j=i;j<n;j++){ // j for Column i.e For "*"

				System.out.print(" ");

			}
			 for(int k=0;k<i+1;k++){ // j for Column i.e For "*"

                                System.out.print("*");

                        }
			System.out.println();

		}
	

	}


}
