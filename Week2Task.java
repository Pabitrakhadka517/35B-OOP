import java.util.Scanner;

public class Week2Task {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        // 1. Write a program to check whether a person can cast a vote or not. The condition is you must be over 18 years old to vote.
        System.out.print("Enter your age: ");
        int age = scan.nextInt();
        scan.close();

        if (age>=18) {
            System.out.print("You are eligible to cast your vote.");
        }else{
            System.out.print("You are not eligible to cast your vote yet.");
        }



        // 2. Write a program to calculate SI. 
        // Formula Simple Interest = (PrincipleAmount*Time*Rate/100);

        // Ask the user to enter principal amount, rate of interest, and time period
        System.out.print("Enter the principal amount (in rupees): ");
        double principal = scan.nextDouble();

        System.out.print("Enter the rate of interest (in percentage): ");
        double rateOfInterest = scan.nextDouble();

        System.out.print("Enter the time period (in years): ");
        double timePeriod = scan.nextDouble();

        // Close the Scanner object
        scan.close();

        // Calculate Simple Interest
        double simpleInterest = (principal * rateOfInterest * timePeriod) / 100;

        // Display the result
        System.out.println("Simple Interest: " + simpleInterest + " rupees");

        // 3. Write a program to calculate, area of the triangle, and the Volume of the Cube and Cuboid.
        // Formula: Volume of Cuboid = length*width*height; and Volume of Cube: side*side*side;

        // Calculate area of triangle
        System.out.println("Enter the base and height of the triangle:");
        double base = scan.nextDouble();
        double height = scan.nextDouble();
        double areaTriangle = 0.5 * base * height;
        System.out.println("Area of the triangle: " + areaTriangle);

        
        // Calculate volume of cube
        System.out.println("Enter the side length of the cube:");
        double sideLengthCube = scan.nextDouble();
        double volumeCube = Math.pow(sideLengthCube, 3);
        System.out.println("Volume of the cube: " + volumeCube);

        // Calculate volume of cuboid
        System.out.println("Enter the length, width, and height of the cuboid:");
        double lengthCuboid = scan.nextDouble();
        double widthCuboid = scan.nextDouble();
        double heightCuboid = scan.nextDouble();
        double volumeCuboid = lengthCuboid * widthCuboid * heightCuboid;
        System.out.println("Volume of the cuboid: " + volumeCuboid);

        // Close the Scanner object
        scan.close();


        // 4. Write the ternary operator for question no. 1

         // Ask the user to enter their age
         System.out.print("Enter your age: ");
         int age1 = scan.nextInt();
 
         // Close the Scanner object
         scan.close();
 
         // Check if the person is eligible to vote using ternary operator
         String message = (age1 >= 18) ? "You are eligible to cast your vote." : "You are not eligible to vote yet.";
 
         // Print the result
         System.out.println(message);

        //  5. Write a program to take two integer inputs from the user and print the sum and product of them.
        // Prompt the user to enter the first integer
        System.out.print("Enter the first integer: ");
        int num1 = scan.nextInt();

        // Prompt the user to enter the second integer
        System.out.print("Enter the second integer: ");
        int num2 = scan.nextInt();

        // Close the Scanner object
        scan.close();

        // Calculate the sum and product
        int sum = num1 + num2;
        int product = num1 * num2;

        // Print the sum and product
        System.out.println("Sum: " + sum);
        System.out.println("Product: " + product);


        // 6. Take two integer inputs from the user. First, calculate the sum of two, then the product of two.
        //  Finally, calculate the division of the thus obtained sum and product and print the result.

         // Prompt the user to enter the first integer
         System.out.print("Enter the first integer: ");
         int num3 = scan.nextInt();
 
         // Prompt the user to enter the second integer
         System.out.print("Enter the second integer: ");
         int num4 = scan.nextInt();
 
         // Close the Scanner object
         scan.close();
 
         // Calculate the sum and product
         int sum1 = num3 + num4;
         int product1 = num1 * num2;
 
         // Calculate the division of the sum by the product
         double divisionResult = (double) sum1 / product1;
 
         // Print the result
         System.out.println("Division of sum by product: " + divisionResult);



        //  7. Take the name, roll number, and field of interest from the user and print in the format below: 
        // Hey, my name is XYZ and my roll number is XYZ. My field of interest are xyz.

         // Prompt the user to enter their name
         System.out.print("Enter your name: ");
         String name = scan.nextLine();
 
         // Prompt the user to enter their roll number
         System.out.print("Enter your roll number: ");
         String rollNumber = scan.nextLine();
 
         // Prompt the user to enter their field of interest
         System.out.print("Enter your field of interest: ");
         String fieldOfInterest = scan.nextLine();
 
         // Close the Scanner object
         scan.close();
 
         // Print the information in the specified format
         System.out.println("Hey, my name is " + name + " and my roll number is " + rollNumber + ".");
         System.out.println("My field of interest is " + fieldOfInterest + ".");
     

