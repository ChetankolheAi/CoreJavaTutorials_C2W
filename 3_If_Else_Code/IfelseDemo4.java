







import java.util.*;

class IfelseDemo4{

	public static void main(String[] args){

	Scanner sc = new Scanner(System.in);

	System.out.println("Enter Alphabet to check whether the Alphabet is in Upper Case or in Lower Case");

	char ch = sc.next().charAt(0);
	if(ch>='a' && ch <='z'){
		
		System.out.println(ch+ " is in Lower Case");
	}
	else if(ch>='A' && ch<='Z'){

		System.out.println(ch + " is in Upper Case");

	}
	else{
		System.out.println(ch +" is invalid Character");
	}




	}}
