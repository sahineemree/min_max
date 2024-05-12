import java.util.*;

public class minMax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    int sayac = 1;

    int min = Integer.MAX_VALUE;
    int max = Integer.MIN_VALUE;

        System.out.print("Kaç adet sayı girmek istediğinizi giriniz : ");
        int n = input.nextInt();

        System.out.println();

        for (int i = 1 ; i <=n ; i++){

            System.out.print(i+ ". sayı = ");
            int sayi = input.nextInt();

            if (i==1){
              min = sayi;
              max = sayi;
            }

            if (sayi>=max) {
                max = sayi;
            }

            if (sayi <= min){
                min = sayi;
            }
        }
        System.out.println("Girdiğiniz sayılardan en büyüğü : " + max);
        System.out.println("Girdiğiniz sayılardan en küçüğü : " + min);
    }
}