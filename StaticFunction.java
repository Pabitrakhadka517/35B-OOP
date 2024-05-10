
public class StaticFunction {
    public static int multiply(int a , int b){
        int mul= a*b;
        return mul;
    }
    public static String vendingMachine(int menu){
        if(menu == 1){
            return "Coke";
        }
        if(menu == 2){
            return "Water";
        }
        if(menu==3){
            return "Frooti";
        }
        return"Invalid Menu";
    }
    /* Task 1
     * create a function checkEligible
     * takes 2 parameter, String name, int age
     * returns String
     * if age is less than 0, more than 200 return "Hello name, Invalid age"
     * if age is less than 18 return "Sorry name, you are not eligible"
     * else return "Congratulation name, you are eligible " 
     */

    /* task 2
     * create a function makeSquare that takes double
     * return double of square value
     */
    
    public static void main(String[] args) {
        /* if the function is static and in same class 
         * no need to make object simply call */
        int multiplyReturn = multiply(10,2);
        System.out.println("Result is "+ multiplyReturn);
        String iGet = vendingMachine(1);
        System.out.println("I get" + iGet);
    }
}
