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

public class RegEx {
	public static void main(String[]args) throws IOException{
		BufferedReader eingabe = new BufferedReader(new InputStreamReader(System.in));
		String ein="";
		System.out.println("Geben Sie die Zeile ein die Sie untersuchen mšchten");
		ein = eingabe.readLine();
		Pattern p = Pattern.compile(ein);
		Matcher m = p.matcher("abbbbc");
		boolean b = m.matches();
		System.out.println(b);
		ein = ein.replaceAll(ein, "def");
		System.out.println(ein);
	}
}
