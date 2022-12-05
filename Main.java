import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends Inheritance{
    public static void main(String[] args) {

        JFrame frame = new JFrame("Estilles_OOP");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panelTitle = new JPanel(new FlowLayout());
        JPanel panelOne = new JPanel(new GridLayout(2,2,1,1));
        JPanel panelTwo = new JPanel(new FlowLayout());
        JButton button = new JButton("Calculate");


        panelTitle.setBounds(40,10,300,40);
        panelOne.setBounds(40,60,300,80);
        panelTwo.setBounds(40,200,300,40);

        panelTitle.setBackground(Color.pink);
        panelOne.setBackground(Color.pink);
        panelTwo.setBackground(Color.pink);

        JLabel labelOne, labelTwo, labelTitle;

        JTextField tFieldOne, tFieldTwo;
        tFieldOne = new JTextField(15);
        tFieldOne.setPreferredSize(new Dimension(90,20));
        tFieldTwo = new JTextField(15);
        tFieldTwo.setPreferredSize(new Dimension(90,20));

        labelTitle = new JLabel("Subtraction", JLabel.CENTER);
        labelOne = new JLabel("First Number");
        labelTwo = new JLabel("Second Number");


        labelTitle.setBounds(10,10,70,20);
        labelOne.setBounds(10,10,70,20);
        tFieldOne.setBounds(5, 5, 90, 100);
        labelTwo.setBounds(10,10,70,20);
        tFieldTwo.setBounds(5, 5, 90, 100);

        panelTitle.add(labelTitle);

        panelOne.add(labelOne);
        panelOne.add(tFieldOne);
        panelOne.add(labelTwo);
        panelOne.add(tFieldTwo);

        button.setBounds(50,10,90,20);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int result = computeValue(tFieldOne.getText(),tFieldTwo.getText());
                displayMessage(String.valueOf(result));
            }
        });

        panelTwo.add(button);

        frame.add(panelTitle);
        frame.add(panelOne);
        frame.add(panelTwo);

        frame.setSize(400,300);
        frame.setResizable(false);
        frame.setLayout(null);

        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}