package td3_tp3;

public class Sqr extends Func1 {
    public Sqr(Function child) {
        super(child);
    }

    public double getValue() {
        return Math.pow(this.child.getValue(), 2);
    }

    public String toString() {
        return "(" + this.child.toString() + ")²";
    }
}
