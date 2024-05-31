package Week7;

public class AccessModifier {
    public static void main(String[] args) {
        AccessExample ae=new AccessExample();
        ae.name="Ram";
        ae.age=12;
        // ae.salary=1000.21; //
        ae.defualtFunction();
        ae.publicFunction();
        // ae.privateFunction(); //
        ae.accessPrivate();
        ae.setSalary(1002.22);
        System.out.println(ae.getSalary());
        
  

        // Create an object of the Dog class
        Dog myDog = new Dog();
        
        // Set the attributes
        myDog.setName("XYZ");
        myDog.setAge(10);
        myDog.breed = "ABC";
        
        // Print the attributes using the object
        System.out.println("Name: " + myDog.getName());
        System.out.println("Breed: " + myDog.breed);
        System.out.println("Age: " + myDog.getAge());

    }
}


// Task 
// Make a class Dog
// Make a private attribute name and age
// Make setter for name and age
// Make getter for name and age
// Make an object for dog
// Fill all atributes
// print the following using object
// Name:xyz
//Bread: ABC
//Age: 10

// Define the Dog class
class Dog {
    // Private attributes
    private String name;
    private int age;
    
    // Public attribute
    public String breed;
    
    // Setter for name
    public void setName(String name) {
        this.name = name;
    }
    
    // Setter for age
    public void setAge(int age) {
        this.age = age;
    }
    
    // Getter for name
    public String getName() {
        return name;
    }
    
    // Getter for age
    public int getAge() {
        return age;
    }
}




class AccessExample{
    String name; // Automatically defualt, package/folder can access
    public int age; //can be accessed from anywhere
    private double salary; //  can only accessed inside the class
    void setSalary(double s){
        salary=s;
    }
    double getSalary(){
        return salary;
    }

    // same concept in function
    void defualtFunction(){
        System.out.println("I can be accesed inside a package");
    }
    public void publicFunction(){
        System.out.println("I can accessed from anywhere");
    }
    private void privateFunction(){
        System.out.println("I can be only accessed inside class");
    }
    void accessPrivate(){
        System.out.println(salary);
        privateFunction();
    }
}

