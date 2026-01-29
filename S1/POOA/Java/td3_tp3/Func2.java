package td3_tp3;

public abstract class Func2 implements Function {
	protected Function leftChild;
	protected Function rightChild;
	
	public Func2(Function leftChild, Function rightChild) {
		this.leftChild = leftChild;
		this.rightChild = rightChild;
	}
}
