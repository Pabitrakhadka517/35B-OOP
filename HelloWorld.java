// public class HelloWorld {
//     public static void main(String[]agrs){
//      System.out.print("Hello, World!\n");   
//      System.out.print("This is my first program\n");
//      System.out.print("I am on module ST4003CEM\n");

//     }
// }




// 4. WAP that prints the following pattern:
// *
// **
// ***
// ****

public class HelloWorld{
    public static void main(String[] args) {
        int rows = 4; // Number of rows for the pattern

        // Outer loop to iterate through rows
        for (int i = 1; i <= rows; i++) {
            // Inner loop to print '*' based on the current row number
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}
