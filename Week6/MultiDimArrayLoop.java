public class MultiDimArrayLoop {
    public static void main(String[] args) {
        int[][] twoArray = new int[2][3];
        twoArray[0][0]=10;
        twoArray[0][1]=20;
        twoArray[0][2]=30;
        twoArray[1][0]=-30;
        twoArray[1][1]=-20;
        twoArray[1][2]=-10;
        /* Visual
         * [
         *  [10,20,30]  ->0
         *  [-30,-20,-10]   ->1
         * ]
         */
        /*LOop multi dim array with nested loop */
        /* Outer selects the array, inner selects the; actual value inside */
        int outerLength = twoArray.length;
            for(int outer = 0; outer < outerLength; outer ++){
            // twoArray[outer]  -> iterate each array
            int innerLength = twoArray[outer].length;
            for(int inner = 0; inner < innerLength; inner ++){
                System.out.println(twoArray[outer] [inner]);
            }
        }

        /* Task
         * Make the following Array
         * [
         *   ["Ram", "Shyam", "Hari"]
         *   ["Sita", "Gita", "Rita"]
         *   ["Pratima", "Aayushma", "Prakriti"]
         * ]
         * Print all the names
         * Also, Find on which array is Aayushma is
         * output:
         * 2
         */
        String[][] threeDArray = new String[3][3];
        threeDArray[0][0]="Ram";
        threeDArray[0][1]="Shyam";
        threeDArray[0][2]="Hari";
        threeDArray[1][0]="Sita";
        threeDArray[1][1]="Gita";
        threeDArray[1][2]="Rita";
        threeDArray[2][0]="Pratima";
        threeDArray[2][1]="Aayushma";
        threeDArray[2][3]="Prakriti";
        System.out.println(threeDArray[0][0]);
        System.out.println(threeDArray[0][1]);
        System.out.println(threeDArray[0][2]);
        System.out.println(threeDArray[1][0]);
        System.out.println(threeDArray[1][1]);
        System.out.println(threeDArray[0][0]);
        System.out.println(threeDArray[0][0]);
        System.out.println(threeDArray[0][0]);
        System.out.println(threeDArray[0][0]);


















    }
}
