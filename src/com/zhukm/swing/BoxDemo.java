package com.zhukm.swing;

import java.awt.BorderLayout;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BoxDemo {
	public static void main(String[] args){
		BoxFrame frame = new BoxFrame();
	}
}

class BoxFrame extends JFrame{
	final int WIDTH = 300;
	final int HEIGHT = 150;
	
	public BoxFrame(){
		JFrame frame = new JFrame("BoxDemo");
		frame.setSize(WIDTH, HEIGHT);
		frame.setVisible(true);
		
		JPanel contentPane = new JPanel();
		frame.setContentPane(contentPane);
		
		JLabel lb1 = new JLabel("用户名: ");
		JLabel lb2 = new JLabel("密码: ");
		JTextField txt1 = new JTextField(15);
		JTextField txt2 = new JTextField(15);
		
		txt1.setMaximumSize(txt1.getPreferredSize());
		txt2.setMaximumSize(txt2.getPreferredSize());
		Box box1 = Box.createHorizontalBox();
		box1.add(lb1);
		box1.add(Box.createHorizontalStrut(20));
		box1.add(txt1);
		Box box2 = Box.createHorizontalBox();
		box2.add(lb2);
		box2.add(Box.createHorizontalStrut(20));
		box2.add(txt2);
		
		
		Box box3 = Box.createHorizontalBox();
		JButton btn1 = new JButton("确认");
		JButton btn2 = new JButton("取消");
		box3.add(btn1);
		box3.add(btn2);
		
		Box box4 = Box.createVerticalBox();
		box4.add(box1);
		box4.add(box2);
		box4.add(Box.createVerticalGlue());
		box4.add(box3);
		
		contentPane.add(box4,BorderLayout.CENTER);
		frame.pack();
	}
}
