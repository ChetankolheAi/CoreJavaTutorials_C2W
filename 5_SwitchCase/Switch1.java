



import java.util.*;
class Switch1{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Traffic Light Color /Red/Yellow/Green");
		String Signal  = sc.next();

		switch(Signal){

			case "Red":
				System.out.println("Stop");
				break;
			case "Green":
				System.out.println("Go");
				break;
			case "Yellow":
				System.out.println("Look And Go");
				break;
			default:
				System.out.println("Invalid Input : No Such Color in Traffic Light");

		}

	}

}
