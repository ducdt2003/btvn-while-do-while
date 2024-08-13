package btvn_7;

import java.util.Scanner;

public class use_for {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // dùng for tính tổng tất cả các số nguyên từ phần tử thứ 0 --> n

        int sum = 0, n, tich = 1, sumChan = 0;
        System.out.println( " Nhập số nguyên n ");
        n = Integer.parseInt(sc.nextLine());
        System.out.println( " các phần tử từ 0 --> " + n + " là ");
        for (int i = 0; i <= n ; i++){
            sum += i;
            System.out.println(i);
        }
        System.out.println(" Tổng tất cả các số nguyên từ phần tử 0 --> " + n + " = " + sum);
        System.out.println("\n");


        // tính tích các phần tử từ 0 --> n

        System.out.println( " các phần tử từ 0 --> " + n + " là ");
        for (int i = 1; i <= n ; i++) {
            tich *= i;
            System.out.println(i);
        }
        System.out.println(" Tích tất cả các số nguyên từ phần tử 0 --> " + n + " = " + tich);


/*         Viết chương trình cho phép nhập vào một số nguyê dương n,
         tính tổng tất cả số chẵn trong khoảng từ 0 -- n*/

        System.out.println(" các số chẵn từ 0 --> " + n + " là ");
        for ( int i = 0 ; i <= n ; i++ ){
            if ( i % 2 == 0 ){
                sumChan += i;
                System.out.println(i);
            }
        }
        System.out.println(" Tổng các số chẵn từ 0 --> " + n + " là " + sumChan);
    }
}
