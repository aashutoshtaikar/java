package app;

public class App {
    public static void main(String[] args) throws Exception {
        StockGrabber stockGrabber = new StockGrabber();
        StockObserver observer1 = new StockObserver(stockGrabber);
        stockGrabber.setIbmPrice(100.2);
        stockGrabber.setAaplPrice(500.2);
        stockGrabber.setGoogPrice(300.2);

        StockObserver observer2  = new StockObserver(stockGrabber);
        stockGrabber.setIbmPrice(100.2);
        stockGrabber.setAaplPrice(500.2);
        stockGrabber.setGoogPrice(300.2);

        stockGrabber.unregister(observer2);
        stockGrabber.setIbmPrice(100.2);
        stockGrabber.setAaplPrice(500.2);
        stockGrabber.setGoogPrice(300.2);
    }
}