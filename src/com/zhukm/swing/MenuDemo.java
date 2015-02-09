package com.zhukm.swing;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JToolBar;

public class MenuDemo {
	public static void main(String[] args){
		//MenuFrame frame = new MenuFrame();
		PopMenuFrame frame = new PopMenuFrame();
	}
}

class MenuFrame extends JFrame{
	final int WIDTH = 400;
	final int HEIGHT = 300;
	
	public MenuFrame(){
		final JFrame frame =new JFrame("FireBall - [专项统计]");
		frame.setSize(WIDTH, HEIGHT);
		frame.setVisible(true);
		
		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension screenSize = kit.getScreenSize();
		
		int width = (int) screenSize.getWidth();
		int height = (int) screenSize.getHeight();
		
		int x = (width-WIDTH)/2;
		int y = (height - HEIGHT)/2;
		
		frame.setLocation(x, y);
		
		JMenuBar menubar = new JMenuBar();
		frame.setJMenuBar(menubar);
		
		JMenu fMenu = new JMenu("文件(F)");
		JMenu tMenu = new JMenu("工具(T)");
		JMenu mMenu = new JMenu("资源中心(M)");
		JMenu vMenu = new JMenu("视图(V)");
		JMenu lMenu = new JMenu("流程菜单");
		JMenu hMenu = new JMenu("帮助(H)");
		
		fMenu.setMnemonic('F');
		tMenu.setMnemonic('T');
		mMenu.setMnemonic('M');
		vMenu.setMnemonic('V');
		hMenu.setMnemonic('H');
		
		menubar.add(fMenu);
		menubar.add(tMenu);
		menubar.add(mMenu);
		menubar.add(vMenu);
		menubar.add(lMenu);
		menubar.add(hMenu);
		
		JMenuItem newItem = new JMenuItem("New",'N');
		JMenuItem openItem = new JMenuItem("Open File...");
		JMenuItem saveItem = new JMenuItem("Save");
		JMenuItem closeItem = new JMenuItem("Close");
		JMenuItem closeAllItem = new JMenuItem("Close All");
		JMenuItem aboutItem = new JMenuItem("About");
		JMenuItem exitItem = new JMenuItem("Exit",'E');
		/*Icon icon = new Icon();*/
		fMenu.add(newItem);
		fMenu.add(openItem);
		fMenu.addSeparator();
		fMenu.add(saveItem);
		fMenu.addSeparator();
		fMenu.add(closeItem);
		fMenu.add(closeAllItem);
		
		hMenu.add(aboutItem);
		hMenu.addSeparator();
		hMenu.add(exitItem);
		
		exitItem.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				int i = JOptionPane.showConfirmDialog(null, 
						"是否真的要退出系统","退出确认对话框",
						JOptionPane.YES_NO_CANCEL_OPTION);
				if(i == 0){
					frame.dispose();
				}
			}
			
		});
	}   
}

class PopMenuFrame extends JFrame{
	public PopMenuFrame(){
		int WIDTH = 300;
		int HEIGHT = 200;
		JFrame frame = new JFrame("弹出式菜单");
		frame.setSize(WIDTH, HEIGHT);
		frame.setVisible(true);
		
		JPanel con = new JPanel(new BorderLayout());
		frame.setContentPane(con);
		
		JButton btn1 = new JButton("一一");
		JButton btn2 = new JButton("二二");
		
		JToolBar toolBar = new JToolBar();
		toolBar.add(btn1);
		toolBar.add(btn2);
		
		con.add(toolBar,"North");
		
		JPanel p = new JPanel();
		p.setSize(200, 150);
		con.add(p,"Center");
		
		final JPopupMenu menu = new JPopupMenu();
		
		JMenuItem copy = new JMenuItem("Copy");
		JMenuItem past = new JMenuItem("Past");
		
		menu.add(copy);
		menu.add(past);
		
		con.addMouseListener(new MouseAdapter(){

			@Override
			public void mouseReleased(MouseEvent event) {
				if(event.isPopupTrigger()){
					menu.show(event.getComponent(), event.getX(), event.getY());
				}
			}
			
		});
	}
}
