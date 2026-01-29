package td4_tp4.ex1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		/***** Code Départ *****/
		/*
		int a, b, res;
		
		Scanner clavier = new Scanner(System.in);
		
		System.out.print("Donnez la valeur de a:");
		a = clavier.nextInt();
		
		System.out.print("Donnez la valeur de b:");
		b = clavier.nextInt();
		
		res = a / b;
		
		System.out.println("Le résultat de " + a + " divisé par " + b + " est" + res);
		
		System.out.println("Fin du programme");
		*/
		
		

		/***** Code Final *****/
		
		int a, b, res;
		Scanner clavier = new Scanner(System.in);
		
		try {
			System.out.print("Donnez la valeur de a:");
			a = clavier.nextInt();
			
			System.out.print("Donnez la valeur de b:");
			b = clavier.nextInt();
			
			try {
				res = a / b;	
				System.out.println("Le résultat de " + a + " divisé par " + b + " est" + res);
			} catch(ArithmeticException e) {
				System.out.println("Wak-Wak! un problème de division");
				System.out.println("Le message officiel est " + e.getMessage());
			} finally {
				System.out.println("Le bloc finally sera toujours exécuté");
				System.out.println("Et c'est là que l'on fermera par example les fichiers");
			}

		} catch(InputMismatchException e) {
			System.out.println("Wak-Wak! caractère donné doit être un chiffre");
		}
		
		System.out.println("Fin du programme");
	}
}
