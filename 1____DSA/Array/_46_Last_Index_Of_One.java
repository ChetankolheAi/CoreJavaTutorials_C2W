public class _46_Last_Index_Of_One {
     static int lastIndex(String arr) {
        int last = -1; 
        for (int i = 0; i < arr.length(); i++) {
            if (arr.charAt(i) == '1') {
                last = i;
            }
        }
        return last;
    }

    public static void main(String[] args) {
        
        String arr = "00001";
        System.out.println("Last index of 1: " + lastIndex(arr)); 
    }
}
