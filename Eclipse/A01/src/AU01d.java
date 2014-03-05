import javax.swing.JOptionPane;


public class AU01d {
	public static void main(String[] args) throws Exception{
		String entscheid = JOptionPane.showInputDialog("GUI oder Kommandozeile?");
		if(entscheid.equals("Kommandozeile")){
			Telefonbuchsteuerung x=new Telefonbuchsteuerung();
			x.start();
			}else{
				TelefonbuchsteuerungGUI g = new TelefonbuchsteuerungGUI();
			}
			
	}
}
