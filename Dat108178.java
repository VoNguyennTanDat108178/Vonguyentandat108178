package buoi2;

import java.util.Scanner;

public class Dat108178 {
    public static void main(String[] args) {
        // Khai báo biến
        int num1 = 10;
        double num2 = 5.5;
        
        // Xuất thông tin
        System.out.println("Xin chào các bạn tân sinh viên lớp Dat108178");
        System.out.println("Xin chào các bạn tân sinh viên lớp \"Dat108178\"");
        System.out.println("Giá trị của num1 là " + num1);
        System.out.println("Giá trị của num2 là " + num2);

        // Nhập dữ liệu từ bàn phím
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập tên lớp: ");
        String tenLop = scanner.nextLine();
        System.out.println("Xin chào các bạn tân sinh viên\nlớp " + tenLop);

        // Xuất bảng
        System.out.printf("%-5s %-20s %-10s%n", "1", "Vo Nguyen Tan Dat", "IT24B");
        
        scanner.close();
    }
}