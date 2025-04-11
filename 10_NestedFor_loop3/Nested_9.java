import java.util.*;
class Nested{
        public static void main(String[] args){

                Scanner sc = new Scanner(System.in);
                System.out.println("Enter the Rows");
                int n = sc.nextInt();
                char ch = (char)(64+n);
                char ch1 = 65;
		int num =1;
                for(int i=1;i<=n;i++){
                       
                        for(int j=1;j<=n;j++){
                                if(i%2!=0){
                                       
                                       System.out.print(ch--+" ");
                                }
                                else{
                                      
                                        System.out.print(num+++" ");
                                }


                        }
                        ch = (char)(64+n);
                        num=1;
                        System.out.println();                                                                                                                               }
        }
}
