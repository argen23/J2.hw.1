package com.argen;

public class Main {

    public static void main(String[] args) {
        Class4 class4 = new Class4(555,"Germany");
        Mersedes objectA = new Mersedes(4 , " rigth" , "cars" , Color.BLACK  , class4 );
        Sclass objectB = new Sclass(4,"left", " freight", Color.GRAY ,new Class4(394,"Germany"));
        Sclass objectC = new Sclass(4,"right", "cars", Color.RED ,new Class4(389,"Germany"));
        System.out.println("\n  OBJECT A" +objectA.getInfo() + "\n  OBJECT B" + objectB.getInfo() + " \n  OBJECT C  " + objectC.getInfo() );
        objectA.numCar(73,2);
        objectB.numCar(23,3);
        objectC.numCar(244,6);
    }
}






//  Создать объект класса 2-го уровня (objectA) и 2 объекта класса 3-го уровня (objectB, objectC),
//  также распечатать все свойства объектов и вызвать перегруженные методы через каждый из экземпляров
//  ваших объектов.