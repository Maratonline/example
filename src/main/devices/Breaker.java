package main.devices;

@FunctionalInterface
public interface Breaker {
    void turnOff(String name, int autoBreak);
}
