

import java.util.*;
class ForLoop2{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for (int i =1 ;i<n+1;i++){ //i for row
			for(int j=0;j<i;j++){ // j for Column i.e For "*"

				System.out.print("*");

			}
			System.out.println();

		}
	

	}


}
