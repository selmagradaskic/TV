package com.company;

public class Main {

    public static void main(String[] args) {


        Tv tv1 = new Tv();
        tv1.turnOn();
        tv1.setChannel(42);
        tv1.setVolume(5);

        Tv tv2 = new Tv(77,4,true);

        System.out.println(tv1);
        System.out.println(tv2);

        tv1.changeChannel(66);
        tv1.turnOn();
        System.out.println(tv1);








    }
}
