package teamdetail;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		InputStreamReader m = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(m);
		String teamName,cityRepresented;
		teamName=br.readLine();
		cityRepresented=br.readLine();
		Team t = new Team(teamName,cityRepresented);
		

	}

}
