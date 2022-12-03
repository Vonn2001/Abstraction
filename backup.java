import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class backup {
    public static void main(String[] args) {

        JFrame frame = new JFrame("My UI Frame");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panelTitle = new JPanel(new FlowLayout());
        JPanel panelOne = new JPanel(new GridLayout(2,2,1,1));
        JPanel panelTwo = new JPanel(new FlowLayout());
        JButton button = new JButton("Submit");

        // Setting the panel sizes
        panelTitle.setBounds(10,10,380,40);
        panelOne.setBounds(10,60,380,80);
        panelTwo.setBounds(10,200,380,40);

        // Color for visualization only
        panelTitle.setBackground(Color.pink);
        panelOne.setBackground(Color.yellow);
        panelTwo.setBackground(Color.pink);

        JLabel labelOne, labelTwo, labelTitle;

        final JTextField tFieldOne, tFieldTwo;
        tFieldOne = new JTextField(20);
        tFieldOne.setPreferredSize(new Dimension(80,20));
        tFieldTwo = new JTextField(20);
        tFieldTwo.setPreferredSize(new Dimension(80,20));

        labelTitle = new JLabel("Please fill out the following:", JLabel.CENTER);
        labelOne = new JLabel("Enter your first name");
        labelTwo = new JLabel("Enter your last name");


        labelTitle.setBounds(10,10,90,20);
        labelOne.setBounds(10,10,90,20);
        tFieldOne.setBounds(5, 5, 100, 100);
        labelTwo.setBounds(10,10,90,20);
        tFieldTwo.setBounds(5, 5, 100, 100);

        panelTitle.add(labelTitle);

        panelOne.add(labelOne);
        panelOne.add(tFieldOne);
        panelOne.add(labelTwo);
        panelOne.add(tFieldTwo);

        button.setBounds(10,10,90,20);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //System.out.println("Button Clicked");
                //System.out.println(tFieldOne.getText());
                //System.out.println(tFieldTwo.getText());
                //System.out.println("Your name is " + tFieldOne.getText() + " " + tFieldTwo.getText());
                displayMessage("Your name is " + tFieldOne.getText() + " " + tFieldTwo.getText());
            }
        });

        panelTwo.add(button);

        frame.add(panelTitle);
        frame.add(panelOne);
        frame.add(panelTwo);

        // make the frame half the height and width
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int height = screenSize.height;
        int width = screenSize.width;
        // set size to half of screen
        //frame.setSize(width/2, height/2);

        frame.setSize(400,300);
        frame.setResizable(false);
        frame.setLayout(null);

        // center the jframe on screen
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public static void displayMessage(String message){
        JOptionPane.showMessageDialog( null, message, "Result" , JOptionPane.INFORMATION_MESSAGE );
    }
}


