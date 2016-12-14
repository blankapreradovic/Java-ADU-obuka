
public class App {
	
	public static void main(String[] args) {

	// Ciklus koji ispisuje brojeve od 0 do 4
    for(int i=0; i < 5; i++) {
        System.out.printf("Vrijednost od i je : %d \n", i);
    }
    
    /*
     * Zadatak:
     *
     * 1 - Napisati ciklus koji ispisuje brojeve od 1 do 1000
     */
    for(int i=1; i < 1001; i++) {
        System.out.printf("Vrijednost od i je : %d \n", i);
    }
    
    /*
     * Zadatak:
     * 2 - Napisati ciklus koji ispisuje brojeve od 500 do 1
     */
    for(int i=500; i > 0; i--) {
        System.out.printf("Vrijednost od i je : %d \n", i);
    }
    
    /*
     * Zadatak:
     * * 3 - Napisati ciklus koji ispisuje parne brojeve od 2 do 1000
     */
    for(int i=1; i < 501; i++) {
        System.out.printf("Vrijednost od i je : %d \n", i*2);
    }
    
    /*
     * Zadatak:
     * 4 - Napisati ciklus koji ispisuje neparne brojeve od 1 do 1000
     */
    for(int i=1; i < 501; i++) {
        System.out.printf("Vrijednost od i je : %d \n", i*2-1);
    }
	}
	
	}
