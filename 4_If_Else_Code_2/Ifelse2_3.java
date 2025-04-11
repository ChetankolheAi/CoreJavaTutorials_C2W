





import java.util.*;
class Ifelse2_3{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Alphabet in Lower Case");
		char n = sc.next().charAt(0);
		
		if(n == 'a' || n=='e' || n=='i' || n=='o' || n=='u'){

			System.out.println( n +" is Vowel");

		}
		else{

			     System.out.println( n +" is Consonant");
			     
		}
	}


}
