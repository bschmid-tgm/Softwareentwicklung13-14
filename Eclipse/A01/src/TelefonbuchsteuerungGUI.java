import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;


public class TelefonbuchsteuerungGUI implements ActionListener{

	private Telefonbuch t;
	private TelefonbuchView v;	
	private Frame g;

	{
		this.t = new Telefonbuch();
		this.v = new TelefonbuchView(this.t, this);
		this.g = new TelefonbuchFrame(v);
		
	}
	
	public void actionPerformed(ActionEvent e)
	{
		
		if(e.getSource() == v.getNEW())
		{
			Telefonbucheintrag tb = new Telefonbucheintrag(v.getVname(), v.getNname(), v.getNUM());
			t.add(tb);
		}
		else if(e.getSource() == v.getSEARCH())
		{
			t.contains(v.searchText());
		}
		else if(e.getSource() == v.getSORT())
		{
			t.sort(0, true);
		}
		if(e.getSource() == v.getExit()){
			t.exit();
		}
		v.refresh(t);
		
	}
	
}
