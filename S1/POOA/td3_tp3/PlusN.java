package td3_tp3;

import java.util.Collections;
import java.util.stream.Stream;

public class PlusN implements Function {
    private Function[] childrens;

    public PlusN(Function... funcs) {
        this.childrens = funcs;
    }

    public double getValue() {
        double somme = 0.;

        for (int i = 0; i < this.childrens.length; i++) {
            somme += childrens[i].getValue();
        }

        return somme;
    }

    public Function getDiff() {
        Function[] diffFunctions = new Function[this.childrens.length];
        for (int i = 0; i < this.childrens.length; i++) {
            diffFunctions[i] = this.childrens[i].getDiff();
        }
        return new PlusN(diffFunctions);
    }

    public String toString() {
        String toString = "(";

        for (int i = 0; i < this.childrens.length; i++) {
            toString += childrens[i].toString();

            if (i != this.childrens.length - 1) {
                toString += " + ";
            }
        }

        return toString + ")";
    }
}
