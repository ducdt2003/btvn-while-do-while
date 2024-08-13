package btvn_7;

import java.util.Scanner;

public class use_do_while {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //  tính tổng tất cả các số nguyên từ phần tử thứ 0 --> n

        int n = 0, sum = 0;
        System.out.println(" nhập vào số nguyên bất kỳ ");
        int nNhap = Integer.parseInt(sc.nextLine());
        do {
            sum += n;
            n++;
        }while ( n <= nNhap);
        System.out.println(" tổng là " + sum);

        // tính tích các phần tử từ 0 --> n
        int tich = 1, n1 =1;
        do {
            tich *= n1;
            n1++;
        } while (n1 <= nNhap);
        System.out.println(" tích là " + tich);


         /*         Viết chương trình cho phép nhập vào một số nguyên dương n,
         tính tổng tất cả số chẵn trong khoảng từ 0 -- n*/

        int soDuong;
        do {
            System.out.println(" nhập số nguyên dương bất kỳ ");
            soDuong = Integer.parseInt(sc.nextLine());
        } while (soDuong < 0 );

        int n2 = 0;
        int sumChan = 0;
        do {
            if ( n2 % 2 == 0 ){
                sumChan += n2;
            }
            n2++;
        } while ( n2 <= soDuong);
        System.out.println(" tổng số chẵn là " + sumChan);
    }
}
