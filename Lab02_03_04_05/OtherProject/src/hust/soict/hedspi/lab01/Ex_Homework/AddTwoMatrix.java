//Do Gia Huy
//20215060
//6.6
package hust.soict.hedspi.lab01.Ex_Homework;
import java.util.Scanner;
public class AddTwoMatrix {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhâp số hàng của ma trận: ");
        int row = sc.nextInt();
        System.out.print("Nhập số cột của ma trận: ");
        int col = sc.nextInt();

        //Khai báo ma trận số thực
        double[][] matA = new double[row][col]; //Ma trận A
        double[][] matB = new double[row][col]; //Ma trận B
        double[][] matAns = new double[row][col]; //Ma trận kết quả

        //Nhập các phần tử trong các ma trận
        System.out.println("\nHãy nhập các phần tử trong ma trận A: ");
        for (int i=0;i<row;i++){
            for (int j=0;j<col;j++){
                matA[i][j] = sc.nextDouble();
            }
        }
        System.out.println("\nHãy nhập các phần tử trong ma trận B: ");
        for (int i=0;i<row;i++){
            for (int j=0;j<col;j++){
                matB[i][j] = sc.nextDouble();
            }
        }

        //Tính matA + matB
        for (int i=0;i<row;i++){
            for (int j=0;j<col;j++){
                matAns[i][j] = matA[i][j] + matB[i][j];
            }
        }

        //In kết quả
        System.out.println("\n________________________________");
        System.out.println("Kết quả matA + amtB là: ");
        for (int i=0;i<row;i++){
            for (int j=0;j<col;j++){
                System.out.print(matAns[i][j]+" ");
            }
            System.out.println();   //Xuống dòng
        }
    }
}
