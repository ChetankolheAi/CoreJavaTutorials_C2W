public class Sum_Of_N {
    static int SumofN(int num){
            if(num == 1){
                return 1;
            }
            num = num + SumofN(--num);
            return num;
    }


    static void PrintFirstN(int num){
        if(num == 0){
            return ;
        }
        PrintFirstN(num-1);
        System.out.println(num+" ");
    }

    
    public static void main(String[] args){
        System.out.println(SumofN(100));
        PrintFirstN(90);
    }
}
