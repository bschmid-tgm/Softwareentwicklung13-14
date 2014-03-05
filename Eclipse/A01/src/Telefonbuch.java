import java.util.*;

public class Telefonbuch {
	ArrayList<Telefonbucheintrag> tb;
	public Telefonbuch(){
		tb = new ArrayList<Telefonbucheintrag>();
	}
	public boolean add(Telefonbucheintrag neu){
		tb.add(neu);
		return true;
	}
	public boolean remove(String del) {
		for (int i = 0; i < tb.size(); i++)
			if (tb.get(i).equals(del)){
				tb.remove(i);
			}
		return true;
	}
	public boolean contains(String search){
		for (int i = 0; i < tb.size(); i++)
			if (tb.get(i).equals(search)){
				return true;
			}
		return false;
	}
	public void sort (int sortieren, boolean typ){
		switch(sortieren){
		case -1:
			
			break;
		case 0:
			for (int i=0; i < tb.size(); i++){
				int vergleich = tb.get(i).nname.compareTo(tb.get(i+1).nname);
				if(typ == true){
					if(vergleich < 0){
						Telefonbucheintrag tb1 = new Telefonbucheintrag();
						tb1 = tb.get(i);
						tb.set(i, tb.get(i+1));
						tb.set(i+1, tb1);
					}
					if(vergleich == 0){
						int vergleich2 = tb.get(i).nname.compareTo(tb.get(i+1).nname);
						if(vergleich2 < 0){
							Telefonbucheintrag tb2 = new Telefonbucheintrag();
							tb2 = tb.get(i);
							tb.set(i,tb.get(i+1));
							tb.set(i+1, tb2);
						}
					}
				}
				if(typ == false){
					if(vergleich < 0){
						Telefonbucheintrag tb3 = new Telefonbucheintrag();
						tb3 = tb.get(i+1);
						tb.set(i+1, tb.get(i));
						tb.set(i, tb3);
					}
					if(vergleich == 0){
						int vergleich3 = tb.get(i).nname.compareTo(tb.get(i+1).nname);
						if(vergleich3 < 0){
							Telefonbucheintrag tb4 = new Telefonbucheintrag();
							tb4 = tb.get(i);
							tb.set(i, tb.get(i+1));
							tb.set(i+1, tb4);
						}
					}
				}
			}
			break;
		case 1:
			for (int i=0; i < tb.size(); i++){
				int vergleich = tb.get(i).vname.compareTo(tb.get(i+1).vname);
				if(typ == true){
					if(vergleich < 0){
						Telefonbucheintrag tb1 = new Telefonbucheintrag();
						tb1 = tb.get(i);
						tb.set(i, tb.get(i+1));
						tb.set(i+1, tb1);
					}
					if(vergleich == 0){
						int vergleich2 = tb.get(i).nname.compareTo(tb.get(i+1).nname);
						if(vergleich2 < 0){
							Telefonbucheintrag tb2 = new Telefonbucheintrag();
							tb2 = tb.get(i);
							tb.set(i, tb.get(i+1));
							tb.set(i+1, tb2);
						}
					}
				}
				if(typ == false){
					if(vergleich < 0){
						Telefonbucheintrag tb3 = new Telefonbucheintrag();
						tb3 = tb.get(i+1);
						tb.set(i+1, tb.get(i));
						tb.set(i, tb3);
					}
					if(vergleich == 0){
						int vergleich3 = tb.get(i).nname.compareTo(tb.get(i+1).nname);
						if(vergleich3 < 0){
							Telefonbucheintrag tb4 = new Telefonbucheintrag();
							tb4 = tb.get(i);
							tb.set(i, tb.get(i+1));
							tb.set(i+1, tb4);
						}
					}
				}
			}
			break;
		case 2:
			for (int i=0; i < tb.size(); i++){
				int vergleich = tb.get(i).telnr.compareTo(tb.get(i+1).telnr);
				if(typ == true){
					if(vergleich < 0){
						Telefonbucheintrag tb1 = new Telefonbucheintrag();
						tb1 = tb.get(i);
						tb.set(i, tb.get(i+1));
						tb.set(i+1, tb1);
					}
				}
				if(typ == false){
					if(vergleich < 0){
						Telefonbucheintrag tb2 = new Telefonbucheintrag();
						tb2 = tb.get(i+1);
						tb.set(i+1, tb.get(i));
						tb.set(i, tb2);
					}
				}
			}
			break;
		}
		
	}
	public void exit(){
		System.exit(0);
	}
}
