package td3_tp3;

public class Cos extends Func1 {
	public Cos(Function child) {
		super(child);
	}
	
	public double getValue()
	{
		return Math.cos(this.child.getValue());
	}
	
	public String toString() {
		return "cos(" + this.child.toString() + ")";
	}
}
