package app;

public class App {
    public static void main(String[] args) throws Exception {
        StockGrabber stockGrabber = new StockGrabber();
        StockObserver observer1 = new StockObserver(stockGrabber);

        stockGrabber.setIBMPrice(197.00);
        stockGrabber.setAAPLPrice(677.2);
        stockGrabber.setGOOGPrice(555.4);
        StockObserver observer2 = new StockObserver(stockGrabber);

        stockGrabber.setIBMPrice(197.00);
        stockGrabber.setAAPLPrice(677.2);
        stockGrabber.setGOOGPrice(555.4);

        stockGrabber.unregister(observer1);
        stockGrabber.setIBMPrice(197.00);
        stockGrabber.setAAPLPrice(677.2);
        stockGrabber.setGOOGPrice(555.4);
    }
}