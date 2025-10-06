public class _6_Check_Palindrome_frequency {
    static boolean isPalindrome(int num){
        int temp = num;
        int rev = 0;
        while(num>0){
            int digit = num%10;
            num/=10;
            rev = rev*10+digit;
        }
        if(rev==temp)return true;
        return false;
    }
    public static void main(String[] args) {
        int arr[]={131,111,121};
        int PalindromeCount = 0;
        for(int i=0;i<arr.length;i++){
            if(isPalindrome(arr[i]))PalindromeCount++;
        }
        System.out.println("Count Of Palidromic Number in Array is : "+ PalindromeCount);
    }
}
