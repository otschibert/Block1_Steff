public class BruttoNetto {

    public static void main(String[] args) {

    float netPrice = 500;
    int tax;
    int maxTax = 50;

    int taxClass = 1;

    System.out.println();

    if (taxClass == 1){
        tax = 20;
    } else if (taxClass == 2){
        tax = 16;
    } else if (taxClass == 3) {
        tax = 8;
    } else {
        tax = 0;
        System.out.println("Lieber User, diese Steuerklasse ist unbekannt");
    } //if else

    switch (taxClass){
        case 1:
            tax = 20;
            break;
        case 2:
            tax = 16;
            break;
        case 3:
            tax = 8;
            break;
        default:
            tax = 0;
            System.out.println("Lieber User, diese Steuerklasse ist unbekannt");
    }

    System.out.println();

    int schulnote = 6;
    int language = 1; // 1 = englisch 2 = deutsch

    if (schulnote == 1) {
        System.out.println("Du hast die Note SEHR GUT erreicht!");
    } else if (schulnote == 2 && language == 2) {
        System.out.println("Du hast die Note GUT erreicht!");
    } else if (schulnote == 3 && language == 2) {
        System.out.println("Du hast die Note BEFRIEDIGEND erreicht!");
    } else if (schulnote == 4 && language == 2) {
        System.out.println("Du hast die Note GENÜGEND erreicht!");
    } else if (schulnote == 5 && language == 2) {
        System.out.println("Du hast die Note NICHT GENÜGEND erreicht!");
    } else if (schulnote == 1 && language == 1) {
        System.out.println("Du hast die Note A erreicht!");
    } else if (schulnote == 2 && language == 1) {
        System.out.println("Du hast die Note B erreicht!");
    } else if (schulnote == 3 && language == 1) {
        System.out.println("Du hast die Note C erreicht!");
    } else if (schulnote == 4 && language == 1) {
        System.out.println("Du hast die Note D erreicht!");
    } else if (schulnote == 5 && language == 1) {
        System.out.println("Du hast die Note E erreicht!");
    } else {
        System.out.println("FEHLERHAFTE EINGABE - Bitte erneut versuchen!");
    }

    System.out.println();

    double calculatedTax = netPrice * tax / 100;
        System.out.println("calculatedTax = " + calculatedTax);

    boolean maxTaxExceeded = calculatedTax >= maxTax;
        // System.out.println("maxTaxExceeded = " + maxTaxExceeded);

    if (maxTaxExceeded == true) {
        System.out.println("Der maximale Steuerbetrag wurde erreicht: " + calculatedTax + " >= " + maxTax);
        } // if
    else {
        System.out.println("Juhu! Der maximale Steuerbetrag wurde nicht erreicht. Folgender Betrag ist noch verfügbar: " + (maxTax - calculatedTax));
        } // else


    if (maxTaxExceeded == false) {
        System.out.println("Juhu");
        } // if

    if (!maxTaxExceeded) {
        System.out.println("Juhu");
        } // if

    double grossPrice = netPrice + calculatedTax;
        System.out.println("grossPrice = " + grossPrice);



    }  // public static void



} //public class
