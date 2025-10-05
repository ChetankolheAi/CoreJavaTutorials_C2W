public class _65_Minimum_Product_Of_k_Integer {
    static int MinProductinKrange(int arr[] , int k){
       
        int RangeProduct = 1;
        for(int i=0;i<k;i++){
            if(arr[i]==0)return 0;
            RangeProduct*=arr[i];
        }
        if(arr.length==k)return RangeProduct;
        
        int MinProduct = RangeProduct;
        for(int i=k;i<arr.length;i++){
            if(arr[i]==0)return 0;
            RangeProduct =(RangeProduct*arr[i])/arr[i-k];
            if(RangeProduct<MinProduct){
                MinProduct=RangeProduct;
            }
        }
        return MinProduct;
    }
    public static void main(String[] args) {
        int arr[] ={2,2,2,9};
        System.out.println(MinProductinKrange(arr ,3));
    }
}
