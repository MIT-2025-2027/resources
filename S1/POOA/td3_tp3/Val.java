package td3_tp3;

public class Val extends Func0 {
    private double value;

    public Val(double value) {
        this.value = value;
    }

    public double getValue() {
        return this.value;
    }

    public String toString() {
        return "" + this.value;
    }

    public Function getDiff() {
        return new Val(0);
    }
}
