package td4_tp4.ex3;

public class TestMain {
	
	
	 public static void main(String[] args) {

	        try {
	        	
	            AdresseIP adr = new AdresseIP(192, 168, 0, 10);
	            System.out.println(adr);
	            

	            AdresseIP adr2 = new AdresseIP(192, 1608, 209, 10);
	            System.out.println(adr2);
	            

	            AdresseIP adr3 = new AdresseIP(192, 168, 155, 10);
	            System.out.println(adr3);
	            
	        } catch (ExceptionAdrIP e) {
	            System.out.println("Erreur : " + e.getMessage());
	        }
	    }
}
