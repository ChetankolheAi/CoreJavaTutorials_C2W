

import java.util.*;

class ifelseDemo1{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number To Check Positive or negative");
		int x = sc.nextInt();

		if(x>0){
			
			System.out.println(x+" is Positive");
	
		}
		else if(x == 0){

			System.out.println(x+" is 0");
		}
		else{
			System.out.println(x+" is Negative");

		}


	}




}
