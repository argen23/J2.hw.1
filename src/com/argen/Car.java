package com.argen;

public class Car {
    private int wheels;
    private String steering;
    private String typeCar;
    private Color color;
    private int class4;


    public int getWheels() {
        return wheels;
    }

    public String getSteering() {
        return steering;
    }

    public String getTypeCar() {
        return typeCar;
    }

    public Color getColor() {
        return color;
    }

    public Car(int wheels, String steering, String typeCar, Color color , int class4) {
        this.wheels = wheels;
        this.steering = steering;
        this.typeCar = typeCar;
        this.color = color;
        this.class4 = class4;
    }
    public String getInfo(){
        return  " \n wheels = " + wheels + "\n steering = " + steering + "\n type Car = " + typeCar + "\n color = " + color + "\n class4 = " + class4 ;
    }
}













//   b)  Создать иерархию из 3х классов (1й -> 2й -> 3й уровень иерархии),
//   последний 3й класс сделать не наследуемым
//   c)  Все поля классов должны быть приватными, одно из полей должно быть сложного типа созданного вами же
//  (4й класс), одно из полей сделать сложного типа (enum)
//  d)  В классах не должно быть setter-ов, только getter-ы и конструкторы
//  e)  Добавить перегруженные методы (2-3 шт.) в класс 2-го уровня иерархии,
//  один из них сделать неперезаписываемым
//  f)  В классе 3-го уровня перезаписать один из методов родителя
//  g)  В главном классе (Main)
//  Создать объект класса 2-го уровня (objectA) и 2 объекта класса 3-го уровня (objectB, objectC),
//  также распечатать все свойства объектов и вызвать перегруженные методы через каждый из экземпляров ваших объектов.