package exercise;

import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int dem = 0;
        System.out.println("Nhập một số bất kỳ: ");
        int n = new Scanner(System.in).nextInt();
        
        // Kiểm tra xem giá trị nhập vào có phải số dương không
        
        // Nếu n < 0 thì thông báo lỗi
        if (n < 0) {
            System.out.println("Nhập sai.");
        }
        // nếu n >= 0 thì thực hiện tính toán
        else {
            // Nếu n = 0 hoặc n = 1 thì thông báo không là số nguyên tố
            if (n == 0 || n == 1) {
                dem = 0;
            }
            else {
                for (int i = 1; i <= n; i++) {
                    if (n % i == 0) {
                        dem += 1;
                    }
                }
            }
        }
        
        if (dem == 2) {
            System.out.println("Đây là số nguyên tố.");
        }
        else {
            System.out.println("Đây không phải là số nguyên tố.");
        }
    }

}
