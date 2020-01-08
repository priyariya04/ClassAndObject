package Machine;

import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner m = new Scanner(System.in);
		System.out.println("Enter No Of Coal Pieces");
		int coalPieces = m.nextInt();
		System.out.println("Enter Hair Strand");
		float hairStrand = m.nextFloat();
		System.out.println("Enter Coal Message");		
		String coalMsg = m.next();
		Machine ma = new Machine(coalPieces,hairStrand,coalMsg);
		ma.produceShoePolish();
			}

	
}
