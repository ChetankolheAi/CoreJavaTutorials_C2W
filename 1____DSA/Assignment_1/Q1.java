//Count the Number of Digits in Number
class Q1{
    static int DigitCount(int num){
        int count = 0;
        while(num>=1){
            num=num/10;
            count++;
        }
        return count;

    }
    public static void main(String[] args){
            
       System.out.println(DigitCount(232323)); 
    }   
}