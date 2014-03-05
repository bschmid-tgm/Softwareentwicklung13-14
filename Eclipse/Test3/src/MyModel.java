/*
 * author Raphael Simsek
 * version 2014-02-25
 * Model des Programmes das 2 Buttons beinhalten soll, und durch druck dieser Buttons einer Zahl, 
 * mit Standard 1, addiert oder subtrahiert werden soll.
 */
public class MyModel {
	//Counter der die Zahl die angezeigt wird beinhaltet
	private int counter;
	//Konstruktor der den Counter am Anfang auf 0 setzt.
	public MyModel() {
		this.counter = 0;
	}
	//Um den Counter in anderen Klassen zu erkennen
	public String getCounter() {
		return Integer.toString(counter);
	}
	//Um den Counter in anderen Klassen zu addieren
	public void plus()	{
		this.counter++;
	}
	//Um den Counter in anderen Klassen zu subtrahieren
	public void minus() {
		this.counter--;
	}
}
