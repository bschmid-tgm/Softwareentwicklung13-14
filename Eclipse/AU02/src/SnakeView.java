
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SnakeView extends JFrame{
	private SnakeModel m;
	private SnakeController c;
	private SnakePanel p;
	private JButton bRechts;
	private JButton bLinks;
	private JButton bRauf;
	private JButton bRunter;
	
	public SnakeView(SnakeModel m, SnakeController c){
		this.m = m;
		this.c = c;
		this.p = new SnakePanel(this.m);
		/*this.bRechts = new JButton("Rechts");
		this.bLinks = new JButton("Links");
		this.bRauf = new JButton("Rauf");
		this.bRunter = new JButton("Runter");*/
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		this.setResizable(false);
		this.setSize(new Dimension(600, 400));
		
		this.setLayout(new BorderLayout());
		/*this.add(bRauf, BorderLayout.NORTH);
		this.add(bRunter, BorderLayout.SOUTH);
		this.add(bRechts, BorderLayout.EAST);
		this.add(bLinks, BorderLayout.WEST);*/
		this.add(p, BorderLayout.CENTER);
		
		/*this.bRauf.addActionListener(this.c);
		this.bRunter.addActionListener(this.c);
		this.bRechts.addActionListener(this.c);
		this.bLinks.addActionListener(this.c);*/
		
		/*this.bRauf.addKeyListener(this.c);
		this.bRunter.addKeyListener(this.c);
		this.bRechts.addKeyListener(this.c);
		this.bLinks.addKeyListener(this.c);*/
		this.addKeyListener(this.c);
	}
	public boolean isButtonRechts(ActionEvent e){
		if(e.getSource() == this.bRechts){
			return true;
		}
		return false;
	}
	public boolean isButtonLinks(ActionEvent e){
		if(e.getSource() == this.bLinks){
			return true;
		}
		return false;
	}
	public boolean isButtonRauf(ActionEvent e){
		if(e.getSource() == this.bRauf){
			return true;
		}
		return false;
	}
	public boolean isButtonRunter(ActionEvent e){
		if(e.getSource() == this.bRunter){
			return true;
		}
		return false;
	}
	public void refresh(){
		if(m.verloren)
		{
			//JOP
			
			//System.exit(0);
		}
		this.repaint();
		
	}
}