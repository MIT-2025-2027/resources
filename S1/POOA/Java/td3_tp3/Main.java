package td3_tp3;

public class Main {

	public static void main(String[] args) {
		
		/*
		Var x = new Var("x"), y = new Var("y");
		Function f = new Plus(x, new Mul(new Val(2), y));
		System.out.print(f);*/
		
		/*
		Var x = new Var("x"), y = new Var("y"), z = new Var("z");
		Function x2=new Sqr(x);
		Function y2=new Sqr(y);
		Function z2=new Sqr(z);
		Function g = new Plus(x2, new Plus(y2, z2));
		System.out.print(g);*/
		
		/*
		Var x = new Var("x");
		Function h = new Plus(new Sin(x), new Val(5));
		System.out.print(h);*/
		
		/*
		Var x = new Var("x"), y = new Var("y");
		Function k = new Plus(new Sqr(new Sin(x)), new Sqr(new Cos(x)));
		System.out.print(k);
		*/
		
		
		/* Exercice 5 */
		//Var x = new Var("x", -3.0);
		//Var x = new Var("x", -2.13);
		//Var x = new Var("x", -1.26);
		//Var x = new Var("x", -0.39);
		/*Var x = new Var("x", 0.48);
		double resultat = new Plus(new Sqr(new Sin(x)), new Sqr(new Cos(x))).getValue();
		System.out.print(resultat);*/
		
		/* Exercice 6 */
		/*Var x = new Var("x"), y = new Var("y"), z = new Var("z");
		Function x2 = new Sqr(x);
		Function y2 = new Sqr(y);
		Function z2 = new Sqr(z);
		Function g = new PlusN(x2, y2, z2);
		System.out.print(g);*/

		Var x = new Var("x");
		x.setValue(2);

		Function f = new Plus(new Sin(x), new Val(5));
		Function df = f.getDiff();

		System.out.println("f(x) = " + f);
		System.out.println("f'(x) = " + df);

	}

}
