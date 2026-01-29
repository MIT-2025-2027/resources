package td4_tp4.ex2;

public class OubliStupide {

	public static void main(String[] args) {
		int[] tab = null;
		try  {
			System.out.println(tab[2]);	
		} catch (NullPointerException e) {
			System.out.println("On ne peut pas accéder à une case d'un tableau qui est déja null");
		}
		
	}

}
