package arrayContains;

import java.util.Arrays;

public class arrayContains {
    public static void main(String[] args) {


    /*
    Artan düzende sıralanmış iki adet ınt array göz önüne alındığında 2. deki tum degerler 1.de varsa true dondur
    yoksa false dondur.
     */

        int[] arr1 = {2, 4, 6, 8};
        int[] arr2 = {2, 6};

        boolean varMi = false;

        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j <=i ; j++) {

                if (arr1[i]==arr2[j]){
                    varMi=true;
                }else varMi=false;

            }
        }
        System.out.println(varMi);



    }}