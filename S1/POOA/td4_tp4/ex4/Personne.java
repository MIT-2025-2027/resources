package td4_tp4.ex4;

public class Personne {
	private String nom, prenom;
	private int age;
	
	public Personne(String nom, String prenom, int age) throws ErrConst
	{
		if (age < 0) {
			throw new ErrConst();
		}
		
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
	}
	
	public void grandir(int g) throws ErrAge
	{
		if ((this.age + g) < 0) {
			throw new ErrAge();
		}
		
		age+= g;
	}
	
	public void afficher()
	{
		System.out.println("Je suis " + nom + " " + prenom + " age: "+ age + " ans");
	}
}
