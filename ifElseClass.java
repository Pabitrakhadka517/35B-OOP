public class ifElseClass {
    public static void main(String[] args) {
        /* If Statement */
        if(true){
            System.out.println("True Statement");
        }
        /* If takes boolean expression inside() */
        int num1=10,num2=20;
        if(num1==num2){
            System.out.println("Equal");

        }else{
            System.out.println("Not Equal");
        }
        /* Note that else is optional */

        /* If else if */
        if(num1==num2){
            System.out.println("Equal");
        }else if(num1<num2){
            System.out.println("Lesser");
        }else{
            System.out.println("Greater");
        }
        /* Note that else should be at the last */
        /* If else if ladder */
        if(num1>num2){
            System.out.println("Greater");
        }else if (num1 !=num2){
            System.out.println("Not equal");
        }else if(num1==num2){
            System.out.println("Equal");
        }else{
            System.out.println("Default statement ");
        }
        
        /* Nested if statement */
        if(num1<0){
            if(num1>num2){
                System.out.println("Negative and greater");
            }else{
                System.out.println("Negative and lesser");
            }
        }else{
            if(num1>num2){
                System.out.println("Positive and greater");
            }else{
                System.out.println("Positive and lesser");
            }
        }

        /* Task
         * Consider the following marking
         * calculate the total and avg in a variable
         * if any of the marking is less than 35, print fail
         * if avg is less than 60, print third division
         * if avg is less than 70, print second division
         * if avg is less than 80, print first division
         * if avg is equal or greater tha 80, print distinction
         * if avg is less than 0 or more than 100,print invalid 
         */
        int science = 109, english = 101, math = 100;
        int sum= science+english+math;
        System.out.println(sum);

        int avg=sum/3;
        System.out.println(avg);

        if(avg<35){
            System.out.println("fail");
        }else if (avg<60){
            System.out.println("Third Division");
        }else if(avg<70){
            System.out.println("Second Division");
        }else if(avg<80){
            System.out.println("First Division");
        }else if(avg>=80 && avg<100){
            System.out.println("Distinction");
        }else {
            System.out.println("Invalid");
        }

    }        

}

