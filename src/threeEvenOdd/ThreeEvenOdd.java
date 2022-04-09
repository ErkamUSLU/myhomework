package threeEvenOdd;

public class ThreeEvenOdd {


    public static boolean ucArray() {
        int arr[] = {2, 56, 78, 9, 78, 8};

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                count += 1;

            }
        }
        if (count >= 3) {
            return true;

        } else {
            return false;
        }

    }

    public static void main(String[] args) {
        ucArray();
    }
}