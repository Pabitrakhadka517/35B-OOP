package Week11;

public class Polymerphism {
    public static void main(String[] args) {
        MathOperation mo = new MathOperation();
        System.out.println(mo.add(10,20));
        System.out.println(mo.add(10,20,30));
        mo.add();

        // Method overriding 
        Document d1=new Document();
        d1.print("Black");
        // Polymorphism allow Child Object to be stored in 
        // Parent Class variable
        Document d2=new MsWord();
        d2.print("White");
        //Doing so will take the update function and
        // attribute from child object representation
        Document d3=new Office365();
        d3.print("Yellow");
        // when Parent variable holds child object
        // only the attribute and function written in Parent 
        // can be used
        // Eg: d3.online; -> cannot be used
    }
}
// Method Overloading - Compiletime polymerphism
// Making same function multiple times with diff in parameter
class MathOperation{
    int add(int num1, int num2){
        return num1+num2;
    }
    // 1. Changing the number of parameter
    int add(int num1, int num2, int  num3){
        return num1+num2+num3;
    }
    // 2. Changing the data type of parameter
    double add(double num1, double num2){
        return num1 + num2;
    }
    // Note: Method overloading expects the unique in data type of parameter
    // Cannot overload method just by changing variable
    // Eg: int add(int a, int b) -> cannot do this as add with 2 int already made
    // cannot overload by just changing return data type
    // Eg: double add(int num1, int num2) -> cannot do this as add with 2 int already made
    void add(){
        System.out.println("Invalid Operation");
    }
}

// Method Overriding - Runtime polymerphism
// Making the same function of ParentClass in ChildClass
class Document{
    public void print(String paper){
        System.out.println("Document Printing");
    }
}
//Method overriding is only possible in ChildClass
class MsWord extends Document{
    boolean online = false;
    @Override 
    public void print(String paper){
        System.out.println("MS Word is printing");
    }
}
// Method Overrriding can be done in multi level interface
class Office365 extends MsWord{
    boolean online = true;
    @Override
    public void print(String paper){
        System.out.println("Online is printing");
    }
}