package com.zhukm.swing;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class CardLayoutDemo {

	public static void main(String[] args) {
		CardLayFrame frame = new CardLayFrame();
	}

}


class CardLayFrame extends JFrame{
	final int WIDTH = 400;
	final int HEIGHT = 300;

	public CardLayFrame() {
		
		
		// 定义一个顶层容器
		JFrame frame = new JFrame("BorderLayout");
		frame.setSize(WIDTH, HEIGHT);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);

		final CardLayout card = new CardLayout(5,5);
		// 定义内容面板
		final JPanel contentPane = new JPanel(card);
		
		JPanel p11 = new JPanel();
		final JPanel p12 = new JPanel();
		JPanel p13 = new JPanel();
		JPanel p14 = new JPanel();
		final JPanel p15 = new JPanel();
		p11.add(new JLabel("---->1<---"));
		p12.add(new JLabel("---->2<---"));
		p13.add(new JLabel("---->3<---"));
		p14.add(new JLabel("---->4<---"));
		p15.add(new JLabel("---->5<---"));
		
		p11.setBackground(Color.BLUE);
		p12.setBackground(Color.CYAN);
		p13.setBackground(Color.GRAY);
		p14.setBackground(Color.GREEN);
		p15.setBackground(Color.YELLOW);
		
		contentPane.add(p11,"p11");
		contentPane.add(p12,"p12");
		contentPane.add(p13,"p13");
		contentPane.add(p14,"p14");
		contentPane.add(p15,"p15");
		
		JPanel p1 = new JPanel();
		JButton b1 = new JButton("上一步");
		JButton b2 = new JButton("1");
		JButton b3 = new JButton("2");
		JButton b4 = new JButton("3");
		JButton b5 = new JButton("下一步");
		
		b1.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				card.previous(contentPane);
			}
		});
		
		b2.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				card.show(contentPane, "p12");
			}
		});
		
		b3.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				card.show(contentPane, "p13");
			}
		});
		
		b4.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				card.show(contentPane, "p15");
			}
		});
		
		b5.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				card.next(contentPane);
			}
		});
		
		p1.add(b1);
		p1.add(b2);
		p1.add(b3);
		p1.add(b4);
		p1.add(b5);
		
		frame.getContentPane().add(contentPane);
		frame.getContentPane().add(p1,BorderLayout.SOUTH);
		
		
	}
}