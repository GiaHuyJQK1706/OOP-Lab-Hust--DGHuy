//Do Gia Huy
//20215060
//2,2,6 - Part 2
package hust.soict.hedspi.lab01;
import java.util.Scanner;
//java.lang không cần import, đối tượng Math có sẵn trong java.lang.*
public class SeconDegreeEquation {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // Nhập các hệ số từ người dùng
        System.out.print("Nhập hệ số a: ");
        double a = sc.nextDouble();
        System.out.print("Nhập hệ số b: ");
        double b = sc.nextDouble();
        System.out.print("Nhập hệ số c: ");
        double c = sc.nextDouble();
        // Tính Delta
        double delta = b * b - 4 * a * c;

        if (delta > 0) {
            // Hai nghiệm thực
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("Nghiệm của phương trình là:");
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        } else if (delta == 0) {
            // Một nghiệm kép
            double x = -b / (2 * a);
            System.out.println("Phương trình có nghiệm kép:");
            System.out.println("x = " + x);
        } else {
            // Nghiệm phức
            double re = -b / (2 * a);
            double im = Math.sqrt(-delta) / (2 * a);
            System.out.println("Phương trình có nghiệm phức:");
            System.out.println("x1 = " + re + " + " + im + "i");
            System.out.println("x2 = " + re + " - " + im + "i");
        }
    }
}
