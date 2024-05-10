public class SwitchCase {
    public static void main(String[] args) {
        char charValue='b';
        int intValue=10;
        switch(charValue){
            case 'a':
                System.out.println("Apple");
                break;
            case 'b':
                switch(intValue){
                    case 10:
                    System.out.println("Ten");
                    break;
                    case 20:
                    System.out.println("Twenty");
                    break;
                }
                System.out.println("Ball");
                break;
            case 'c':
                System.out.println("cat");
                break;
            default:
            System.out.println("Invalid");
            break;

    
        }

        /* Task
         * Use switch case for the following
         * 0 - sunday
         * 1 - Monday
         * 2 - Tuesday
         * 3 - Wednesday
         * 4 - Thursday
         * 5 - Friday
         * 6 - Saturday
         * rest - Invalid          
         */
        int day = 4;
        switch(day){
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                 break;
            case 2:
                System.out.println("Tuseday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;

        }

    }
}
