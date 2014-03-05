import java.awt.List;
import java.awt.Point;
import java.util.LinkedList;
import java.util.Timer;
import java.util.TimerTask;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class RegExprModel {
	private RegExprView v;
	private String matchstring;
	private String patternstring;
	private String aus;
	private Pattern p;
	private Matcher m;
	boolean ifgo;
	public RegExprModel(RegExprView v){
		this.v=v;
		aus = "";
		matchstring = ""+v.txt1.getText();
		patternstring = ""+v.txt2.getText();
	}
	public String getTranslate(){
		p=Pattern.compile(patternstring);
		m=p.matcher(matchstring);
		aus = patternstring.replaceAll(patternstring,matchstring);
			return aus;
	}
}
