import java.awt.List;
import java.util.*;


public class LotteryMain { 
	public static void main(String[]args) throws NoSuchElementException {
		/*
		Random r = new Random();
		TreeSet<Integer> ts = new TreeSet<Integer>();
		Integer i1=0;
		//Ziehung
		for(int i=0; i<6; i++){
			while(ts.size() <= 6){ //Wegen Zusatzzahl
				i1=r.nextInt(45);
				System.out.print (i1 + " ");
				ts.add(i1);
			}
		}
		
		//Tipp
		Random r1 = new Random();
		TreeSet<Integer> ts1 = new TreeSet<Integer>();
		Integer i2=0;
		for(int a=0; a<6; a++){
			while(ts1.size() <= 6){ //Wegen Zusatzzahl
				i2=r1.nextInt(45);
				System.out.print (i2 + " ");
				ts.add(i2);
			}
		}
		*/
		System.out.println("Ziehung");
		TreeSet<Integer> ts = createTipp();
		System.out.println();
		System.out.println("Tipp");
		TreeSet<Integer> ts1 = createTipp();
		
		Iterator itr1 = ts.iterator();
		Iterator itr2 = ts1.iterator();
		System.out.println();
		int count = 0;
		boolean bool = false;
		for(int a=0; a<ts.size();a++){
			bool = itr1.equals(itr2);
			itr1.next();
			itr2.next();
			if(bool == true){
				count++;
			}
		}
		System.out.println(count);
		if (count == 1){
			System.out.println("Gratulation! \n Sie haben 1,10 Û gewonnen.");
		}
		if(count == 3){
			System.out.println("Gratulation! \n Sie haben 4,60 Û gewonnen.");
		}
		if(count == 4){
			System.out.println("Gratulation! \n Sie haben 16,60 Û gewonnen.");
		}
		if(count == 5){
			System.out.println("Gratulation! \n Sie haben 35,00 Û gewonnen.");
		}
		if(count == 6){
			
		}
	}
	public static TreeSet<Integer> createTipp(){
		Random r = new Random();
		TreeSet<Integer> ts = new TreeSet<Integer>();
		Integer i1=0;
		//Ziehung oder Tipp
		for(int i=0; i<6; i++){
			while(ts.size() <= 6){ //Wegen Zusatzzahl
				i1=r.nextInt(45);
				System.out.print (i1 + " ");
				ts.add(i1);
			}
		}
		return ts;
	}
}
