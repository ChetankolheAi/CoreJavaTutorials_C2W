public class Q3_Reverse_Number {
    
    static int ReverseUserNumber(int num){
      
        int Reverse = 0;
        while(num>=1){
            int digit = num%10;
            num=num/10;
            Reverse = Reverse*10+digit;
        
        }
        return Reverse;

    }
    public static void main(String[] args){
            
       System.out.println(ReverseUserNumber(1223)); 
    }   
}