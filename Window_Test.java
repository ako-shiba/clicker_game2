import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Window_Test implements ActionListener {

    // Game Counter

    int count = 0;

    // Globalize vars for scope purposes

    JPanel Main_Panel;
    JButton button1;
    JLabel label1;
    JFrame frame;

    public Window_Test () {
        
        // Init frame

        frame = new JFrame("My Window");

        // Init Labels

        label1 = new JLabel("CLICK TO PLAY!!");
        label1.setPreferredSize(new Dimension(10000,1000000));
        
        // Init Buttons

        button1 = new JButton("Play");
        button1.addActionListener(this);

        // Main Panel Handlng

        Main_Panel = new JPanel();

        Main_Panel.setBorder(BorderFactory.createEmptyBorder());
        Main_Panel.setLayout(new GridLayout(0,1));
        
        Main_Panel.add(label1);

        Main_Panel.add(button1);
        
        frame.add(Main_Panel, BorderLayout.CENTER);
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        // frame.pack();

    }
    public static void main(String[] args) {
      new Window_Test();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        count++;
        label1.setText("NUMBER OF CLICKS: " + count);
    }
}



