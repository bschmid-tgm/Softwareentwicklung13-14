import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/*
 * author Raphael Simsek
 * version 2014-02-25
 * View des Programmes das 2 Buttons beinhalten soll, und durch druck dieser Buttons einer Zahl, 
 * mit Standard 1, addiert oder subtrahiert werden soll.
 */

public class MyView extends JFrame {

	// Attribute inkl. den nötigen Klassen als Objekt
	private JButton plus, minus;
	private JLabel counter;
	private MyModel m;
	private MyController c;
	//Konstruktor der die Attribute der Klasse aus den Attributen ersetzt
	public MyView(MyModel m, MyController c)	{
		this.m = m;
		this.c = c;
		//setzt das Layout, sowie die Buttons und das Label
		this.setLayout(new FlowLayout());
		this.plus = new JButton("Plus");
		this.minus = new JButton("Minus");
		this.counter = new JLabel("0");
		//added diese buttons und labels in das Layout
		this.add(counter);
		this.add(plus);
		this.add(minus);
		//Action Listener erstellen
		this.plus.addActionListener(this.c);
		this.minus.addActionListener(this.c);
		//this.refresh();
		//Visible setzen, Titel setzen, Groeße setzen, nicht veraenderbar, default close operation
		this.setVisible(true);
		this.setTitle("Counter");
		this.setSize(200, 100);
		this.setResizable(false);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	//Button plus dessen Rueckgabe dann in den Controller uebergeben wird
	public boolean isButtonPlus(ActionEvent e) {
		if(e.getSource() == this.plus) return true;
		return false;
	}
	//Button minus dessen Rueckgabe dann in den Controller uebergeben wird
	public boolean isButtonMinus(ActionEvent e)	{
		if(e.getSource() == this.minus) return true;
		return false;
	}
	//Refresht das Programm, um einen neuen Wert im Counter anzuzeigen.
	public void refresh() {
		this.counter.setText(this.m.getCounter());
	}
	
}
