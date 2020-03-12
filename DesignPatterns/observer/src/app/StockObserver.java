package app;

public class StockObserver implements Observer {

    private Subject stockGrabber;
    private double ibmPrice;
    private double aaplPrice;
    private double googPrice;
    private static int observerIDTracker = 0;
    private int observerID;

    public StockObserver(Subject stockGrabber) {
        this.stockGrabber = stockGrabber;
        this.observerID = ++observerIDTracker;
        System.out.println("New Observer" + this.observerID);
        this.stockGrabber.register(this);
    }

    @Override
    public void update(double ibmPrice, double aaplPrice, double googPrice) {
        this.ibmPrice = ibmPrice;
        this.aaplPrice = aaplPrice;
        this.googPrice = googPrice;

        printThePrices();
    }

    public void printThePrices() {
        System.out.println(observerID + "\nibm " + ibmPrice + 
        "\naapl " + aaplPrice + 
        "\ngoog " + googPrice);
    }

}