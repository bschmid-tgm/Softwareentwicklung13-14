import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.*;
import javax.swing.*;
public class WoerterbuchMain{
	public static void main (String[]args) throws IOException{
		File f = new File("c:\\data\\file.txt");
		RandomAccessFile file;
		file = new RandomAccessFile(f, "rw");
		HashMap a = new HashMap();
		long punkt = 0;
		if(!f.exists()){
			f.createNewFile();
			file=new RandomAccessFile(f, "rw");
		}
		
		file.seek(0);
		while(file.length()!=0){
			String content = file.readUTF();
		}
		String ein = "";
		ein = JOptionPane.showInputDialog(null,"Geben Sie den zu uebersetzenden Satz ein");
		System.out.println(ein);
		String leer = " ";
		String[] woerter;
		woerter=ein.split(" ");
		for(int i=0; i<woerter.length; i++){
			if(a.containsKey(woerter[i])==true){
				System.out.print(a.get(woerter[i])+" ");
			}else{
				String uebersetz="";
				uebersetz=JOptionPane.showInputDialog(null,"Geben Sie eine †bersetzung fŸr "+woerter[i]+" ein");
				a.put(woerter[i], uebersetz);
				System.out.print(a.get(woerter[i])+" ");
			}
		String words=a.toString();
		long l = file.length();	
		file.seek(l);
		file.writeUTF(words);
		}
		
	}
	
}
