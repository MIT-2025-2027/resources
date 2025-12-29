package tp2.ex7;

public class Test {

	public static void main(String[] args) {		

		EqSecondDegreC equation2 = new EqSecondDegreC(2.0, 1.0, +3.0);

		equation2.afficheDiscriminant();
		equation2.resoudre();
		equation2.afficheSolutions();
	}

}
