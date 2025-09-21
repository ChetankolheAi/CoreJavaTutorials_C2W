

public class NoOfFactors {
        static int FactorCount (int num ,int num1){
                // if(num1*num1>num)return 0;

             
                // if(num%num1==0){
        
                //     if (num1 * num1 == num) {
                //         // Perfect square, count only once
                //         return 1 + FactorCount(num,num1 + 1);
                //     } else {
                //         // Count both i and num/i
                //         return 2 + FactorCount(num,num1 + 1);
                //     }
                // }
                // else{
                //     return FactorCount(num, num1+1);
                // }



                if(num==0)return 0; 
                
                int count1 = 0; 
                if(num1%num==0){ 
                    count1++; 
                } 
                
                return count1 + FactorCount(num-1,num1); 



        }
	  public static void main(String[] args){
        System.out.println(FactorCount(5656 ,5656));
       
    }
}
