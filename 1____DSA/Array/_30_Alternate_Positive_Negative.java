public class _30_Alternate_Positive_Negative {
    static void AlternatePositiveNegative(int arr[]) {
        int Posi[] = new int[arr.length];
        int Negi[] = new int[arr.length];
        int posCount = 0;
        int negCount = 0;

        // Putting all positive values in Posi;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0) {
                Posi[posCount] = arr[i];
                posCount++;
            }
        }

        // Putting all negative values in Negi;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                Negi[negCount] = arr[i];
                negCount++;
            }
        }

        int PosiIndex = 0;
        int NegiIndex = 0;

        // Combining both array
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0 && PosiIndex < posCount) {
                arr[i] = Posi[PosiIndex];
                PosiIndex++;
            } else if (i % 2 != 0 && NegiIndex < negCount) {
                arr[i] = Negi[NegiIndex];
                NegiIndex++;
            } else if (PosiIndex >= posCount && NegiIndex < negCount) {
                arr[i] = Negi[NegiIndex];
                NegiIndex++;
            } else if (NegiIndex >= negCount && PosiIndex < posCount) {
                arr[i] = Posi[PosiIndex];
                PosiIndex++;
            }
        }

      
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { -5, -2, 5, 2, 4, 7, 1, 8, 0, -8 };
        AlternatePositiveNegative(arr);
    }
}
