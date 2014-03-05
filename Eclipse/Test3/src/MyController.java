import java.awt.event.*;
/*
 * author Raphael Simsek
 * version 2014-02-25
 * Controller des Programmes das 2 Buttons beinhalten soll, und durch druck dieser Buttons einer Zahl, 
 * mit Standard 1, addiert oder subtrahiert werden soll.
 */

public class MyController implements ActionListener {

	// Attribute
	private MyModel m;
	private MyView v;
	//Konstruktor der die Attribute mit den erzeugten Attributen ersetzt
	public MyController()	{
		this.m = new MyModel();
		this.v = new MyView(m, this);
	}	
	//action Performed um die Aktionen für die ActionListener zu kontrollieren
	public void actionPerformed(ActionEvent e) {
		//Wenn + gedrückt wird um zu addieren
		if(this.v.isButtonPlus(e)) {
			this.m.plus();
			this.v.refresh();
		}
		//Wenn - gedrückt wird um zu subtrahieren
		if(this.v.isButtonMinus(e))	{
			this.m.minus();
			this.v.refresh();
		}
	}
}

