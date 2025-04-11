



import java.util.*;
class Switch4{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Operation / + , - , * , / , % ");
		String Operator= sc.next();
		System.out.println("Enter number 1 ");
		int num1 = sc.nextInt();
		
		System.out.println("Enter Number 2");
		int num2 = sc.nextInt();

		int ans = 0;
		switch(Operator){

			case "+":
				ans = num1+num2;
				 System.out.println(num1+"+"+num2+" is :-  "+ans);
				break;
			case "-":
				ans = num1-num2;
				 System.out.println(num1+"-"+num2+" is :-  "+ans);
				break;
			case "*":
				ans = num1*num2;
				 System.out.println(num1+"*"+num2+" is :-  "+ans);
				break;
			case "/":
				ans = num1/num2;
                                 System.out.println(num1+"/"+num2+" is :-  "+ans);
                                break;
			case "%":
				ans = num1%num2;
                                System.out.println(num1+"%"+num2+" is :-  "+ans);
                                break;
			default:
				System.out.println("Invalid Input : No Such Operator");

		}

	}

}
