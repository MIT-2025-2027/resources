package td3_tp3;

public class Var extends Func0 {
    private String name;
    private double value;

    public Var(String name) {
        this.name = name;
        this.value = 0.;
    }

    public Var(String name, double value) {
        this.name = name;
        this.value = value;
    }

    public double getValue() {
        return this.value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public String toString() {
        return this.name;
    }
}
