import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class RegExprView extends JFrame{
	private RegExprController c;
	private RegExprModel m;
	private JButton b;
	private JTextField txt1;
	private JTextField txt2;
	private JLabel l;
	public RegExprView(RegExprController c, RegExprModel m){
		this.c=c;
		this.m=m;
		b=new JButton ("Start!");
		txt1=new JTextField("Matcher Inhalt",100);
		txt2=new JTextField("Pattern Inhalt",100);
		l=new JLabel(m.getTranslate()+"");
		Container con = this.getContentPane();
		con.setLayout(new GridLayout(2,2));
		con.add(txt1);
		con.add(txt2);
		con.add(l);
		con.add(b);
		this.b.addActionListener(this.c);
		this.setVisible(true);
		this.setTitle("Regular Expressions");
		this.setSize(400, 400);
		this.setResizable(false);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public boolean isButtonGo(ActionEvent e) {
		if(e.getSource() == this.b) return true;
			return false;
	}
	public void refresh(){
		l.setText(m.getTranslate());
	}
}