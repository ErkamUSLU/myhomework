package uzunKelimeBul;

import java.util.Scanner;

public class uzunKelime {
    public static void main(String[] args) {


    Scanner scan = new Scanner(System.in);
        System.out.println("Cumle giriniz: ");

    String cumle = scan.nextLine();

        System.out.println(longestWord(cumle));
}
    public static String longestWord(String cumle) {

        String arr[] = cumle.split(" ");
        int max = 0;
        String longestWord = "";

        for (int i = 0; i < arr.length; i++) {

            if (arr[i].length() > max) {
                max = arr[i].length();
                longestWord = arr[i];

            }
        }
        return longestWord;
    }
}

