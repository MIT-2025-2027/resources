package td3_tp3;

public abstract class Func1 implements Function {
	protected Function func;
	
	public Func1(Function func)
	{
		this.func = func;
	}
}
