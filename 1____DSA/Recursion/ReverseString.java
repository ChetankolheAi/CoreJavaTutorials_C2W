import java.util.*;
public class ReverseString {
        static boolean StringPalindromeCheck(String s , int left , int right){
                if(left>=right){
                    return true;
                }
                if(s.charAt(left) != s.charAt(right)){
                        return false;
                }
                
                return StringPalindromeCheck(s ,left + 1, right - 1);
        }
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the String");
            String UserInput =sc.next();

            System.out.println( StringPalindromeCheck(UserInput , 0 , UserInput.length()-1));
        }
}
