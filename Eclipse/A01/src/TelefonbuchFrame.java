
import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
public class TelefonbuchFrame extends JFrame{
	private TelefonbuchView v;
	public TelefonbuchFrame (TelefonbuchView v){
		this.v=v;
		Container a1 = this.getContentPane();
		setTitle("Telefonbuch"); 	
		this.setSize(new Dimension(600,800));    	
	    setLocation(100,100); 	
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		a1.add(this.v);
	}

}
