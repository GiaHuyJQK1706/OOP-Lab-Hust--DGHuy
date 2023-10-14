//Do Gia Huy
//20215060
//6.1
package Ex_Homework; //Khai báo gói bài tập về nhà
import javax.swing.JOptionPane;
public class ChooseOption {
    public static void main(String[] args){
        int option = JOptionPane.showConfirmDialog(null, "Do you want to change to the first class ticket?");
        JOptionPane.showMessageDialog(null, "Your've choosen: " + (option==JOptionPane.YES_OPTION?"Yes":"No"));
        System.exit(0);
    }
}
