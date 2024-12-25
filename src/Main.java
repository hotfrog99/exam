class ZeroDenominatorException extends Exception {
    public ZeroDenominatorException(String message) {
        super(message);
    }
}

class Fraction {
    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator) throws ZeroDenominatorException {
        if (denominator == 0) {
            throw new ZeroDenominatorException("Знаменатель не может быть нулем.");
        }
        this.numerator = numerator;
        this.denominator = denominator;
    }

    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }
}


class TestFraction {
    public void testFractionCreation() {
        try {
            Fraction fraction = new Fraction(1, 2);
            System.out.println("Создана дробь: " + fraction);
        } catch (ZeroDenominatorException e) {
            System.out.println(e.getMessage());
        }
        try {
            Fraction fraction = new Fraction(1, 0);
            System.out.println("Создана дробь: " + fraction);
        } catch (ZeroDenominatorException e) {
            System.out.println(e.getMessage());
        }
    }
}


public class Main {
    public static void main(String[] args) {
        TestFraction test = new TestFraction();
        test.testFractionCreation();
    }
}
