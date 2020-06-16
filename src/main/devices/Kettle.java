package main.devices;

public class Kettle implements Electrical {
    final String NAME = "Kettle";

    @Override
    public void turnOn() {
        System.out.println("The "+NAME+" turn on");
    }


}
