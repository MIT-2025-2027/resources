package td3_tp3;

public abstract class Func1 implements Function {
	protected Function child;
	
	public Func1(Function child) {
		this.child = child;
	}
}
