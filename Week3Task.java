import java.util.Scanner;

public class Week3Task {
    public static void main(String[] args) {

        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // 1. Write a JAVA program to find the maximum between three numbers.

        // Prompt the user to enter three numbers
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        System.out.print("Enter the third number: ");
        int num3 = scanner.nextInt();

        // Close the Scanner object
        scanner.close();

        // Find the maximum among the three numbers
        int max = num1;
        if (num2 > max) {
            max = num2;
        }
        if (num3 > max) {
            max = num3;
        }

        // Print the maximum number
        System.out.println("The maximum number among " + num1 + ", " + num2 + ", and " + num3 + " is: " + max);
       
        // 2. Write a JAVA program to check whether a number is negative, positive, or zero.
        // Prompt the user to enter a number
         System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        // Close the Scanner object
        scanner.close();
        
        // Check whether the number is negative, positive, or zero
        if (number > 0) {
            System.out.println("The number is positive.");
        } else if (number < 0) {
            System.out.println("The number is negative.");
        } else {
               System.out.println("The number is zero.");
        }

        // 3. Write a JAVA program to check whether a number is divisible by 5 and 11 or not.
        
        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        int number1 = scanner.nextInt();

        // Close the Scanner object
        scanner.close();

        // Check whether the number is divisible by 5 and 11
        if (number1 % 5 == 0 && number1 % 11 == 0) {
            System.out.println("The number is divisible by both 5 and 11.");
        } else {
            System.out.println("The number is not divisible by both 5 and 11.");
        }

        // 4. Write a JAVA program to check whether a number is even or odd.
          // Prompt the user to enter a number
          System.out.print("Enter a number: ");
          int number2 = scanner.nextInt();
  
          // Close the Scanner object
          scanner.close();
  
          // Check whether the number is even or odd
          if (number2 % 2 == 0) {
              System.out.println("The number is even.");
          } else {
              System.out.println("The number is odd.");
          }

        //5. Write a JAVA program to check whether a year is a leap year or not. 
          // Hint: if year%4==0; if year%100!==0 ; year%400==0; 
          // Prompt the user to enter a year
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();

        // Close the Scanner object
        scanner.close();

        // Check whether the year is a leap year or not
        boolean isLeapYear = false;

        if (year % 4 == 0) {
            if (year % 100 != 0 || year % 400 == 0) {
                isLeapYear = true;
            }
        }

        // Print the result
        if (isLeapYear) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }

        // 6. Write a JAVA program to input any alphabet and check whether it is vowel or consonant.
        // Prompt the user to enter an alphabet
          System.out.print("Enter an alphabet: ");
          char ch = scanner.next().charAt(0);
  
          // Close the Scanner object
          scanner.close();
  
          // Check whether the entered character is a vowel or a consonant
          boolean isVowel = false;
  
          switch (ch) {
              case 'a':
              case 'e':
              case 'i':
              case 'o':
              case 'u':
              case 'A':
              case 'E':
              case 'I':
              case 'O':
              case 'U':
                  isVowel = true;
                  break;
              default:
                  isVowel = false;
          }
  
          // Print the result
          if (isVowel) {
              System.out.println(ch + " is a vowel.");
          } else {
              System.out.println(ch + " is a consonant.");
          }


          //    Some Switch case Statements Questions:
          //    1. Write a Java program that takes a student's grade as input (A, B, C, D, or F) and converts it 
          //    to the corresponding GPA value. Use a switch case statement to handle different grades.
                  // Prompt the user to enter the grade
        System.out.print("Enter your grade (A, B, C, D, or F): ");
        char grade = scanner.next().charAt(0);

        // Close the Scanner object
        scanner.close();

        // Convert the grade to GPA using switch case
        double gpa;

        switch (grade) {
            case 'A':
            case 'a':
                gpa = 4.0;
                break;
            case 'B':
            case 'b':
                gpa = 3.0;
                break;
            case 'C':
            case 'c':
                gpa = 2.0;
                break;
            case 'D':
            case 'd':
                gpa = 1.0;
                break;
            case 'F':
            case 'f':
                gpa = 0.0;
                break;
            default:
                System.out.println("Invalid grade entered.");
                return; // Exit the program if an invalid grade is entered
        }

