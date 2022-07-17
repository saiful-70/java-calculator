import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Calculator extends JFrame {

private Toolkit toolkit;

 public Calculator() {
 setSize(500, 300);
 
 toolkit = getToolkit();
 
 Dimension size = toolkit.getScreenSize();
 
 setLocation((size.width - getWidth())/2, (size.height -getHeight())/2);
 
 setDefaultCloseOperation(EXIT_ON_CLOSE);
 
 JPanel panel = new JPanel();
 getContentPane().add(panel);
 panel.setLayout(null);
 
 JLabel lbl1 = new JLabel("First Number");
 lbl1.setBounds(30,20,100,30);
 JLabel lbl2 = new JLabel("Second Number");
 lbl2.setBounds(30,55,130,30);
 JLabel lbl3 = new JLabel("Result");
 lbl3.setBounds(30,90,80,30);
 JLabel lbl4 = new JLabel();
 lbl4.setBounds(145,90,50,30);
 
 JTextField txt1 = new JTextField();
 txt1.setBounds(145,20,50,30);
 
 txt1.setText("0");
 JTextField txt2 = new JTextField();
 
 txt2.setBounds(145,55,50,30);
 txt2.setText("0");

 JButton sum = new JButton("sum");
 sum.setBounds(30, 125, 110, 30);
 JButton sub = new JButton("sub");
 sub.setBounds(200, 125, 110, 30);
 
 sum.addActionListener(new ActionListener() {
 public void actionPerformed(ActionEvent event) {
 int a1 = Integer.parseInt(txt1.getText());
 int a2 = Integer.parseInt(txt2.getText());
 int a3 = a1 + a2;
 lbl4.setText(String.valueOf(a3));  
}});
 
 sub.addActionListener(new ActionListener() {
	 public void actionPerformed(ActionEvent event) {
	 int a1 = Integer.parseInt(txt1.getText());
	 int a2 = Integer.parseInt(txt2.getText());
	 int a3 = a1 - a2;
	 lbl4.setText(String.valueOf(a3));  
	}});

panel.add(lbl1);
panel.add(lbl2);
panel.add(lbl3);
panel.add(txt1);
panel.add(txt2);
panel.add(lbl4);
panel.add(sum);
panel.add(sub);
}

public static void main(String[] args) {
Calculator buttons = new Calculator();
buttons.setVisible(true);
}
}