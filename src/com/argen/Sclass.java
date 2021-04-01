package com.argen;

public class Sclass extends Mersedes{

    private int motorType;
    private int boxType;
    public int getMotorType() {
        return motorType;
    }
    public int getBoxType() {
        return boxType;
    }

    public Sclass(int wheels, String steering, String typeCar, Color color, int class4) {
        super(wheels, steering, typeCar, color, class4);
    }

    @Override
    public String getInfo() {
        return super.getInfo();
    }

    @Override
    public int numCar(int num, int speed, int hide) {
        return super.numCar(num, speed, hide);
    }
}
