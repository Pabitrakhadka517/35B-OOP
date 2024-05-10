import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        /* Check the same condition in whie and do while for difference */
        int counter=0;
        while(counter < 0){
            System.out.println("The condition is false, it won't run");
        }

        do{
            System.out.println("This runs first then checks the condition");
        }while(counter < 0);
        /* do while run at least once, even if the condition is false */



    /* Task 
     * prompt user to enter a number
     * run loop and ask user the integer until the integer is negative
     */
    Scanner scan = new Scanner(System.in);
    int input;
    do{
        System.out.print(" Enter a number:");
        input = scan.nextInt();
    }while(input>0);
    System.out.println("negative number:" +  input);
    scan.close();





    }
}
