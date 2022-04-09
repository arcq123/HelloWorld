package Proiect1;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

class Gui1 extends JFrame{
	

	private static final long serialVersionUID = 1L;
	
	Gui1(){
		setTitle("Miro e colegul meu :)");
		setBounds(800,300,400,300);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setBackground((new Color(100,200,225)));
		
		JTextField n = new JTextField(" Nickname: "); 
		n.setEditable(true);
		n.setBounds(60,30,70,20);
		getContentPane().add(n);
		n.setVisible(true); //aici trebuie true
		
		JTextField p = new JTextField(" Password: "); 
		p.setEditable(true);
		p.setBounds(150,30,70,20);
		getContentPane().add(p);
		p.setVisible(true); //si aici
		
		JButton b = new JButton("Log in"); 
		b.setBounds(250, 30, 80, 20);
		getContentPane().add(b);
		b.setVisible(true);
		
		JTextField txt = new JTextField(" Text: "); 
		txt.setEditable(true);
		txt.setBounds(60,30,250,20);
		getContentPane().add(txt);
		txt.setVisible(false);
		
		
	//	n.setVisible();
		setVisible(true);
	}
	
	

}
	public class Interfata1 {
		
	
	public static void main(String[] args) {
		new Gui1();

	}

}
