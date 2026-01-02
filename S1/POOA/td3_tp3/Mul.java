package td3_tp3;

public class Mul extends Func2 {
	public Mul(Function leftChild, Function rightChild) {
		super(leftChild, rightChild);
	}

	public double getValue() {
		return this.leftChild.getValue() * this.rightChild.getValue();
	}

	public Function getDiff() {
		// (f * g)' = f' * g + f * g'
		return new Plus(
				new Mul(leftChild.getDiff(), rightChild),
				new Mul(leftChild, rightChild.getDiff())
		);
	}
	
	public String toString() {
		return "(" + this.leftChild.toString() + " * " + this.rightChild.toString() + ")";
	}
}
