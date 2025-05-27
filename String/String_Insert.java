import java.util.*;
class Demo{

	public static void main(String[] args){

	Scanner sc = new Scanner(System.in);
	System.out.print("Enter String ");
	String str = sc.next();
	String str1 = "User";
	StringBuffer sb = new StringBuffer(str);
	StringBuffer sb1 = new StringBuffer(str1);
	sb1.insert(4,sb);
	String ans = sb1.toString();
	System.out.println(ans);
	
	
	}
}
