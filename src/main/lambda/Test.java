package main.lambda;
import main.devices.Breaker;
import main.devices.Electrical;
import main.devices.Radio;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Test {

    public void run(){

        Electrical device1 = new Radio(new Breaker() {
            @Override
            public void turnOff(String name, int autoBreak) {
                System.out.println("Auto power off occurred at " + autoBreak +"A device " + name);
            }
        });
        device1.turnOn();

        Electrical device2 = new Radio(Test::aoutobreak);
        device2.turnOn();
    }


    public static void aoutobreak(String name, int power){
        System.out.println("Auto power off occurred at " + power +"A device " + name);
    }

    Predicate<Integer> predicate;
    Consumer<Object> consumer;
    BinaryOperator<Integer> binaryOperator;

    public void tesetFucntionalInterface(){
        Predicate<Integer> isPositive = x -> x > 0;
        BinaryOperator<Integer> binaryOperator = (x,y) -> x*y;

        System.out.println(isPositive.test(8)); // true
        System.out.println(isPositive.test(-5));
        System.out.println(binaryOperator.apply(4,8));
    }

}
