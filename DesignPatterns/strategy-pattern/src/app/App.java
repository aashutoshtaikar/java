package app;

public class App {
    public static void main(String[] args) throws Exception {
        Animal sparky = new Dog();
        Animal tweety = new Bird();

        System.out.println("Dog " + sparky.tryToFly());
        System.out.println("Bird " + tweety.tryToFly());

        sparky.setFlyingType(new ItFlys());
        System.out.println("Dog " + sparky.tryToFly());
        
    }
}