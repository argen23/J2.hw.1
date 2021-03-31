package com.argen;

public class Main {

    public static void main(String[] args) {

        Mersedes objectA = new Mersedes(4 , " rigth" , "cars" , Color.BLACK);
        Sclass objectB = new Sclass(4,"left", " freight", Color.GRAY);
        Sclass objectC = new Sclass(4,"right", "cars", Color.RED);
        System.out.println(objectA.getInfo() + " "+ objectB.getInfo() + objectC.getInfo());
        objectA.numCar(73,2);
        objectB.numCar(23,3);
        objectC.numCar(244,6);
    }


}









//  Создать объект класса 2-го уровня (objectA) и 2 объекта класса 3-го уровня (objectB, objectC),
//  также распечатать все свойства объектов и вызвать перегруженные методы через каждый из экземпляров
//  ваших объектов.