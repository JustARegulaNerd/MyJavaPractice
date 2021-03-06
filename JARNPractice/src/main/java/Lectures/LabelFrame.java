// Fig. 12.6
// JLabels with text and icons
// Experimented by JustARegularNerd @ 2020-08-03
package Lectures;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class LabelFrame extends JFrame {
    private final JLabel label1;
    private final JLabel label2;
    private final JLabel label3;
    
    // LabelFrame constructor adds JLabels to JFrame
    public LabelFrame() {
        super("Testing JLabel");
        setLayout(new FlowLayout());
        
        label1 = new JLabel("Label with text");
        label1.setToolTipText("This is label1");
        add(label1);
        
        Icon bug = new ImageIcon(getClass().getResource("bug1.png"));
        label2 = new JLabel("Label with text and icon", bug, SwingConstants.LEFT);
        add(label2);
        
        label3 = new JLabel();
        label3.setText("Label with icon and text at the bottom");
        label3.setIcon(bug);
        label3.setHorizontalTextPosition(SwingConstants.CENTER);
        label3.setVerticalTextPosition(SwingConstants.BOTTOM);
        label3.setToolTipText("This is label3");
        add(label3);
    }
}