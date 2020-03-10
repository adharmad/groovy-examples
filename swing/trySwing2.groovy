// does not work

import javax.swing.*;          
import java.awt.*;
import java.awt.event.*;

class SwingApp implements ActionListener {
    labelPrefix = "Number of button clicks: "
    numClicks = 0
    label = new JLabel(labelPrefix + "0   ")
    laf = null

    createComponents() {
        button = new JButton("I am a swing button!")
        button.mnemonic = KeyEvent.VK_I
        button.setActionListener(this)
        label.labelFor = button

        pane = new JPanel(new GridLayout(0, 1))
        pane.add(button)
        pane.add(label)
        pane.border = BorderFactory.createEmptyBorder(30, 30, 10, 30)

        return pane
    }

    void actionPerformed(ActionEvent e) {
        numClicks++;
        label.text = labelPrefix + numClicks;
    }

    initLookAndFeel() {
        lookAndFeel = ""
        if (laf != null) {
            if (laf == "Metal") {
                lookAndFeel = UIManager.getCrossPlatformLookAndFeelClassName()
            } else if (laf == "System") {
                lookAndFeel = UIManager.getSystemLookAndFeelClassName()
            } else if (laf == "Motif") {
                lookAndFeel = "com.sun.java.swing.plaf.motif.MotifLookAndFeel"
            } else if (laf == "GTK+") {
                lookAndFeel = "com.sun.java.swing.plaf.gtk.GTKLookAndFeel"
            } else {
                println ("Unexpected value of laf specified ${laf}")
                lookAndFeel = UIManager.getCrossPlatformLookAndFeelClassName()
            }
        }
        
        try {
            UIManager.lookAndFeel = lookAndFeel
        } catch (Exception e) {
            println e.message
        }
    }

    createAndShowGUI() {
        initLookAndFeel()
        JFrame.setDefaultLookAndFeelDecorated(true)
        f = new JFrame("Swing Application")
        f.defaultCloseOperation = JFrame.EXIT_ON_CLOSE

        contents = createComponents()
        f.contentPane.add(contents, BorderLayout.CENTER)
        
        f.pack()
        f.visible = true
    }
}

s = new SwingApp()
s.createAndShowGUI()
