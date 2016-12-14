import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Kreiranje skener objekta
		Scanner input = new Scanner(System.in);
		
		// Output prompt
		System.out.println("Ime: ");
		System.out.println("Prezime: ");
		System.out.println("Godina rodjenja: ");
		System.out.println("Pol: ");
		// System.out.println("Unesite integer: ");
		
		// Izvrsavanje skenera i arhiviranje rezultata
		String line = input.nextLine();
		String line2 = input.nextLine();
		String line3 = input.nextLine();
		String line4 = input.nextLine();
		
		// int value = input.nextInt();
		// int value = input.nextDouble();
		
		// Ispis arhiviranog rezultata
		System.out.println("Vi ste" + line + " "+ line2 + "rodjeni ste" + line3 + "a vas pol je" + line4);
		
		// Svaki skener i citac treba zatvoriti nakon upotrebe (dobra praksa)
		input.close();
			
		/*
		 * Zadatak:
		 * 1 - Napisati program koji omogucava korisniku da unese svoje Ime, Prezime, Godinu rodjenja i pol.
		 *   - Nakon sto korisnik unese trazene podatke ispisati jednu recenicu kojom se ponavlja korisnicki unos.
		 */

		
	}

}
