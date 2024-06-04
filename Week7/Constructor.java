// package Week7;

// public class Constructor {
//     public static void main(String[] args) {
//         ConstructorExample ce=new ConstructorExample();
//         System.out.println("After object");
//         ParamConstructor pc=new ParamConstructor(10, 20);
//         System.out.println(pc.data2);
//     }
// }
// // Task 
// // Make a class Cat
// // make 2 private attribute name, age
// // make 2 public attribute breed, color
// // Make a constructor to only set name and age
// // Make setter for age
// // Make object of cat
// // Fill the attributes
// // Add +1 to the current age
// // Print the Following using object
// // Name: Ny
// // Age: 4
// // Breed: Xy
// // Color: Orange 
// class Cat{
//     private String name;
//     private int age;
//     public String breed, color;
//     Cat(String name, String age){
        
// this.name
//  = name;
//         this.age = age;
//     }
//     void setAge(int age){
//         this.age = age;
//     }
//     String getName(){
//         return 
// this.name
// ;
//     }
//     int getAge(){
//         return this.age;
//     }
// }




// class ParamConstructor{
//     private int data1;
//     public int data2;
//     void setData1(int data1){
//         this.data1=data1;
//     }
//     ParamConstructor(int d1, int d2){
//         this.data1=d1;
//         this.data2=d2;
//     }
// }

// class ConstructorExample{
//     // Non parametarized constructor
//     ConstructorExample(){
//         System.out.println("I run in object creation");
//         // Add more logic
//         // Only called once, to set attributes value in most cases

//     }

// }

// public class ConstructorClass{
//     public static void main(String[] args){
//         ConstructorExample ce = new ConstructorExample();
//         System.out.println("After object");
//         ParamConstructor pc = new ParamConstructor(10, 20);
//         System.out.println(pc.data2);
//         // Task 2 Cntd.
//         Cat cat1 = new Cat("Nya", 3);
//         cat1.breed = "hw";
//         cat1.color = "Orange";
//         cat1.setAge(cat1.getAge() + 1);
//         System.out.println("Name :" + cat1.getName());
//         System.out.println("Age: " + cat1.getAge());
//         System.out.println("Breed: " + cat1.breed);
//         System.out.println("Color " + cat1.color);
//     }
// }

// class ParamConstructor{
//     private int data1;
//     public int data2;
//     void setData1(int data1){
//         this.data1 = data1;
//     }
//     ParamConstructor(int d1, int d2){
//         this.data1 = d1;
//         this.data2 = d2;
    

// class ConstructorExample{
//     // Non parametarized constructor
//     ConstructorExample(){
//         System.out.println("I run in object creation");
//         // Add more logic 
//         // Only called once, to set attributes value in most cases
//     }
// } 