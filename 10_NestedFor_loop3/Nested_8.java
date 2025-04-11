import java.util.*;
class Nested{
        public static void main(String[] args){

                Scanner sc = new Scanner(System.in);
                System.out.println("Enter the Rows");
                int n = sc.nextInt();
               
                for(int i=1;i<=n;i++){
                        
                        for(int j=1;j<=n;j++){
                                if(i%3==1){
                                        
                                       System.out.print('#'+" ");
                                }
                                else if(i%3==2){
                                       
                                        System.out.print('$'+" ");
                                }
				else if(i%3==0){

                                        System.out.print('@'+" ");
                                }


                        }
                    
                        System.out.println();                                                                                                                               }
        }
}
