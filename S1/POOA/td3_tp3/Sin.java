package td3_tp3;

public class Sin extends Func1 {
	public Sin(Function func) {
		super(func);
	}
	
	public double getValue()
	{
		return Math.sin(this.func.getValue());
	}
	
	public String toString() {
		return "sin " + this.func.toString();
	}
}
