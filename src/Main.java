public class Main {
    public static void main(String[] args) {
        TaxCalculator calculator = getCalculator();
        calculator.calculateText();
    }

    public static TaxCalculator getCalculator() {
        return new TaxCalculator2023();
    }

}