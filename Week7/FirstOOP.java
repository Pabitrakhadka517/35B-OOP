package Week7;

public class FirstOOP {
    public static void main(String[] args) {
        Person p1=new Person();
        p1.name = "Ram";
        p1.age= 12;
        p1.gender = 'M';
        System.out.println(p1.name);
        p1.introduction();

       Person p2 = new Person();
       p2.name = "Pabitra";      
       p2.age = 12;
       p2.gender='F';
       System.out.println(p2.name);
       p2.introduction();

       Square s1 = new Square();
       s1.sides = 10;
       int s1Area=s1.area();
       System.out.println(s1Area);
       s1.addSides(2);
       System.out.println(s1.area());

       Rectangle r1=new Rectangle();
       r1.length=10.1;
       r1.breadth=20.2;
       double area=(r1.length + r1.breadth);
       System.out.println(area);
       
       double perimeter=2*(r1.length+r1.breadth);
       System.out.println(perimeter);
       
    }
    
}

// Task 
// Make 2 attributes in double, length and breadth
// Make a function areaOfRectangle that returns length and breadth
// Make a function perimeterOfRectangle that returns 2(length + breadth)
// Make an object of Rectangle and print area and perimeter

class Rectangle{
    double length, breadth;
    double area(){
        return length + breadth;
    }
    double perimeter(){
        return 2*(length+breadth);
    }
}

class Car{
    // Make attributes: name, brand, year, color
    // Make a function modify() that takes new color and set to old color
    // Make a function expriy() that returns 100 added to year
    // Make a function start() that prints(name is starting)
    // Make a function stop() that print(name, brand is stopping)
    // Make a function detail()that print(name, brand, color and year)
    // Make 3 Object of Car
    // Start all 3 Object
    // Stop only 1st object
    // Modify 2nd car to Green Color
    // Print the expiry of 3rd Object
    // Print detail of all 3 Object

    String name, brand, color;
    int year;
    void modify(String newColor){
        color = newColor;
    }
    int expiry(){
        return 100+year;
    }
    void start(){
        System.out.println(name + "is starting");
    }
    void stop(){
        System.out.println(name + "," + brand + "is stopping");
    }
    void detail(){
        System.out.println(name + "," + brand + "," + color + " and " + year);
    }

}


class Square{
    int sides;
    int area(){
        int area = sides * sides;
        return area;
    }
    void addSides(int val){
        sides=sides+val; //sides will retain state/data
    }
}

class Person{
    // data/fields/attributes/properties
    String name;
    int age;
    char gender;

    // procedures/functions/methods
    void introduction(){
        System.out.println("Hi my name is " + name);
    }
}
