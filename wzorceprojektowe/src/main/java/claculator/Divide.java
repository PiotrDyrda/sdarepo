package claculator;

public class Divide implements Operation {

    @Override
    public Number perform(Number n1, Number n2) {
        if (n2.longValue() == 0 || n2.equals(null)) {
            throw new IllegalArgumentException("cannot divide through 0.");
        }
        return n1.longValue() / n2.longValue();
    }
}
