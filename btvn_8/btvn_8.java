package btvn_8;

import java.util.Scanner;

public class btvn_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner ( System.in );
        int sum = 0;
        char choce;
        do {
            System.out.println( " nhập số nguyên bất kỳ ");
            int a = Integer.parseInt(sc.nextLine());
            sum += a;
            System.out.println( " nhập Y để tiếp tục || nhập N để in ra kết quả ");
            choce = sc.next().charAt(0);
            sc.nextLine();
        }while ( choce == 'Y');
        System.out.println(" tổng các số vừa nhập là " + sum);
    }
}
