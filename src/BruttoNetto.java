public class BruttoNetto {

    public static void main(String[] args) {

    float netPrice = 252;
    int tax = 20;
    int maxTax = 50;

    System.out.println();

    double calculatedTax = netPrice * tax / 100;
        System.out.println("calculatedTax = " + calculatedTax);

    boolean maxTaxExceeded = calculatedTax >= maxTax;
        System.out.println("maxTaxExceeded = " + maxTaxExceeded);

    double grossPrice = netPrice + calculatedTax;
        System.out.println("grossPrice = " + grossPrice);


    }  // public static void



} //public class
