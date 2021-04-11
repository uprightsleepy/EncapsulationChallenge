package academy.learnprogramming;

public class Printer {
    private int toner;
    private int totalPagesPrinted;
    private boolean duplex = true;

    public Printer(int tonerLevel, int pagesPrinted, boolean duplex) {
        this.toner = tonerLevel;
        this.totalPagesPrinted = pagesPrinted;
        this.duplex = duplex;
    }

    public int getTonerLevel() {
        return toner;
    }

    public int getPagesPrinted() {
        System.out.println("Number of pages printer: " + totalPagesPrinted);
        return totalPagesPrinted;
    }

    public boolean isDuplex() {
        if(duplex){
            System.out.println("This printer is a duplex printer.");
        }
        else{
            System.out.println("This printer is not a duplex printer.");
        }
        return duplex;
    }

    public void fillToner(int amount) {
        if((this.toner + amount) > 100){
            System.out.println("Unable to fill that much toner.");
            this.toner = 100;
            System.out.println("Toner Level: " + this.toner);
        }
        else if(amount < 0){
            System.out.println("Invalid amount.");
            System.out.println("Toner Level: " + this.toner);
        }
        else{
            this.toner = this.toner + amount;
            System.out.println("Toner Level: " + this.toner);
        }
    }

    public void printPage(int amount){
        if(!this.duplex) {
            if ((this.totalPagesPrinted + amount) < 0) {
                System.out.println("No pages were printed.");
            } else if (amount < 0) {
                System.out.println("Invalid amount.");
                System.out.println("Total pages printed: " + this.totalPagesPrinted);
            } else {
                this.totalPagesPrinted = this.totalPagesPrinted + amount;
                System.out.println("Number of pages printed: " + amount);
                System.out.println("Total pages printed: " + this.totalPagesPrinted);
            }
        }
        else{
            if ((this.totalPagesPrinted + amount) < 0) {
                System.out.println("No pages were printed.");
            } else if (amount < 0) {
                System.out.println("Invalid amount.");
                System.out.println("Total pages printed: " + this.totalPagesPrinted);
            } else {
                this.totalPagesPrinted = this.totalPagesPrinted+ ((amount / 2) + (amount % 2));
                System.out.println("Printed in Duplex mode: " + this.totalPagesPrinted);
            }
        }
    }
}
