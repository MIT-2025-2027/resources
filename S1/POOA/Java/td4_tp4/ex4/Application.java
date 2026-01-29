package td4_tp4.ex4;

public class Application {

	public static void main(String[] args) {
		try {
			Personne p = new Personne("Balihi", "Lahoucine", 35);
			p.afficher();
			p.grandir(-36);
			p = new Personne("Balihi", "Lahoucine", -35);
			p.afficher();
		} catch(ErrConst e) {
			System.out.println("Erreur de construction");
		} catch(ErrAge e) {
			System.out.println("Erreur d'agrandissement");
			System.exit(1);
		}
	}

}
