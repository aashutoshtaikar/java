package app;

public class StockObserver implements Observer {

    public Subject stockGrabber;
    public double ibmPrice;
    public double aaplPrice;
    public double googPrice;
    public static int observerTracker;
    public int observeId;

    public StockObserver(StockGrabber stockGrabber) {
        this.stockGrabber = stockGrabber;
        observeId = ++observerTracker;
        System.out.println("New observer:" + observeId);
        this.stockGrabber.register(this);
    }

    @Override
    public void update(double ibmPrice, double aaplPrice, double googPrice) {
        this.ibmPrice = ibmPrice;
        this.aaplPrice = aaplPrice;
        this.googPrice = googPrice;
        printPrices();
    }

    private void printPrices() {
        System.out.println(
                observeId + "\nIBM price:" + ibmPrice + "\nAAPL price:" + aaplPrice + "\nGOOG price" + googPrice);
    }

}