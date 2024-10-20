package vonguyenngocquy;

import java.util.Scanner;

public class Buoi5 {
     public static void main(String[] args) {
        double a,b,c,x1,x2,delta;
        Scanner sc = new Scanner(System.in);
        System.out.println("Giải phương trình ax^2 + bx + c = 0");

        // Nhập giá trị a, b, c
        System.out.print("Nhập vào a = ");
        a = sc.nextDouble();
        System.out.print("Nhập vào b = ");
        b = sc.nextDouble();
        System.out.print("Nhập vào c = ");
        c = sc.nextDouble();

        // Kiểm tra nếu a != 0 mới là phương trình bậc 2
        if(a==0) {
            System.out.println("Nhập dữ liệu sai!");
            return; // Dừng chương trình nếu a = 0
        }
        // Tính delta
        delta = Math.pow(b, 2) - 4*a*c;

        if(delta<0) {
            System.out.println("Phương trình vô nghiệm");
        }else if(delta==0) {
            x1 = -b/(2*a);
            System.out.println("Phương trình có nghiệm kép x1=x2="+x1);
        }else {
            x1 = (-b - Math.sqrt(delta))/(2*a);
            x2 = (-b + Math.sqrt(delta))/(2*a);
            System.out.println("Phương trình có hai nghiệm phân biệt ");
            System.out.println("x1="+ x1);
            System.out.println("x2="+ x2);
        }

     }
}

