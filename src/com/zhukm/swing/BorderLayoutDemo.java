package com.zhukm.swing;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * 
 * @author King
 *
 *   Ҫ�ȶ���һ������������Ȼ�����������������һ��������壬 
 *   ����������������Ĳ��֣��������ֹ������Ż����������ϵ�������в���
 *   
 *   JFrame.pack():
 *   ���ã�����JFrame�Ŀ��ӿؼ���������ײ�ؼ���ʼ�����ݿؼ���getPreperredSize()���ô�С��
 * ֱ�����JFrame�����С������
 */
public class BorderLayoutDemo {
	public static void main(String[] args) {
		//BorderLayFrame2 frame1 = new BorderLayFrame2();
		//FlowLayFrame1 flowFrame1 = new FlowLayFrame1();
		ComplexFrame complexFrame1 = new ComplexFrame();
	}
}

class BorderLayFrame1 extends JFrame {
	final int WIDTH = 400;
	final int HEIGHT = 300;

	public BorderLayFrame1() {
		// ����һ����������
		JFrame frame = new JFrame("BorderLayout");
		frame.setSize(WIDTH, HEIGHT);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);

		// �����������
		JPanel contentPane = new JPanel();
		// �����������ӵ�����������
		frame.setContentPane(contentPane);

		// Ϊ�����������һ�����ֹ�����
		BorderLayout lay = new BorderLayout();
		frame.setLayout(lay);

		JButton btn1 = new JButton("North");
		JButton btn2 = new JButton("East");
		JButton btn3 = new JButton("West");
		JButton btn4 = new JButton("Center");
		JButton btn5 = new JButton("South");

		// �������������ʱ��ָ������Ĳ���
		contentPane.add(btn1, "North");
		contentPane.add(btn2, "East");
		contentPane.add(btn3, "West");
		contentPane.add(btn4, "Center");
		contentPane.add(btn5, "South");
	}
}

class BorderLayFrame2 extends JFrame {
	final int WIDTH = 900;
	final int HEIGHT = 700;

	public BorderLayFrame2() {
		JFrame frame = new JFrame("BorderLayout2");
		frame.setSize(WIDTH, HEIGHT);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);

		JPanel contentPane = new JPanel();
		

		BorderLayout lay = new BorderLayout();
		contentPane.setLayout(lay);

		frame.setContentPane(contentPane);
		JPanel eastPane = new JPanel();
		JPanel westPane = new JPanel();
		JPanel northPane = new JPanel();
		JPanel southPane = new JPanel();
		JPanel centerPane = new JPanel();
		
		frame.add(eastPane, "East");
		frame.add(westPane, "West");
		frame.add(northPane, "North");
		frame.add(southPane, "South");
		frame.add(centerPane, "Center");
		
		eastPane.setLayout(new BorderLayout());
		westPane.setLayout(new BorderLayout());
		northPane.setLayout(new BorderLayout());
		southPane.setLayout(new BorderLayout());
		centerPane.setLayout(new BorderLayout());
		
		JButton nbtn = new JButton("Ӣ��");
		JButton ebtn = new JButton("ŷԪ");
		JButton sbtn = new JButton("�۱�");
		JButton wbtn = new JButton("�����");
		JButton cbtn = new JButton("��Ԫ");
		
		northPane.add(nbtn,"North");
		northPane.add(ebtn,"East");
		northPane.add(sbtn,"South");
		northPane.add(wbtn,"West");
		northPane.add(cbtn,"Center");
		
		JButton nbtn2 = new JButton("Ӣ��");
		JButton ebtn2 = new JButton("ŷԪ");
		JButton sbtn2 = new JButton("�۱�");
		JButton wbtn2 = new JButton("�����");
		JButton cbtn2 = new JButton("��Ԫ");
		
		eastPane.add(nbtn2,"North");
		eastPane.add(ebtn2,"East");
		eastPane.add(sbtn2,"South");
		eastPane.add(wbtn2,"West");
		eastPane.add(cbtn2,"Center");
		
		JButton nbtn3 = new JButton("Ӣ��");
		JButton ebtn3 = new JButton("ŷԪ");
		JButton sbtn3 = new JButton("�۱�");
		JButton wbtn3 = new JButton("�����");
		JButton cbtn3 = new JButton("��Ԫ");
		
		southPane.add(nbtn3,"North");
		southPane.add(ebtn3,"East");
		southPane.add(sbtn3,"South");
		southPane.add(wbtn3,"West");
		southPane.add(cbtn3,"Center");
		
		JButton nbtn4 = new JButton("Ӣ��");    
		JButton ebtn4 = new JButton("ŷԪ");    
		JButton sbtn4 = new JButton("�۱�");    
		JButton wbtn4 = new JButton("�����");   
		JButton cbtn4 = new JButton("��Ԫ");    
		                                      
		westPane.add(nbtn4,"North");         
		westPane.add(ebtn4,"East");          
		westPane.add(sbtn4,"South");         
		westPane.add(wbtn4,"West");          
		westPane.add(cbtn4,"Center");        
		
		JButton nbtn5 = new JButton("Ӣ��");    
		JButton ebtn5 = new JButton("ŷԪ");    
		JButton sbtn5 = new JButton("�۱�");    
		JButton wbtn5 = new JButton("�����");   
		JButton cbtn5 = new JButton("��Ԫ");    
		                                      
		centerPane.add(nbtn5,"North");         
		centerPane.add(ebtn5,"East");          
		centerPane.add(sbtn5,"South");         
		centerPane.add(wbtn5,"West");          
		centerPane.add(cbtn5,"Center");        
	}
}

