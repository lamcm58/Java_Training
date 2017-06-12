package exercise;

import java.util.ArrayList;
import java.util.Scanner;

public class PerfectNumber {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.print("Nhập một số bất kỳ: ");
        int n = new Scanner(System.in).nextInt();
        
        int tong = 0;
        for (int i = 1; i <= n/2; i++) {
            if (n % i == 0) {
                tong += i;
            }
        }
        
        if (tong == n) {
            System.out.println("Số " + n + " là số hoàn hảo.");
        }
        else {
            System.out.println("Số " + n + " không phải số hoàn hảo.");
        }
    }

}
