package exercice;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class AppMain {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String nomFichier;
		String ligne;
		int numligne=0;
		int maxnumligne = 4;
		int maxCarinligne = 60;
		char charNumLigne[] = new char[maxnumligne];
		
		Scanner sc = new Scanner(System.in);
		nomFichier = sc.next();
		BufferedReader filein = new BufferedReader(new FileReader("/Volumes/Data/Workspace/formations/java/workspace/exercice/"+nomFichier));

		do {
			
			ligne = filein.readLine();
//			System.out.println(ligne);
			if(ligne==null) break;
			numligne++;
			String numLigneStr = String.valueOf(numligne);
//			System.out.println(numLigneStr);
			int i,j;
			for(i=0; i<maxnumligne - numLigneStr.length(); i++) charNumLigne[i]=' ';
			for(j=0; i<maxnumligne; i++,i++) charNumLigne[i]=numLigneStr.charAt(j);
			
			for(i=0; i<maxnumligne; i++) {System.out.print(charNumLigne[i]);}
			System.out.print(' ');
			
			int n=0;
			while(n < ligne.length()) {
				
				if( ( n !=0 ) && (n%maxCarinligne == 0)  ) {
					System.out.println();
					for(int k=0; k<maxnumligne+1; k++) System.out.print(' ');
						
				}
				
				System.out.print(ligne.charAt(n));
				n++;
				
			}
			System.out.println();
			
		}while(ligne!=null);
		filein.close();
		
	}

}
