class Main {
    static int sumArray(int arr[],int i){
        if(i==0){
            return arr[0];
        }
        return arr[i]+sumArray(arr,i-1);
    }
    static double AvgCalc(int arr[]){
        
        int sum = sumArray(arr,arr.length-1);
        double Avg = (double)sum/arr.length;
        return Avg;
    }
    public static void main(String[] args) {
        int arr[]={10,20,30,40};
        System.out.println(AvgCalc(arr));
        System.out.println("Try programiz.pro");
    }
}