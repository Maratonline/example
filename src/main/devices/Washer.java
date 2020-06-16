package main.devices;

public class Washer implements Electrical {
    final String NAME = "Washer";
    Breaker breaker;
    public Washer(Breaker breaker) {
        this.breaker = breaker;
    }
    @Override
    public void turnOn() {
        System.out.println("The " + NAME + " turn on");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if (breaker != null)
            breaker.turnOff(NAME, 123);
    }
}
