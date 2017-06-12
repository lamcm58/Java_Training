package controlstatement;

import java.util.Scanner;

public class PerfectNumber {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.print("Nhập một số bất kỳ: ");
        int n = new Scanner(System.in).nextInt();
        // Kiểm tra xem giá trị nhập vào có phải là số dương không
        
        // Nếu n <= 0 thì thông báo lỗi
        if (n <= 0) {
            System.out.println("Nhập sai.");
        }
        // Nếu n > 0 thì thực hiện tính toán
        else {
            int tong = 0;
            for (int i = 1; i <= n/2; i++) {
                if (n % i == 0) {
                    tong += i;
                }
            }
            
            if (tong == n) {
                System.out.println("Số " + n + " là  số hoàn hảo.");
            }
            else {
                System.out.println("Số " + n + " không phải là số hoàn hảo.");
            }
        }
    }

}
