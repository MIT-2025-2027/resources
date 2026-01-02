package td3_tp3;

public class Cos extends Func1 {
	public Cos(Function child) {
		super(child);
	}
	
	public double getValue() {
		return Math.cos(this.child.getValue());
	}

	public Function getDiff() {
		// (cos f)' = -sin(f) * f'
		return new Mul(
				new Mul(new Val(-1), new Sin(child)),
				child.getDiff()
		);
	}
	
	public String toString() {
		return "cos(" + this.child.toString() + ")";
	}
}
