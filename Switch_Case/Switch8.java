import java.util.*;
class Switch8{

        public static void main(String[] args){

                Scanner sc = new Scanner(System.in);

                System.out.println("Enter Number 1");
		int num1 = sc.nextInt();
		System.out.println("Enter Number 2");
		int num2 = sc.nextInt();
                
		if(num1 >= 0 && num2 >= 0){
			int Multi = num1* num2;
			int OE = 2;
			if(Multi%2 == 0){
				OE = 1;
			}
                	switch(OE){

                        	case 1:
                                	System.out.println(num1+"*"+num2+" = "+Multi+ " is Even");
                                	break;
                        	case 2:
                                	System.out.println(num1+"*"+num2+" = "+Multi+ " is Odd");
                                	break;
                        	default:
                                	System.out.println("Invalid Input:");

               		 }
		
		}
		else{

			System.out.println("Sorry Negative Number Not Allowed");
		}

        }

}
