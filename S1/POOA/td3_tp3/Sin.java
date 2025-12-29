package td3_tp3;

public class Sin extends Func1 {
    public Sin(Function child) {
        super(child);
    }

    public double getValue() {
        return Math.sin(this.child.getValue());
    }

    public String toString() {
        return "sin(" + this.child.toString() + ")";
    }
}
