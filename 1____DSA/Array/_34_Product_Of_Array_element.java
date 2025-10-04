public class _34_Product_Of_Array_element {
    static int Product(int Start , int end){
        int Pro = 1;
        for(int i=Start ; i<=end;i++){
            Pro*=i;
        }
        return Pro;
    }
    public static void main(String[] args) {
        int Start = 1;
        int end = 4;
        System.out.println(Product(Start ,end));
    }
}
