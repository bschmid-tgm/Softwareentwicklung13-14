import java.io.*;
public class Telefonbuchsteuerung {
	private Telefonbuch t;
	public Telefonbuchsteuerung()throws Exception{
		start();
	}
	public void start() throws Exception{
		System.out.println("Geben Sie a ein um einen neuen Telefonbucheintrag zu verfassen \n Geben Sie r ein um einen Telefonbucheintrag zu verwerfen \n Geben Sie c ein um einen Telefonbucheintrag zu suchen \n Geben Sie sort ein um die Telefonbucheinträge zu sortieren \n Geben Sie x ein um das Telefonbuch zu beenden");
		BufferedReader eingabe = new BufferedReader(new InputStreamReader(System.in));
		boolean ende=true;
		while(ende!=false){}
			String ein="";
			System.out.println("Ihre Befehl: ");
		
			ein = eingabe.readLine();
			char c = ein.charAt(0);
				switch(c){
					case 'a': 
						String vname="";
						String nname="";
						String telnr="";
						boolean aus;
						System.out.println("Vorname: ");
						vname = eingabe.readLine();
						System.out.println("Nachname: ");
						nname = eingabe.readLine();
						System.out.println("Telefonnummer: ");
						telnr = eingabe.readLine();
						Telefonbucheintrag tb = new Telefonbucheintrag(vname,nname,telnr);
						aus=t.add(tb);
						break;
					case 'r': 
						String del;
						boolean aus1;
						System.out.println("Geben Sie den Namen des zu löschenden Eintrags ein: ");
						del = eingabe.readLine();
						aus1 = t.remove(del);
						break;
					case 'c':
						String search ="";
						boolean aus2;
						System.out.println("Geben Sie den Namen des zu suchenden Eintrags ein: ");
						search = eingabe.readLine();
						aus2=t.contains(search);
						break;
					case 's':
						int sortieren;
						boolean typ;
						System.out.println("Geben Sie 0 ein um nach Nachnamen zu sortieren \n Geben Sie 1 ein um nach Vornamen zu sortieren \n Geben Sie 2 ein um nach Telefonnummer zu sortieren \n Geben Sie -1 ein um nach allem zu sortieren");
						sortieren = Integer.parseInt(eingabe.readLine());
						System.out.println("Geben Sie true ein um aufsteigend zu sortieren \n Geben Sie false ein um absteigend zu sortieren");
						typ = Boolean.parseBoolean(eingabe.readLine());
						t.sort(sortieren,typ);
						break;
					case 'x': ende=false;
						break;
		}
		
	}
}
