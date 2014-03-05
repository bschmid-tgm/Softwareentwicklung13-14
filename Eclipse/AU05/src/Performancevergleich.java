import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Random;
import java.util.TreeMap;
import java.util.TreeSet;

import javax.swing.JOptionPane;

public class Performancevergleich {
	
	public static void messungArrayListDown(int anzahl){
		ArrayList<Integer> al = new ArrayList<Integer>();
		long startZeit = System.nanoTime();
		for(int i = 0; i <= anzahl; i++) al.add(i,i);
		long dauer = System.nanoTime() - startZeit;
		System.out.println(dauer);
	}
	public static void messungLinkedListDown(int anzahl){
		LinkedList<Integer> ll = new LinkedList<Integer>();
		long startZeit = System.nanoTime();
		for(int i = 0; i <= anzahl; i++) ll.add(i, i);
		long dauer = System.nanoTime() - startZeit;
		System.out.println(dauer);
		}
	public static void messungArrayListUp(int anzahl){
		ArrayList<Integer> al = new ArrayList<Integer>();
		long startZeit = System.nanoTime();
		for (int i = 0; i<anzahl;i++) al.add(new Integer(i),i);
		long dauer = System.nanoTime() - startZeit;
		System.out.println(dauer);
		}
	public static void messungLinkedListUp(int anzahl){
		LinkedList<Integer> ll = new LinkedList<Integer>();
		long startZeit = System.nanoTime();
		for (int i = 0; i<anzahl;i++) ll.add(new Integer(i),i);
		long dauer = System.nanoTime() - startZeit;
		System.out.println(dauer);
		}
	public static void messungArrayListRandom(int anzahl){
		ArrayList<Integer> al = new ArrayList<Integer>();
		long startZeit = System.nanoTime();
		for (int i = 0; i<=anzahl;i++){
			int random = new Random().nextInt(anzahl)+1;
			while(anzahl >= 0 && anzahl < anzahl){
				al.add(random-1,random);
			}
		}
		long dauer = System.nanoTime() - startZeit;
		System.out.println(dauer);
		}
	public static void messungLinkedListRandom(int anzahl){
		LinkedList<Integer> ll = new LinkedList<Integer>();
		long startZeit = System.nanoTime();
		for (int i = 0; i<=anzahl;i++){
			int random = new Random().nextInt(anzahl)+1;
			while(anzahl >= 0 && anzahl < anzahl){
				ll.add(random-1,random);
			}
		}
		long dauer = System.nanoTime() - startZeit;
		System.out.println(dauer);
		}
	public static void messungHashSetUp(int anzahl){
		HashSet<Integer> hs = new HashSet<Integer>();
		long startZeit = System.nanoTime();
		for (int i = 0; i<anzahl;i++) hs.add(new Integer(i));
		long dauer = System.nanoTime() - startZeit;
		System.out.println(dauer);
		}	
	public static void messungTreeSetUp(int anzahl){
		TreeSet<Integer> ts = new TreeSet<Integer>();
		long startZeit = System.nanoTime();
		for (int i = 0; i<anzahl;i++) ts.add(new Integer(i));
		long dauer = System.nanoTime() - startZeit;
		System.out.println(dauer);
		}	
	public static void messungHashSetRandom(int anzahl){
		HashSet<Integer> hs = new HashSet<Integer>();
		long startZeit = System.nanoTime();
		for (int i = 0; i<anzahl;i++){
			int random = new Random().nextInt(anzahl)+1;
			while(anzahl >= 0 && anzahl < anzahl){
				hs.add(random-1);
			}
		}
		long dauer = System.nanoTime() - startZeit;
		System.out.println(dauer);
	}
	public static void messungTreeSetRandom(int anzahl){
		TreeSet<Integer> ts = new TreeSet<Integer>();
		long startZeit = System.nanoTime();
		for (int i = 0; i<=anzahl;i++){
			int random = new Random().nextInt(anzahl)+1;
			while(anzahl >= 0 && anzahl < anzahl){
				ts.add(random-1);
			}
		}
		long dauer = System.nanoTime() - startZeit;
		System.out.println(dauer);
	}
	public static void messungHashMapLeer(int anzahl){
		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		long startZeit = System.nanoTime();
		String s = "";
		for (int i = 0; i<anzahl;i++) hm.put(new Integer(i),s);
		long dauer = System.nanoTime() - startZeit;
		System.out.println(dauer);
		}	
	public static void messungTreeMapLeer(int anzahl){
		TreeMap<Integer,String> tm = new TreeMap<Integer,String>();
		long startZeit = System.nanoTime();
		String s = "";
		for (int i = 0; i<anzahl;i++) tm.put(new Integer(i),s);
		long dauer = System.nanoTime() - startZeit;
		System.out.println(dauer);
		}	
	public static void messungHashMapKey(int anzahl){
		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		long startZeit = System.nanoTime();
		for (int i = 0; i<anzahl;i++) hm.put(new Integer(i),Integer.toString(i));
		long dauer = System.nanoTime() - startZeit;
		System.out.println(dauer);
		}	
	public static void messungTreeMapKey(int anzahl){
		TreeMap<Integer,String> tm = new TreeMap<Integer,String>();
		long startZeit = System.nanoTime();
		for (int i = 0; i<anzahl;i++) tm.put(new Integer(i),Integer.toString(i));
		long dauer = System.nanoTime() - startZeit;
		System.out.println(dauer);
		}	
	public static void messungHashMapRandom(int anzahl){
		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		long startZeit = System.nanoTime();
		for (int i = 0; i<=anzahl;i++){
			int random = new Random().nextInt(anzahl)+1;
			while(anzahl >= 0 && anzahl < anzahl){
				int rand = random-1;
				hm.put(rand, Integer.toString(rand));
			}
		}
		long dauer = System.nanoTime() - startZeit;
		System.out.println(dauer);
		}	
	public static void messungTreeMapRandom(int anzahl){
		TreeMap<Integer,String> tm = new TreeMap<Integer,String>();
		long startZeit = System.nanoTime();
		for (int i = 0; i<=anzahl;i++){
			int random = new Random().nextInt(anzahl)+1;
			while(anzahl >= 0 && anzahl < anzahl){
				int rand = random-1;
				tm.put(rand, Integer.toString(rand));
			}
		}
		long dauer = System.nanoTime() - startZeit;
		System.out.println(dauer);
		}	
	public static void test1(){
		int m = 10;
		messungArrayListDown(m);
		messungArrayListUp(m);
		messungArrayListRandom(m);
		messungLinkedListDown(m);
		messungLinkedListUp(m);
		messungLinkedListRandom(m);
		messungHashSetUp(m);
		messungHashSetRandom(m);
		messungTreeSetUp(m);
		messungTreeSetRandom(m);
		messungHashMapLeer(m);
		messungHashMapKey(m);
		messungHashMapRandom(m);
		messungTreeMapLeer(m);
		messungTreeMapKey(m);
		messungTreeMapRandom(m);
	}
	public static void test2(){
		int m = 100;
		messungArrayListDown(m);
		messungArrayListUp(m);
		messungArrayListRandom(m);
		messungLinkedListDown(m);
		messungLinkedListUp(m);
		messungLinkedListRandom(m);
		messungHashSetUp(m);
		messungHashSetRandom(m);
		messungTreeSetUp(m);
		messungTreeSetRandom(m);
		messungHashMapLeer(m);
		messungHashMapKey(m);
		messungHashMapRandom(m);
		messungTreeMapLeer(m);
		messungTreeMapKey(m);
		messungTreeMapRandom(m);
	}
	public static void test3(){
		int m = 1000;
		messungArrayListDown(m);
		messungArrayListUp(m);
		messungArrayListRandom(m);
		messungLinkedListDown(m);
		messungLinkedListUp(m);
		messungLinkedListRandom(m);
		messungHashSetUp(m);
		messungHashSetRandom(m);
		messungTreeSetUp(m);
		messungTreeSetRandom(m);
		messungHashMapLeer(m);
		messungHashMapKey(m);
		messungHashMapRandom(m);
		messungTreeMapLeer(m);
		messungTreeMapKey(m);
		messungTreeMapRandom(m);
	}
	public static void test4(){
		int m = 10000;
		messungArrayListDown(m);
		messungArrayListUp(m);
		messungArrayListRandom(m);
		messungLinkedListDown(m);
		messungLinkedListUp(m);
		messungLinkedListRandom(m);
		messungHashSetUp(m);
		messungHashSetRandom(m);
		messungTreeSetUp(m);
		messungTreeSetRandom(m);
		messungHashMapLeer(m);
		messungHashMapKey(m);
		messungHashMapRandom(m);
		messungTreeMapLeer(m);
		messungTreeMapKey(m);
		messungTreeMapRandom(m);
	}
	public static void test5(){
		int m = 100000;
		messungArrayListDown(m);
		messungArrayListUp(m);
		messungArrayListRandom(m);
		messungLinkedListDown(m);
		messungLinkedListUp(m);
		messungLinkedListRandom(m);
		messungHashSetUp(m);
		messungHashSetRandom(m);
		messungTreeSetUp(m);
		messungTreeSetRandom(m);
		messungHashMapLeer(m);
		messungHashMapKey(m);
		messungHashMapRandom(m);
		messungTreeMapLeer(m);
		messungTreeMapKey(m);
		messungTreeMapRandom(m);
	}
	public static void test6(){
		int m = 1000000;
		messungArrayListDown(m);
		messungArrayListUp(m);
		messungArrayListRandom(m);
		messungLinkedListDown(m);
		messungLinkedListUp(m);
		messungLinkedListRandom(m);
		messungHashSetUp(m);
		messungHashSetRandom(m);
		messungTreeSetUp(m);
		messungTreeSetRandom(m);
		messungHashMapLeer(m);
		messungHashMapKey(m);
		messungHashMapRandom(m);
		messungTreeMapLeer(m);
		messungTreeMapKey(m);
		messungTreeMapRandom(m);
	}
	public static void main(String[]args){
		System.out.println("EinfŸgen (am Ende), Fall 3: HashSet");
		System.out.println("Anzahl: Dauer:");
		System.out.println("------+-------");
		//String art = JOptionPane.showInputDialog(null, "Geben Sie ein welche Messung durchgefŸhrt werden soll: \n 1 ArrayList/LinkedList einfŸgen am Ende der Liste \n 2 ArrayList/LinkedList einfŸgen am Beginn der Liste \n 3 ArrayList/LinkedList zufŠlliger Wert \n 4 HashSet/TreeSet aufsteigender Wert \n 5 HasgSet/TreeSet zufŠlliger Wert \n 6 HashMap/TreeMap aufsteigender Key, leerer String als Value \n 7 HashMap/TreeMap aufsteigender Key, Value = Key \n 8 HashMap/TreeMap ZufŠlliger Key, Value = Key");
		String a = JOptionPane.showInputDialog(null,"Geben Sie an mit welcher Zahl die Messung durchgefŸhrt werden soll.");
		//String b = JOptionPane.showInputDialog(null,"Geben Sie an wie oft die Messung durchgefŸhrt werden soll.");
		//int w = Integer.parseInt(art);
		int m = Integer.parseInt(a);
		//int z = Integer.parseInt(b);
		if(m == 10){
			test1();
		}
		if(m == 100){
			test2();
		}
		if(m == 1000){
			test3();
		}
		if(m == 10000){
			test4();
		}
		if(m == 100000){
			test5();
		}
		if(m == 1000000){
			test6();
		}
		/*for(int i=0; i<z; i++){
			messungArrayListDown(m);
			messungArrayListUp(m);
			messungArrayListRandom(m);
			messungLinkedListDown(m);
			messungLinkedListUp(m);
			messungLinkedListRandom(m);
			messungHashSetUp(m);
			messungHashSetRandom(m);
			messungTreeSetUp(m);
			messungTreeSetRandom(m);
			messungHashMapLeer(m);
			messungHashMapKey(m);
			messungHashMapRandom(m);
			messungTreeMapLeer(m);
			messungTreeMapKey(m);
			messungTreeMapRandom(m);
			System.out.println();
		}*/
	
	}
}
