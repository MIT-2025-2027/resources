package td3_tp3;

public class Sqr extends Func1 {
    public Sqr(Function child) {
        super(child);
    }

    public double getValue() {
        return Math.pow(this.child.getValue(), 2);
    }

    public Function getDiff() {
        // (f²)' = 2 * f * f'
        return new Mul(
                new Mul(new Val(2), child),
                child.getDiff()
        );
    }

    public String toString() {
        return "(" + this.child.toString() + ")²";
    }
}
