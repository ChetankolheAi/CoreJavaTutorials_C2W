



import java.util.*;
class Switch2{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Your Grade / O , A , A+ , P , F");
		String Grade  = sc.next();

		switch(Grade){

			case "O":
				System.out.println("Outstanding");
				break;
			case "A":
				System.out.println("Excellent");
				break;
			case "A+":
				System.out.println("FirstClass");
				break;
			case "P":
				System.out.println("Pass");
				break;
			case "F":
				System.out.println("Fail");
				break;
			default:
				System.out.println("Invalid Input : No Such Grade");

		}

	}

}
