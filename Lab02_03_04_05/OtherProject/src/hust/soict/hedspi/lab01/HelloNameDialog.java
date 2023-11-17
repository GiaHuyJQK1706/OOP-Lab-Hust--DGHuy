//Do Gia Huy
//20215060
//2.2.3
package hust.soict.hedspi.lab01;
import javax.swing.JOptionPane;
public class HelloNameDialog {
    public static void main(String[] args){
        String result;
        result = JOptionPane.showInputDialog("Please enter your name");
        JOptionPane.showMessageDialog(null, "Hi, " + result + "!");
        System.exit(0);
    }
}