class FlowLayFrame1 extends JFrame{
	final int WIDTH = 900;
	final int HEIGHT = 700;

	public FlowLayFrame1() {
		JFrame frame = new JFrame("BorderLayout2");
		frame.setSize(WIDTH, HEIGHT);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		JPanel flowPane = new JPanel();
		flowPane.setLayout(new FlowLayout());
		
		frame.setContentPane(flowPane);
		
		JPanel p1 = new JPanel();
		JPanel p2 = new JPanel();
		JPanel p3 = new JPanel();
		JPanel p4 = new JPanel();
		
		flowPane.add(p1);
		flowPane.add(p2);
		flowPane.add(p3);
		flowPane.add(p4);
		
		p1.setLayout(new BorderLayout());
		p2.setLayout(new BorderLayout());
		p3.setLayout(new BorderLayout());
		p4.setLayout(new BorderLayout());
		
		JButton btn11 = new JButton("North");
		JButton btn12 = new JButton("East");
		JButton btn13 = new JButton("South");
		JButton btn14 = new JButton("West");
		JButton btn15 = new JButton("Center");
		
		p1.add(btn11,"North"); 
		p1.add(btn12,"East");  
		p1.add(btn13,"South"); 
		p1.add(btn14,"West");  
		p1.add(btn15,"Center");
		
		JButton btn21 = new JButton("North");
		JButton btn22 = new JButton("East");
		JButton btn23 = new JButton("South");
		JButton btn24 = new JButton("West");
		JButton btn25 = new JButton("Center");
		
		p2.add(btn21,"North"); 
		p2.add(btn22,"East");  
		p2.add(btn23,"South"); 
		p2.add(btn24,"West");  
		p2.add(btn25,"Center");
		
		JButton btn31 = new JButton("North");
		JButton btn32 = new JButton("East");
		JButton btn33 = new JButton("South");
		JButton btn34 = new JButton("West");
		JButton btn35 = new JButton("Center");
		
		p3.add(btn31,"North"); 
		p3.add(btn32,"East");  
		p3.add(btn33,"South"); 
		p3.add(btn34,"West");  
		p3.add(btn35,"Center");
		
		JButton btn41 = new JButton("North");
		JButton btn42 = new JButton("East");
		JButton btn43 = new JButton("South");
		JButton btn44 = new JButton("West");
		JButton btn45 = new JButton("Center");
		
		p4.add(btn41,"North"); 
		p4.add(btn42,"East");  
		p4.add(btn43,"South"); 
		p4.add(btn44,"West");  
		p4.add(btn45,"Center");
	}
}

class ComplexFrame extends JFrame{
	final int WIDTH = 900;
	final int HEIGHT = 700;

	public ComplexFrame() {
		JFrame frame = new JFrame("BorderLayout2");
		//frame.setSize(WIDTH, HEIGHT);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		JPanel complexPane = new JPanel();
		complexPane.setLayout(new GridLayout(5,1));
		
		frame.setContentPane(complexPane);
		
		JPanel p1 = new JPanel();
		JPanel p2 = new JPanel();
		JPanel p3 = new JPanel();
		JPanel p4 = new JPanel();
		JPanel p5 = new JPanel();
		
		complexPane.add(p1);
		complexPane.add(p2);
		complexPane.add(p3);
		complexPane.add(p4);
		complexPane.add(p5);
		
		p1.setLayout(new BorderLayout());
		p2.setLayout(new BorderLayout());
		p3.setLayout(new FlowLayout());
		p4.setLayout(new BorderLayout());
		p5.setLayout(new BorderLayout());
		
		JButton btn11 = new JButton("North");
		JButton btn12 = new JButton("East");
		JButton btn13 = new JButton("South");
		JButton btn14 = new JButton("West");
		JButton btn15 = new JButton("Center");
		
		JButton btn21 = new JButton("North");
		JButton btn22 = new JButton("East");
		JButton btn23 = new JButton("South");
		JButton btn24 = new JButton("West");
		JButton btn25 = new JButton("Center");
		
		JButton btn31 = new JButton("North");
		JButton btn32 = new JButton("East");
		JButton btn33 = new JButton("South");
		JButton btn34 = new JButton("West");
		JButton btn35 = new JButton("Center");
		
		JButton btn41 = new JButton("North");
		JButton btn42 = new JButton("East");
		JButton btn43 = new JButton("South");
		JButton btn44 = new JButton("West");
		JButton btn45 = new JButton("Center");
		
		JButton btn51 = new JButton("North");
		JButton btn52 = new JButton("East");
		JButton btn53 = new JButton("South");
		JButton btn54 = new JButton("West");
		JButton btn55 = new JButton("Center");
		
		p1.add(btn11,"North"); 
		p1.add(btn12,"East");  
		p1.add(btn13,"South"); 
		p1.add(btn14,"West");  
		p1.add(btn15,"Center");
		
		p2.add(btn21,"North"); 
		p2.add(btn22,"East");  
		p2.add(btn23,"South"); 
		p2.add(btn24,"West");  
		p2.add(btn25,"Center");
		
		p3.add(btn31);
		p3.add(btn32);
		p3.add(btn33);
		p3.add(btn34);
		p3.add(btn35);
		
		p4.add(btn41,"North"); 
		p4.add(btn42,"East");  
		p4.add(btn43,"South"); 
		p4.add(btn44,"West");  
		p4.add(btn45,"Center");
		
		p5.add(btn51,"North"); 
		p5.add(btn52,"East");  
		p5.add(btn53,"South"); 
		p5.add(btn54,"West");  
		p5.add(btn55,"Center");
		
		frame.pack();
	}
} 
