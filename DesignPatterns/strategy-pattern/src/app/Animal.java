package app;

public class Animal {
    public Flys flyingType;

    public String tryToFly(){
        return flyingType.fly();
    }

    public void setFlyingType(Flys flyingType) {
        this.flyingType = flyingType;
    }
    
}