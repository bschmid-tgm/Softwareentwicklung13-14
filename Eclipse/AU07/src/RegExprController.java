import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.RandomAccessFile;
import java.util.HashMap;
import java.util.regex.*;
/*
 * Entweder mit GUI - Editor, oder aus File auslesen, und dann suchen & ersetzen.
 */

public class RegExprController implements ActionListener{
	private RegExprView v;
	private RegExprModel m;
	public RegExprController(){
		m = new RegExprModel(this.v);
		v = new RegExprView(this,this.m);
		m = new RegExprModel(this.v);
	}
	private void actionPerformed(ActionEvent e){
		if(this.v.isButtonGo(e)) {
			this.m.getTranslate();
			this.v.refresh();
		}
	}
	
}
