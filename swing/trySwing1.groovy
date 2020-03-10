import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Dimension;

class HelloWorldSwing {
    createAndShowGUI() {
        JFrame.setDefaultLookAndFeelDecorated(true);

        f = new JFrame("HelloWorldSwing");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        label = new JLabel("Hello world");
        f.contentPane.add(label);

        d = new Dimension(height:400, width:500);
        f.size = d

        f.pack();
        f.visible = true;
    }
}

hws = new HelloWorldSwing()
hws.createAndShowGUI()
