package PlayerDetail;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		InputStreamReader m = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(m);
		String a,b;
		a=br.readLine();
		b=br.readLine();
		Player p = new Player(a,b);
	}

}
