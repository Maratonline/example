package main.devices;

public class TV implements Electrical {
    final String NAME = "TV";
    Breaker breaker;
    public TV(Breaker breaker) {
        this.breaker = breaker;
    }
    @Override
    public void turnOn() {
        System.out.println("The " + NAME + " turn on");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if (breaker != null)
            breaker.turnOff(NAME,12);
    }
}
