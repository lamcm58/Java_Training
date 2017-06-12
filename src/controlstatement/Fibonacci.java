package controlstatement;

import java.util.Scanner;

public class Fibonacci {

    /**
     * HÃ m main
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int f0 = 1;
        int f1 = 1;
        int result=0;
        System.out.println("Nhập một số bất kỳ: ");
        int n = new Scanner(System.in).nextInt();
        
        // Kiểm tra xem giá trị nhập vào có phải là số dương không
        
        // Nếu n <= 0 thì thông báo lỗi
        if (n <= 0) {
            System.out.println("Nhập sai.");
        }
        // Nếu n > 0 thì thực hiện tính toán
        else {
            System.out.print("Dãy Fibonacci: ");
            for (int i = 0; i < n; i++) {
                f0 = f1;
                f1 = result;
                result = f0 + f1;
                
                System.out.print(result + "    ");
            }
        }
    }

}
