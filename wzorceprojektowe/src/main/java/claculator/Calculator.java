package claculator;

public class Calculator {

    private Number wynik;



    public Number calculate(Operation o, Number n1, Number n2) {
        wynik = o.perform(n1,n2);
        return wynik;
    }
}
