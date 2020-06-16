package main.devices;

import java.util.ArrayList;
import java.util.List;
//ToDo implements Breaker
public class Autodevices implements Breaker {
    static List<Electrical> electricals = new ArrayList<>();


    public void run (){
        electricals.add(new Radio(this ));
        electricals.add(new TV(this));
        electricals.add(new Washer(this));

        electricals.forEach( device -> {
            device.turnOn();
        });

    }

    @Override
    public void turnOff(String name, int autoBreak) {

    }
}
