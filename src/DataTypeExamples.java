public class DataTypeExamples {

    public static void main(String[] args) {

        System.out.println("Einige Beispiele von Datentypen");
        System.out.println();

        int length;
        int width;
        int result;

        length = 5;
        width = 7;

        result = length * width;

        System.out.println("Die Fläche ist " + result + " cm².");

        int a, b, c;
        a = 4;
        b = 3;

        int ergebnis1, ergebnis2, ergebnis3, ergebnis4, ergebnis5;

        ergebnis1 = a + b;
        ergebnis2 = a - b;
        ergebnis3 = a * b;
        ergebnis4 = a / b;
        ergebnis5 = a % b;

        System.out.println();
        System.out.println("a + b = " + a + " + " + b + " = " + ergebnis1);
        System.out.println("a - b = " + a + " - " + b + " = " + ergebnis2);
        System.out.println("a * b = " + a + " * " + b + " = " + ergebnis3);
        System.out.println("a : b = " + a + " : " + b + " = " + ergebnis4);
        System.out.println("a : b = " + a + " : " + b + " = " + ergebnis4 + " mit " + ergebnis5 + " Rest");
        System.out.println("Der Rest von a : b = " + a + " % " + b + " = " + ergebnis5);


    } //public static void

} //public class
