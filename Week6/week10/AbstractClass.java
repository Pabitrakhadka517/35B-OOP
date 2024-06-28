package week10;

public class AbstractClass {
    public static void main(String[] args) {
        Samsung s1=new Samsung();
        s1.sms();
        s1.call("9868602838");
        Apple a1=new Apple();
        a1.sms();
        a1.call("9829638227");
        
    }
}
// To make abstract class keyword "abstract" before "class"
// If you make abstract class, cannot make object of it
abstract class SmartPhone{
    // abstract class may or may not contain abstract functions
    // to make abstract function use "anstract" before making function
    // abstract class do not have a body
    abstract void sms();
    abstract public boolean call(String number);
    // abstract class have normal functions
    void imei(){
        System.out.println("Imei number");
    }
}
// Abstract class only be used in sub/child class
class Samsung extends SmartPhone{
    // when extending abstract class we have to implement/override
    // all the abstract function of abstract class
    @Override 
    void sms(){
        System.out.println("Samsung way of sending sms");
    }

@Override 
public boolean call(String number){
    System.out.println("Samsung calling to " + number);
    return true;
}

}

// Make a class Apple extending Smartphone
// Make object of Samsung and Apple,
// call sms() and call() function of them

class Apple extends SmartPhone{
    @Override
    void sms(){
        System.out.println("Apple way of sending sms");
    }
    @Override
    public boolean call(String number){
        System.out.println("Apple calling to " + number);
        return true;
    }


}

/*
 * You are building a shape hierarchy for a drawing application.
 * Design an abstract class named "Shape" with the following abstract methods:
 * 
 * calculateArea():
 * This method should calculate and return the area of shape.
 * 
 * calculatePerimeter():
 * This method should calculate and return the perimeter of shape.
 * 
 * Implement the abstract class and provide concrete implementations for
 * the abstract methods. Create subclasses for different shapes such as "Circle,"
 * "Rectangle," and "Triangle."
 * Each subclass should provide specific implementation for
 * claculating the area of each shape class and demostrate
 * how you can calculate their respective areas and perimeters.
 */

 abstract class Shape{
    abstract double calculateArea();
    abstract double calculatePerimeter();
 }
 class Circle extends Shape{
    private double radius;

    public Circle (double radius){
        this.radius=radius;
    }
    @Override
    double calculatePerimeter(){
        return 2 * Math.PI * radius;
    }
    @Override 
    double calculateArea(){
        return Math.PI * radius * radius;

    }
 }
 class Rectangle extends Shape{
    private double length;
    private double breadth;

    Rectangle(double length, double breadth){
        this.length=length;
        this.breadth=breadth;
    }
    @Override
    double calculatePerimeter(){
        return 2*(length + breadth);
    }
    @Override
    double calculateArea(){
        return length * breadth;
    }

 }
 class Triangle extends Shape{
    private double base;
    private double height;
    private double sideA;
    private double sideB;
    private double sideC;

    Triangle(double base, double height, double sideA, double sideB, double sideC){
        this.base=base;
        this.height=height;
        this.sideA=sideA;
        this.sideB=sideB;
        this.sideC=sideC;
    }
    @Override 
    double calculateArea(){
        return 0.5 * base * height;   
    }

    @Override
    double calculatePerimeter(){
        return sideA + sideB + sideC;
        
    }


 }