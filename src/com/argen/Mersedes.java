package com.argen;

public class Mersedes extends Car {

    private  int glass ;
    private  int volume;

    public int getGlass() {
        return glass;
    }

    public int getVolume() {
        return volume;
    }

    public Mersedes(int wheels, String steering, String typeCar, Color color, int class4) {
        super(wheels, steering, typeCar, color , class4);
    }

    @Override
    public String getInfo() {
        return super.getInfo();
    }

    public int numCar(int num , int speed , int hide){
        return hide;
    }
    public int numCar(int num , int hide){
        return num ;
    }
    public final int numCar( int speed ){
        return speed;
    }
}





