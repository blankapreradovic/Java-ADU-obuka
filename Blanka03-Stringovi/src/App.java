
public class App {

	public static void main(String[] args) {
	
		/*
		 * Zadatak:
		 * 
		 * 1. Napraviti program koji sadrzi NIZ Stringova unutar koga se nalaze
		 *    imena i prezimena clanova grupe. 
		 * 2. Kreirani niz ispisati/izlistati u konzolu petljom.
		 */
		// Deklarisanje niza (niza stringova)
		
		// Deklarisanje i definisanje stringa istovremeno
		String[] clanovigrupe = {"Dragana Pupac", "Blanka Preradovic", "Tanja Stankovic" };
		
		// Kratka forma FOR petlje 
				// Ovaj dio se radi tek na sljedecim primjerima, za sada ga usvojiti ovakvog
		for(String clangrupe : clanovigrupe) {
			
			// Kompletan kod koji obradjuje instancu - clangrupe
			System.out.println(clangrupe);
		}
		String[] words = new String[3];
		
	
		// Unos vrijednosti za string
		words[0] = "Pozdrav, ";
		words[1] = "kako si ";
		words[2] = "ti ?";
		
			
	}

}

