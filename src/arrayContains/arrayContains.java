package arrayContains;

import java.util.Arrays;

public class arrayContains {
    public static void main(String[] args) {


    /*
    Artan düzende sıralanmış iki adet ınt array göz önüne alındığında 2. deki tum degerler 1.de varsa true dondur
    yoksa false dondur.
     */
        int[] arr1 = {2, 4, 6, 8};
        int[] arr2 = {4, 6, 9};
        int sayac = 0;

        for (int each : arr1) {
            for (int each1 : arr2) {
                if (each == each1) {
                    sayac++;
                }
            }
        }
        if (sayac == arr2.length) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}