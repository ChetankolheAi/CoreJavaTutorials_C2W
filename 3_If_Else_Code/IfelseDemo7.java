




import java.util.*;
class IfelseDemo7{



	public static void main(String[] args){

		Scanner sc= new Scanner(System.in);

		System.out.println("Enter The Number");
		int num1 = sc.nextInt();

		if(num1%3 ==0 && num1%7==0){

			System.out.println(num1+" is Divisible by both 3 and 7");
		}
		else if(num1%3==0){

			System.out.println(num1+" is Divisible by 3");
			
		}
		else if(num1%7 == 0){


			System.out.println(num1+" is Divisible by 7");


		}
		else{

			System.out.println(num1+" is Neither Divisible by 3 nor by 7");

		}


	}





}