        // Print the GPA corresponding to the grade
        System.out.println("Your GPA for grade " + grade + " is: " + gpa);



        // 2. Create a Java program that takes two numbers and an operator (+, -, *, /) as inputs 
        // and performs the corresponding arithmetic operation using a switch case statement.
                // Prompt the user to enter the first number
                System.out.print("Enter the first number: ");
                double num4 = scanner.nextDouble();
        
                // Prompt the user to enter the second number
                System.out.print("Enter the second number: ");
                double num5 = scanner.nextDouble();
        
                // Prompt the user to enter the operator (+, -, *, /)
                System.out.print("Enter the operator (+, -, *, /): ");
                char operator = scanner.next().charAt(0);
        
                // Close the Scanner object
                scanner.close();
        
                // Perform the arithmetic operation using switch case
                double result;
        
                switch (operator) {
                    case '+':
                        result = num4 + num5;
                        break;
                    case '-':
                        result = num4 - num5;
                        break;
                    case '*':
                        result = num4 * num5;
                        break;
                    case '/':
                        if (num2 != 0) {
                            result = num4 / num5;
                        } else {
                            System.out.println("Error: Division by zero!");
                            return; // Exit the program if division by zero is attempted
                        }
                        break;
                    default:
                        System.out.println("Invalid operator entered.");
                        return; // Exit the program if an invalid operator is entered
                }
        
                // Print the result of the arithmetic operation
                System.out.println("Result: " + result);


         // 3. Write a Java program that takes an integer input (1 to 12) representing a month and prints the corresponding
         //  season (e.g., 1-3: Winter, 4-6: Spring, 7-9: Summer, 10-12: Fall) using a switch case.
         
        // Prompt the user to enter a month (1 to 12)
        System.out.print("Enter a month (1 to 12): ");
        int month = scanner.nextInt();

        // Close the Scanner object
        scanner.close();

        // Determine the season using switch case
        String season;

        switch (month) {
            case 1:
            case 2:
            case 3:
                season = "Winter";
                break;
            case 4:
            case 5:
            case 6:
                season = "Spring";
                break;
            case 7:
            case 8:
            case 9:
                season = "Summer";
                break;
            case 10:
            case 11:
            case 12:
                season = "Fall";
                break;
            default:
                season = "Invalid month entered";
                break;
        }

        // Print the corresponding season
        System.out.println("The season for month " + month + " is: " + season);


        // 4. Implement a Java program that calculates the area of different shapes
        //  (circle, rectangle, square, triangle) based on the user's choice using a switch case.
        
        // Display menu and prompt the user to choose a shape
        System.out.println("Choose a shape to calculate its area:");
        System.out.println("1. Circle");
        System.out.println("2. Rectangle");
        System.out.println("3. Square");
        System.out.println("4. Triangle");
        System.out.print("Enter your choice (1-4): ");
        int choice = scanner.nextInt();

        double area = 0.0; // Variable to store the calculated area

        // Perform the corresponding area calculation based on the user's choice
        switch (choice) {
            case 1: // Calculate area of circle
                System.out.print("Enter the radius of the circle: ");
                double radius = scanner.nextDouble();
                area = Math.PI * radius * radius;
                break;
            case 2: // Calculate area of rectangle
                System.out.print("Enter the length of the rectangle: ");
                double length = scanner.nextDouble();
                System.out.print("Enter the width of the rectangle: ");
                double width = scanner.nextDouble();
                area = length * width;
                break;
            case 3: // Calculate area of square
                System.out.print("Enter the side length of the square: ");
                double side = scanner.nextDouble();
                area = side * side;
                break;
            case 4: // Calculate area of triangle
                System.out.print("Enter the base of the triangle: ");
                double base = scanner.nextDouble();
                System.out.print("Enter the height of the triangle: ");
                double height = scanner.nextDouble();
                area = 0.5 * base * height;
                break;
            default:
                System.out.println("Invalid choice! Please choose a number between 1 and 4.");
                // Exit the program if an invalid choice is entered
                System.exit(0);
        }

        // Close the Scanner object
        scanner.close();

        // Print the calculated area
        System.out.println("The area of the selected shape is: " + area);






        




    }
}
