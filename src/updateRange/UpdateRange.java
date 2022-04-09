package updateRange;

public class UpdateRange {

    public static void updateRange(int a, int b, int[] arr) {
        int array[] = {1, 6, 12, 15, 22, 18, 30, 16};


        for (int i = 0; i < arr.length; i++) {
            if (b > a) {
                if (arr[i] >= a && arr[i] <= b) {
                    arr[i] = (-1);
                }
                System.out.print(arr[i] + " ");
            } else {
                if (arr[i] >= b && arr[i] <= a) {
                    arr[i] = (-1);
                }
                System.out.print(arr[i] + " ");
            }

        }
    }


    public static void main(String[] args) {
        updateRange(36, 24, new int[]{1, 6, 12, 15, 22, 18, 30, 16});

    }
}
