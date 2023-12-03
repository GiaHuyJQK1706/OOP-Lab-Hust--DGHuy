//Do Gia Huy
//20215060
//6.2
package hust.soict.hedspi.lab01.Ex_Homework;
import java.util.Scanner;
public class InputFrokKeyboard {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);

        System.out.println("What is your name? ");
        String name = keyboard.nextLine(); //Nhập tên có dấu cách
        System.out.println("How old are you? ");
        int age = keyboard.nextInt();
        keyboard.nextLine(); //Chống trôi lệnh khi nhập tuổi
        System.out.println("How tall are you(m)? ");
        double height = keyboard.nextDouble();

        //Xuat thong tin
        System.out.println("\n\n____________________________");
        System.out.println("Mr/Mrs " + name + "\nAge: "+ age +"\nYour height is: " +height+ " m");
    }
}
