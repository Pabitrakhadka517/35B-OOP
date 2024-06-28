package Week8;

public class InheritanceConstructor {
    public static void main(String[] args) {
        Polo p1 = new Polo();
        p1.differentColor("Yellow");
        Polo p2 = new Polo("Red");
        Polo p3 = new Polo(10);
        // Call Constructer with overloaded param
        
    }
}
class Shirt{
    String color ="Black"; // super.color
    Shirt(){
        System.out.println("Making shirt");
    }
    Shirt(String color){
        this.color=color;
    }
}
class Polo extends Shirt{
    String color ="White"; // this.color
    String texture;
    Polo(){
        // By defualt the constructor of parent is called
        // meaning super() or Short() on first line of execution
        super("white");
        System.out.println("Making Polo shirt");
    }
    // Constructor Overloading
    // Same name function/Constructor with different logic/param
    Polo(String color){
        this.color=color;
        System.out.println("Constructor with one string");
    }
    Polo(String color, String texture){
        this.color = color;
        this.texture = texture;
        System.out.println("Constructor with two string");
    }
    Polo (int num){
        System.out.println(num);
        System.out.println("Constructor with one int");
        // Note that constructor overload takes the different in data type
        // not the variable Polo(String c) cannot be made
    }
    void differentColor(String color){
        System.out.println("Param color " + color);
        System.out.println("Class color " + this.color);
        System.out.println("Parent color " + super.color);
    }
}
// Task
// Make a class pant
// Add two attribute color and texture
// Make constructor or pant that takes color and texture 
// Make a class HalfPant that extends Pant
// Make a attribute color and add default String White
// Make a non Param constructor of HalfPant and \
// call the Parametrized constructor of parent Pant with "Black" and "Wool"
// Make a function design() in HalfPant that takes String color \
// change the parent color to current color of halfpant
// change the current color of half pant to provided parameter
class Pant{
    String color;
    String texture;
    Pant(String color, String texture){
        this.color=color;
        this.texture=texture;
        System.out.println("Constructor with two String");
    }
}
class HalfPant extends Pant{
    String color="White";
    HalfPant(){
        super("Black", "Wool");
    }
    void design(String color){
        super.color=this.color;
        this.color=color;
    }

}