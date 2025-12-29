package td3_tp3;

public class PlusN implements Function {
	private Function[] functions;
	
	public PlusN(Function ...funcs) {
		this.functions = funcs;
	}
	
	public double getValue()
	{
		double somme = 0.;
		
		for (int i = 0; i < this.functions.length; i++) {
			somme+=functions[i].getValue();
		}
		
		return somme;
	}
	
	public String toString() {
		String toString = "(";
		
		for (int i = 0; i < this.functions.length; i++) {
			toString += functions[i].toString();
			
			if (i != this.functions.length - 1) {
				toString += " + ";
			}
		}
		
		return toString + ")";
	}
}
