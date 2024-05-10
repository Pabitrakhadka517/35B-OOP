
// *Task
// * Make a new scanner object/variable scan1
// * prompt the following
// * What is your name? ->save as a string, name
// * Are you over 18? -> save as boolean, status
// * How many siblings? ->save as int, sibling
// * print the following
// * Hello, name
// * over 18? status
// * You have siblings num of siblings
// * //comment the previous scanner for ease of use        
// */


import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {
      Scanner scan1=new Scanner(System.in);
      System.out.println("What is your name?");
      String name=scan1.nextLine();
      System.out.println("My name is " + name);

      System.out.println("Are you over 18?");
      boolean status=scan1.nextBoolean();
      System.out.println("over 18?"+ status);

      System.out.println("How many siblings ?");
      int sib=scan1.nextInt();
      System.out.println("I have " + sib + " siblings");

      scan1.close();

    }
}






// import java.util.Scanner;

// public class Task2{
//   public static void main(String[] args) {
//     System.out.println("Taking input from the user");
    
//     Scanner sc = new Scanner(System.in);
//     // System.out.print("Enter the first number:");
//     // int a = sc.nextInt();
//     // System.out.print("Enter secong number:");
//     // int b = sc.nextInt();
//     // int sum=a+b;
//     // System.out.print("The sum of the numbers:");
//     // System.out.println(sum);

//     // boolean b1= sc.hasNextInt();
//     // System.out.println(b1);

//     String str=sc.nextLine();
//     System.out.println(str);


  
//   }
// }




// Write a program to claculate the percantage of given student in NEB board exam. his marks from 5 subjects must be as input from the keyboard(marks are out of 100).
// import java.util.Scanner;

// public class Task2{

//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         // Array to store marks of 5 subjects
//         int[] marks = new int[5];

//         System.out.println("Enter marks out of 100 for 5 subjects:");

//         // Input marks for each subject
//         for (int i = 0; i < 5; i++) {
//             System.out.print("Enter marks for subject " + (i + 1) + ": ");
//             marks[i] = scanner.nextInt();

//             // Validate marks (assuming marks should be between 0 and 100)
//             while (marks[i] < 0 || marks[i] > 100) {
//                 System.out.println("Invalid marks! Marks should be between 0 and 100.");
//                 System.out.print("Enter marks for subject " + (i + 1) + ": ");
//                 marks[i] = scanner.nextInt();
//             }
//         }

//         // Calculate total marks
//         int totalMarks = 0;
//         for (int mark : marks) {
//             totalMarks += mark;
//         }

//         // Calculate percentage
//         double percentage = (double) totalMarks / (5 * 100) * 100;

//         // Display the percentage
//         System.out.println("Total marks obtained: " + totalMarks);
//         System.out.printf("Percentage: %.2f%%\n", percentage);

//         // Close the scanner
//         scanner.close();
//     }
// }