        //  8. Take side of a square from user and print area and perimeter of it.
       //  Also, calculate Simple Interest, Area of triangle and Volume of Cube and Cuboid. Take the attributes as user input.
         // Prompt the user to enter the side length of the square
         System.out.print("Enter the side length of the square: ");
         double sideLengthSquare = scan.nextDouble();
 
         // Prompt the user to enter the principal amount, rate of interest, and time period for Simple Interest calculation
         System.out.print("Enter the principal amount (in rupees) for Simple Interest calculation: ");
         double principal1 = scan.nextDouble();
         System.out.print("Enter the rate of interest (in percentage) for Simple Interest calculation: ");
         double rateOfInterest1 = scan.nextDouble();
         System.out.print("Enter the time period (in years) for Simple Interest calculation: ");
         double timePeriod1 = scan.nextDouble();
 
         // Prompt the user to enter the base and height of the triangle
         System.out.print("Enter the base and height of the triangle: ");
         double baseTriangle1 = scan.nextDouble();
         double heightTriangle1 = scan.nextDouble();
 
         // Prompt the user to enter the side length of the cube
         System.out.print("Enter the side length of the cube: ");
         double sideLengthCube1 = scan.nextDouble();
 
         // Prompt the user to enter the length, width, and height of the cuboid
         System.out.print("Enter the length, width, and height of the cuboid: ");
         double lengthCuboid1 = scan.nextDouble();
         double widthCuboid1 = scan.nextDouble();
         double heightCuboid1 = scan.nextDouble();
 
         // Close the Scanner object
         scan.close();
 
         // Calculate area and perimeter of the square
         double areaSquare = sideLengthSquare * sideLengthSquare;
         double perimeterSquare = 4 * sideLengthSquare;
 
         // Calculate Simple Interest
         double simpleInterest1 = (principal1 * rateOfInterest1 * timePeriod1) / 100;
 
         // Calculate area of triangle
         double areaTriangle1 = 0.5 * baseTriangle1 * heightTriangle1;
 
         // Calculate volume of cube
         double volumeCube1 = Math.pow(sideLengthCube1, 3);
 
         // Calculate volume of cuboid
         double volumeCuboid1 = lengthCuboid1 * widthCuboid1 * heightCuboid1;
 
         // Print the results
         System.out.println("\nArea of the square: " + areaSquare);
         System.out.println("Perimeter of the square: " + perimeterSquare);
         System.out.println("Simple Interest: " + simpleInterest1);
         System.out.println("Area of the triangle: " + areaTriangle1);
         System.out.println("Volume of the cube: " + volumeCube1);
         System.out.println("Volume of the cuboid: " + volumeCuboid1);

        //  9.  Ask user to give two double input for length and breadth of a rectangle and print area type casted to int.
         // Prompt the user to enter the length and breadth of the rectangle
         System.out.print("Enter the length of the rectangle: ");
         double length = scan.nextDouble();
 
         System.out.print("Enter the breadth of the rectangle: ");
         double breadth = scan.nextDouble();
 
         // Close the Scanner object
         scan.close();
 
         // Calculate the area of the rectangle
         double area = length * breadth;
 
         // Type cast the area to int
         int areaInt = (int) area;
 
         // Print the area after type casting to int
         System.out.println("Area of the rectangle (type casted to int): " + areaInt);


         // 10. Write a program to calculate the total marks of four subjects of a student and the total percentage secured.
        //   And use the following conditions to generate the final result;
         // a. If equal to or more than 70 -> First Class
         // b. If more than 59 -> Upper Second Class
         // c. If more than 49 -> Second class
         // d. If more than 39 -> Third class and if below than 40 the result is fail. 
         // Hint: Use ternary operator
         
        // Prompt the user to enter marks for each subject
        System.out.print("Enter marks for subject 1: ");
        int subject1 = scan.nextInt();

        System.out.print("Enter marks for subject 2: ");
        int subject2 = scan.nextInt();

        System.out.print("Enter marks for subject 3: ");
        int subject3 = scan.nextInt();

        System.out.print("Enter marks for subject 4: ");
        int subject4 = scan.nextInt();

        // Close the Scanner object
        scan.close();

        // Calculate the total marks
        int totalMarks = subject1 + subject2 + subject3 + subject4;

        // Calculate the total percentage
        double totalPercentage = (totalMarks / 400.0) * 100;

        // Generate the final result based on the conditions
        String result = (totalPercentage >= 70) ? "First Class" :
                        (totalPercentage > 59) ? "Upper Second Class" :
                        (totalPercentage > 49) ? "Second Class" :
                        (totalPercentage > 39) ? "Third Class" : "Fail";

        // Print the total marks, total percentage, and final result
        System.out.println("Total marks: " + totalMarks);
        System.out.println("Total percentage: " + totalPercentage + "%");
        System.out.println("Result: " + result);







    }

}



