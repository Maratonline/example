package main;

import main.devices.*;
import main.lambda.Test;

import java.util.ArrayList;
import java.util.List;

public class Main {
    static List<Electrical> electricals = new ArrayList<>();

    public static void main(String[] args) {

//        example1();
//        example2();
//        example3();
        example4();

    }


    public static void example1(){
//        electricals.add(new Kettle());
//        electricals.add(new TV());
//        electricals.add(new Washer());
//
//        for(Electrical deviceIn : electricals)
//            deviceIn.turnOn();
    }



    public static void example3(){
//        Autodevices autodevices = new Autodevices();
//        autodevices.run();
    }

    public static void example4(){
        Test test = new Test();
       test.run();
        test.tesetFucntionalInterface();
    }
}


