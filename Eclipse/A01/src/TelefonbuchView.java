import java.awt.*;

import javax.swing.*;


public class TelefonbuchView extends JFrame{
	private Telefonbuch t;
	private TelefonbuchsteuerungGUI c;
	private JTextField vorname,nachname,tnummer,Bsearch;
	private JLabel anzeige,anzeige2,anzeige3,abtrennung;
	private JTextArea zentrum;
	private JButton nc, search,sv,beenden;
	private JPanel p,p2,p3,p4,pv;
 
	
	public TelefonbuchView(Telefonbuch t, TelefonbuchsteuerungGUI c)
	{
		this.t = t;
		this.c = c;
		p = new JPanel();
		p2 = new JPanel();
		p3 = new JPanel();
		p4 = new JPanel();
		pv = new JPanel();
		
		p.setLayout(new GridLayout(3,2));
		p2.setLayout(new GridLayout(4,1));
		p3.setLayout(new BorderLayout());
		p4.setLayout(new GridLayout(1,1));
		pv.setLayout(new GridLayout(2,1));
		
		vorname = new JTextField("");
		anzeige = new JLabel("Vorname eingeben:");
		anzeige.setForeground(Color.BLUE);
		p.add(anzeige);
		p.add(vorname);
		
		nachname = new JTextField("");
		anzeige2 = new JLabel("Nachname eingeben:");
		anzeige2.setForeground(Color.BLUE);
		p.add(anzeige2);
		p.add(nachname);
		
		anzeige3 = new JLabel("Telefonnummer eingeben:");
		anzeige3.setForeground(Color.BLUE);
		tnummer = new JTextField("");
		p.add(anzeige3);
		p.add(tnummer);
		
		nc = new JButton("Eintragen");
		nc.setBackground(Color.BLACK);
		nc.setForeground(Color.WHITE);
		p2.add(nc);
		
		Bsearch = new JTextField();
		p2.add(Bsearch);
		search = new JButton("Suchen");
		search.setBackground(Color.BLACK);
		search.setForeground(Color.WHITE);
		
		p2.add(search);
		sv = new JButton("Sortieren nach Vornamen");
		sv.setBackground(Color.BLACK);
		sv.setForeground(Color.WHITE);
		p2.add(sv);
		
		beenden = new JButton("Beenden");
		beenden.setBackground(Color.BLACK);
		beenden.setForeground(Color.WHITE);
		p4.add(beenden);
		
        zentrum = new JTextArea();
        // Positioniere GUI-Elemente
        p3.setLayout(new BorderLayout());
		p3.add(zentrum);
		
		pv.add(p);
		pv.add(p2);
		
		this.setLayout(new GridLayout(3,1));
		this.add(pv);
		this.add(p3);
		this.add(p4);
		
		nc.addActionListener(c);
		search.addActionListener(c);
		sv.addActionListener(c);
		beenden.addActionListener(c);
		
	}
	
	public JButton getNEW()
	{
		return nc;
	}

	public JButton getSEARCH()
	{
		return search;
	}

	public JButton getSORT()
	{
		return sv;
	}
	
	public String getVname()
	{
		return vorname.getText();
	}

	public String getNname()
	{
		return nachname.getText();
	}

	public String getNUM()
	{
		return tnummer.getText();
	}
	
	public String searchText()
	{
		return Bsearch.getText();
	}
	
	public void refresh(Telefonbuch t)
	{
		this.t = t;
		zentrum.setText(t.toString());
		
	}
	public JButton getExit()
	{
		return beenden;
	}

}
