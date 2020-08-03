// Fig. 12.7
// Testing LabelFrame
package Lectures;
import javax.swing.JFrame;

public class LabelTest {
    public static void main(String[] args) {
        LabelFrame labelFrame = new LabelFrame();
        labelFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        labelFrame.setSize(260, 180);
        labelFrame.setVisible(true);
    }
}