package LogIn;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JLabel;
public class Gui {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JFrame f=new JFrame();
		JLabel (11,12);
		JTextField t;
		JPasswordField p;
		JButton b;
		javax.swing.JLabel l1 = new JLabel("Kullanici Adi");
		l1.setBounds(100,50,200,50); //sağ,sol,yatay,dikey
		
		t=new JTextField();
		t.setBounds(100,100,200,50);
		javax.swing.JLabel l2 = new JLabel("Şifre");
		l2.setBounds(100,150,200,50);
		p=new JPasswordField();
		p.setBounds(100,200,200,50);
		b=new JButton("Giriş");
		b.setBounds(100,250,200,50);
		b.addActionListener(new ActionListener( ) {
			
			

		
		String adi="Ali";
		String sifre="12345";
		
			public void actionPerformed(ActionEvent e) {
				String pass=new String (p.getPassword());
				
				if(adi.equals(t.getText())&& sifre.equals (pass)){
					System.out.println("Giris Yapildi");
					
				}
				else
					System.out.println("Hatali adi && şifre");
				
				
			}
			
			
		} );
	
		f.add(t);
		f.add(l2);
		f.add(p);
		f.add(b);
		f.add(l1);
		f.setLayout(null);
		f.setSize(400,400);
		f.setVisible(true);
		
	}

	private static void JLabel(int i, int j) {
		// TODO Auto-generated method stub
		
	}

	

}
