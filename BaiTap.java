package vonguyenngocquy;

import java.util.Scanner;

public class BaiTap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a,b,c;

        //Nhập giá trị 3 cạnh tam giác
        System.out.print("Nhập cạnh a = ");
        a = sc.nextDouble();
        System.out.print("Nhập cạnh b = ");
        b = sc.nextDouble();
        System.out.print("Nhập cạnh c = ");
        c = sc.nextDouble();

        //Kiểm tra điều kiện của tam giác
        if (a + b > c && a + c > b && b + c > a) {
            System.out.println("Đây là 3 cạnh của tam giác");
        } else {
            System.out.println("Đây không phải 3 cạnh tam giác");
        }

        //Kiểm tra loại tam giác
        if (a == b && b == c) {
            System.out.println("Đây là tam giác đều");
        } else if (a == b || a == c || b == c) {
            System.out.println("Đây là tam giác cân");
        } else if (isRightTriangle(a, b, c)) {
            System.out.println("Đây là tam giác vuông");
        } else {
            System.out.println("Đây là tam giác thường");
        } 
    
        }
        //Cách tính tam giác vuông
        private static boolean isRightTriangle(double a, double b, double c) {
            double max = Math.max(a, Math.max(b, c));
            double sumOfSquares = (a * a) + (b * b) + (c * c) - (max * max);
            return (max * max) == sumOfSquares;

        }
    }        

    
    

