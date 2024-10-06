package dev.omedia.section8.exc39;

public class Printer {
    private int pagesPrinted = 0;
    private int tonerLevel;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        this.duplex = duplex;
        this.tonerLevel = Math.max(tonerLevel, -1);
    }

    public int addToner(int tonerAmount) {
        if (tonerAmount <= 0 || tonerAmount > 100 || (tonerAmount + tonerLevel > 100)) {
            return -1;
        }

        tonerLevel += tonerAmount;
        return tonerLevel;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }

    public int printPages(int pages) {
        int pagesToPrint = duplex ? (pages / 2) + (pages % 2) : pages;
        pagesPrinted += pagesToPrint;
        return pagesToPrint;
    }
}
