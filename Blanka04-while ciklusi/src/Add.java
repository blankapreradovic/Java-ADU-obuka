
public class Add {
	/* Zadatak: 
	 * 
	 * 1. Napisati While petlju koja ispisuje vrijednosti od 0 do 100	 
	 */
	
public static void main(String[] args) {
	// TODO Auto-generated method stub
	int value = 0;
    
    while(value < 101)
    {
        System.out.println("Iteracija broj: " + value);
        
        value = value + 1;
    }

    /* Zadatak: 
	 * 2. Napisati While petlju koja ispisuje vrijednosti od 30 do 50
	 */
    
value = 30;
    
    while(value < 51)
    {
        System.out.println("Iteracija broj: " + value);
        
        value = value + 1;
    }
    
    /* Zadatak: 
	 * 3. Napisati While petlju koja ispisuje vrijednsoti od 50 do 30
	 */
    
value = 50;
    
    while(value > 29)
    {
        System.out.println("Iteracija broj: " + value);
        
        value = value - 1;
    } 
}
}

