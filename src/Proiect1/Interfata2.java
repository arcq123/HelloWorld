package Proiect1;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

class Gui2 extends JFrame{
	

	private static final long serialVersionUID = 1L;
	
	Gui2(){
		setTitle("Interfata nr. 2 :)");
		setBounds(800,300,900,400);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setBackground((new Color(100,200,225)));
		
		JTextField n = new JTextField(" Text Topic: "); 
		n.setEditable(true);
		n.setBounds(20,20,200,200);
		getContentPane().add(n);
		n.setVisible(true); //aici trebuie true
		
//		JTextField p = new JTextField(" Password: "); 
//		p.setEditable(true);
//		p.setBounds(150,30,70,20);
//		getContentPane().add(p);
//		p.setVisible(true); //si aici
		
		JButton b = new JButton("Log out"); 
		b.setBounds(250, 30, 80, 20);
		getContentPane().add(b);
		b.setVisible(true);
		
		JButton b2 = new JButton("Topic nou. "); 
		b2.setBounds(250, 70, 110, 20);
		getContentPane().add(b2);
		b2.setVisible(true);
		
		JButton b3 = new JButton("Topic abonat. "); 
		b3.setBounds(250, 110, 130, 20);
		getContentPane().add(b3);
		b3.setVisible(true);
		
		JButton b4 = new JButton("Write. "); 
		b4.setBounds(370, 70, 100, 20);
		getContentPane().add(b4);
		b4.setVisible(true);
		
		JButton b5 = new JButton("Read. "); 
		b5.setBounds(480, 70, 100, 20);
		getContentPane().add(b5);
		b5.setVisible(true);
		
		JButton b6 = new JButton("Subscribe. "); 
		b6.setBounds(590, 70, 100, 20);
		getContentPane().add(b6);
		b6.setVisible(true);
		
		
		JButton b8 = new JButton("Unsubscribe. "); 
		b8.setBounds(390, 110, 130, 20);
		getContentPane().add(b8);
		b8.setVisible(true);
		
		JButton b7 = new JButton("Unsubscribe. "); 
		b7.setBounds(390, 110, 100, 20);
		getContentPane().add(b7);
		b7.setVisible(false);
		
	//	n.setVisible();
		setVisible(true);
	}
	
	

}
	public class Interfata2 {
		
	
	public static void main(String[] args) {
		new Gui2();

	}

}
