//Do Gia Huy
//20215060
//2.2.6 - Part 2
import java.util.Scanner;
public class SystemLinearEquation {
    public static void main(String[] args){
        // Nhập hệ số
        //a1*x + b1*y = c1
        //a2*x + b2*y = c2
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a1: ");
        double a1 = sc.nextDouble();
        System.out.print("Input b1: ");
        double b1 = sc.nextDouble();
        System.out.print("Input c1: ");
        double c1 = sc.nextDouble();
        System.out.print("Input a2: ");
        double a2 = sc.nextDouble();
        System.out.print("Input b2: ");
        double b2 = sc.nextDouble();
        System.out.print("Input c2: ");
        double c2 = sc.nextDouble();

        // Tính định thức hệ số
        double det = a1 * b2 - a2 * b1;

        // Kiểm tra xem hệ phương trình có nghiệm hay không
        if (det == 0) {
            if (c1/c2 == a1/a2) {
                System.out.println("Hệ phương trình có vô số nghiệm.");
            } else {
                System.out.println("Hệ phương trình vô nghiệm.");
            }
        } else {
            // Tính nghiệm x và y
            double x = (c1 * b2 - c2 * b1) / det;
            double y = (a1 * c2 - a2 * c1) / det;

            System.out.println("Nghiệm của hệ phương trình là:");
            System.out.println("x = " + x);
            System.out.println("y = " + y);
        }
    }
}
