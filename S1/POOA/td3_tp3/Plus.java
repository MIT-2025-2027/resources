package td3_tp3;

public class Plus extends Func2 {
	public Plus(Function leftChild, Function rightChild) {
		super(leftChild, rightChild);
	}

	public double getValue() {
		return this.leftChild.getValue() + this.rightChild.getValue();
	}

	public Function getDiff() {
		return new Plus(leftChild.getDiff(), rightChild.getDiff());
	}

	public String toString() {
		return "("+this.leftChild.toString() + " + " + this.rightChild.toString() + ")";
	}
}
