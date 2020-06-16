package main.devices;

public class Radio implements Electrical {
    final String NAME = "Radio";
    Breaker breaker;

    public Radio(Breaker breaker) {
        this.breaker = breaker;
    }

    public void setBreaker(Breaker breaker){
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
            breaker.turnOff(NAME, 120);
    }
}
