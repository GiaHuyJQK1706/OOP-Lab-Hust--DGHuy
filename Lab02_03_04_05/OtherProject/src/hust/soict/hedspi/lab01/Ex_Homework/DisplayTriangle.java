//Do Gia Huy
//20215060
//6.3
package hust.soict.hedspi.lab01.Ex_Homework;
import java.util.Scanner;
public class DisplayTriangle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Input n: ");
        int n = sc.nextInt();

        for (int i=n;i>=1;i--){
            for (int j=0;j<=i-1;j++){   //Vòng lặp in số khoảng trắng
                System.out.print(" ");
            }
            for (int k=1 ; k<= 2*(n-i) + 1 ; k++){  //Vòng lặp in sao
                System.out.print("*");
            }
            System.out.print("\n"); //Xuống dòng
        }
    }
}
