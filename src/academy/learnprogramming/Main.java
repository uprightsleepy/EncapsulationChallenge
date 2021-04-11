package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        Printer printer = new Printer(0,0,false);

        System.out.println("Toner Level Testing ...");
        System.out.println("Toner level: " + printer.getTonerLevel());

        printer.fillToner(35);
        printer.fillToner(50);
        printer.fillToner(15);
        printer.fillToner(-1);
        printer.fillToner(1);


        System.out.println();
        System.out.println("Printing Testing ...");

        printer.getPagesPrinted();
        printer.printPage(10);
        printer.printPage(-1);
        printer.printPage(5);

        printer.isDuplex();

    }
}
