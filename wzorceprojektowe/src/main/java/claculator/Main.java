package claculator;

public class Main {
    public static void main(String[] args) {

        Operation sum = new Sum();
        Operation substract = new Substraction();
        Operation multiply = new Multiplication();
        Operation divide = new Divide();

        Calculator calc = new Calculator();

        System.out.println("wynik: " + calc.calculate(divide, 5355, 21));
    }
}
