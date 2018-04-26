package claculator;

public class Sum implements Operation {

    @Override
    public Number perform(Number n1, Number n2) {
        return n1.longValue() + n2.longValue();
    }
}
