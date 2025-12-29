package td3_tp3;

public class Mul extends Func2 {
	public Mul(Function leftChild, Function rightChild) {
		super(leftChild, rightChild);
	}

	public double getValue() {
		return this.leftChild.getValue() * this.rightChild.getValue();
	}
	
	public String toString() {
		return "(" + this.leftChild.toString() + " * " + this.rightChild.toString() + ")";
	}
}
