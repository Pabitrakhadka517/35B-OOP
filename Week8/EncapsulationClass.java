package Week8;
public class EncapsulationClass{
    public static void main(String[] args){

    } 
    
}
// 1. Encapsulation enclose/bundles similar properties/attribute
// and function/methods inside a single class
class Laptop{
    String brand;
    String name;
    // 2. Data hiding can be done using private modifier
    private double price;
    private int ram;
    private int storage;
    public int year;
    // 3. data attributes can have a better control using setter/getter
    // write only using setter
    public void setPrice(double price){
        this.price = price;
    }
    // Read only using getter
    public double getPrice(){
        return this.price;
    }
    void branding(){
        System.out.println("Brand :" + brand);
    }
    // Task 
    // Make a constructer of Laptop that takes brand and name
    // Make a setter and getter for remaining private attributes, ram, storage
    // Make a function upgrade() takes, 2 number for ram and storage \
    // and add them to the current value of ram and storage
    // Make a function inflation() takes 1 number price \
    // and add to the current value of price
    // Make 2 object, fill the attribute and call upgrade & inflation
    // Print the following
    // Output
    // Brand: Apple
    // Name: Apple Air M3
    // Price: 150000
    // Ram: 10GB
    // Storage: 256GB
    // Year: 2022 
    Laptop(String brand, String name){
        this.brand = brand;
        this.name = name;
    }
    public void setRam(int ram){
        this. ram = ram;
    }
    public void setStorage(int storage){
        this. storage = storage;
    }
    public int getRam(){
        return this.ram;
    }
    public int getStorage(){
        return this.storage;
    }
    public void upgrade(int ram, int storage){
        this.ram = this.ram + ram;
        this.storage += storage;
    }
    public void inflation(double price){
        this.price += price;
    }

}
