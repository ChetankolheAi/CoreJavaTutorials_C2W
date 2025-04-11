



import java.util.*;
class Switch3{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Your Cloth Size / XXXL , XXL , XL , L , M , S ");
		String Size  = sc.next();

		switch(Size){

			case "XXXL":
				System.out.println("Extra Extra Extra Large");
				break;
			case "XXL":
				System.out.println("Extra Extra Large");
				break;
			case "XL":
				System.out.println("Extra Large");
				break;
			case "L":
                                System.out.println("Large");
                                break;
			case "M":
                                System.out.println("Medium");
                                break;
			case "S":
                                System.out.println("Small");
                                break;
			default:
				System.out.println("Invalid Input : No Such Size");

		}

	}

}
