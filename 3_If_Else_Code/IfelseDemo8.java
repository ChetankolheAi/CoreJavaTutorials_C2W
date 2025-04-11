




import java.util.*;
class IfelseDemo8{



	public static void main(String[] args){

		Scanner sc= new Scanner(System.in);

		System.out.println("Enter The Number");
		int num1 = sc.nextInt();

		if(num1%2 ==0 && num1%5==0 && num1%10==0){

			System.out.println(num1+" is Divisible by 2 , 5 , 10");
		}
		else{

		System.out.println(num1+" is not Divisible by 2 , 5 , 10");	

		}


	}


}
