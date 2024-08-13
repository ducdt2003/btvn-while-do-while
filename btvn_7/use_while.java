package btvn_7;

import java.util.Scanner;

public class use_while {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //  tính tổng tất cả các số nguyên từ phần tử thứ 0 --> n

        int n = 0, sum = 0;
        System.out.println( " Nhập số nguyên n ");
        int nNhap = Integer.parseInt(sc.nextLine());
        while (n <= nNhap) {
            sum += n;
            n++;
        }
        System.out.println(" tổng là " + sum);


        // tính tích các phần tử từ 0 --> n

        int n1 = 1, tich =1;
        while (n1 <= nNhap) {
            tich *= n1;
            n1++;
        }
        System.out.println(" tích là " + tich);


        /*         Viết chương trình cho phép nhập vào một số nguyên dương n,
         tính tổng tất cả số chẵn trong khoảng từ 0 -- n*/
        int nDuong;
        System.out.println( " nhập số nguyên dương ");
        nDuong = Integer.parseInt(sc.nextLine());
        while ( nDuong < 0 ){
            System.out.println( " bạn đã nhập số âm ");
            System.out.println(" nhập lại ");
            nDuong = Integer.parseInt(sc.nextLine());
        }
        int sumChan = 0;
        int n2 = 0;
        while ( n2 < nDuong ) {
            if ( n2 % 2 == 0) {
                sumChan += n2;
            }
            n2++;
        }
        System.out.println(" tổng chẵn " + sumChan);
    }
}
