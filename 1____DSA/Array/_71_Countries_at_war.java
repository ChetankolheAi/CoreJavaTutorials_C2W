public class _71_Countries_at_war{
    static String WarWinner(int ctr1[] , int ctr2[]){
        int Alive1 = 0;
        int Alive2 = 0;
        for(int i=0;i<ctr1.length;i++){
            if(ctr1[i]==ctr2[i]){
                continue;
            }
            else if(ctr1[i]>ctr2[i]){
                Alive1++;
            }
            else if(ctr1[i]<ctr2[i]){
                Alive2++;
            }

        }
        if(Alive1>Alive2)return "Country 1 Wins";
        if(Alive1<Alive2)return "Country 2 Wins";
        return "Draw No Winner";
    }
    public static void main(String[] args) {
        int ctr1[]={1,2,3,10};
        int ctr2[]={1,2,3,8};
        System.out.println(WarWinner(ctr1,ctr2));
    }
    
}
